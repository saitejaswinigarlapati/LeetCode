import java.util.PriorityQueue;

public class MaxAvgPassRatio {
    static class ClassInfo {
        double gain;
        int passed;
        int total;

        public ClassInfo(int passed, int total) {
            this.passed = passed;
            this.total = total;
            this.gain = (double)(passed + 1) / (total + 1) - (double)passed / total;
        }

        public void addStudent() {
            passed++;
            total++;
            gain = (double)(passed + 1) / (total + 1) - (double)passed / total;
        }
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int n = classes.length;
        PriorityQueue<ClassInfo> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b.gain, a.gain)
        );

        for (int[] c : classes) {
            int p = c[0], q = c[1];
            pq.offer(new ClassInfo(p, q));
        }

        for (int i = 0; i < extraStudents; i++) {
            ClassInfo top = pq.poll();
            top.addStudent();
            pq.offer(top);
        }

        double sum = 0.0;
        for (ClassInfo c : pq) {
            sum += (double)c.passed / c.total;
        }

        return sum / n;
    }

    public static void main(String[] args) {
        MaxAvgPassRatio s = new MaxAvgPassRatio();
        int[][] classes1 = {{1,2},{3,5},{2,2}};
        int extraStudents1 = 2;
        System.out.println(s.maxAverageRatio(classes1, extraStudents1));
    }
}

// Input: classes = [[1,2],[3,5],[2,2]], extraStudents = 2
// Output: 0.78333

// Input: classes = [[2,4],[3,9],[4,5],[2,10]], extraStudents = 4
// Output: 0.53485