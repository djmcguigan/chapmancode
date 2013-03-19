/**
 * Review Game: QuestionWriter Class
 * Author: McGuigy
 * Date: 03/01/10-03/12/10
 * School: Valencia HS (OC)
 * Computer: #19 (Dell Intel QuadCore)
 * IDE: Blue J
 * Purpose: create interface to create review game files
 */

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class QuestionWriter extends JFrame{
    private Toolkit toolkit;
    private JPanel panel;
    private JLabel fileTitle;
    private JLabel enterQuestion;
    private JLabel enterAnswer;
    private JTextField question;
    private JTextField answer;
    private JTextField fileName;
    private JButton save;
    private JButton close;
    private String name;
    
    /**
     * constructor for question writer objects
     */
    public QuestionWriter(){
        setTitle("Welcome to the Question Generator!");
        setSize(800,700);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        panel = new JPanel();
        getContentPane().add(panel);
        
        panel.setLayout(null);
        
        /*
         * creates directions for title addition
         */
        fileTitle = new JLabel("Please create a title for the set: ");
        fileTitle.setFont(new Font("Arial", Font.PLAIN, 14));
        fileTitle.setVisible(true);
        fileTitle.setBounds(50, 50, 300,50);
        
        /*
         * creates field for user to input file name
         */
        fileName = new JTextField(50);
        fileName.setBounds(380, 50, 250, 30);
        fileName.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
//                 name = fileName.getText();
//                 for(int x = 0; x < Startup.gameOptions.length; x++){
//                     if(name.equals(Startup.gameOptions[x])){
//                         break;
//                     }
//                 }
//                 Startup.gameChoices.addItem(name);
            }
        });
        
        /*
         * creates label for user instruction
         */
        enterQuestion = new JLabel("Please enter your question here ----> ");
        enterQuestion.setFont(new Font("Arial", Font.PLAIN, 14));
        enterQuestion.setBounds(50,150,250,50);
        panel.add(enterQuestion);
        
        /*
         * creates field for user to input question
         */
        question = new JTextField(200);
        question.setBounds(325,150,200,30);
        question.setVisible(true);
        panel.add(question);
        
        /*
         * creates label for user instruction
         */
        enterAnswer = new JLabel("Now enter your answer here ----> ");
        enterAnswer.setFont(new Font("Arial", Font.PLAIN, 14));
        enterAnswer.setBounds(50,300,250,50);
        panel.add(enterAnswer);
        
        /*
         * creates field for user to input answer
         */
        answer = new JTextField(200);
        answer.setBounds(325,300,200,30);
        answer.setVisible(true);
        panel.add(answer);
        
        /*
         * creates button to save input question and answer combo
         */
        save = new JButton("Save Question");
        save.setBounds(50,500,125,50);
        save.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                name = fileName.getText();
                try{
                    boolean in = false;
                    for(int x = 0; x < Startup.gameOptions.length; x++){
                        if(name.equals(Startup.gameOptions[x])){
                            in = true;
                        }
                    }
                    if(in == false){
                        Startup.gameChoices.addItem(name);
                        String[] bob = new String[Startup.gameOptions.length + 1];
                        for(int x = 0; x < Startup.gameOptions.length; x++){
                            bob[x] = Startup.gameOptions[x];
                        }
                        bob[bob.length - 1] = name;
                        Startup.gameOptions = bob;
                    }
                    PrintWriter output = new PrintWriter(new FileWriter(fileName.getText() + ".txt", true));
                    if(question.getText().equals("")){
                        JOptionPane.showMessageDialog(panel, "Question ERROR", "ENTER a QUESTION!", JOptionPane.ERROR_MESSAGE);
                    }
                    else if(answer.getText().equals("")){
                        JOptionPane.showMessageDialog(panel, "Answer ERROR", "ENTER an ANSWER!", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        output.println(question.getText());
                        output.println(answer.getText());
                        output.close();
                        question.setText("");
                        answer.setText("");
                    }
                }catch(IOException err){
                    JOptionPane.showMessageDialog(panel, err.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
//                dispose();
            }
        });
        
        /*
         * creates button to close window
         */
        close = new JButton("Finished");
        close.setBounds(200, 500, 125, 50);
        close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                dispose();
            }
        });
        
        panel.add(fileTitle);
        panel.add(fileName);
        panel.add(save);
        panel.add(close);
        
        setVisible(true);
    }
    
    public String getSetName(){
        return name;
    }
}