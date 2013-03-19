import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class PrototypeStartup extends Applet implements MouseMotionListener{
    Button okButton;
    TextField nameField;
    CheckboxGroup radioGroup;
    Checkbox radio1;
    Checkbox radio2;
    Checkbox option;
    Font yeah;
    Color thing1;
    Color thing2;
    Graphics bufferGraphics; 
    Image offscreen; 
    Dimension dim;
    int curX, curY; 
    PrototypeDesign window;
    QuestionWriterDecider bob;
    
    public PrototypeStartup(){
    }

    public void init()
    {
        setLayout(null);
         
        yeah = new Font("Microsoft Sans Serif", Font.BOLD, 24);
        thing1 = Color.blue;
        thing2 = Color.red;
        setBackground(thing1);
        
        dim = getSize();
        addMouseMotionListener(this);
        offscreen = createImage(dim.width, dim.height);
        bufferGraphics = offscreen.getGraphics();
         
        okButton = new Button("Start");
        radioGroup = new CheckboxGroup();
        radio1 = new Checkbox("Computer Science", radioGroup,false);
        radio2 = new Checkbox("Create new Question", radioGroup, false);
        okButton.setBounds(250,350,100,30);
        radio1.setBounds(20,120,150,20);
        radio2.setBounds(20, 150,150,20);
        add(okButton);
        add(radio1);
        add(radio2);
        
        window = new PrototypeDesign();
    }
     
    public void stop(){}
     
    public void paint(Graphics draw){
        draw.setColor(thing2);
        draw.setFont(yeah);
        draw.drawString("JEOPARDY: The Review Game", 40, 60);         
    }
    
    public void actionPerformed(ActionEvent evt){
        if(evt.getSource() == okButton && radio1.getState() == true){
            window = new PrototypeDesign();
            setVisible(true);
        }
        else if(evt.getSource() == okButton && radio2.getState() == true){
            bob = new QuestionWriterDecider();
            setVisible(true);
        }
    }
    
    public void update(Graphics goober){
        paint(goober);
    }
    
    public void mouseMoved(MouseEvent e){
        curX = e.getX();
        curY = e.getY();
        repaint();
    }
    
    public void mouseDragged(MouseEvent event){}
    
    public void mouseClicked(MouseEvent success){
    }
}