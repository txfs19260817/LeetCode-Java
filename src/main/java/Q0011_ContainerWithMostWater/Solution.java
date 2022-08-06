package Q0011_ContainerWithMostWater;

class Solution {
    public int maxArea(int[] height) {
        int ans = 0, l = 0, r = height.length - 1;
        while (l < r) {
            int hl = height[l], hr = height[r];
            ans = Math.max(ans, (r - l) * Math.min(hl, hr));
            if (hl < hr) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}