/*Problem statement: 
Write a program to solve Classical Problems of Synchronization using Mutex and Semaphore.  
*/
package pract6;
import java.util.concurrent.Semaphore; 
class RW { 
    static Semaphore mutex = new Semaphore(1);   
    static Semaphore wrt = new Semaphore(1);     
    static int readCount = 0;                    
 
    static class Reader implements Runnable { 
        int readerId; 
 
        Reader(int id) { 
            this.readerId = id; 
        } 
 
        @Override 
        public void run() { 
            try { 
                mutex.acquire(); 
                readCount++; 
                if (readCount == 1) { 
                    wrt.acquire();  
                } 
                mutex.release(); 
 
                System.out.println(Thread.currentThread().getName() + " is READING"); 
                Thread.sleep(1000);  
                System.out.println(Thread.currentThread().getName() + " has FINISHED READING"); 
 
                mutex.acquire(); 
                readCount--; 
                if (readCount == 0) { 
                    wrt.release();  
                } 
                mutex.release(); 
 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
    } 

    static class Writer implements Runnable { 
        int writerId; 
 
        Writer(int id) { 
            this.writerId = id; 
        } 
 
        @Override 
        public void run() { 
            try { 
                wrt.acquire(); 
 
                System.out.println(Thread.currentThread().getName() + " is WRITING"); 
                Thread.sleep(1500);  
                System.out.println(Thread.currentThread().getName() + " has FINISHED WRITING"); 
 
                wrt.release(); 
 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
    } 
} 
 
public class pract6{ 
    public static void main (String[] args) { 
        Thread r1 = new Thread (new RW.Reader(1), "Reader - 1"); 
        Thread r2 = new Thread (new RW.Reader(2), "Reader - 2"); 
        Thread w1 = new Thread (new RW.Writer(1), "Writer - 1"); 
        Thread r3 = new Thread (new RW.Reader(3), "Reader - 3"); 
        Thread w2 = new Thread (new RW.Writer(2), "Writer - 2"); 
 
        r1.start(); 
        w1.start(); 
        r2.start(); 
        r3.start(); 
        w2.start(); 
    } 
} 