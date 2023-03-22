//Co-ordinate class

package coordinates;

public class Cartesian{
     double x,y;

     public Cartesian(double v1,double v2){
          x=v1;
          y=v2;
     }

     public void display(){
          System.out.println("The cartesian co-ordinates: ("+x+","+y+")");
     }

     public void toPolar(){                 
          double r=Math.sqrt(x*x+y*y);
          double theta=Math.atan(y*1.0/x);

          if(x>=0 && y>=0){
          }
          
          else if(x<0 && y>=0){
               theta += 3.1399992;
          }

          else if(x<0 && y<0){
               theta += 3.1399992;
          }
          
          else{
               theta += 3.1399992*2;
          }
          
          System.out.println("Polar coordinates P("+r+","+theta+")");
     }
}
