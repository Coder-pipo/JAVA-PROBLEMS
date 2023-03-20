/*1) Create a user-defined package named ‘geoshapes’. In this package, define the
following classes with necessary methods such as area and perimeter.
i) Circle
ii) Rectangle
iii) Triangle
iv) Sphere
import the package and demonstrate the use of objects of each defined class. */


import geoshapes.*;
import java.util.*;

public class Problem1{
     public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the radius of the circle: ");
          double cir_rad=sc.nextDouble();
          Circle c=new Circle(cir_rad);

          System.out.println("The area of the circle: "+c.area());
          System.out.println("The perimeter of the circle: "+c.perimeter());

          System.out.println("Enter the height and breadth of the rectangle: ");
          double len=sc.nextDouble();
          double bre=sc.nextDouble();
          Rectangle r=new Rectangle(len,bre);

          System.out.println("The area of the rectangle: "+r.area());
          System.out.println("The perimeter of the rectangle: "+r.perimeter());

          System.out.println("Enter the three sides of the triangle: ");
          double t1=sc.nextDouble();
          double t2=sc.nextDouble();
          double t3=sc.nextDouble();
          Triangle t=new Triangle(t1,t2,t3);

          System.out.println("The area of the triangle: "+t.area());
          System.out.println("The perimeter of the triangle: "+t.perimeter());

          System.out.println("Enter the radius of the sphere: ");
          double rad=sc.nextDouble();
          Sphere sp=new Sphere(rad);

          System.out.println("The area of the rectangle: "+sp.area());
          System.out.println("The perimeter of the rectangle: "+sp.perimeter());
     }
}
