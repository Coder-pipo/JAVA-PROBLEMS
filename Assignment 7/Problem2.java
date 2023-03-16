/*2) Demonstrate the Shortest Job First Process Scheduling Algorithm using java multithreading. Here, assume that job size is decided by the numbers elements (n) a
method is going to print from 1 to n. For example, a method called to print elements from 1 to 5 has higher priority than a method called to print from 1 to 10. */

class Display implements Runnable {

     Thread t;
     int n;
     String s;
     Display(int priority, int n) {
         t = new Thread(this,"Print Thread "+n);
         t.setPriority(priority);
         t.start();
         this.n = n;
     }
 
     @Override
     public void run() {
          for (int i=1;i<=n;i++)
             System.out.println(t.getName()+" "+i);
     }
}
 
public class Problem2 {
     public static void main(String[] args) {
         new Display(5, 100);
         new Display(10, 50);
     }
}
