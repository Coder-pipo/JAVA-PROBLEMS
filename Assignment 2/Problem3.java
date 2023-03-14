/*Problem 3: Write a program in java to input two integers a and b and compute gcd(a,b) using both recursive and non-recursive method.*/

import java.util.*;

class Problem3 {
    static int rec_gcd(int num1,int num2){             //Gcd calculation using recursion
        
          if(num1%num2==0)
               return num2;
           
          return rec_gcd(num2,num1%num2);
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");     //Inputting two numbers
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       
        int val=0;
        if(a==0)
            val=b;
           
        else if(b==0)
            val=a;
           
        else{
            for(int i=1;i<=a&&i<=b;i++)                    //Calculation using non-recursion
            {
                if(a%i==0&&b%i==0)
                    val=i;
            }
        }
        System.out.println("The gcd using recursion: "+rec_gcd(a,b));
        System.out.println("The gcd using non-recursion: "+ val);
    }
}