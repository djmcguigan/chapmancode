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

public class Directions extends JFrame{
    private Toolkit toolkit;
    private JLabel info;
    private JPanel panel;
    private String directions;
    
    /**
     * Constructor for Direction window
     */
    public Directions(){
        setTitle("Jeopardy Help Desk");
        setSize(600,500);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        directions = "<html> DIRECTIONS: <br>" + 
                              "1. Select a topic <br>" + 
                              "2. Click Begin <br>" +
                              "3. In game area, select a point value <br>" +
                              "4. Answer the question in the textfield and click submit. <br>" +
                              "5. After the game, if your score is in the top 10, then you will be prompted to enter your initials for the records. <br>";
                              
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