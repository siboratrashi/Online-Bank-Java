/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinebankingsystem;

import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JLabel;

public class GUI {
    public static void main(String[] args){
        JFrame frame = new JFrame("");
        frame.setSize(400,400);
        JLabel label = new JLabel("Online Banking System");
        label.setBounds(50, 50, 300, 30);
        
        JButton button = new JButton("Welcome!");
        button.setBounds(100, 100, 100, 40);
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);            
        }
    });
        frame.add(label);
        frame.add(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
}
}
