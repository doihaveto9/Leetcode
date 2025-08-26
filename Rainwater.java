class Solution {
    public int trap(int[] height) {
        if(height.length < 3){
            return 0;
        }

        int l = 0;
        int r = height.length - 1;
        int lmax = Integer.MIN_VALUE;
        int rmax = Integer.MIN_VALUE;
        int ans = 0;

        while (l < r) {
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);
            ans += (lmax < rmax) ? lmax - height[l++] : rmax - height[r--];
        }
        return ans;
}
}