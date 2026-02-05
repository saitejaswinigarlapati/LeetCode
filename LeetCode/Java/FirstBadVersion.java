public class FirstBadVersion {

    private static int bad = 4;

    public static boolean isBadVersion(int version) {
        return version >= bad;
    }

    public int firstBadVersion(int n) {
        int first = 1, last = n;

        while (first < last) {
            int mid = first + (last - first) / 2;

            if (isBadVersion(mid)) {
                last = mid;
            } else {
                first = mid + 1;
            }
        }

        return first;
    }

    public static void main(String[] args) {
        FirstBadVersion obj = new FirstBadVersion();
        int n = 5;
        System.out.println(obj.firstBadVersion(n)); 
    }
}
