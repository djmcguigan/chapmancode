/**
 * Review Game: QuestionBox Class
 * Author: McGuigy
 * Date: many moons
 * School: Valencia HS (OC)
 * Computer: #19 (Dell Intel QuadCore)
 * IDE: Blue J
 * Purpose: create GUI for question and answer
 */

import java.awt.*;
import java.util.*;
import java.io.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;

public class QuestionBox extends JFrame{
    private Toolkit toolkit;
    private String actualQ;
    private String actualA;
    private String entry;
    private JPanel panel;
    private JTextField text;
    private boolean statsu;
    private boolean answered;
    private int value;                      ///////////////point value of question
    private int score;                      ///////////////current game score
	private JRadioButton answerChoice;
    
    public QuestionBox(String question, String answer, int pointValue, int currentScore){
        setTitle("Question: " + pointValue +"");
        setSize(600, 500);
        
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth())/2, (size.height - getHeight())/2);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        panel = new JPanel();
        getContentPane().add(panel);
        
        panel.setLayout(null);
        
        actualQ = question;
        actualA = answer;
        
        value = pointValue;
        score = currentScore;
       
        JLabel theQuestion = new JLabel(actualQ);
        theQuestion.setFont(new Font("Georgia", Font.PLAIN, 14));
        theQuestion.setVisible(true);
        theQuestion.setBounds(50, 25, 600, 400);
        
        /**
        text = new JTextField(50);
        text.setBounds(50, 350, 200, 30);
        text.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                

            }
        });
		*/
		 
		answerChoice = new JRadioButton(actualA);
		answerChoice.setBounds(50,100,600,400);
		answerChoice.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JOptionPane.showMessageDialog(panel, "Correct Answer", "Success", JOptionPane.INFORMATION_MESSAGE);
				GameBoard.updateScore(score + value);
				if(GameBoard.gameOver()){
					dispose();
					JOptionPane.showMessageDialog(panel, "Congratulations, you've completed the game! Your score was " + score, "w00t", JOptionPane.INFORMATION_MESSAGE);
				}
				dispose();
			}
		});
		
        /**
        //creates SUBMIT button
        JButton submit = new JButton("SUBMIT");
        submit.setBounds(50,400,80,30);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                entry = text.getText();
                boolean result = checkAnswer(entry, actualA);
                if(result == true){
                    JOptionPane.showMessageDialog(panel, "Correct Answer", "Good Job!", JOptionPane.INFORMATION_MESSAGE);
                    GameBoard.updateScore(score + value);
                }
                else{
                    JOptionPane.showMessageDialog(panel, "Wrong Answer.  The Correct Answer was: " + actualA, "Woe is you....", JOptionPane.INFORMATION_MESSAGE);
                    GameBoard.updateScore(score - value);
                }
                if(GameBoard.gameOver()){
                    dispose();
                    JOptionPane.showMessageDialog(panel, "Congratulations, you've completed the game! Your score was " + score, "w00t", JOptionPane.INFORMATION_MESSAGE);
                }
                dispose();
            }
        });
		 */
        
        
        panel.add(theQuestion);
        //panel.add(text);
        //panel.add(submit);
        panel.add(answerChoice);
		
        setVisible(true);

    }
    
    /**
     * checks answer
     * 
     * @param input the user's answer
     * @param correct the correct answer
     * @return true answer is correct
     * @return false answer is wrong
     */
    private boolean checkAnswer(String input, String correct){
        if(input.equalsIgnoreCase(correct))
            return true;
        return false;
    }
    
    /**
     * checks to see if answer is correct
     * 
     * @param
     * @return true answer is correct
     * @return false answer is incorrect
     */
    public boolean isCorrect(){
        if(statsu == true)
            return true;
        return false;
    }
    
    /**
     * checks to see if the question has been answered
     * 
     * @param
     * @return true question answered
     * @return false question not answered
     */
    public boolean isAnswered(){
        if(answered == true){
            return true;
        }
        return false;
    }
}
