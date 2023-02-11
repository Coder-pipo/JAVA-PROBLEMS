/*Define a class Battery having data field: level which indicate its energy level. When an object is instantiated it has 100 units battery level. The class must implement the following methods:
 A default constructor
 showLevel() method to show the current battery level.
 sendMsg() method is used to consume 2 units of battery on each call
 recvMsg() method is used to consume 1 unit of battery on each call
 compute() method consumes 1.5 unit of battery on each call
 recharge(minutes) method update the battery level , 1 unit per 2 minutes.*/

import java.util.*;

class Battery{
    double level;
    
    Battery(){                          //Default constructor
        level=100;
    }
    
    Battery(double l){                  //Parameterized constructor
        level=l;
    }
    
    void showLevel(){                   //Showing current level
        System.out.println("The current battery level: "+level);
    }
    
    void sendMsg(){                     //Sending message
        level=level-2;
        System.out.println("Message sent!! The current battery level: "+level);
    }
    
    void recvMsg(){                     //Recieving message 
        level=level-1;
        System.out.println("Message recieved!!The current battery level: "+level);
    }
    
    void compute(){                     //Compute
        level=level-1.5;
        System.out.println("Computed!!The current battery level: "+level);
    }
    
    void recharge(double minutes){      //Recharge
        level=level+minutes/2;
        System.out.println("Recharged!!The current battery level: "+level);
    }
}
class Problem2 {
    public static void main(String[] args) {
        System.out.println("Enter battery level: ");
        Scanner sc=new Scanner(System.in);
        double l=sc.nextDouble();
        Battery b=new Battery(l);            //Object creation
        
        b.showLevel();
        
        b.sendMsg();
        
        b.recvMsg();
        
        b.compute();
        
        System.out.println("Enter the minutes: ");
        double minutes=sc.nextDouble();
        
        b.recharge(minutes);
    }
}