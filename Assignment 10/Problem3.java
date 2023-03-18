/*Problem 3:Write a java program to create a button with the name of three countries and on  clicking a button it display the flag image of the respective country.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Problem3 extends JFrame {
     final private Font mainfont = new Font("Times new roman", Font.BOLD,15);
     JLabel lwelcome;
     public void initialize() {
          ImageIcon i= new ImageIcon("src/india.png");
          ImageIcon j= new ImageIcon("src/south_korea.jpeg");
          ImageIcon k= new ImageIcon("src/canada.png");

          lwelcome = new JLabel();
          lwelcome.setFont(mainfont);

          JButton btn = new JButton("INDIA");
          btn.setFont(mainfont);

          btn.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                    lwelcome.setText("Welcome to India" );
                    lwelcome.setIcon(i);
               }
          });


          JButton btn1 = new JButton("SOUTH KOREA");
          btn1.setFont(mainfont);
          btn1.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                    lwelcome.setText("Welcome to South Korea");
                    lwelcome.setIcon(j);
               }
          });

          JButton btn2 = new JButton("CANADA");
          btn2.setFont(mainfont);
          btn2.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                    lwelcome.setText("Welcome to Canada");
                    lwelcome.setIcon(k);
               }
          });

          JPanel buttn = new JPanel();
          buttn.setLayout(new GridLayout(1, 2, 5, 5));
          buttn.setOpaque(false);
          buttn.add(btn);
          buttn.add(btn1);
          buttn.add(btn2);

          JPanel mainPane1 = new JPanel();
          mainPane1.setLayout(new BorderLayout());
          mainPane1.setBackground(new Color(230, 15, 9));


          mainPane1.add(buttn, BorderLayout.NORTH);
          mainPane1.add(lwelcome, BorderLayout.CENTER);

          add(mainPane1);

          setTitle("Problem 3");
          setSize(500, 600);
          setMinimumSize(new Dimension(300, 400));
          setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          setVisible(true);
     }

     public static void main(String[] args){
          Problem3 myFrame = new Problem3();
          myFrame.initialize();

     }
}