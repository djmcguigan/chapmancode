import java.awt.*;
import java.applet.*;

public class GuiExample extends Applet 
{
 // A Button to click
     Button okButton;
 // A textField to get text input
     TextField nameField;
 // A group of radio buttons
 // necessary to only allow one radio button to be selected at the same time.
     CheckboxGroup radioGroup;
 // The radio buttons to be selected
     Checkbox radio1;
     Checkbox radio2;
 // An independant selection box
     Checkbox option;
 

     public void init()
     {
         setLayout(null);
         okButton = new Button("Start");
         radioGroup = new CheckboxGroup();
         radio1 = new Checkbox("Computer Science", radioGroup,false);
//         option = new Checkbox("Option",false);
         okButton.setBounds(20,20,100,30);
         radio1.setBounds(20,120,100,260);
//         option.setBounds(20,170,100,30);
         add(okButton);
         add(radio1);
         
     }

    } 