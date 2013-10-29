/* Generated By:JavaCC: Do not edit this line. ATScriptInterpreterTokenManager.java */
package com.gpl.rpg.AndorsTrail.scripting.interpreter;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Map;
import java.lang.reflect.Field;
import com.gpl.rpg.AndorsTrail.context.ControllerContext;
import com.gpl.rpg.AndorsTrail.context.WorldContext;
import com.gpl.rpg.AndorsTrail.model.ability.ActorCondition;
import com.gpl.rpg.AndorsTrail.model.ability.ActorConditionEffect;
import com.gpl.rpg.AndorsTrail.model.actor.Actor;
import com.gpl.rpg.AndorsTrail.model.actor.Player;
import com.gpl.rpg.AndorsTrail.model.map.PredefinedMap;
import com.gpl.rpg.AndorsTrail.util.ConstRange;

/** Token Manager. */
public class ATScriptInterpreterTokenManager implements ATScriptInterpreterConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_1(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_1(int pos, long active0)
{
   return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 53);
      case 92:
         return jjMoveStringLiteralDfa1_1(0x10000000000000L);
      default :
         return jjMoveNfa_1(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 34:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(1, 52);
         break;
      default :
         break;
   }
   return jjStartNfa_1(0, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfffffffbffffffffL & l) == 0L)
                     break;
                  kind = 54;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffffffefffffffL & l) == 0L)
                     break;
                  kind = 54;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x200000L) != 0L)
            return 1;
         if ((active0 & 0x7fffff8003000L) != 0L)
         {
            jjmatchedKind = 51;
            return 5;
         }
         return -1;
      case 1:
         if ((active0 & 0x1fe8080001000L) != 0L)
            return 5;
         if ((active0 & 0x6017f78002000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 51;
               jjmatchedPos = 1;
            }
            return 5;
         }
         return -1;
      case 2:
         if ((active0 & 0x201f9f0002000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 2;
            return 5;
         }
         if ((active0 & 0x4000608000000L) != 0L)
            return 5;
         return -1;
      case 3:
         if ((active0 & 0x1f9f0000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 3;
            return 5;
         }
         if ((active0 & 0x2000000002000L) != 0L)
            return 5;
         return -1;
      case 4:
         if ((active0 & 0x1f960000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 4;
            return 5;
         }
         if ((active0 & 0x90000000L) != 0L)
            return 5;
         return -1;
      case 5:
         if ((active0 & 0x18900000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 5;
            return 5;
         }
         if ((active0 & 0x7060000000L) != 0L)
            return 5;
         return -1;
      case 6:
         if ((active0 & 0x18000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 6;
            return 5;
         }
         if ((active0 & 0x900000000L) != 0L)
            return 5;
         return -1;
      case 7:
         if ((active0 & 0x18000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 7;
            return 5;
         }
         return -1;
      case 8:
         if ((active0 & 0x18000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 8;
            return 5;
         }
         return -1;
      case 9:
         if ((active0 & 0x18000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 9;
            return 5;
         }
         return -1;
      case 10:
         if ((active0 & 0x18000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 10;
            return 5;
         }
         return -1;
      case 11:
         if ((active0 & 0x18000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 11;
            return 5;
         }
         return -1;
      case 12:
         if ((active0 & 0x18000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 12;
            return 5;
         }
         return -1;
      case 13:
         if ((active0 & 0x18000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 13;
            return 5;
         }
         return -1;
      case 14:
         if ((active0 & 0x18000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 14;
            return 5;
         }
         return -1;
      case 15:
         if ((active0 & 0x18000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 15;
            return 5;
         }
         return -1;
      case 16:
         if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 16;
            return 5;
         }
         if ((active0 & 0x8000000000L) != 0L)
            return 5;
         return -1;
      case 17:
         if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 17;
            return 5;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 14);
      case 34:
         return jjStopAtPos(0, 25);
      case 40:
         return jjStopAtPos(0, 6);
      case 41:
         return jjStopAtPos(0, 7);
      case 42:
         return jjStopAtPos(0, 22);
      case 43:
         return jjStopAtPos(0, 20);
      case 44:
         return jjStopAtPos(0, 11);
      case 45:
         return jjStartNfaWithStates_0(0, 21, 1);
      case 46:
         return jjStopAtPos(0, 5);
      case 47:
         return jjStopAtPos(0, 23);
      case 59:
         return jjStopAtPos(0, 10);
      case 60:
         jjmatchedKind = 18;
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 61:
         jjmatchedKind = 24;
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 62:
         jjmatchedKind = 17;
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x1c80a0000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x2200000000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x1810800000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x404000000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x608000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 123:
         return jjStopAtPos(0, 8);
      case 125:
         return jjStopAtPos(0, 9);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         else if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x6408000000L);
      case 99:
         if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 45, 5);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 47, 5);
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 100:
         if ((active0 & 0x100000000000L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 102:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(1, 12, 5);
         break;
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x10040002000L);
      case 109:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 48, 5);
         break;
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x2001010000000L);
      case 112:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 41, 5);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 42, 5);
         break;
      case 114:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 46, 5);
         break;
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000900000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L);
      case 109:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 50, 5);
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 110:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(2, 33, 5);
         break;
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000000L);
      case 112:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 5);
         break;
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x2810000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x1a0000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000L);
      case 120:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(2, 34, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x14020000000L);
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 5);
         break;
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000L);
      case 108:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 49, 5);
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x1800000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 121:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x9020000000L);
      case 100:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(4, 28, 5);
         break;
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x2840000000L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000L);
      case 114:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 5);
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000000L);
      case 101:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 36, 5);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 38, 5);
         break;
      case 107:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(5, 29, 5);
         break;
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000L);
      case 114:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(5, 30, 5);
         break;
      case 116:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 37, 5);
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000000L);
      case 101:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(6, 32, 5);
         break;
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000000L);
      case 116:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(6, 35, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x8000000000L);
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa9_0(active0, 0x8000000000L);
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa10_0(active0, 0x8000000000L);
      case 114:
         return jjMoveStringLiteralDfa10_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa11_0(active0, 0x10000000000L);
      case 110:
         return jjMoveStringLiteralDfa11_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa12_0(active0, 0x8000000000L);
      case 111:
         return jjMoveStringLiteralDfa12_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa13_0(active0, 0x8000000000L);
      case 110:
         return jjMoveStringLiteralDfa13_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa14_0(active0, 0x10000000000L);
      case 116:
         return jjMoveStringLiteralDfa14_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa15_0(active0, 0x18000000000L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa16_0(active0, 0x8000000000L);
      case 116:
         return jjMoveStringLiteralDfa16_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
private int jjMoveStringLiteralDfa16_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa17_0(active0, 0x10000000000L);
      case 110:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(16, 39, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
private int jjMoveStringLiteralDfa17_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(15, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, active0);
      return 17;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa18_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjStartNfa_0(16, active0);
}
private int jjMoveStringLiteralDfa18_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(16, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(17, active0);
      return 18;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(18, 40, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(17, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                     jjCheckNAddTwoStates(1, 2);
                  }
                  else if (curChar == 45)
                     jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if (curChar == 46)
                     jjCheckNAdd(3);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(3);
                  break;
               case 5:
                  if ((0x3ff200000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(5);
                  break;
               case 5:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\56", "\50", "\51", "\173", "\175", "\73", "\54", 
"\151\146", "\145\154\163\145", "\41", "\76\75", "\74\75", "\76", "\74", "\75\75", "\53", 
"\55", "\52", "\57", "\75", "\42", null, "\155\141\160", "\167\157\162\154\144", 
"\141\164\164\141\143\153", "\160\154\141\171\145\162", "\141\143\164\157\162", 
"\157\165\164\163\151\144\145", "\155\151\156", "\155\141\170", "\143\165\162\162\145\156\164", 
"\163\157\165\162\143\145", "\164\141\162\147\145\164", "\144\141\155\141\147\145", 
"\141\144\144\101\143\164\157\162\103\157\156\144\151\164\151\157\156", 
"\143\154\145\141\162\101\143\164\157\162\103\157\156\144\151\164\151\157\156", "\150\160", "\141\160", "\141\143", "\141\144", "\142\143", "\144\162", 
"\143\143", "\143\155", "\142\157\157\154", "\156\165\155", null, "\134\42", "\42", null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "LITERAL",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, 0, -1, 
};
static final long[] jjtoToken = {
   0x7fffffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[6];
private final int[] jjstateSet = new int[12];
protected char curChar;
/** Constructor. */
public ATScriptInterpreterTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ATScriptInterpreterTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 6; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
