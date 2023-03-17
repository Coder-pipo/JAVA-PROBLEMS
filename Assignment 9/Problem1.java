/*Problem 1: Write a program to use ArrayList to implement railway ticket booking operations */

import java.util.*;

class railwayTicket{
	
	ArrayList<String> ticket;
	int max;

	railwayTicket(int max){
         this.ticket=new ArrayList<>();
         this.max=max;
	}

	void bookticket(){                                                         //Ticket booking method
          if(this.ticket.size()>=this.max)
               System.out.println("No ticket available");

          else
          {
               System.out.print("Enter name of the passanger: ");
               Scanner in=new Scanner(System.in);
               String name=in.next();
               ticket.add(name);
               System.out.println("Ticket booked");
          }
	}

	void cancelticket(){                                                       //Ticket cancel method
          System.out.print("Enter name of the passanger whose ticket you want to cancel: ");
        	Scanner in=new Scanner(System.in);
        	int index=-1;
        	String name=in.next();
        	for(int j=0;j<this.ticket.size();j++){
        	     String t=ticket.get(j);
               if(name.equals(t)==true){
                    ticket.remove(j);
                    index=j;
                    break;
               }
        	}

        	if(index==-1)
        	  	System.out.println("No data found. Please enter valid name.");

          else
        	     System.out.println("Ticket canceled");
	}

	void ticketleft(){                                                         //Empty seats display method
	     int ans=max-ticket.size();
	     System.out.println("Ticket left : "+ans);
	}
}

class Problem1{
	       public static void main(String args[]){

	       	     railwayTicket r1=new railwayTicket(20);
	       	     boolean f=true;

	       	     while(f){
	       	   	     System.out.println("1: Book ticket 2: Cancel ticket 3: Ticket left 4:exit ");
	       	   	     Scanner in= new Scanner(System.in);
	       	   	     int c=in.nextInt();
	       	   	     switch(c){
	       	   	          case 1: r1.bookticket();
                                        break;

	       	   	          case 2: r1.cancelticket();
                                        break;

	       	   	          case 3: r1.ticketleft();
                                        break;
	       	   	 
                              case 4: f=false;
                                        break;
	       	   	 
                              default: System.out.println("Please enter valid option");
	       	   	     }
	       	   }
	       }

}
