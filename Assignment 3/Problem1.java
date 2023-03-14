/*Problem 1:  Define a class Time having four private data members; hour, min, and sec. The class must have folllowing methods:
 A default constructor
 A parameterized constructor
 A displayTime() method to display the time in HH:MM:SS format.
 A setTime(byte,byte,byte) to set the values of hour, min, and sec.
 An addTime(Time,Time) method to add two Time objects passes as
arguments and store the result in the object that has called the method.
 A subtractTime(Time,Time) method : to subtract two Time objects passes as
arguments and store the result in the object that has called the method.
 toSeconds() method to convert the time into number of seconds
 tohours() method to convert the time into total number of hours*/

import java.util.*;

class Time{
    int hour,min,sec;
    
    Time(){                        //Default constructor
        hour=0;
        min=0;
        sec=0;
    }
    
    Time(int hr,int mt,int sc){         //Parameterized constructor
        hour=hr;
        min=mt;
        sec=sc;
    }
    
    void DisplayTime(){                 //Display time
        System.out.println("The time: "+hour+":"+min+":"+sec);
    }
    
    void setTime(byte h,byte m,byte s){      //Setting time
        hour=(byte)h;
        min=(byte)m;
        sec=(byte)s;
    }
    
    Time addTime(Time t1,Time t2){           //Addition of two times
        Time t3=new Time();
        t3.hour=t1.hour+t2.hour;
        t3.min=t1.min+t2.min;
        t3.sec=t1.sec+t2.sec;
        
        if(t3.sec>=60)
        {
            t3.min++;
            t3.sec-=60;
        }
        
        if(t3.min>=60)
        {
            t3.hour++;
            t3.min-=60;
        }
        
        return t3;
    }
    
    Time subtractTime(Time t1,Time t2){      //Subtraction of two times
        Time t3=new Time();
        if(t1.hour>t2.hour)
        {
            t3.hour=t1.hour-t2.hour;
            if(t1.min<t2.min)
            {
                t3.min=(t1.min+60)-t2.min;
                t3.hour--;
            }
            else
                t3.min=t1.min-t2.min;
            if(t1.sec<t2.sec)
            {
                t3.sec=(t1.sec+60)-t2.sec;
                t3.min--;
            }
            else
                t3.sec=t1.sec-t2.sec;
        }
        
        else
        {
            t3.hour=t2.hour-t1.hour;
            if(t2.min<t1.min)
            {
                t3.min=(t2.min+60)-t1.min;
                t3.hour--;
            }
            else
                t3.min=t2.min-t1.min;
            if(t2.sec<t1.sec)
            {
                t3.sec=(t2.sec+60)-t1.sec;
                t3.min--;
            }
            else
                t3.sec=t2.sec-t1.sec;
        }
        
        return t3;
    }
    
    void toSeconds(){                   //Convert to seconds
        int second;
        second=(((hour*60)+min)*60)+sec;
        
        System.out.println("The total seconds: "+second);
    }
    
    void toHours(){                     //Convert to hours
        double hours;
        hours=(double)((double)((double)(sec/60)+min)/60)+hour;
        
        System.out.println("The total hours: "+hours);
    }
}
class Problem1 {
    public static void main(String[] args) {
        System.out.println("Enter the 1st time: ");
        Scanner sc1=new Scanner(System.in);
        int hour1=sc1.nextInt();
        int min1=sc1.nextInt();
        int sec1=sc1.nextInt();
        Time t1=new Time(hour1,min1,sec1);             //1st object creation
        
        t1.DisplayTime();
        
        System.out.println("Enter the 2nd time: ");
        Scanner sc2=new Scanner(System.in);
        int hour2=sc2.nextInt();
        int min2=sc2.nextInt();
        int sec2=sc2.nextInt();
        Time t2=new Time(hour2,min2,sec2);             //2nd object creation
        
        t2.DisplayTime();
        
        Time t3=new Time();
        
        System.out.println("After addition: ");
        t3=t3.addTime(t1,t2);
        t3.DisplayTime();
        
        Time t4=new Time();
        
        System.out.println("After subtraction: ");
        t4=t4.subtractTime(t1,t2);
        t4.DisplayTime();
        
        t1.toSeconds();
        t1.toHours();
    }
}
