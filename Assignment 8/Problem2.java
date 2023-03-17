//2021PGCACA052

/*Problem 2: Write a java program to input a string and perform inserting, replacing, and deleting a substring using build-in methods. */

import java.util.*;

class Problem2 
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the string: ");
          String str=sc.nextLine();

          System.out.print("Enter the string to be inserted: ");                     //Insertion
          String s=sc.nextLine();

          StringBuilder sb=new StringBuilder(str);
          sb.insert(str.length(),s);

          System.out.println("The string after insertion: "+sb);                          //Display
          
          System.out.print("Enter the string to be replaced: ");                     //Replacement
          String r=sc.nextLine();
          
          System.out.print("Enter the indexes to be replaced: ");
          int start=sc.nextInt();
          int end=sc.nextInt();

          sb.replace(start,end,s);

          System.out.println("The string after replacement: "+sb);                          //Display
     
          System.out.print("Enter the indexes to be deleted: ");                     //Deletion
          int start_index=sc.nextInt();
          int end_index=sc.nextInt();

          sb.delete(start_index,end_index);

          System.out.println("The string after deletion: "+sb);                          //Display
     }
}
