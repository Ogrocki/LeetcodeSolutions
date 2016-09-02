public class Solution {
    public int missingNumber(int[] nums) {
        int i=0; 
        Arrays.sort(nums);
        while(i<nums.length){
            if(nums[i]!=i) return i;
            i++;
        } 
        return i;
    }
}