import java.util.*;
public class JobSequencing {
    static class Job {
        String id; int deadline,profit;
        Job(String id,int d,int p) { this.id=id; deadline=d; profit=p; }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of jobs: ");
        int n=sc.nextInt();
        Job[] jobs=new Job[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter details for Job "+(i+1));
            System.out.print("Job ID: "); String id=sc.next();
            System.out.print("Deadline: "); int d=sc.nextInt();
            System.out.print("Profit: "); int p=sc.nextInt();
            jobs[i]=new Job(id,d,p);
        }
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);
        int maxDeadline=0;
        for(Job j:jobs) maxDeadline=Math.max(maxDeadline,j.deadline);
        Job[] slot=new Job[maxDeadline+1];
        int totalProfit=0;
        for(Job j:jobs) {
            for(int t=Math.min(j.deadline,maxDeadline);t>=1;t--) {
                if(slot[t]==null) {
                    slot[t]=j; totalProfit+=j.profit; break;
                }
            }
        }
        System.out.println("\\nScheduled Jobs:");
        for(int t=1;t<=maxDeadline;t++)
            if(slot[t]!=null)
                System.out.println("Slot "+t+": "+slot[t].id+
                        " (Profit = "+slot[t].profit+", Deadline = "+slot[t].deadline+")");
        System.out.println("Maximum Profit = "+totalProfit);
        sc.close();
    }
}
