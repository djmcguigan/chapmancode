

// and now The inevitible "Hello World" example :)

// tell the compiler where to find the methods you will use.
// required when you create an applet
import java.applet.*;
// required to paint on screen
import java.awt.*;
 

// the start of an applet - HelloWorld will be the executable class
// Extends applet means that you will build the code on the standard Applet class
public class HelloWorld extends Applet
{

// The method that will be automatically called  when the applet is started
     public void init()
     {
 // It is required but does not need anything.
     }
 

// This method gets called when the applet is terminated
// That's when the user goes to another page or exits the browser.
     public void stop()
     {
     // no actions needed here now.
     }
 

// The standard method that you have to use to paint things on screen
// This overrides the empty Applet method, you can't called it "display" for example.

     public void paint(Graphics g)
     {
 //method to draw text on screen
 // String first, then x and y coordinate.
      g.drawString("GOOD BYE",50,20);
      g.drawString("THIS IS SPARTA!!!!!",20,40);

     }

} 