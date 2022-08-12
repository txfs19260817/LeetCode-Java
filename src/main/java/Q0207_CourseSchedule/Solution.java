package Q0207_CourseSchedule;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, HashSet<Integer>> to2from = new HashMap<>(numCourses);
        // prerequisite: [to <- from]
        for (int[] prerequisite : prerequisites) {
            HashSet<Integer> s = to2from.getOrDefault(prerequisite[0], new HashSet<>());
            s.add(prerequisite[1]);
            to2from.put(prerequisite[0], s);
        }
        // use Set to build a queue to do BFS
        // init it with nodes whose in-degree is 0
        HashSet<Integer> q = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            if (!to2from.containsKey(i)) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            HashSet<Integer> p = new HashSet<>();
            for (Integer node : q) {
                to2from.remove(node); // remove 0 in-degree nodes from graph first
                to2from.forEach((to, from) -> {
                    from.remove(node); // remove 0 in-degree nodes from `from` node set
                    if (from.isEmpty()) {
                        p.add(to); // now `to` is a 0 in-degree node, push it to the next queue
                    } else {
                        to2from.put(to, from); // update `from` node set
                    }
                });
            }
            q = p;
        }
        return to2from.size() == 0;
    }
}