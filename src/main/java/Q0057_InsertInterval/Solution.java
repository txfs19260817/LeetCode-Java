package Q0057_InsertInterval;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> intervalList = new ArrayList<>(List.of(intervals));
        intervalList.add(newInterval);
        intervalList.sort(Comparator.comparingInt((int[] a) -> a[0]));

        Stack<int[]> outStack = new Stack<>();
        outStack.add(intervalList.get(0));
        for (int i = 1; i < intervalList.size(); i++) {
            int[] interval = intervalList.get(i);
            if (outStack.peek()[1] >= interval[0]) {
                int[] top = outStack.pop();
                outStack.push(new int[]{top[0], Math.max(interval[1], top[1])});
            } else {
                outStack.add(interval);
            }
        }
        return outStack.toArray(new int[0][]);
    }
}