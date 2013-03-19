import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class QuestionWriterDecider extends Applet implements MouseMotionListener{
    Button question;
    Button set;
    Color bob;
    Font yesSiree;
    PrototypeQuestionWriter window;
    SetWriter joker;
    
    public void init(){
        setLayout(null);
        
        bob = Color.blue;
        setBackground(bob);
        
        yesSiree = new Font("Arial", Font.PLAIN, 16);
        
        question = new Button("Create new question");
        question.setBounds(100, 250, 400, 50);
        add(question);
        
        set = new Button("Create new Set");
        set.setBounds(250, 350, 100, 50);
        add(set);
    }
    
    public void paint(Graphics g)
     {
         //method to draw text on screen
         // String first, then x and y coordinate.
         g.setFont(yesSiree);
         g.drawString("This data structure can store any data type and increases in size as more is added.",50,200);
     }
     
     public void actionPerformed(ActionEvent evt){
        if(evt.getSource() == set){
            joker = new SetWriter();
        }
        else if(evt.getSource() == question){
            window = new PrototypeQuestionWriter();
        }
    }
    
    public void update(Graphics goober){
        paint(goober);
    }
    
    public void mouseMoved(MouseEvent e){}
    
    public void mouseDragged(MouseEvent event){}
    
    public void mouseClicked(MouseEvent success){}
}