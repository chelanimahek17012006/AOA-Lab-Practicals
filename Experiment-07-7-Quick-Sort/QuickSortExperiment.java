import java.util.*;
public class QuickSortExperiment {
    static int comparisons=0;
    static void quickSort(int[] a,int low,int high) {
        if(low<high) {
            int p=partition(a,low,high);
            quickSort(a,low,p-1);
            quickSort(a,p+1,high);
        }
    }
    // First element is selected as pivot
    static int partition(int[] a,int low,int high) {
        int pivot=a[low], p=low+1, q=high;
        while(p<=q) {
            while(p<=high && a[p]<pivot) { comparisons++; p++; }
            if(p<=high) comparisons++;
            while(q>=low && a[q]>pivot) { comparisons++; q--; }
            if(q>=low) comparisons++;
            if(p<q) {
                int temp=a[p]; a[p]=a[q]; a[q]=temp;
                p++; q--;
        }
        a[low]=a[q]; a[q]=pivot;
        return q;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of product prices: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter product prices:");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println("\\nOriginal Product Prices:");
        System.out.println(Arrays.toString(a));
        long start=System.nanoTime();
        quickSort(a,0,n-1);
        long end=System.nanoTime();
        System.out.println("\\nSorted Product Prices:");
        System.out.println(Arrays.toString(a));
        System.out.println("\\nNumber of Comparisons : "+comparisons);
        System.out.println("Execution Time : "+(end-start)+" ns");
        System.out.println("\\nTIME COMPLEXITY ANALYSIS");
        System.out.println("Best Case: O(n log n)");
        System.out.println("Average Case: O(n log n)");
        System.out.println("Worst Case: O(n^2)");
        System.out.println("Space Complexity: Average O(log n), Worst O(n)");
        sc.close();
    }
}
