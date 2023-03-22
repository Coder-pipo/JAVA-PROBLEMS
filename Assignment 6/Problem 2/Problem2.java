/*Problem 2: Create a user-defined package named as ‘coordinates’. Define two Classes namely
Cartesian and Polar in coordinate package with all necessary methods. Define methods
toPolar() and toCartesian() in Cartesian and Polar class respectively for converting in to
respective types of coordinate. Demonstrate the conversion in both way by importing the
package and using method of these objects. */

import coordinates.*;
import java.util.*;

public class Problem2 {
     public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the co-ordinates of Cartesian plane: ");         //Inputting cartesian co-ordinates
          double x=sc.nextDouble();
          double y=sc.nextDouble();
          Cartesian c=new Cartesian(x,y);
          c.display();
          c.toPolar();

          System.out.println("Enter the co-ordinates of Polar plane: ");             //Inputting polar co-ordinates
          double r=sc.nextDouble();
          double theta=sc.nextDouble();
          Polar p=new Polar(r,theta);
          p.display();
          p.toCartesian();
     }
}
