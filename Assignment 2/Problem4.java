/*Problem 4: Write a java program to input two vector of length n using array and compute the dot product using for-each loop.*/

import java.util.*;

class Problem4 {
    public static void main(String[] args) {
        System.out.println("Enter no. of elements of vector: ");           //Inputting number of elements
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
       
        int[] arr1=new int[n1];
        System.out.println("Enter the vector elements: ");                 //Inputting 1st vector
        for(int i=0;i<n1;i++)
            arr1[i]=sc.nextInt();
       
        Scanner sc1=new Scanner(System.in);
        int[] arr2=new int[n1];
        System.out.println("Enter the vector elements: ");                 //Inputting 2nd vector
        for(int i=0;i<n1;i++)
            arr2[i]=sc1.nextInt();
       
        System.out.println("The dot product of the vector elements: ");    //Calculating dot product    
        for(int i=0;i<n1;i++)
        {
            int val=arr1[i]*arr2[i];
            System.out.print(val+" ");
        }
    }
}