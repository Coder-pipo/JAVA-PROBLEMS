/*Problem 5: Write a program in java to input a set of n integers and print the overall frequency (number of times a digit appeared in the given integers) of each digit of the set of
numbers.*/

import java.util.*;

class Problem5{
    public static void main(String[] args) {
        System.out.println("Enter no. of elements of array: ");       //Inputting no. array elements
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int[] arr=new int[n];
        boolean[] visited=new boolean[n];
        
        
        System.out.println("Enter the array elements: ");             //Inputting array elements
        for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();
                   
        for(int i=0;i<n;i++)
        {
            if(visited[i]==true)
                continue;
                
            int count = 1;
            for(int j=i+1;j<n;j++) 
            {
                if(arr[i]==arr[j]) 
                {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+": "+count);                     //Frequency calculation
        }
    }
}
