class Solution {
    public int removeElement(int[] nums, int val) {
        // if(nums.length == 0){
        //     return nums.length;
        // }

        // Map<Integer, Integer> numsMap = new HashMap<>();

        // int index = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != val){
        //         // System.out.println(nums[i]);
        //         // System.out.println(index);
        //         numsMap.put(index, nums[i]);
        //         index++;
        //     }
        // }

        // for(Map.Entry<Integer, Integer> entry: numsMap.entrySet()){
        //     // System.out.println(entry.getValue());
        //     // System.out.println(entry.getKey());
        //     nums[entry.getKey()] = entry.getValue();
        // }

        // return index;

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {

                nums[index] = nums[i];

                index++;

            }

        }

        return index;
    }
}