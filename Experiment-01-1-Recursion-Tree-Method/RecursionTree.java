public class RecursionTree {
    static long operations = 0;
    static void process(int n) {
        if (n <= 1) {
            operations++;
            return;
        }
        for (int i = 0; i < n; i++) {
            operations++;
        }
        process(n / 2);
        process(n / 2);
    }
    static void displayTree() {
        System.out.println("             T(8) + 8");
        System.out.println("            /         \\");
        System.out.println("       T(4) + 4     T(4) + 4");
        System.out.println("        /    \\       /    \\");
        System.out.println("   T(2)+2 T(2)+2 T(2)+2 T(2)+2");
        System.out.println("    / \\     / \\    / \\     / \\");
        System.out.println(" T(1)+1 repeated eight times");
    }
    public static void main(String[] args) {
        int n = 8;
        long start = System.nanoTime();
        process(n);
        long end = System.nanoTime();
        displayTree();
        System.out.println("\\nOverhead Cost at Each Level:");
        System.out.println("Level 0 : n");
        System.out.println("Level 1 : n/2 + n/2 = n");
        System.out.println("Level 2 : n/4 + n/4 + n/4 + n/4 = n");
        System.out.println("Level 3 : eight leaves; constant work per leaf");
        System.out.println("\\nRecurrence Relation : T(n) = 2T(n/2) + n");
        System.out.println("Time Complexity : O(n log n)");
        System.out.println("Execution Time : " + (end-start) + " ns");
    }
}
