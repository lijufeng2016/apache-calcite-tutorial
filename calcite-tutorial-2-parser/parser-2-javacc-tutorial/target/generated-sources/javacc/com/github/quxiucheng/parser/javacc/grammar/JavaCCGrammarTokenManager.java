/* Generated By:JavaCC: Do not edit this line. JavaCCGrammarTokenManager.java */
package com.github.quxiucheng.parser.javacc.grammar;

public class JavaCCGrammarTokenManager implements JavaCCGrammarConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 4;
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 40:
         return jjStopAtPos(0, 14);
      case 41:
         return jjStopAtPos(0, 15);
      case 44:
         return jjStopAtPos(0, 9);
      case 61:
         return jjStopAtPos(0, 13);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x140L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 83:
      case 115:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         break;
      default :
         return 2;
   }
   return 2;
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x140L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      default :
         return 3;
   }
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 3;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x140L);
      case 77:
      case 109:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(3, 10);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      default :
         return 4;
   }
   return 4;
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 4;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 4;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      case 69:
      case 101:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(4, 12);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x180L);
      default :
         return 5;
   }
   return 5;
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 5;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 5;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(5, 7);
         else if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(5, 8);
         break;
      case 84:
      case 116:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(5, 6);
         break;
      default :
         return 6;
   }
   return 6;
}
static final int[] jjnextStates = {
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\54", null, null, null, 
"\75", "\50", "\51", };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0xffc1L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[0];
private final int[] jjstateSet = new int[0];
protected char curChar;
public JavaCCGrammarTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public JavaCCGrammarTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 0; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
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

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
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

}
