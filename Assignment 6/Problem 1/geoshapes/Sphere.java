//Sphere class

package geoshapes;

public class Sphere {
     double radius;

     public Sphere(double r){
          radius=r;
     }

     public double area(){
          return 4*3.14*radius*radius;
     }

     public double perimeter(){
          return 4*3.14*radius;
     }
}
