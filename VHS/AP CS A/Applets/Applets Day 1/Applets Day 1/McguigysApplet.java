import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class McguigysApplet extends Applet implements ActionListener
{
    Button upButton;
    Button downButton;
    int counter;
    TextField field;
    Image my_jpg;
    MediaTracker mt;
    URL base;
    
    public void init()
    {
        //initialization
        setBackground(Color.green);
        setLayout(null);
        upButton = new Button("Add one to count");
        downButton = new Button("Subtract one from count");
        counter = 0;
        field = new TextField("0", 100);
        mt = new MediaTracker(this);
		try {
			base = getDocumentBase();
		}
		catch (Exception e) {}
        my_jpg = getImage(base,"CC_OCC.jpg");
		mt.addImage(my_jpg,1);
		try {
			mt.waitForAll();
		}
		catch (InterruptedException  e) {}
        
        //postitions
        field.setBounds(100,20,100,40);
        upButton.setBounds(20,80,150,30);
        downButton.setBounds(200,80,150,30);
        
        //add
        add(field);
        add(upButton);
        add(downButton);
        
        //add actionListeners
        upButton.addActionListener(this);
        downButton.addActionListener(this);
    }
    
    public void paint(Graphics g)
    {
        g.drawString("Count =",40,40);
        if(counter > 20 || counter < -20)
	       g.drawString("Get a life!",140,150);
	    if(counter > 30 || counter < -30)
	       g.drawImage(my_jpg,20,170,this);
	    else
	       g.drawString("",140,150);
	}
	
	public void actionPerformed(ActionEvent evt) 
	{
		//UpButton refresh
		if (evt.getSource() == upButton) 
		{	
		    counter++;
		    field.setText(counter + "");
			repaint();
		}
		
		//DownButton refresh
		else if (evt.getSource() == downButton) 
		{
		    counter--;
		    field.setText(counter + "");
			repaint();
		}
	}	
}