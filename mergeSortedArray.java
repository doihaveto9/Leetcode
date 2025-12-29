class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Instantiate 2 values that will be used to track progress across the two arrays
        int m_iterate = 0;
        int n_iterate = 0;

        // Instantiate counter which will be used to track progress in main nums1 array
        int counter = 0;

        // Create clone of nums1 to get m values from, this is easier than pushing the
        // values to the right
        int[] new_nums1 = nums1.clone();

        // Look over both arrays until ewither m or n iterate hits the passed limit
        while(m_iterate < m && n_iterate < n){
            // Place the lower number in the nums1 array, and increment the corresponding iterator and counter
            if(new_nums1[m_iterate] < nums2[n_iterate]){
                nums1[counter] = new_nums1[m_iterate];
                m_iterate++;
            }
            else if(new_nums1[m_iterate] >= nums2[n_iterate]){
                nums1[counter] = nums2[n_iterate];
                n_iterate++;
            }

            counter++;
        }

        // Afterwards, if either iterator has not hit the limit, dump the remaining values into the main array
        while(m_iterate < m){
            nums1[counter] = new_nums1[m_iterate];
            counter++;
            m_iterate++;
        }

        while(n_iterate < n){
            nums1[counter] = nums2[n_iterate];
            counter++;
            n_iterate++;
        }
    }
}