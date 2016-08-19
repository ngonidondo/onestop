import java.awt.*;
import javax.swing.*;
import java.util.*;

// OneStopPage class
public class OneStopPage extends JPanel{
	
	// components
	JLabel 		   logo;
	JLabel	       icon1, author1, message1,
				   icon2, author2, message2,
		     	   icon3, author3, message3,
		     	   icon4, author4, message4,
		     	   icon5, author5, message5,
		     	   icon6, author6, message6,
		     	   icon7, author7, message7;
	JButton		   postButton;
	JToggleButton  fbToggle, twToggle,ggToggle ;
	JTextField	   aTextField;
	JCheckBox      fbCheckBox,twCheckBox,ggCheckBox;

    // constructor
    public OneStopPage() {

    	setLayout(null);
    	   	
    	this.setBackground(Color.WHITE);   	    	
    	
    	JLabel label = new JLabel("Network(s):");
		label.setLocation(24,70);
		label.setSize(90, 30);
    	add(label); 
    	
    	label = new JLabel("Write Something:");
		label.setLocation(115,70);
		label.setSize(110, 30);
    	add(label);
    	
    	label = new JLabel("Toggle to filter feeds:");
		label.setLocation(380,20);
		label.setSize(150, 30);
    	add(label);   	
    	
    	label = new JLabel(new ImageIcon("addedBorder.png"));
		label.setLocation(0,148);
		label.setSize(584, 6);
    	add(label);
    		   
		label = new JLabel(new ImageIcon("underline.png"));
		label.setLocation(0,242);
		label.setSize(584, 4);
    	add(label);
    	
    	label = new JLabel(new ImageIcon("underline.png"));
		label.setLocation(0,342);
		label.setSize(584, 4);
    	add(label);
    	
    	label = new JLabel(new ImageIcon("underline.png"));
		label.setLocation(0,442);
		label.setSize(584, 4);
    	add(label);
    	
    	label = new JLabel(new ImageIcon("underline.png"));
		label.setLocation(0,542);
		label.setSize(584, 4);
    	add(label);
    	
    	label = new JLabel(new ImageIcon("underline.png"));
		label.setLocation(0,642);
		label.setSize(584, 4);
    	add(label);
    	
    	label = new JLabel(new ImageIcon("underline.png"));
		label.setLocation(0,742);
		label.setSize(584, 4);
    	add(label);
    	
    	label = new JLabel(new ImageIcon("underline.png"));
		label.setLocation(0,842);
		label.setSize(584, 4);
    	add(label);
    	
    	
    	
		// add textfield
		aTextField = new JTextField();
		aTextField.setLocation(115,105);
		aTextField.setSize(350, 35);
    	add(aTextField);
    	
    	// add postButton
    	postButton = new JButton("Post");
    	postButton.setLocation(480,105);
		postButton.setSize(75, 35);
    	add(postButton);    

    	// add checkboxes
    	fbCheckBox = new JCheckBox("Facebook");
    	fbCheckBox.setLocation(20,100);
		fbCheckBox.setSize(80, 15);
		fbCheckBox.setToolTipText("Check to set Facebook as destination");
    	add(fbCheckBox);
    	
    	twCheckBox = new JCheckBox("Twitter");
    	twCheckBox.setLocation(20,116);
		twCheckBox.setSize(80, 15);
		twCheckBox.setToolTipText("Check to set Twitter as destination");
    	add(twCheckBox);
    	
    	ggCheckBox = new JCheckBox("Google+");
    	ggCheckBox.setLocation(20,132);
		ggCheckBox.setSize(80, 15);
		ggCheckBox.setToolTipText("Check to set Google+ as destination");
    	add(ggCheckBox);
    	
    	// add toggle buttons
    	fbToggle = new JToggleButton(new ImageIcon("Facebook Toggle.png"),true);
    	fbToggle.setLocation(380,50);
		fbToggle.setSize(35, 35);
		fbToggle.setToolTipText("Toggle to include Facebook feeds");
    	add(fbToggle);
    	
    	twToggle = new JToggleButton(new ImageIcon("Twitter Toggle.png"),true);
    	twToggle.setLocation(420,50);
		twToggle.setSize(35, 35);
		twToggle.setToolTipText("Toggle to include Twitter feeds");
    	add(twToggle);
    	
    	ggToggle = new JToggleButton(new ImageIcon("Google Toggle.png"),true);
    	ggToggle.setLocation(460,50);
		ggToggle.setSize(35, 35);
		ggToggle.setToolTipText("Toggle to include Google+ feeds");
    	add(ggToggle);
    	

		// feeds components
		icon1 = new JLabel(new ImageIcon("Facebook Icon.png"));
		icon1.setLocation(24,171);
		icon1.setSize(55,55);
    	add(icon1);
    	
    	author1 = new JLabel("John Doe");
		author1.setLocation(100,171);
		author1.setSize(99, 55);
    	add(author1);
    	
    	message1 = new JLabel("Hello World!");
		message1.setLocation(200,171);
		message1.setSize(300, 55);
    	add(message1);
    	
    	icon2 = new JLabel(new ImageIcon("Google Icon.png"));
		icon2.setLocation(24,267);
		icon2.setSize(55, 55);
    	add(icon2);
    	
    	author2 = new JLabel("John Doe");
		author2.setLocation(100,267);
		author2.setSize(99, 55);
    	add(author2);
    	
    	message2 = new JLabel("Hello World!");
		message2.setLocation(200,267);
		message2.setSize(300, 55);
    	add(message2);
    	
    	icon3 = new JLabel(new ImageIcon("Twitter Icon.png"));
		icon3.setLocation(24,367);
		icon3.setSize(55, 55);
    	add(icon3);
    	
    	author3 = new JLabel("John Doe");
		author3.setLocation(100,367);
		author3.setSize(280, 55);
    	add(author3);
    	
    	message3 = new JLabel("Hello World!");
		message3.setLocation(200,367);
		message3.setSize(280, 55);
    	add(message3);
    	
    	icon4 = new JLabel(new ImageIcon("Google Icon.png"));
		icon4.setLocation(24,467);
		icon4.setSize(55, 55);
    	add(icon4);
    	
    	author4 = new JLabel("John Doe");
		author4.setLocation(100,467);
		author4.setSize(99, 55);
    	add(author4);
    	
    	message4 = new JLabel("Hello World!");
		message4.setLocation(200,467);
		message4.setSize(300, 55);
    	add(message4);
    	
    	icon5 = new JLabel(new ImageIcon("Facebook Icon.png"));
		icon5.setLocation(24,567);
		icon5.setSize(55, 55);
    	add(icon5);
    	
    	author5 = new JLabel("John Doe");
		author5.setLocation(100,567);
		author5.setSize(99, 55);
    	add(author5);
    	
    	message5 = new JLabel("Hello World!");
		message5.setLocation(200,567);
		message5.setSize(300, 55);
    	add(message5);
    	
    	icon6 = new JLabel(new ImageIcon("Twitter Icon.png"));
		icon6.setLocation(24,667);
		icon6.setSize(55, 55);
    	add(icon6);
    	
    	author6 = new JLabel("John Doe");
		author6.setLocation(100,667);
		author6.setSize(99, 55);
    	add(author6);
    	
    	message6 = new JLabel("Hello World!");
		message6.setLocation(200,667);
		message6.setSize(300, 55);
    	add(message6);
    	
    	icon7 = new JLabel(new ImageIcon("Twitter Icon.png"));
		icon7.setLocation(24,767);
		icon7.setSize(55, 55);
    	add(icon7);
    	
    	author7 = new JLabel("John Doe");
		author7.setLocation(100,767);
		author7.setSize(99, 55);
    	add(author7);
    	
    	message7 = new JLabel("Hello World!");
		message7.setLocation(200,767);
		message7.setSize(300, 55);
    	add(message7);
    	
    	// add labels
		logo = new JLabel(new ImageIcon("onestop logo.png"));
		logo.setLocation(-305,0);
		logo.setSize(890, 74);
		logo.setOpaque(true);
    	add(logo);
    	
    	JLabel logo2 = new JLabel("");
		logo2.setLocation(-305,74);
		logo2.setSize(890, 74);
		logo2.setOpaque(true);
    	add(logo2);
    	
		 
    }    
}