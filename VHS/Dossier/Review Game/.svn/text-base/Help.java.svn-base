/**
 * Review Game: Help Class
 * Author: McGuigy
 * Date: 02/19/10-03/12/10
 * School: Valencia HS (OC)
 * Computer: #19 (Dell Intel QuadCore)
 * IDE: Blue J
 * Purpose: Display a help menu
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

public class Help extends JFrame{
    private Toolkit toolkit;
    private JPanel panel;
    
    /**
     * constructor for help menu window
     */
    public Help(){
        setTitle("Help Menu");
        setSize(800,700);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        panel = new JPanel();
        getContentPane().add(panel);
        
        panel.setLayout(null);
        
        /*
         * creates direction for window
         */
        JLabel intro = new JLabel("Please select a help topic:");
        intro.setFont(new Font("Arial", Font.PLAIN, 22));
        intro.setVisible(true);
        intro.setBounds(20,20,500,200);
        
        /*
         * creates button to open Directions
         */
        JButton directions = new JButton("Directions");
        directions.setBounds(50,200,100,50);
        directions.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                Directions dirs = new Directions();
            }
        });
        
        /*
         * creates button to open WriterDirections
         */
        JButton writer = new JButton("Q. W. Help");
        writer.setBounds(200,200,100,50);
        writer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                WriterDirections qw = new WriterDirections();
            }
        });
        
        /*
         * creates button to handle closing function
         */
        JButton close = new JButton("Close");
        close.setBounds(500,300,100,50);
        close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                dispose();
            }
        });
        
        /*
         * adds objects to window pane
         */
        panel.add(intro);
        panel.add(directions);
        panel.add(writer);
        panel.add(close);
        
        /*
         * sets window to be displayed on screen
         */
        setVisible(true);
    }
}