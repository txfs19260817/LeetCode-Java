package Q0001_TwoSum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> num2idx = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int b = target - nums[i];
            if (num2idx.containsKey(b)) {
                return new int[]{num2idx.get(b), i};
            }
            num2idx.put(nums[i], i);
        }
        return new int[]{};
    }
}
