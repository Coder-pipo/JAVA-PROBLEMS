/*2021PGCACA052

Problem 3: An user defined exception class : UserNumericString. This exception is thrown before when a string contains number values as substring in it. Override toString method to
display appropriate exception error message. */

import java.util.*;

class UserNumericString extends Exception{                       //UserNumericString class
     public String toString(){
          return "The string contains number values";
     }
}

public class Problem3 {
     static String Stringcheck(String str) throws UserNumericString{
          boolean numfound=false;
          for(int i=0;i<str.length();i++){
               if(str.charAt(i)>=0||str.charAt(i)<=9)
                    numfound=true;
                    break;
          }
          if(numfound){
               throw new UserNumericString();
          }
          return str;
     }
     
     public static void main(String args[])
     {
          
          System.out.println("Enter the string: ");              //Inputting string
          Scanner sc=new Scanner(System.in);
          String str=sc.nextLine();

          try{                                                        //Exception handling
               Stringcheck(str);
               System.out.println("The inputted string: "+str);
          }
          catch(UserNumericString e){
               System.out.println(e.toString());
          }
     }

}
