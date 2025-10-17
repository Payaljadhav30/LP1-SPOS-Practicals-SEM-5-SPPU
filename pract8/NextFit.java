package pract8;

import java.util.Scanner; 
public class NextFit { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter number of memory blocks: "); 
        int m = sc.nextInt(); 
        int blockSize[] = new int[m]; 
        System.out.println("Enter block sizes:"); 
        for (int i = 0; i < m; i++) blockSize[i] = sc.nextInt(); 
 
        System.out.print("Enter number of processes: "); 
        int n = sc.nextInt(); 
        int processSize[] = new int[n]; 
        System.out.println("Enter process sizes:"); 
        for (int i = 0; i < n; i++) processSize[i] = sc.nextInt(); 
 
        int allocation[] = new int[n]; 
        for (int i = 0; i < n; i++) allocation[i] = -1; 
 
        int j = 0;  
 
        for (int i = 0; i < n; i++) { 
            int count = 0; 
            while (count < m) { 
                if (blockSize[j] >= processSize[i]) { 
                    allocation[i] = j; 
                    blockSize[j] -= processSize[i]; 
                    break; 
                } 
                j = (j + 1) % m;  
                count++; 
            } 
        } 
 
        System.out.println("\nProcess No.\tProcess Size\tBlock No."); 
        for (int i = 0; i < n; i++) { 
            if (allocation[i] != -1) 
                System.out.println((i+1) + "\t\t" + processSize[i] + "\t\t" + (allocation[i]+1)); 
            else 
                System.out.println((i+1) + "\t\t" + processSize[i] + "\t\tNot Alloacated"); 
        } 
        sc.close(); 
    } 
} 