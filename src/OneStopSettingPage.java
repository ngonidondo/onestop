import java.awt.*;

import javax.swing.*;

import java.util.*;

// OneStopSettingPage class
public class OneStopSettingPage extends JPanel{
	
	// components
	JLabel	logo;

	JButton	addNetworkButton, logOutButton, changeButton, uButton, delButton;
	
	// get/set methods

    // constructor
    public OneStopSettingPage() {

    	setLayout(null);
    	this.setBackground(Color.WHITE);
    	// setting labels
		logo = new JLabel(new ImageIcon("set.png"));
		logo.setLocation(10,84);
		logo.setSize(60, 60);
    	add(logo);
    	
    	JLabel settingLabel = new JLabel("Settings");
    	settingLabel.setLocation(70,94);
    	settingLabel.setSize(230, 50);
    	settingLabel.setFont(new Font("Serif", Font.BOLD, 40));
    	//Font a = new Font();
    	add(settingLabel);
    	
    	// add postButton button and label
    	addNetworkButton = new JButton(new ImageIcon("addnetwork.png"));
    	addNetworkButton.setBorderPainted(false); 
        addNetworkButton.setContentAreaFilled(false); 
        addNetworkButton.setFocusPainted(false); 
        addNetworkButton.setOpaque(true);
    	addNetworkButton.setLocation(50,350);
		addNetworkButton.setSize(60, 60);
    	add(addNetworkButton);
    	
    	changeButton = new JButton(new ImageIcon("u.png"));
    	changeButton.setBorderPainted(false); 
        changeButton.setContentAreaFilled(false); 
        changeButton.setFocusPainted(false); 
        changeButton.setOpaque(true);
    	changeButton.setLocation(450,350);
		changeButton.setSize(60, 60);
    	add(changeButton); 
    	
    	uButton = new JButton(new ImageIcon("change.png"));
    	uButton.setBorderPainted(false); 
        uButton.setContentAreaFilled(false); 
        uButton.setFocusPainted(false); 
        uButton.setOpaque(true);
    	uButton.setLocation(260,350);
		uButton.setSize(60, 60);
    	add(uButton); 

    	JLabel label = new JLabel("  Add/Replace a ");
		label.setLocation(20,300);
		label.setSize(160, 30);
    	add(label);
    	
    	label = new JLabel("Social Network Account");
		label.setLocation(20,315);
		label.setSize(160, 30);
    	add(label);
    	
    	label = new JLabel("  Update an existing   ");
		label.setLocation(220,300);
		label.setSize(160, 30);
    	add(label);
    	
    	label = new JLabel("Social Network's Password");
		label.setLocation(220,315);
		label.setSize(160, 30);
    	add(label);
    	
    	label = new JLabel("Change OneStop");
		label.setLocation(420,300);
		label.setSize(160, 30);
    	add(label);
    	
    	label = new JLabel("   Password");
		label.setLocation(420,315);
		label.setSize(160, 30);
    	add(label);
    	
    	logOutButton = new JButton("Logout");
    	logOutButton.setLocation(220,450);
    	logOutButton.setSize(200, 30);
    	add(logOutButton); 
    	
    	delButton = new JButton("Delete A Social Network Account");
		delButton.setLocation(560,840);
		delButton.setSize(200, 30);
    	add(delButton);
    	
    	// add labels
		logo = new JLabel(new ImageIcon("onestop logo.png"));
		logo.setLocation(-305,0);
		logo.setSize(890, 74);
		logo.setOpaque(true);
    	add(logo);

    }    
}