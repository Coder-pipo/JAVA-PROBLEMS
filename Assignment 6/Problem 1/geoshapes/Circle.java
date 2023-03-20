//Circle class

package geoshapes;

public class Circle{
     double radius;

     public Circle(double r){
          radius=r;
     }

     public double area(){
          return 3.14*radius*radius;
     }

     public double perimeter(){
          return 2*3.14*radius;
     }
}
