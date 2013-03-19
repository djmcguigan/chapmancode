/**
 * ALTERNATE DESIGN --------> IN PROGRESS
 */


import java.awt.*;
import java.util.*;
import java.util.EventObject;
import java.io.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;


public class SuperDesign extends JFrame{
    private JButton[] field = new JButton[25];                  //stores the buttons in the gameboard
    private String[] topic1Questions = new String[6];             //stores the questions that the particular game is using
    private String[] topic1Answers = new String[5];               //stores the respective answers for the question set
    private String[] topic2Questions = new String[6];
    private String[] topic2Answers = new String[5];
    private String[] topic3Questions = new String[6];
    private String[] topic3Answers = new String[5];
    private String[] topic4Questions = new String[6];
    private String[] topic4Answers = new String[5];
    private String[] topic5Questions = new String[6];
    private String[] topic5Answers = new String[5];
    private String[] questions;
    private String[] answers;
    private Toolkit toolkit;                                                   //yeah
    private int num;                                                             //used multiple times for various counting iterations
    private int choice;                                                         //the selected random number to select the question
    private int random;                                                       //the variable used to find a random number for question selection
    private static int score;                                                //the score         duh
    private ArrayList<Integer> used;                               //stores random numbers once used to select a question
    private JTextArea scoreboard;                                   //displays current score
    private JPanel panel;                                                   //contains the things the user sees
    private int bounds = 0;                                                 //modifier for the x direction
    private int questionValue = 0;                                     //int version of the value of the question
    private int modifier;                                                       //modifier for the y direction
    
    public SuperDesign(String gameTopic, String fileName){
        toolkit = getToolkit();
        
        setTitle("Jeopardy: " + gameTopic);
        setSize(toolkit.getScreenSize());

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        panel = new JPanel();
        getContentPane().add(panel);
        
        panel.setLayout(null);
        
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
            while(counter < 56){
                if(counter ==0){
                    topic1Questions[index] = deathToTrees.nextLine();
                    counter++;
                }
                else if(counter < 6){
                    topic1Questions[index] = deathToTrees.nextLine();
                    topic1Answers[index-1] = deathToTrees.nextLine();
                    counter++;
                    index++;
                }
                else if(counter == 6){
                    topic2Questions[index] = deathToTrees.nextLine();
                    index = 1;
                    counter++;
                }
                else if(counter < 12){
                    topic2Questions[index] = deathToTrees.nextLine();
                    topic2Answers[index-1] = deathToTrees.nextLine();
                    index++;
                    counter++;
                }
                else if(counter == 12){
                    index = 1;
                    topic3Questions[index] = deathToTrees.nextLine();
                    counter++;
                }
                else if(counter < 18){
                    topic3Questions[index] = deathToTrees.nextLine();
                    topic3Answers[index-1] = deathToTrees.nextLine();
                    counter++;
                    index++;
                }
                else if(counter == 18){
                    index = 1;
                    topic4Questions[index] = deathToTrees.nextLine();
                    counter++;
                }
                else if(counter < 24){
                    topic4Questions[index] = deathToTrees.nextLine();
                    topic4Answers[index-1] = deathToTrees.nextLine();
                    counter++;
                    index++;
                }
                index = 1;
            }
        }catch(IOException io){
            System.out.println("Woe is you, " + io.getMessage());
        }
        
        used = new ArrayList<Integer>();
        
        
        // initialize gameboard
        num = 0;
        while(num < field.length){
            if(num < 5){
                questionValue = 200;
                modifier = 0;
                questions = topic1Questions;
                answers = topic1Answers;
            }
            else if(num > 4 && num < 10){
                questionValue = 400;
                questions = topic2Questions;
                answers = topic2Answers;
            }   
            else if(num > 9 && num < 15){
                questionValue = 600;
                questions = topic3Questions;
                answers = topic3Answers;
            }
            else if(num > 14 && num < 20){
                questionValue = 800;
                questions = topic4Questions;
                answers = topic4Answers;
            }
            else if(num > 21 && num < 25){
                questionValue = 1000;
                questions = topic5Questions;
                answers = topic5Answers;
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
                    if(gameOver()){
                        JOptionPane.showMessageDialog(panel, "Congratulations, you've completed the game! Your score was " + score, "w00t", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    }else{
                        while(!(temp.equals(field[index]))){
                            index++;
                        }
                        if(temp.getLabel().equals("Already Chosen")){
                            JOptionPane.showMessageDialog(panel, "That option has already been chosen.  Please choose another.", "Option Unavailable, nubber.....", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            QuestionBox question = new QuestionBox(questions[choice], answers[choice], questionValue, score);
                            scoreboard.setText(score + "");
                            temp.setLabel("Already Chosen");
                        }
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
        
        JLabel topic1 = new JLabel(topic1Questions[0]);
        topic1.setBounds(100, 100, 200, 100);
        
        JLabel topic2 = new JLabel(topic2Questions[0]);
        topic2.setBounds(200, 100, 200, 100);
        
        JLabel topic3 = new JLabel(topic3Questions[0]);
        topic3.setBounds(300, 100, 200, 100);
        
        JLabel topic4 = new JLabel(topic4Questions[0]);
        topic4.setBounds(400, 100, 200, 100);
        
        JLabel topic5 = new JLabel(topic5Questions[0]);
        topic5.setBounds(500, 100, 200, 100);
        
        panel.add(scoreboard);
        setVisible(true);
        
    }
    
    //checks to see if random choice selector has used that number before
    private boolean contains(Integer num){
        int k = 0;
        while(k < used.size()){
            if(num.equals(used.get(k))){
                return true;
            }
        }
        return false;
    }
    
    //kind of self explanatory....
    public static void updateScore(int newScore){
        score = newScore;
    }
    
    public boolean gameOver(){
        for(JButton button: field){
            if(!(button.getLabel().equals("Already Chosen"))){
                return false;
            }
        }
        return true;
    }
//}

    //ummmm...
     public static void main(String[] args){
         SuperDesign test = new SuperDesign("Computer Science", "Computer Science.txt");
     }
 }