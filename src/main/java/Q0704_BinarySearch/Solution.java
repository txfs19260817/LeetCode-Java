package Q0704_BinarySearch;

class Solution {
    public int search(int[] nums, int target) {
        for (int l = 0, r = nums.length - 1; l <= r; ) {
            var mid = l + (r - l) / 2;
            var num = nums[mid];
            if (target == num) {
                return mid;
            }
            if (target > num) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}