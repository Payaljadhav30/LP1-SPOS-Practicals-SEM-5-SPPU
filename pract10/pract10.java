/*Problem Statement: 
Write a Java program to implement Banker ‘s Algorithm. 
*/ 
package pract10;
import java.util.*; 
public class pract10 
{ 
    int[] available; 
    int[][] need; 
    int[][] allocation; 
    int[][] max; 
    int n,m; 
    public pract10(int n, int m) { 
        this.n = n;   
        this.m = m;   
        allocation = new int[n][m]; 
        max = new int[n][m]; 
        need = new int[n][m]; 
        available = new int[m]; 
    } 
 
    public void getInput() 
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter allocation matrix : "); 
        for(int i=0; i<n;i++) 
        { 
            for(int j=0;j<m;j++) 
            { 
                allocation[i][j] = sc.nextInt(); 
            } 
        } 
 
        System.out.println("Enter max matrix : "); 
        for(int i=0;i<n;i++) 
        { 
            for(int j=0;j<m;j++) 
            { 

                max[i][j] = sc.nextInt(); 
            } 
        } 
        System.out.println("Enter Available Resources:"); 
        for (int j = 0; j < m; j++) 
        { 
            available[j] = sc.nextInt(); 
        } 
 
    
       for(int i = 0; i < n; i++) 
       { 
            for(int j = 0; j<m; j++) 
            { 
                need[i][j] = max[i][j] - allocation[i][j]; 
            } 
       } 
       sc.close(); 
    } 
 
    public boolean checkSafety() 
    { 
        boolean[] finish = new boolean[n];              
        int[] safeSequence = new int[n]; 
        int[] work = available.clone(); 
        int count = 0; 
 
        while (count < n) { 
            boolean found = false; 
            for (int i = 0; i < n; i++) { 
                if (!finish[i]) { 
                    int j; 
                    for (j = 0; j < m; j++) { 
                        if (need[i][j] > work[j]) 
                            break; 
                    } 
 
                    if (j == m)  
                    { 
                        for (int k = 0; k < m; k++) 
                        { 
 
                            work[k] += allocation[i][k];      
                        } 
                        safeSequence[count++] = i; 
                        finish[i] = true; 
                        found = true; 
                    } 
                } 
            } 
            if (!found)  
            { 
                System.out.println("System is NOT in a safe state."); 
                return false; 
            } 
        } 
 
        System.out.print("System is in a SAFE state.\nSafe Sequence: "); 
        for (int i = 0; i < n; i++) 
        { 
            System.out.print("P" + safeSequence[i] + " "); 
        } 
        System.out.println(); 
        return true; 
    } 
 
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter number of processes: "); 
        int n = sc.nextInt(); 
        System.out.print("Enter number of resources: "); 

        int m = sc.nextInt(); 
        pract10 b = new pract10(n,m); 
        b.getInput(); 
        b.checkSafety(); 
        sc.close(); 
    } 
}