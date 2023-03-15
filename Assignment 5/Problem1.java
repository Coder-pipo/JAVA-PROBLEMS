/* 2021PGCACA052
Problem 1: Write a Java program to handle each of the following exception during execution. Write a suitable finally block for the selected exceptions wherever found appropriate.

a) InterruptedException
b) ArrayIndexOutOfBoundsException
c) IllegalArgumentException
d) IndexOutOfBoundsException
e) NegativeArraySizeException
f) NullPointerException
g) IllegalAccessException */

import java.util.*;

class Problem1
{
     public static void main(String args[])
     {
          //Interrupted exception
          Scanner sc=new Scanner(System.in);
          try
          {
               System.out.println("Enter time till thread will wait: ");
               int n=sc.nextInt();

               System.out.println("Thread will wait till "+n+" milisecs");
               Thread.sleep(n);
          }catch(InterruptedException e)
          {
               System.out.println("Interrupted exception occur");
          }finally
          {
               System.out.println("InterruptedException finally block");
          }

          //Array Index Out of Bound Exception
          int arr[]={1,2,3,4,5,6};
          try {
               System.out.println("Enter any index of an array to be accessed: ");
               int n=sc.nextInt();
               System.out.println("Value at that index: "+arr[n]);
          } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("Exception occured as the size of the array: "+arr.length);
          } finally{
               System.out.println("ArrayIndexOutOfBoundsException finally block");
          }

          //Illegal Argument Exception
          try{
               System.out.println("Enter the value: ");
               int val=sc.nextInt();
               Thread.sleep(val);
          } catch(InterruptedException | IllegalArgumentException e){
               System.out.println("Exception occured "+e);
          }finally{
               System.out.println("IllegalArgumentException finally block");
          }

          //Index Out of Bound Exception
          try {
               System.out.println("Enter the string: ");
               String str=sc.next();
               System.out.println("Enter the index to access any string character: ");
               int n=sc.nextInt();
               System.out.println("The character at the index: "+str.charAt(n));
          } catch (IndexOutOfBoundsException e) {
               System.out.println(e);
          } finally{
               System.out.println("IndexOutOFBoundsException finally block");
          }

          //Negative Array Size Exception
          try {
               System.out.println("Enter the array size: ");
               int n=sc.nextInt();
               System.out.println("Array is created of size: "+n);
          } catch (NegativeArraySizeException e) {
               System.out.println("Exception occured: "+e);
          } finally{
               System.out.println("NegativeArraySizeException finally block");
          }

          //Null Pointer Exception
          try{
               String str=null;
               System.out.println("The length of the string: "+str.length());
          } catch(NullPointerException e){
               System.out.println("Exception occured "+e);
          } finally{
               System.out.println("NullPointerException finally block"); 
          }
     }
}
