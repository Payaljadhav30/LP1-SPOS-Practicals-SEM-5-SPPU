package pract7;

import java.util.*;
class RR {
    public static void main(String[] args) {
        int at[] = {10,0,8,5}, bt[] = {2,10,4,5};
        int n = 4, tq = 1, rt[] = bt.clone(), ct[] = new int[n];
        int t = 0, done = 0;
        Queue<Integer> q = new LinkedList<>();

    
        for(int i=0;i<n;i++) if(at[i]==0) q.add(i);

        while(done < n){
            if(q.isEmpty()){ t++; for(int i=0;i<n;i++) if(at[i]==t) q.add(i); continue; }

            int i = q.poll();
            int exec = Math.min(tq, rt[i]);
            rt[i]-=exec; t+=exec;

            for(int j=0;j<n;j++) if(at[j]>t-exec && at[j]<=t && rt[j]>0 && !q.contains(j)) q.add(j);

            if(rt[i]>0) q.add(i);
            else { ct[i]=t; done++; }
        }

        System.out.println("P\tAT\tBT\tCT\tTAT\tWT");
        double sumTAT=0,sumWT=0;
        for(int i=0;i<n;i++){
            int tat=ct[i]-at[i], wt=tat-bt[i];
            sumTAT+=tat; sumWT+=wt;
            System.out.println("P"+(i+1)+"\t"+at[i]+"\t"+bt[i]+"\t"+ct[i]+"\t"+tat+"\t"+wt);
        }
        System.out.printf("Avg TAT=%.2f  Avg WT=%.2f\n",sumTAT/n,sumWT/n);
    }
}

