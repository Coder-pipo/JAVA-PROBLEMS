/*Problem1: Write a java program using swing to find factorial of a number. User is allowed to enter a number into the text field whose factorial is to be determined and displayed on a JLabel.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Problem1 extends JFrame {
     final private Font mainfont=new Font("Times New Roman", Font.BOLD,40);
     JTextField tfname,tlname ;
     JLabel lwelcome;
     static long solve(long n){
 
          if(n==0)
             return 1;
          long ans=n*solve(n-1);
          return ans;
     }

     public void initialize(){
 
          JLabel fname=new JLabel("Enter a Number:");
          fname.setFont(mainfont);
     
          tfname=new JTextField();
          tfname.setFont(mainfont);
          setVisible(true);
     
          JPanel formpane1=new JPanel();
          formpane1.setLayout(new GridLayout(4, 1, 5, 5));
          formpane1.setOpaque(false);
          formpane1.add(fname);
          formpane1.add(tfname);
     
          lwelcome=new JLabel();
          lwelcome.setFont(mainfont);
     
          JButton button=new JButton("ANSWER");
          button.setFont(mainfont);
     
          button.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                    String  first=tfname.getText();
                    long ans=solve(Long.parseLong(first));
                    lwelcome.setText("Factorial of the number is: " + ans );
               }
          });
 
 
          JButton btn1=new JButton("Clear");
          btn1.setFont(mainfont);
          btn1.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                         tfname.setText(" ");
                         lwelcome.setText(" ");
                    }
          });
     
          JPanel buttn=new JPanel();
          buttn.setLayout(new GridLayout(1, 2, 5, 5));
          buttn.setOpaque(false);
          buttn.add(button);
          buttn.add(btn1);
     
          JPanel mainPane1=new JPanel();
          mainPane1.setLayout(new BorderLayout());
          mainPane1.setBackground(new Color(255, 165, 0));
     
          mainPane1.add(formpane1, BorderLayout.NORTH);
          mainPane1.add(lwelcome, BorderLayout.CENTER);
          mainPane1.add(buttn, BorderLayout.SOUTH);
     
          add(mainPane1);
     
          setTitle("Problem 1");
          setSize(500, 600);
          setMinimumSize(new Dimension(300, 400));
          setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          setVisible(true);
          }
     
          public static void main(String[] args){
          Problem1 myFrame=new Problem1();
          myFrame.initialize();
     }
}
