/**
 * Review Game: Directions Class
 * Author: McGuigy
 * Date: 02/24/10-02/26/10
 * School: Valencia HS (OC)
 * Computer: #19 (Dell Intel QuadCore)
 * IDE: Blue J
 * Purpose: Display directions for program in help menu
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class WriterDirections extends JFrame{
    private Toolkit toolkit;
    private JLabel info;
    private JPanel panel;
    private String directions;
    
    /**
     * Constructor for Direction window
     */
    public WriterDirections(){
        setTitle("Jeopardy Help Desk");
        setSize(600,500);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        directions = "<html> DIRECTIONS: <br>" + 
                              "1. Enter a name for a file. <br>" + 
                              "2. Enter the question and answer into relative spot. <br>" +
                              "3. Click 'ADD' <br>" +
                              "4. Continue until you have added all desired questions. <br>" +
                              "5. Click 'FINISHED' when finished. <br>";
                              
        panel = new JPanel();
        panel.setLayout(null);
        
        /*
         * creates the text of the window
         */
        info = new JLabel(directions);
        info.setBounds(20,20,500,200);
        info.setFont(new Font("Georgia", Font.PLAIN, 14));
        
        /*
         * creates button for close function
         */
        JButton close = new JButton("Close");
        close.setBounds(20,300,100,50);
        close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                dispose();
            }
        });
        
        /*
         * adds objects to window pane
         */
        panel.add(info, BorderLayout.CENTER);
        
        getContentPane().add(panel);
        
        panel.add(close);
        
        /*
         * sets window to be displayed on screen
         */
        setVisible(true);
    }
}