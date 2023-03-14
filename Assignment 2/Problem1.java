/*Problem 1: Write a program to input endpoints of two lines and display whether two lines are parallel or intersecting each other.*/

import java.util.*;

class Problem1 {
    public static void main(String[] args) {
        System.out.println("Enter the points of the first line: ");        //Inputting points for 1st line
        Scanner sc1=new Scanner(System.in);
        double w1=sc1.nextDouble();
        double x1=sc1.nextDouble();
        double w2=sc1.nextDouble();
        double x2=sc1.nextDouble();
       
        System.out.println("Enter the points of the second line: ");       //Inputting points for 2nd line
        Scanner sc2=new Scanner(System.in);
        double y1=sc2.nextDouble();
        double z1=sc2.nextDouble();
        double y2=sc2.nextDouble();
        double z2=sc2.nextDouble();
       
        double slope1=(w2-w1)/(x2-x1);                                          //Calculating slope
        double slope2=(y2-y1)/(z2-z1);
       
        if(slope1==slope2)
            System.out.println("Parallel");
           
        else
            System.out.println("Intersecting");
    }
}
