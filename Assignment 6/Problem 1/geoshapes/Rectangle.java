//Rectangle class

package geoshapes;

public class Rectangle {
     double len,bre;

     public Rectangle(double l,double b){
          len=l;
          bre=b;
     }

     public double area(){
          return len*bre;
     }

     public double perimeter(){
          return 2*(len+bre);
     }
}
