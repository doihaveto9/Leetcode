class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        
        if(nums.length == 0){
            return Arrays.asList();
        }

        if(nums.length == 1){
            return Arrays.asList(Integer.toString(nums[0]));
        }

        List<String> result = new ArrayList<String>();

        int current = nums[0];
        int past = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == current + 1){
                current = nums[i];
            }
            else{
                if(current == past){
                    result.add(Integer.toString(past));
                }
                else{
                    result.add(Integer.toString(past) + "->" + Integer.toString(current));
                }

                past = nums[i];
                current = nums[i];
            }
        }

        if(current == past){
            result.add(Integer.toString(past));
        }
        else{
            result.add(Integer.toString(past) + "->" + Integer.toString(current));
        }

        return result;
    }
}