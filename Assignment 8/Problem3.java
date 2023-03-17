//2021PGCACA052

/*Problem 3: Write a java program to perform character circular left and right shift with the given number of times. */

import java.util.*;

class Problem3
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the string: ");                               //Inputting string
          String str=sc.nextLine();
          String s=str;

          System.out.print("Enter the number of time left shifted: ");          //Number of left shift
          int left=sc.nextInt();

          String str1=str.substring(left);
          String str2=str.substring(0,left);

          System.out.println("The string after shifting left: "+(str1+str2));     //Displayed after left shift

          System.out.print("Enter the number of time right shifted: ");         //Number of right shift
          int right=sc.nextInt();

          String str3=s.substring(s.length()-right);
          String str4=s.substring(0,s.length()-right);

          System.out.println("The string after shifting left: "+(str3+str4));     //Displayed after right shift
     }
}