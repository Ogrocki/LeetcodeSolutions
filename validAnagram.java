public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        boolean checker = false;
        if(sa.length!=ta.length) return false;
        for(int si=0; si<sa.length;si++){
            for(int ti=0; ti<ta.length;ti++){
                if(ta[ti]==sa[si]){
                    ta[ti]=0;
                    sa[si]=0;
                    checker=true;
                    break;
                }
            }
            if(checker==false) return false;
            else checker=false;
        }
        return true;
    }
}