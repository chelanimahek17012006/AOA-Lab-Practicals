public class KnapsackDP {
    public static void main(String[] args) {
        int capacity=15;
        int[] weight={2,3,5,7,9};
        int[] value ={10,5,15,7,20};
        int n=weight.length;
        int[][] dp=new int[n+1][capacity+1];
        for(int i=1;i<=n;i++) {
            for(int w=0;w<=capacity;w++) {
                if(weight[i-1]<=w)
                    dp[i][w]=Math.max(value[i-1]+dp[i-1][w-weight[i-1]],dp[i-1][w]);
                else dp[i][w]=dp[i-1][w];
            }
        }
        boolean[] selected=new boolean[n];
        int w=capacity;
        for(int i=n;i>0;i--) {
            if(dp[i][w]!=dp[i-1][w]) {
                selected[i-1]=true;
                w-=weight[i-1];
            }
        }
        int totalWeight=0,totalValue=0;
        System.out.println("Item Details:");
        System.out.println("------------------------------");
        System.out.printf("%-10s %-12s %-10s%n","Item","Weight (kg)","Value");
        for(int i=0;i<n;i++)
            System.out.printf("%-10s %-12d %-10d%n","Item "+(i+1),weight[i],value[i]);
        System.out.println("\\nSelected Items:");
        System.out.println("------------------------------");
        for(int i=0;i<n;i++) if(selected[i]) {
            System.out.printf("%-10s %-12d %-10d%n","Item "+(i+1),weight[i],value[i]);
            totalWeight+=weight[i]; totalValue+=value[i];
        }
        System.out.println("\\nTotal Weight : "+totalWeight+" kg");
        System.out.println("Total Value  : "+totalValue);
        System.out.println("Capacity     : "+capacity+" kg");
        System.out.println("\\nDynamic Programming Matrix:");
        System.out.printf("%-18s","Items / Capacity");
        for(int j=0;j<=capacity;j++) System.out.printf("%4d",j);
        System.out.println();
        for(int i=0;i<=n;i++) {
            System.out.printf("%-18s",i==0?"No items":"Item "+i);
            for(int j=0;j<=capacity;j++) System.out.printf("%4d",dp[i][j]);
            System.out.println();
        }
        System.out.println("\\nTime Complexity: O(n * W)");
        System.out.println("Space Complexity: O(n * W)");
    }
}
