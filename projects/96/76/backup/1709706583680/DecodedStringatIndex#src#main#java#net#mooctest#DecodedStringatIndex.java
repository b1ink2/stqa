package net.mooctest;

/**
 * 索引处的解码字符串
 * 
 * @author brianlin
 * 
 */
public class DecodedStringatIndex {
	public String decodeAtIndex(String S, int K) {
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
