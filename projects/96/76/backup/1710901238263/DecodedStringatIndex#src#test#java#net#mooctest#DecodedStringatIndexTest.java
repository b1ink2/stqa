package net.mooctest;
import static org.junit.Assert.*;
import org.junit.Test;

public class DecodedStringatIndexTest {
    String result1 = decodeAtIndexOri("", 0);
    String result2 = decodeAtIndexOri("a1qwdsvr2", 10);
    String result3 = decodeAtIndexOri("a12", 2);
  @Test(timeout = 4000)
  public void test0() {

      assertEquals(null,new DecodedStringatIndex().decodeAtIndex("0", 1));
      assertEquals(result3,new DecodedStringatIndex().decodeAtIndex("a12", 2));
      assertEquals(result2,new DecodedStringatIndex().decodeAtIndex("a1qwdsvr2", 10));
      assertEquals(result1,new DecodedStringatIndex().decodeAtIndex("", 0));
      assertEquals(null,new DecodedStringatIndex().decodeAtIndex("a1b", 98));
      assertEquals("b",new DecodedStringatIndex().decodeAtIndex("a1b", 2));
  }
  
  public String decodeAtIndexOri(String S, int K) {
      char[] chs=S.toCharArray();
      long size=0; 
      for(char ch:chs){
          if(Character.isDigit(ch)) size*=(int)(ch-'0');
          else size++;
      }
      if(K>size) return null;
      long sNo=size;
      for(int ix=chs.length-1;ix>=0;ix--){
          char ch=chs[ix];
          if(K==0 && Character.isLetter(ch)) return String.valueOf(ch);
          if(Character.isDigit(ch)){
              int dgt=(int)(ch-'0');
              sNo=sNo/dgt; 
              K%=sNo; 
          }else if( K==sNo ){
              return String.valueOf(ch);
          }else{
              sNo--;
          }
      }
      return null;
    }

}