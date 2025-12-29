class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }

        int index = 0;
        int count = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[index]){
                if(count < 2){
                    index++;
                    count++;
                    nums[index] = nums[i];
                }
            }
            else{
                index++;
                count = 1;
                nums[index] = nums[i];
            }
        }

        return index + 1;
    }
}