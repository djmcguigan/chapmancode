import java.awt.*;
import java.applet.*;

public class PrototypeQuestionWriter extends Applet{
    TextField question;
    TextField answer;
    Button submit;
    Color bob;
    Font yesSiree;
    
    public void init(){
        setLayout(null);
        
        bob = Color.blue;
        setBackground(bob);
        
        yesSiree = new Font("Arial", Font.PLAIN, 16);
        
        question = new TextField(200);
        question.setBounds (100, 100, 400, 100);
        add(question);
        
        answer = new TextField("What is a(n)...", 100);
        answer.setBounds(100, 250, 400, 100);
        add(answer);
        
        submit = new Button("Submit");
        submit.setBounds(250, 400, 100, 50);
        add(submit);
    }
    
    public void paint(Graphics g)
     {
         //method to draw text on screen
         // String first, then x and y coordinate.
         g.setFont(yesSiree);
         g.drawString("Enter new question here.",50,75);
         g.drawString("Enter new answer here.", 50, 225);
     }
}