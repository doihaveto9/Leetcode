class Solution {
    public int maxArea(int[] height) {
        // int maxArea = 0;
        // int area = 0;

        // for(int i = 0; i < height.length - 1; i++){
        //     for(int j = i + 1; j < height.length; j++){
        //         area = (Math.min(height[i], height[j]) * (j - i));

        //         if(area > maxArea)
        //             maxArea = area;
        //     }
        // }

        // return maxArea;

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}