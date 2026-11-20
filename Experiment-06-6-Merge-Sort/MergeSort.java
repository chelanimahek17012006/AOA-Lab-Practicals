import java.util.*;
public class MergeSort {
    static void mergeSort(int[] a,int left,int right) {
        if(left>=right) return;
        int mid=(left+right)/2;
        mergeSort(a,left,mid);
        mergeSort(a,mid+1,right);
        merge(a,left,mid,right);
    }
    static void merge(int[] a,int l,int m,int r) {
        int n1=m-l+1, n2=r-m;
        int[] L=new int[n1], R=new int[n2];
        for(int i=0;i<n1;i++) L[i]=a[l+i];
        for(int j=0;j<n2;j++) R[j]=a[m+1+j];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2) {
            if(L[i]<=R[j]) a[k++]=L[i++];
            else a[k++]=R[j++];
        }
        while(i<n1) a[k++]=L[i++];
        while(j<n2) a[k++]=R[j++];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers separated by space (count first): ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println("Original Array : "+Arrays.toString(a));
        long start=System.nanoTime();
        mergeSort(a,0,n-1);
        long end=System.nanoTime();
        System.out.println("Sorted Array   : "+Arrays.toString(a));
        System.out.println("Execution Time : "+(end-start)+" ns");
        System.out.println("Time Complexity : O(n log n)");
        System.out.println("Space Complexity: O(n)");
        sc.close();
    }
}
