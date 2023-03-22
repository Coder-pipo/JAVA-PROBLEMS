//Polar class

package coordinates;

public class Polar {
     double r,theta;

     public Polar(double r1,double t){
          r=r1;
          theta=t*0.017444444;
     }

     public void display(){
          System.out.println("The polar co-ordinates: ("+r+","+theta+")");
     }

     public void toCartesian(){
          double x = r * Math.cos(theta);
          double y = r * Math.sin(theta);
          System.out.println("Cartesian Coordinates P("+x+","+y+")");
     }
}
