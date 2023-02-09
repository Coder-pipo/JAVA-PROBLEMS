/*Assignment 3: Write a program to perform following convertions:
a) Reads a number in feet, converts it to meters
b) Enter the minutes (e.g., 1 billion) and displays the number of years and days for
the minutes.
c) Read energy in horse power and convert into joules.*/

import java.util.*;
class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number in feet: ");
        float feet=sc.nextFloat();                              //Inputting in feet
        double meter=feet*0.3048;                               //Conversion feet->meter
        System.out.println(feet+" Feet = "+meter+" Meter");     //Display
        
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter minutes: ");                  
        long minute=sc1.nextLong();                             //Inputting
        long days,years=0;
        days=minute/(60*24);                                  
        if(days>365)
        {
            years=days/365;                                     //Days and year calculation
            days=days%365;
        }
        System.out.println(minute+" Minute = "+days+" Days & "+years+" Years");         //Display
        
        Scanner sc2=new Scanner(System.in);
        System.out.print("Enter energy in Horse power: ");  
        float energy=sc2.nextLong();                            //Inputting
        double joule=energy*735.50;                             //Conversion Horsepower->joule
        System.out.println(energy+" Horse power = "+joule+" Joule");        //Display
        
    }
}