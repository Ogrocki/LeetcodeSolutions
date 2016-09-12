public class Solution {
    public int addDigits(int num) {
        while(true){
            int temp=0;
            while(num>0){
                temp=temp+num%10;
                num=num/10;
            }
            num=temp;
            if(num<10) return num;
        }
    }
}