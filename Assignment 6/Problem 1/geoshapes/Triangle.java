//Triangle class

package geoshapes;

public class Triangle {
     double t1,t2,t3;

     public Triangle(double a,double b,double c){
          t1=a;
          t2=b;
          t3=c;
     }

     public double area(){
          double s;
          s=(t1+t2+t3)/2;
          return Math.sqrt(s*(s-t1)*(s-t2)*(s-t3));
     }

     public double perimeter(){
          return (t1+t2+t3);
     }
}
