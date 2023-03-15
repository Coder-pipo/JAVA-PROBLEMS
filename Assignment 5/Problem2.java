/*2021PGCACA052

Problem 2: An user defined exception class : UserVerySmallNumException. This exception is thrown before performing a/b, on finding that a/b is very small less than 0.00001. Override
toString method to display appropriate exception error message. */

import java.util.*;

class UserVerySmallNumException extends Exception{               //UserVerySmallNumException class
     public String toString(){
          return "Very small number exception encountered";
     }
}

class Problem2 {
     static float divide(float a,float b) throws UserVerySmallNumException{
          if(a/b<=0.00001)
               throw new UserVerySmallNumException();

          return a/b;
     }

     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the value of a and b: ");         //Inputting numbers
          float a=sc.nextFloat();
          float b=sc.nextFloat();
          float result;
          
          try {                                                  //Exception handling
               result=divide(a, b);
               System.out.println("The result: "+result);
          } catch (UserVerySmallNumException e) {
               System.out.println(e.toString());
          }
     }
}
