/**
 * Review Game: GameBoard Class
 * Author: McGuigy
 * Date: many moons
 * School: Valencia HS (OC)
 * Computer: #19 (Dell Intel QuadCore)
 * IDE: Blue J
 * Purpose: create gameboard GUI and functionality
 */



import java.util.*;
import java.io.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;


public class GameBoard extends JFrame{
    private static JButton[] field = new JButton[25];        //stores the buttons in the gameboard
    private String[] questions = new String[25];              //stores questions for current game
    private String[] answers = new String[25];                //stores answers for question array data
    private Toolkit toolkit;                                                    //yeah
    private int num;                                                              //used multiple times for various counting iterations
    private int choice;                                                          //the selected random number to select the question
    private int random;                                                        //the variable used to find a random number for question selection
    private static int score;                                                 //the score         duh
    private ArrayList<Integer> used;                                //stores random numbers once used to select a question
    private static JTextArea scoreboard;                         //displays current score
    private JPanel panel;                                                   //contains the things the user sees
    private int bounds = 0;                                                 //modifier for the x direction
    private int questionValue = 0;                                     //int version of the value of the question
    private int modifier;                                                       //modifier for the y direction
    
    public GameBoard(String gameTopic, String fileName){
        toolkit = getToolkit();
        
        setTitle("Jeopardy: " + gameTopic);
        setSize(toolkit.getScreenSize());

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        panel = new JPanel();
        getContentPane().add(panel);
        
        panel.setLayout(null);
        
        JButton help = new JButton("Help Menu");
        help.setBounds(250,800,100,50);
        help.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                Help meun = new Help();
            }
        });
        
        score = 0;//------------------------------------------------------------------------------->sets default score to 0
        
        scoreboard = new JTextArea();
        scoreboard.setBounds(20, 800, 100, 50);
        scoreboard.setEditable(false);
        scoreboard.setText(score + "");
        
        //fill questions/answers arrays with questions/answers
        Scanner deathToTrees;
        try{
            deathToTrees = new Scanner(new File(fileName));
            int counter = 0;
            int index = 1;
            while(counter < questions.length){
                questions[counter] = deathToTrees.nextLine();
                answers[counter] = deathToTrees.nextLine();
                counter++;
            }
        }catch(IOException io){
            JOptionPane.showMessageDialog(panel, "File not found.", "Uh Oh......", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        used = new ArrayList<Integer>();
        
        
        // initialize gameboard
        num = 0;
       random = returnRandom();
        
        while(num < field.length){
            if(num < 5){
                questionValue = 200;
                modifier = 0;
            }
            else if(num > 4 && num < 10){
                questionValue = 400;
            }   
            else if(num > 9 && num < 15){
                questionValue = 600;
            }
            else if(num > 14 && num < 20){
                questionValue = 800;
            }
            else if(num > 19 && num < 25){
                questionValue = 1000;
            }
        
            field[num] = new JButton(questionValue + "");
            if(num == 5){
                bounds = 0;
                modifier += 100;
            }
            else if(num == 10){
                bounds = 0;
                modifier += 100;
            }
            else if(num == 15){
                bounds = 0;
                modifier += 100;
            }
            else if(num == 20){
                bounds = 0;
                modifier += 100;
            }
            field[num].setBounds(100 + bounds, 200 + modifier, 200, 100);
            field[num].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    JButton temp = (JButton)event.getSource();
                    int index = 0;
                    while(!(temp.equals(field[index]))){
                        index++;
                    }
                    if(index < 5){
                        questionValue = 200;
                    }
                    else if(index > 4 && index < 10){
                        questionValue = 400;
                    }   
                    else if(index > 9 && index < 15){
                        questionValue = 600;
                    }
                    else if(index > 14 && index < 20){
                        questionValue = 800;
                    }
                    else if(index > 19 && index < 25){
                        questionValue = 1000;
                    }
                    if(temp.getLabel().equals("Already Chosen")){
                        JOptionPane.showMessageDialog(panel, "That option has already been chosen.  Please choose another.", "Option Unavailable, nubber.....", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        QuestionBox question = new QuestionBox(questions[random], answers[random], questionValue, score);
                        temp.setLabel("Already Chosen");
                        random = returnRandom();                                
                    }
                    if(gameOver()){
                        dispose();
                    }
                }
            });
            num++;
            bounds += 200;
        }
        
        num = 0;
        while(num < field.length){
            panel.add(field[num]);
            num++;
        }
        panel.add(help);
        panel.add(scoreboard);
        setVisible(true);
        
    }
    
    /**
     * checks to see if the number has been used
     * 
     * @param num the generated random integer
     * @return true if contained
     * @return false if not contained
     */
    private boolean contains(Integer num){
        int k = 0;
        while(k < used.size()){
            if(num.equals(used.get(k))){
                return true;
            }
        }
        return false;
    }
    
    /**
     * gets the point value of the question
     * 
     * @param
     * @return value of the question
     */
    private int getQuestionValue(){
        return questionValue;
    }
    
    /**
     * updates score
     * 
     * @param newScore the new score
     * @return
     */
    public static void updateScore(int newScore){
        score = newScore;
        scoreboard.setText(score + "");
    }
    
    /**
     * checks to see if game has been completed
     * 
     * @param
     * @return true game completed
     * @return false game incomplete
     */
    public static boolean gameOver(){
        for(JButton button: field){
            if(!(button.getLabel().equals("Already Chosen"))){
                return false;
            }
        }
        return true;
    }
    
    /**
     * returns a random integer value
     * 
     * @param
     * @return random int to choose question
     */
    private int returnRandom(){
        int rand = (int)(Math.random() * 25);
        int counter = 0;
        while(counter < used.size()){
            if(used.get(counter) == rand){
                rand = (int)(Math.random() * 25);
                counter = 0;
            }
            counter++;
        }
        used.add(rand);
        return rand;
    }
 }