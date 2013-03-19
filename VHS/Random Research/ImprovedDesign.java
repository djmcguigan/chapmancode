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

public class ImprovedDesign extends JFrame{
    private JButton[] field = new JButton[25];
    private Toolkit toolkit;
    
    public ImprovedDesign(){
        toolkit = getToolkit();
        
        setTitle("Jeopardy");
        setSize(600,500);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        
        panel.setLayout(null);
        
        int bounds = 0;
        for(int num = 0; num < field.length; num++){
            if(num < 5){
                field[num] = new JButton("200");
                field[num].setBounds(20 + bounds, 100, 100, 50);
                field[num].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent event){
//                        QuestionBox question = new QuestionBox(questions[num]);
                    }
                });
            }
            else if(num < 10){
                field[num] = new JButton("400");
                if(num == 5){
                    bounds = 0;
                }
                field[num].setBounds(20 + bounds, 150, 100, 50);
                field[num].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        //QuestionBox question = new QuestionBox(questions[num]);
                    }
                });
            }   
            else if(num < 15){
                field[num] = new JButton("600");
                if(num == 10){
                    bounds = 0;
                }
                field[num].setBounds(20 + bounds, 200, 100, 50);
                field[num].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                //        QuestionBox question = new QuestionBox(quetsions[num]);
                    }
                });
            }
            else if(num < 20){
                field[num] = new JButton("800");
                if(num == 15){
                    bounds = 0;
                }
                field[num].setBounds(20 + bounds, 250, 100, 50);
                field[num].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent event){
 //                       QuestionBox question = new QuestionBox(questions[num]);
                    }
                });
            }
            else{
                field[num] = new JButton("1000");
                if(num == 20){
                    bounds = 0;
                }
                field[num].setBounds(20 + bounds, 300, 100, 50);
                field[num].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent event){
            //            QuestionBox question = new QuestionBox(questions[num]);
                    }
                });
            }
            bounds += 100;
        }
        
        int count = 0;
        while(count < field.length){
            panel.add(field[count]);
            count++;
        }
        

        setVisible(true);
        
    }
    
    public static void main(String[] args){
        ImprovedDesign test = new ImprovedDesign();
    }


    
    
}