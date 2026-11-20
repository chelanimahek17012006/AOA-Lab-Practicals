import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements in sorted order:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print("Enter element to search: ");
        int key=sc.nextInt();
        int low=0, high=n-1, position=-1, step=1;
        System.out.println("\\nDivide and Conquer Process");
        while(low<=high) {
            int mid=(low+high)/2;
            System.out.println("\\nSTEP "+step++);
            System.out.println("low = "+low);
            System.out.println("high = "+high);
            System.out.println("mid = "+mid);
            System.out.println("Middle Element = "+arr[mid]);
            if(arr[mid]==key) { position=mid; break; }
            else if(key<arr[mid]) {
                System.out.println(key+" < "+arr[mid]+" : Search Left Half");
                high=mid-1;
            } else {
                System.out.println(key+" > "+arr[mid]+" : Search Right Half");
                low=mid+1;
            }
        }
        if(position!=-1) System.out.println("\\nElement Found at position "+(position+1));
        else System.out.println("\\nElement Not Found");
        sc.close();
    }
}
