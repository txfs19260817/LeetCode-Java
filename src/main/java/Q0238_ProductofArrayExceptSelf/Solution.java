package Q0238_ProductofArrayExceptSelf;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        out[0] = 1;
        for (int i = 1; i < out.length; i++) {
            out[i] = out[i - 1] * nums[i - 1];
        }
        int r = 1;
        for (int i = out.length - 1; i >= 0; i--) {
            out[i] *= r;
            r *= nums[i];
        }
        return out;
    }
}