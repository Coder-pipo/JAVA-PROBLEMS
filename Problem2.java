/*Assignment 2: Write a java program to apply mod operation for each entry and display multiplication table of modulo n. */

import java.util.*;
class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value of n: ");
        int n=sc.nextInt();                                 //Inputting
        int twoD[][]=new int[n][n];                         //2D array
        int i,j;
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                twoD[i][j]=(i*j)%n;                         //Multiplication table of modulo n
            }
        }
        
        for(i=0;i<n;i++) 
        {
            for(j=0;j<n;j++)
                System.out.print(twoD[i][j] + " ");         //Display
            System.out.println();
        }
    }
}
