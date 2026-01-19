public class findMedianSortedArrays {
    
}
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

 

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Get total size of array and median point, this is so we know what number in the sequence would be the median
        int totalSize = nums1.length + nums2.length;
        int medianPoint = totalSize / 2;

        // If either nums1 or nums2 is empty, we only consider the other for finding the median
        if(nums1.length == 0){
            if(totalSize % 2 == 1){
                return (double) nums2[medianPoint];
            }
            else {
                return ((double) (((double) nums2[medianPoint - 1] + (double) nums2[medianPoint]) / 2));
            }
        }

        if(nums2.length == 0){
            if(totalSize % 2 == 1){
                return (double) nums1[medianPoint];
            }
            else {
                return ((double) (((double) nums1[medianPoint - 1] + (double) nums1[medianPoint]) / 2));
            }
        }

        // Establish 2 counters to increment over both arrays, first we determine which array has the lowest initial value
        // And start from the 2nd value of that array, while the other starts at the first. This is because we know which
        // number would go first in the sorted merged array
        int nums1Increment = nums1[0] <= nums2[0] ? 1 : 0;
        int nums2Increment = nums1[0] <= nums2[0] ? 0 : 1;

        // We establish currentNum and previousNum to serve as the median we are looking for
        int currentNum = nums1[0] <= nums2[0] ? nums1[0] : nums2[0];
        int previousNum = 0;

        // Loop over the arrays until our combined counters add up to surpass the established median point
        while((nums1Increment + nums2Increment) <= medianPoint){
            // If we hit the end of nums1 or nums2 before hitting the median point, all other numbers are taken solely from the other array
            // This is to prevent overflow in the array
            if(nums1Increment == nums1.length){
                previousNum = currentNum;
                currentNum = nums2[nums2Increment];
                nums2Increment++;
            }
            else if(nums2Increment == nums2.length){
                previousNum = currentNum;
                currentNum = nums1[nums1Increment];
                nums1Increment++;
            }
            // Until we hit that point, we compare the current value of nums1 with the current value of nums2, whichever one is lower will be incremented
            // to look at the next value. Before then, the previousNum value is set to what currentNum currently is, and currentNum is then set to the value
            // we just determined is lesser. This is so we have both numbers we need to find the median in case the 
            else if(nums1[nums1Increment] <= nums2[nums2Increment]){
                previousNum = currentNum;
                currentNum = nums1[nums1Increment];
                nums1Increment++;
            }
            else{
                previousNum = currentNum;
                currentNum = nums2[nums2Increment];
                nums2Increment++;
            }
        }

        if(totalSize % 2 == 1){
            return (double) currentNum;
        }
        else{
            return (double) ((double) (currentNum + previousNum) / 2.0d);
        }
    }
}