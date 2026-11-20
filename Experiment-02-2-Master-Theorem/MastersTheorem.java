import java.util.Scanner;
public class MastersTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Master's Theorem =====");
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter exponent k of f(n) = O(n^k): ");
        double k = sc.nextDouble();
        double p = Math.log(a) / Math.log(b);
        System.out.println("\\nRecurrence:");
        System.out.println("T(n) = " + a + " T(n/" + b + ") + O(n^" + k + ")");
        System.out.println("\\nValue of log_b(a): " + p);
        if (k < p) {
            System.out.println("\\nMaster's Theorem Case 1 applies.");
            System.out.println("Since k < log_b(a)");
            System.out.printf("Time Complexity: O(n^%.2f)%n", p);
        } else if (Math.abs(k - p) < 0.000001) {
            System.out.println("\\nMaster's Theorem Case 2 applies.");
            System.out.println("Since k = log_b(a)");
            System.out.printf("Time Complexity: O(n^%.2f log n)%n", p);
        } else {
            System.out.println("\\nMaster's Theorem Case 3 applies (regularity condition assumed).");
            System.out.println("Since k > log_b(a)");
            System.out.printf("Time Complexity: O(n^%.2f)%n", k);
        }
        sc.close();
    }
}
