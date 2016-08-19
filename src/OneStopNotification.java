import java.awt.*;
import javax.swing.*;
import java.util.*;

// OneStopNotification Class
public class OneStopNotification extends JPanel{
	JLabel nwImage, author, message;
	

    public OneStopNotification() {    	
    	
    	setLayout(null);
    	setSize(584,98);    	
    	setBackground(Color.WHITE);    	
    	setBorder(null);
    	
    	JLabel label = new JLabel(new ImageIcon("underline.png"));
		label.setLocation(0,0);
		label.setSize(584, 4);
    	add(label);
    	
    	label = new JLabel(new ImageIcon("underline.png"));
		label.setLocation(0,94);
		label.setSize(584, 4);
    	add(label);
    	
    	nwImage = new JLabel(new ImageIcon("Facebook Icon.png"));
    	nwImage.setLocation(24,20);
    	nwImage.setSize(55,55);
    	add(nwImage);
    	
    	author = new JLabel("John Doe");
    	author.setLocation(100,20);
    	author.setSize(90,55);
    	add(author);
    	
    	message = new JLabel("Hello World!");
    	message.setLocation(200,20);
    	message.setSize(1920,55);
    	add(message);   	
	
    }   

}