//2021PGCACA052

/*Problem 1: Write a java program to input two strings str1, str2, and a length k, and output whether both string has a common substring of length k. If found, write the initial index of matching
substring of both str1 and str2. */

import java.util.*;

class Problem1
{
     public static void substringequal(String str1,String str2,int k)
     {
          boolean flag=false;
          for(int i=0;i<str1.length()-k+1;i++)
          {
               for(int j=0;j<str2.length()-k+1;j++)
               {
                    if(str1.substring(i,i+k).equals(str2.substring(j,j+k)))               //Comparing substrings
                    {
                         System.out.println("True "+i+" "+j);                        //Indexes
                         flag=true;
                         return;
                    }
               }
          }

          if(flag==false)
               System.out.println("No common subsequence is found");
     }
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the first string: ");               //1st string input
          String str1=sc.nextLine();

          System.out.print("Enter the second string: ");              //2nd string input
          String str2=sc.nextLine();

          System.out.print("Enter the size of substring: ");          //size of substring input
          int k=sc.nextInt();

          substringequal(str1,str2,k);
     }
}
