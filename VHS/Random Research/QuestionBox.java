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

public class QuestionBox extends JFrame{
    private Toolkit toolkit;
    private String text;
    
    public QuestionBox(String[] questionAnswer){
        setTitle("Question");
        setSize(600, 500);
        
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth())/2, (size.height - getHeight())/2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        
        panel.setLayout(null);
        
	String actualQuestion = questionAnswer[0];
	String actualAnswer = questionAnswer[1];
                
        JTextField answer = new JTextField(50);
        answer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
//                text = answer.getText();
            }
        });
        
        JButton submit = new JButton("SUBMIT");
        submit.setBounds(50,50,80,30);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                text = answer.getText();
            }
        });
        
        panel.add(submit);
        panel.add(answer);

	setVisible(true);

    }


}