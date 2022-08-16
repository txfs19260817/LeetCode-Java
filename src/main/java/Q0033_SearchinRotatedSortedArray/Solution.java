package Q0033_SearchinRotatedSortedArray;

class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > nums[l]) { // mid in the 1st half
                if (nums[mid] > target && target >= nums[l]) { // target locates between l and mid
                    r = mid;
                } else {
                    l = mid;
                }
            } else { // mid in the 2nd half
                if (nums[mid] < target && target <= nums[r]) { // target locates between mid and r
                    l = mid;
                } else {
                    r = mid;
                }
            }
        }
        if (nums[l] == target) return l;
        if (nums[r] == target) return r;
        return -1;
    }
}