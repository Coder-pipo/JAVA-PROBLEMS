/*Problem 4: Write a program in java for dress item purchasing and billing using checkbox in swing.*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Problem4 extends JFrame {
    final private Font mainFont =new Font("Times new roman",Font.BOLD,15);
    JLabel lbWelcome;
    JCheckBox cd1,cd2,cd3,cd4,cd5,cd6;

    public void initialize(){
        
        JPanel formPanel =new JPanel();
        formPanel.setLayout(new GridLayout(2,3,5,2));
        
        cd1 = new JCheckBox("Saree @3500");
        cd1.setFont(mainFont);
        formPanel.add(cd1);

        cd2 = new JCheckBox("Kurta-Pajama set @4000");
        cd2.setFont(mainFont);
        formPanel.add(cd2);

        cd3 = new JCheckBox("5 tshirt combo @2500");
        cd3.setFont(mainFont);
        formPanel.add(cd3);

        cd4 = new JCheckBox("Denim-Tshirt @1700");
        cd4.setFont(mainFont);
        formPanel.add(cd4);

        cd5 = new JCheckBox("Kurti set @1000");
        cd5.setFont(mainFont);
        formPanel.add(cd5);

        cd6 = new JCheckBox("Shorts combo @500");
        cd6.setFont(mainFont);
        formPanel.add(cd6);

        lbWelcome=new JLabel();
        lbWelcome.setFont(mainFont);

        JButton btnOK=new JButton("OK");
        btnOK.setFont(mainFont);

        btnOK.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                float amount=0;
                String msg="";
                if(cd1.isSelected()){
                    amount+=3500;
                    msg+="Saree---3500\n";
                }
                if(cd2.isSelected()){
                    amount+=4000;
                    msg+="Kurta-Pajama set---4000\n";
                }
                if(cd3.isSelected()){
                    amount+=2500;
                    msg+="5 tshirt combo---2500\n";
                }
                if(cd4.isSelected()){
                    amount+=1700;
                    msg+="Denim-Tshirt---1700\n";
                }
                if(cd5.isSelected()){
                    amount+=1000;
                    msg+="Kurti set---1000\n";
                }
                if(cd6.isSelected()){
                    amount+=500;
                    msg+="Shorts combo---500\n";
                }
                msg+="-----------------\n";
                JOptionPane.showMessageDialog(null,msg+"Total Bill: "+amount);
            }

        });


        JButton btnClear=new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                lbWelcome.setText("");
            }});

        JPanel buttonsPanel=new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);

        JPanel mainPanel =new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(formPanel,BorderLayout.NORTH);
        mainPanel.add(lbWelcome,BorderLayout.CENTER);
        mainPanel.add(buttonsPanel,BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("Problem 4");
        setSize(500,600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Problem4 myFrame=new Problem4();
        myFrame.initialize();
    }


}