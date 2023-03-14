/*Problem 1: Implement and demonstrate the following multi-level inheritance scenario in java.
Class : Bus
Members: regdno, model, capacity
Methods: showbusdetails()

Class : PublicBus(inherits Bus)
Members : owner, from, to, depttime, arrivaltime
Methods: showbusdetails()

Class: LuxuryPublicBus (inherits PublicBus)
Members : isAC, isWifi, noofsleeperseat
Methods: showbusdetails() */

import java.util.*;

class Bus{                                        //Bus class
    String regdno,model;
    int capacity;
    
    Bus(String r,String m,int c){
        regdno=r;
        model=m;
        capacity=c;
    }
    
    void showbusdetails(){
        System.out.println("Registration number: "+regdno);
        System.out.println("Model: "+model);
        System.out.println("Capacity: "+capacity);
    }
}

class PublicBus extends Bus{                      //PublicBus class inherits Bus class 
    String owner,from,to,depttime,arrivaltime;
    
    PublicBus(String r,String m,int c,String o,String f,String t,String d,String a){
        super(r,m,c);
        owner=o;
        from=f;
        to=t;
        depttime=d;
        arrivaltime=a;
        regdno=r;
        model=m;
        capacity=c;
        
    }
    
    void showbusdetails(){
        System.out.println("Owner: "+owner);
        System.out.println("From: "+from);
        System.out.println("To: "+to);
        System.out.println("Departure time: "+depttime);
        System.out.println("Arrival time: "+arrivaltime);
    }
}

class LuxuryPublicBus extends PublicBus{          //LuxuryPublicBus class inherits PublicBus class
    String isAC,isWifi;
    int noofsleeperseat;
    
    LuxuryPublicBus(String r,String m,int c,String o,String f,String t,String d,String a,String AC,String Wifi,int n){
        super(r,m,c,o,f,t,d,a);
        isAC=AC;
        isWifi=Wifi;
        noofsleeperseat=n;
    }
    
    void showbusdetails(){
        System.out.println("Is AC or Non-AC: "+isAC);
        System.out.println("Is Wifi available or not: "+isWifi);
        System.out.println("Number of sleeper seat: "+noofsleeperseat);
    }
}
class Problem1{
    public static void main(String[] args) {
                                                       //Inputting bus details
        System.out.println("Enter the registration no, model, capacity,owner,from,to,departure time, arrival time if the bus has AC,Wifi and no of seats of the bus: ");
        Scanner sc=new Scanner(System.in);
        String regdno=sc.nextLine();
        String model=sc.nextLine();
        int capacity=sc.nextInt();
    
        String owner=sc.nextLine();
        String from=sc.nextLine();
        String to=sc.nextLine();
        String departtime=sc.nextLine();
        String arrivaltime=sc.nextLine();
        
        String isAC=sc.nextLine();
        String isWifi=sc.nextLine();
        int noofsleeperseat=sc.nextInt();
        LuxuryPublicBus LB=new LuxuryPublicBus(regdno,model,capacity,owner,from,to,departtime,arrivaltime,isAC,isWifi,noofsleeperseat);
        LB.showbusdetails();
    }
}
