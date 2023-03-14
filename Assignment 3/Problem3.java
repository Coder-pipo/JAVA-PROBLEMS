/*Problem 3: Implement a class MyByte to add a data member with byte datatypes.
Implement and execute all the following member functions provided below:
 A default constructor ( set to 0)
 A parameterized constructor
 andOP() method to perform bitwise AND between two Byte objects.
 orOP() method to perform bitwise OR between to Byte objects.
 xorOP() method to perform bitwise XOR betwween to MyByte objects.
 mask() method to mak a set of bits of a given MyByte object.
 complement() method complement all the bits of a MyBite object.
Implement all the above question using an appropriate menu-driven program. */

import java.util.*;

class MyByte{
   
    byte b;
   
    MyByte(){
        b=0;
    }
   
    MyByte(byte bb){
        b=bb;
    }
   
    void setByte(byte bb){
        b=bb;
    }
   
    void andOP(MyByte b2){
        b=(byte)(b&b2.b);
    }
   
    void orOP(MyByte b2){
        b=(byte)(b|b2.b);
    }
   
    void xorOP(MyByte b2){
        b=(byte)(b^b2.b);
    }
   
    void mask(){
        System.out.println("Enter number of bits: ");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        byte need=0;

        for(int i=0;i<n;i++)
        {
            byte pos=sc.nextByte();
            need+=Math.pow(2,pos);
        }
        b=(byte)(b&need);
    }
   
    void complement(){
        b=(byte)(~b);
    }
   
    void display(){
        System.out.println("Value of MyByte data: "+b);
    }
   
}

class Problem3
{
public static void main(String[] args) {

   MyByte b=new MyByte();
   Scanner sc=new Scanner(System.in);
   
   int x=1;
   while(x>0){
       System.out.println("Menu");
       System.out.println("1. Set byte value");
       System.out.println("2. Perform and operation");
       System.out.println("3. Perform or operation");
       System.out.println("4. Perform xor operation");
       System.out.println("5. Make mask");
       System.out.println("6. Complement");
       System.out.println("7. Exit");
            System.out.println("Enter choice: ");
           
            int choice=sc.nextByte();
           
            switch(choice){
               
                case 1: {
                    System.out.println("Enter data: ");
                    byte ib=sc.nextByte();
                    b.setByte(ib);
                    break;
                }
                case 2:{
                    System.out.println("Enter 2nd data: ");
                    byte ib=sc.nextByte();
                   
                    MyByte b2=new MyByte(ib);
                    b.andOP(b2);
                    b.display();
                   
                    break;
                }
                case 3:{
                    System.out.println("Enter 2nd data: ");
                    byte ib=sc.nextByte();
                   
                    MyByte b2=new MyByte(ib);
                    b.orOP(b2);
                    b.display();
                   
                    break;
                }
                case 4:{
                    System.out.println("Enter 2nd data: ");
                    byte ib=sc.nextByte();
                   
                    MyByte b2=new MyByte(ib);
                    b.xorOP(b2);
                    b.display();
                   
                    break;
                }
                case 5:{
                    b.mask();
                    System.out.println(b.b);
                    break;
                }
                case 6:{
                    System.out.println("Enter data: ");
                    byte ib=sc.nextByte();
                   
                    b.complement();
                   
                    break;
                }
                case 7:{
                    x=0;
                }
                default : System.out.println("Invalid input");
            }
   }

}
}