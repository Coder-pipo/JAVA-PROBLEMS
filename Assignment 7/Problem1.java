/*1) Demonstrate the printing of alphabets from ‘a’ to ‘z’ using multithreading environment.*/

class Display implements Runnable
{
     Thread t1;
     String name;
     char c = 'a';
     Display(String threadName) {
          name = threadName;
          t1 = new Thread(this,name);
          System.out.println("Child thread: " + t1);
          t1.start();                                                                  // Start the thread
     }
     public void run() {
          try {
               for(char i='a'; i <= 'z'; i++)
                    System.out.print(i + " ");
               System.out.println();
               Thread.sleep(1000);

          }catch(InterruptedException e) {
               System.out.println(name + " interrupted.");
          }
          System.out.println(name + " Exiting ");
     }

}
class Problem1{
     public static void main(String[] args) {
          new Display("push");                                            // start threads
          try {                                                                      // wait for other threads to end
               Thread.sleep(20000);
          }catch (InterruptedException e) {
               System.out.println("Main thread Interrupted");
          }
          
          System.out.println("Main thread exiting.");
     }
}
