/**
 * Review Game: Startup Class
 * Author: McGuigy
 * Date: many days 
 * School: Valencia HS (OC)
 * Computer: #19 (Dell Intel QuadCore)
 * IDE: Blue J
 * Purpose: Launch the program
 */


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

public class Startup extends JFrame implements ItemListener{
    private Toolkit toolkit;
    private JPanel panel;
    private JLabel title;
    protected static JComboBox gameChoices;
    private JButton start;
    private JButton help;
    private JButton quit;
    protected static String[] gameOptions = {"Computer Science A", "Computer Science AB"};
    private String gameChoice;
    private String gameFile;
    private int gameChoiceNum;
    
    
    /**
     * Constructor
     */
    public Startup(){
        setTitle("Welcome to Jeopardy");
        setSize(800,700);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel();
        getContentPane().add(panel);
        
        panel.setLayout(null);
        
        /**
         * creates title of program object
         */
        title = new JLabel("JEOPARDY");
        title.setFont(new Font("Arial Bold", Font.PLAIN, 28));
        title.setVisible(true);
        title.setBounds(50,50,500,250);
        
        /**
         * creates selection box of game choices
         */
        gameChoices = new JComboBox(gameOptions);
        gameChoices.setSelectedIndex(-1);
        gameChoices.setBounds(50,250,250,50);
        gameChoices.addItemListener(this);
        
        /**
         * creates button that will launch the selected game
         */
        start = new JButton("Begin");
        start.setBounds(50,400,100,50);
        start.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eve){
                try{
                    GameBoard game = new GameBoard(gameChoice, gameFile);
                }catch(Exception bob){
                    JOptionPane.showMessageDialog(panel,"You need to select a game to play!","Selection Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        /**
         * creates button that will launch the help menu
         */
        help = new JButton("HELP");
        help.setBounds(200, 400, 100, 50);
        help.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                Help menu = new Help();
            }
        });
        
        /**
         * creates button that will cease the program execution
         */
        quit = new JButton("QUIT");
        quit.setBounds(500, 400, 100, 50);
        quit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        
        /**
         * creates button that will launch the question writer
         */
        JButton writer = new JButton("Question Editor");
        writer.setBounds(50, 475, 150,50);
        writer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                QuestionWriter bob = new QuestionWriter();
            }
        });
        
        /**
         * adds all GUI elements to window
         */
        panel.add(title);
        panel.add(gameChoices);
        panel.add(start);
        panel.add(help);
        panel.add(quit);
        panel.add(writer);
        
        //sets the window to be displayed on the screen
        setVisible(true);
    }
    
    /**
     * 
     * @param event the occurance that will trigger the method
     * @return 
     */
    public void itemStateChanged(ItemEvent event){
        JComboBox bob = (JComboBox) event.getSource();
        int index = bob.getSelectedIndex();
        gameChoiceNum = index;
        gameChoice = (String)bob.getItemAt(index);
        gameFile = gameChoice + ".txt";
    }
    
    /**
     * creates instantiation when called
     * 
     * @param args array of arguments
     * @return
     */
    public static void main(String[] args){
        Startup test = new Startup();
    }
}