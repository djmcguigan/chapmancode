import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class PrototypeDesign extends Applet implements MouseListener, MouseMotionListener{

    Button[] buttons = new Button[25];
    
    
    public void init()
    {
        //creating text in all buttons
        setLayout(null);
        setBackground(background);
        
        for(int n = 0; n < buttons.length; n++){
            buttons[n] = new Button();
        }
        
        int counter = 0;
        while(counter < buttons.length){
            if(counter < 5)
                buttons[counter].setLabel("200");
            else if(counter < 10)
                buttons[counter].setLabel("400");
            else if(counter < 15)
                buttons[counter].setLabel("600");
            else if(counter < 20)
                buttons[counter].setLabel("800");
            else
                buttons[counter].setLabel("1000");
            counter++;
        }
        
        int bounds = 0;
        counter = 0;
        while(counter < buttons.length){
            if(counter < 5){
                buttons[counter].setBounds(20 + bounds, 100, 100, 50);
            }
            else if(counter < 10){
                if(counter == 5){
                    bounds = 0;
                }
                buttons[counter].setBounds(20 + bounds, 150, 100, 50);
            }
            else if(counter < 15){
                if(counter == 10){
                    bounds = 0;
                }
                buttons[counter].setBounds(20 + bounds, 200, 100, 50);
            }
            else if(counter < 20){
                if(counter == 15){
                    bounds = 0;
                }
                buttons[counter].setBounds(20 + bounds, 250, 100, 50);
            }
            else{
                if(counter == 20){
                    bounds = 0;
                }
                buttons[counter].setBounds(20 + bounds, 300, 100, 50);
            }                
            counter++;
            bounds += 100;
        }
        
        counter = 0;
        while(counter < buttons.length)
        {
            add(buttons[counter]);
            counter++;
        }
        

    }
    
     public void mouseEntered(MouseEvent e){ }
     public void mouseExited(MouseEvent e){ }
     public void mouseClicked(MouseEvent e){
//         if (e.getButton() == BUTTON1){
             w.setVisible(true);
             w.setLocation(10 + bounds.x, 10 + bounds.y);
 //        }
         e.consume();
     }
     public void mousePressed( MouseEvent e ) {
        isMouseClicking = true;
        e.consume();
    }
     public void mouseReleased( MouseEvent e ) {
         isMouseClicking = false;
         e.consume();
     }
     public void mouseMoved( MouseEvent e ) { }
     public void mouseDragged( MouseEvent e ) {}

//     public void buttonClicked(MouseEvent e){
//         if(mouseClicked over button){
//             Button bob = getButton();
//             buttonwhtever = new Button();

} 