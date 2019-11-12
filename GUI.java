import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.awt.event.*;  
import java.awt.*;
import javax.swing.*;    

public class GUI {  
    /**
     * @wbp.parser.entryPoint
     */
    public static void gui(ArrayList<String> xxx) { 
       //Create and set up the window
        JFrame frame = new JFrame ("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel("Click on a method to show its code, or Exit to exit." ,SwingConstants.CENTER); 
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        //Display the window
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true); 
        
        //Exit button
        JButton exit=new JButton("Exit"); //Create a button with text
        exit.setBounds(50,100,150,30); //Button coordinates-change 3rd for length
        frame.getContentPane().add(exit); 
        frame.setSize(400,400); //Size of terminal screen (width, length)
        frame.getContentPane().setLayout(null);
        frame.setVisible(true); //Set the terminal to visible
        exit.addActionListener(new ActionListener() //waiting for user to click button
        {
            public void actionPerformed(ActionEvent exit) { //if user clicks button
                System.exit(0); //exit
            }   
        });
        
        for(int i = 0; i < xxx.size(); i++){
            String val = xxx.get(i);
            JButton a = new JButton(val); //Create a button with text
            a.setBounds(50,150 + i*50,150,30); //Button coordinates-change 3rd for length
            frame.getContentPane().add(a); 
            frame.setSize(400,400); //Size of terminal screen (width, length)
            frame.getContentPane().setLayout(null);
            frame.setVisible(true); //Set the terminal to visible
            a.addActionListener(new ActionListener() //waiting for user to click button
            {
                public void actionPerformed(ActionEvent a) { //if user clicks button
                	PrintCode.temporarycode(val);
                }   
            });
                
       }
    }
} 