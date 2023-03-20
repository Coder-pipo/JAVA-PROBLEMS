/*Problem 1: Using the employee table with the following schema, write a jdbc based program in java to retrieve and display the FNAME, MNIT, and LNAME of all the employee whose age is above 40. */

import java.sql.*;
public class Problem1{
    public static void main(String arg[]){
          Connection connection = null;
          try {
               Class.forName("com.mysql.cj.jdbc.Driver");                  
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root",
                         "Pragna@2001");                                   
               Statement state;
               state = connection.createStatement();                                 
               ResultSet result;                                                     
               String myquery="select * from employee where Age>='40'";              
               result = state.executeQuery(myquery);                                 
               String fname,lname;                                                   
               int salary;
               while (result.next()) {                                               
                    fname = result.getString("Fname");
                    lname = result.getString("Lname");
                    salary = result.getInt("Salary");
                    System.out.println("FNAME : " + fname  + " LNAME : " + lname  + " SALARY : " + salary);
               }
               result.close();
               state.close();
               connection.close();                                                   
          }catch (Exception exception){
               System.out.println(exception);
          }
     }
}
