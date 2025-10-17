package pract7;
import java.util.Scanner;
class SJF_NP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4; 
        int[] p = {1,2,3,4};
        int[] at = {10,0,8,5};
        int[] bt = {2,10,4,5};
        int[] wt = new int[n], tat = new int[n];
        boolean[] done = new boolean[n];
        int time=0, completed=0, totalWT=0, totalTAT=0;

        while(completed < n) {
            int idx=-1, minBT=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
                if(!done[i] && at[i]<=time && bt[i]<minBT)
                       { minBT=bt[i]; idx=i; }
            if(idx==-1) { time++; continue; }
            wt[idx]=time-at[idx];
            time += bt[idx];
            tat[idx]=wt[idx]+bt[idx];
            done[idx]=true; completed++;
            totalWT += wt[idx]; totalTAT += tat[idx];
        }

        System.out.println("P\tAT\tBT\tWT\tTAT");
        for(int i=0;i<n;i++)
            System.out.println("P"+p[i]+"\t"+at[i]+"\t"+bt[i]+"\t"+wt[i]+"\t"+tat[i]);

        System.out.println("Avg WT="+(float)totalWT/n);
        System.out.println("Avg TAT="+(float)totalTAT/n);
    }
}
