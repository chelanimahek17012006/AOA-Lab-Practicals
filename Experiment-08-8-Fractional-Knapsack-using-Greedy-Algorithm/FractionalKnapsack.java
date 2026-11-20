import java.util.*;
public class FractionalKnapsack {
    static class Item {
        int itemNo;
        double profit,weight,ratio;
        Item(int no,double p,double w) {
            itemNo=no; profit=p; weight=w; ratio=p/w;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n=sc.nextInt();
        Item[] items=new Item[n];
        for(int i=0;i<n;i++) {
            System.out.println("\\nEnter details for Item "+(i+1));
            System.out.print("Enter profit: "); double p=sc.nextDouble();
            System.out.print("Enter weight: "); double w=sc.nextDouble();
            items[i]=new Item(i+1,p,w);
        }
        System.out.print("\\nEnter knapsack capacity: ");
        double capacity=sc.nextDouble();
        Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
        System.out.println("\\nItems after sorting by Profit/Weight ratio:");
        System.out.printf("%-8s %-10s %-10s %-15s%n","Item","Profit","Weight","Profit/Weight");
        for(Item x:items)
            System.out.printf("%-8d %-10.2f %-10.2f %-15.2f%n",x.itemNo,x.profit,x.weight,x.ratio);
        double total=0;
        System.out.println("\\nSelection of Items:");
        for(Item x:items) {
            if(capacity<=0) break;
            double take=Math.min(x.weight,capacity);
            double fraction=take/x.weight;
            total+=x.profit*fraction;
            capacity-=take;
            System.out.printf("Item %d -> %.2f%% selected, Weight = %.2f, Profit = %.2f%n",
                    x.itemNo,fraction*100,take,x.profit*fraction);
        }
        System.out.printf("\\nMaximum Profit = %.2f%n",total);
        System.out.println("\\nTime Complexity");
        System.out.println("Ratio Calculation : O(n)");
        System.out.println("Sorting by Ratio  : O(n log n)");
        System.out.println("Greedy Selection  : O(n)");
        System.out.println("Overall Complexity: O(n log n)");
        sc.close();
    }
}
