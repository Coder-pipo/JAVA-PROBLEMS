/*Assignment 1: Write a program in java to initialize an integer value n and compute 4096n, (1/1024)n using shift operator.*/

import java.util.*;
class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value of n: ");
        long n=sc.nextInt();        //Inputting
        double val;
        
        val=n<<12;                  //Calculation of 4096n
        System.out.println("The required value: "+val);
        val=n>>10;                  //Calculation of (1/1024)n
        System.out.println("The required value: "+val);
    }
}
