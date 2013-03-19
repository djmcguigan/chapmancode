import java.awt.*;
import java.applet.*;

public class QuestionPrototype extends Applet{
    TextField answer;
    Button submit;
    Color bob;
    Font yesSiree;
    
    public void init(){
        setLayout(null);
        
        bob = Color.blue;
        setBackground(bob);
        
        yesSiree = new Font("Arial", Font.PLAIN, 16);
        
        answer = new TextField("What is a(n)...", 100);
        answer.setBounds(100, 250, 400, 50);
        add(answer);
        
        submit = new Button("Submit");
        submit.setBounds(250, 350, 100, 50);
        add(submit);
    }
    
    public void paint(Graphics g)
    {
        //method to draw text on screen
        // String first, then x and y coordinate.
        g.setFont(yesSiree);
        g.drawString("This data structure can store any data type and increases in size as more is added.",50,200);
    }
}