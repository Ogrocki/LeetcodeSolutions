public class Solution {
    public int[] countBits(int num) {
        int[] finalReturn=new int[num+1];
        int x=0;
        for(int i=0;i<num;i++){
            x=0;
            char[] number = Integer.toBinaryString(i+1).toCharArray();
            for(int n=0; n<number.length; n++){
                if(number[n]=='1') x=x+1;
            }
            finalReturn[i+1]=x;
        }
        return finalReturn;
    }
}