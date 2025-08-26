class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length <= 1){
            return nums.length;
        }

        //ArrayList<Integer> uniqueNums = new ArrayList(Arrays.asList(nums));

        int index = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[index - 1]){
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}