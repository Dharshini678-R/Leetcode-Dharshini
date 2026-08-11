// Last updated: 8/11/2026, 4:07:35 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int odd = 1;
       for(int even=0;even<nums.length;even+=2){
        if(nums[even]%2!=0){
            while(nums[odd]%2!=0){
                odd+=2;
            }
            int temp = nums[even];
            nums[even] = nums[odd];
            nums[odd] = temp;
        }
       }
       return nums;
    }
}