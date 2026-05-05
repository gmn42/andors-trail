package com.gpl.rpg.AndorsTrail.activity;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTabHost;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gpl.rpg.AndorsTrail.AndorsTrailApplication;
import com.gpl.rpg.AndorsTrail.R;
import com.gpl.rpg.AndorsTrail.activity.fragment.HeroinfoActivity_Inventory;
import com.gpl.rpg.AndorsTrail.activity.fragment.HeroinfoActivity_Quests;
import com.gpl.rpg.AndorsTrail.activity.fragment.HeroinfoActivity_Skills;
import com.gpl.rpg.AndorsTrail.activity.fragment.HeroinfoActivity_Stats;
import com.gpl.rpg.AndorsTrail.context.WorldContext;
import com.gpl.rpg.AndorsTrail.util.ThemeHelper;

public final class HeroinfoActivity extends AndorsTrailBaseFragmentActivity {
	private WorldContext world;

	private FragmentTabHost tabHost;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		setTheme(ThemeHelper.getBaseTheme());
		super.onCreate(savedInstanceState);
		AndorsTrailApplication app = AndorsTrailApplication.getApplicationFromActivity(this);
		if (!app.isInitialized()) { finish(); return; }
		this.world = app.getWorld();
		initializeView(this, R.layout.tabbedlayout, android.R.id.tabhost);

		tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		tabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

		addTab("char",   R.string.heroinfo_char,   R.drawable.char_hero,          HeroinfoActivity_Stats.class);
		addTab("quests", R.string.heroinfo_quests,  R.drawable.ui_icon_quest,      HeroinfoActivity_Quests.class);
		addTab("skills", R.string.heroinfo_skill,   R.drawable.ui_icon_skill,      HeroinfoActivity_Skills.class);
		addTab("inv",    R.string.heroinfo_inv,     R.drawable.ui_icon_equipment,  HeroinfoActivity_Inventory.class);

		String t = world.model.uiSelections.selectedTabHeroInfo;
		if (t != null && !t.isEmpty()) {
			tabHost.setCurrentTabByTag(t);
		}
		updateIconForPlayer();
	}

	/** Inflate one tab indicator, attach it to the tab host, and wire focus→select. */
	private void addTab(final String tag, int textResId, int iconResId, Class<? extends Fragment> fragmentClass) {
		Resources res = getResources();
		ViewGroup v = (ViewGroup) getLayoutInflater().inflate(R.layout.tabindicator, null);
		((TextView)  v.findViewById(R.id.tabindicator_text)).setText(res.getString(textResId));
		((ImageView) v.findViewById(R.id.tabindicator_icon)).setImageDrawable(res.getDrawable(iconResId));

		// Select this tab as soon as its label receives d-pad / keyboard focus.
		v.setOnFocusChangeListener((view, hasFocus) -> {
			if (hasFocus && !getSupportFragmentManager().isStateSaved()) { // Don't change tab during activity shutdown
				tabHost.setCurrentTabByTag(tag);
			}
		});

		tabHost.addTab(tabHost.newTabSpec(tag).setIndicator(v), fragmentClass, null);
	}

	@Override
	protected void onResume() {
		super.onResume();
		updateIconForPlayer();
	}

	private void updateIconForPlayer() {
		ImageView iv = (ImageView) tabHost.getTabWidget().getChildTabViewAt(0).findViewById(R.id.tabindicator_icon);
		world.tileManager.setImageViewTileForPlayer(getResources(), iv, world.model.player.iconID);
	}

	@Override
	protected void onPause() {
		super.onPause();
		world.model.uiSelections.selectedTabHeroInfo = tabHost.getCurrentTabTag();
	}
}