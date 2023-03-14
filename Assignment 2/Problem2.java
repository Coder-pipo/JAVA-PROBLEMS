/*Problem 2: Write a program to input center and radius of a circle with an arbitrary point and print whether the point is inside outside, or on the boundary of the circle.*/

import java.lang.Math;
import java.util.*;

class Problem2 {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");                 //Inputting radius
        Scanner sc1=new Scanner(System.in);
        double r=sc1.nextDouble();
       
        System.out.println("Enter the centre of the circle: ");                 //Inputting centre
        Scanner sc2=new Scanner(System.in);
        double c1=sc2.nextDouble();
        double c2=sc2.nextDouble();
       
        System.out.println("Enter the arbitary points of the circle: ");        //Inputting arbitary points
        Scanner sc3=new Scanner(System.in);
        double x1=sc3.nextDouble();
        double x2=sc3.nextDouble();
       
        double d=Math.sqrt(((x1-c1)*(x1-c1))+((x2-c2)*(x2-c2)));                     //Calculating distance
        
        if(d==r)
            System.out.println("On the boundary");
           
        else if(d<r)
            System.out.println("Inside");
           
        else
            System.out.println("Outside");
    }
}