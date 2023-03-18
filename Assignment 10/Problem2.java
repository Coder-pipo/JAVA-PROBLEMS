/*Problem 2: Write a java program using swing to create three buttons. On clicking the first button it displays "Good Morning", clicking the second button displays "Hello" and  clicking the third button displays "Welcome". */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Problem2 extends JFrame{
     
     final private Font mainfont = new Font("Times new roman", Font.BOLD,30);
     JLabel lwelcome;
     public void initialize() {

          lwelcome=new JLabel();
          lwelcome.setFont(mainfont);

          JButton btn=new JButton("PRESS HERE");
          btn.setFont(mainfont);

          btn.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                    lwelcome.setText("Good Morning" );
               }
          });


          JButton btn1 = new JButton("PRESS HERE");
          btn1.setFont(mainfont);
          btn1.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                    lwelcome.setText("Hello");
               }
          });

          JButton btn2 = new JButton("PRESS HERE");
          btn2.setFont(mainfont);
          btn2.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                    lwelcome.setText("Welcome");
               }
          });

          JPanel buttn = new JPanel();
          buttn.setLayout(new GridLayout(1, 2, 10, 10));
          buttn.setOpaque(false);
          buttn.add(btn);
          buttn.add(btn1);
          buttn.add(btn2);

          JPanel mainPane1 = new JPanel();
          mainPane1.setLayout(new BorderLayout());
          mainPane1.setBackground(new Color(210, 109, 255));


          mainPane1.add(buttn, BorderLayout.NORTH);
          mainPane1.add(lwelcome, BorderLayout.CENTER);

          add(mainPane1);

          setTitle("Problem 2");
          setSize(500, 500);
          setMinimumSize(new Dimension(300, 400));
          setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          setVisible(true);
     }

     public static void main(String[] args){
          Problem2 myFrame = new Problem2();
          myFrame.initialize();

     }
}