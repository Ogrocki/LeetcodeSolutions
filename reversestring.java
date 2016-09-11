public class Solution {
    public String reverseString(String s) {
        char[] cs=s.toCharArray();
        char[] cr=s.toCharArray();
        for(int i=0;i<cs.length;i++){
            cr[cs.length-1-i]=cs[i];
        }
        return new String(cr);
    }
}