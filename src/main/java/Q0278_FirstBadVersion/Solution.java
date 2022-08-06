package Q0278_FirstBadVersion;

interface VersionControl {
    boolean isBadVersion(int version);
}

public abstract class Solution implements VersionControl {
    public int firstBadVersion(int n) {
        int l = 0, r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}