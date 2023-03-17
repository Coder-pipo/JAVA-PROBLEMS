/*Problem 2: Write a program to use HashMap to implment login id and password database. Use the same to verify the username and password of a given user.*/

import java.util.*;
class login{
     
     HashMap<String,String> map;

     login(){
          map=new HashMap<>();
     }

     void sign_in(){                                                       //Sign-in method
          System.out.println("Enter your login id and password");
          Scanner in=new Scanner(System.in);
          String id=in.next();
          String password=in.next();
          map.put(id,password);
          System.out.println("Succesfully sign in");
     }

     void log_in(){                                                        //Login method
          System.out.println("Enter your login id and password");
          Scanner in=new Scanner(System.in);
          String i=in.next();
          String p=in.next();
          if(map.containsKey(i)&&p.equals(map.get(i)))
               System.out.println("Succesfully login");
          
          else
               System.out.println("Please enter valid id or password");
     }
}
class Problem2{
	public static void main(String args[]){

               login l1=new login();
               boolean f=true;
               
               while(f){
                    System.out.println("1: Login 2: Sign in 3: exit");
                    Scanner in=new Scanner(System.in);
                    int c=in.nextInt();
                    switch(c){
                         case 1: l1.log_in();
                                   break;

                         case 2: l1.sign_in();
                                   break;

                         case 3: f=false;
                                   break;
                         
                         default : System.out.println("Please enter valid option");
                    }
   	     }

	}
}