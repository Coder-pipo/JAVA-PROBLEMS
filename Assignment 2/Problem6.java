/*Problem 6: Write a program to print the geometric series upto nth term given the value of a, r and n as input.*/

import java.util.*;

class Problem6{
    public static void main(String[] args) {
        System.out.println("Enter the value of a,r and n: ");
        Scanner sc=new Scanner(System.in);
       
        int a=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();
       
        long val=1;
        System.out.println(a+" ");
        for(int i=1;i<n;i++)
        {
            val=val*a*r;
            System.out.println(val+" ");
        }
    }
} 
