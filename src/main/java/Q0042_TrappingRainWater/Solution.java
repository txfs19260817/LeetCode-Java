package Q0042_TrappingRainWater;

class Solution {
    public int trap(int[] height) {
        int ans = 0, leftMaxHeight = 0, rightMaxHeight = 0;
        for (int l = 0, r = height.length - 1; l < r; ) {
            if (height[l] <= height[r]) {
                leftMaxHeight = Math.max(leftMaxHeight, height[l]);
                ans += leftMaxHeight - height[l];
                l++;
            } else {
                rightMaxHeight = Math.max(rightMaxHeight, height[r]);
                ans += rightMaxHeight - height[r];
                r--;
            }
        }
        return ans;
    }
}