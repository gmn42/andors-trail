package com.gpl.rpg.AndorsTrail.controller;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.input.InputManager;
import android.os.Build;
import android.util.Log;
import android.view.InputDevice;

import androidx.annotation.RequiresApi;

public final class InputDeviceController {
	// Accessed only from the main thread (activity lifecycle + input device callbacks).
	private final Context context;
	private InputManager inputManager;
	private boolean listenerRegistered = false;

	private boolean hasTouchscreen = false;
	private boolean hasKeyboard = false;
	private boolean hasMouse = false;
	private boolean hasDpad = false;
	private boolean hasGamepad = false;
	private boolean hasJoystick = false;
	private int connectedControllerCount = 0;

	public InputDeviceController(Context context) {
		this.context = context;
	}

	public void startListening() {
		refreshConnectedDevices();
		if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) return;
		if (listenerRegistered) return;

		inputManager = (InputManager) context.getSystemService(Context.INPUT_SERVICE);
		if (inputManager == null) return;

		registerListener();
		listenerRegistered = true;
	}

	public void stopListening() {
		if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) return;
		if (!listenerRegistered) return;
		if (inputManager == null) return;

		unregisterListener();
		listenerRegistered = false;
	}

	public void refreshConnectedDevices() {
		hasTouchscreen = context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_TOUCHSCREEN);
		hasKeyboard = false;
		hasMouse = false;
		hasDpad = false;
		hasGamepad = false;
		hasJoystick = false;
		connectedControllerCount = 0;

		for (int deviceId : InputDevice.getDeviceIds()) {
			InputDevice device = InputDevice.getDevice(deviceId);
			if (device == null) continue;

			int sources = device.getSources();
			if (device.getKeyboardType() != InputDevice.KEYBOARD_TYPE_NONE || hasSource(sources, InputDevice.SOURCE_KEYBOARD)) {
				hasKeyboard = true;
			}
			if (hasSource(sources, InputDevice.SOURCE_MOUSE) || hasSource(sources, InputDevice.SOURCE_TOUCHPAD)) {
				hasMouse = true;
			}

			boolean isController = false;
			if (hasSource(sources, InputDevice.SOURCE_DPAD)) {
				hasDpad = true;
				isController = true;
			}
			if (hasSource(sources, InputDevice.SOURCE_GAMEPAD)) {
				hasGamepad = true;
				isController = true;
			}
			if (hasSource(sources, InputDevice.SOURCE_JOYSTICK)) {
				hasJoystick = true;
				isController = true;
			}
			if (isController) connectedControllerCount++;
		}
	}

	public boolean hasTouchscreen() { return hasTouchscreen; }
	public boolean hasKeyboard() { return hasKeyboard; }
	public boolean hasMouse() { return hasMouse; }
	public boolean hasDpad() { return hasDpad; }
	public boolean hasGamepad() { return hasGamepad; }
	public boolean hasJoystick() { return hasJoystick; }
	public boolean hasController() { return connectedControllerCount > 0; }
	public int getConnectedControllerCount() { return connectedControllerCount; }

	private static boolean hasSource(int sources, int source) {
		return (sources & source) == source;
	}

	@RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
	private void registerListener() {
		inputManager.registerInputDeviceListener(inputDeviceListener, null);
	}

	@RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
	private void unregisterListener() {
		inputManager.unregisterInputDeviceListener(inputDeviceListener);
	}

	@RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
	private final InputManager.InputDeviceListener inputDeviceListener = new InputManager.InputDeviceListener() {
		@Override
		public void onInputDeviceAdded(int deviceId) {
			refreshConnectedDevices();
		}

		@Override
		public void onInputDeviceRemoved(int deviceId) {
			refreshConnectedDevices();
		}

		@Override
		public void onInputDeviceChanged(int deviceId) {
			refreshConnectedDevices();
		}
	};

	// Log a list of individual hardware devices that are connected and their capabilities.
	public void logConnectedDevices() {
		for (int deviceId : InputDevice.getDeviceIds()) {
			InputDevice device = InputDevice.getDevice(deviceId);
			if (device == null) continue;

			int sources = device.getSources();
			Log.d("InputDeviceController", String.format(
					"%-28s id=%3d  src=0x%08X  kb=%-5s  mouse=%-5s  dpad=%-5s  gamepad=%-5s  joystick=%-5s",
					device.getName(),
					deviceId,
					sources,
					device.getKeyboardType() != InputDevice.KEYBOARD_TYPE_NONE || hasSource(sources, InputDevice.SOURCE_KEYBOARD),
					hasSource(sources, InputDevice.SOURCE_MOUSE) || hasSource(sources, InputDevice.SOURCE_TOUCHPAD),
					hasSource(sources, InputDevice.SOURCE_DPAD),
					hasSource(sources, InputDevice.SOURCE_GAMEPAD),
					hasSource(sources, InputDevice.SOURCE_JOYSTICK)
			));
		}
	}

}


