import java.awt.*;
import javax.swing.*;
import java.util.*;


public class addSMSite extends JPanel{
	JLabel 		   logo, userNameLogo, passwordLogo;
	JToggleButton  fbChange, twChange,ggChange ;
	JTextField	       userName, password;
	JButton		   addAccountButton;
	
    public addSMSite() {
    	setLayout(null);
    	this.setBackground(Color.WHITE);
    	
    	JLabel label = new JLabel("Select Site to add:");
		label.setLocation(115,200);
		label.setSize(150, 30);
    	add(label); 
    		
    	// add toggle buttons
    	fbChange = new JToggleButton(new ImageIcon("Facebook Toggle.png"),true);
    	fbChange.setLocation(115,230);
		fbChange.setSize(35, 35);
		fbChange.setToolTipText("Toggle to include Facebook feeds");
    	add(fbChange);
    	
    	twChange = new JToggleButton(new ImageIcon("Twitter Toggle.png"),true);
    	twChange.setLocation(155,230);
		twChange.setSize(35, 35);
		twChange.setToolTipText("Toggle to include Twitter feeds");
    	add(twChange);
    	
    	ggChange = new JToggleButton(new ImageIcon("Google Toggle.png"),true);
    	ggChange.setLocation(195,230);
		ggChange.setSize(35, 35);
		ggChange.setToolTipText("Toggle to include Google+ feeds");
    	add(ggChange);
    	
    	userNameLogo = new JLabel("User Name:");
		userNameLogo.setLocation(115,270);
		userNameLogo.setSize(110, 30);
    	add(userNameLogo);
    	
    	userName = new JTextField("eddard_stark");
		userName.setLocation(115,305);
		userName.setSize(350, 35);
    	add(userName);
    	userName.setEnabled(false);
    	
    	passwordLogo = new JLabel("Password:");
		passwordLogo.setLocation(115,360);
		passwordLogo.setSize(110, 30);
    	add(passwordLogo);
    	
    	password = new JTextField("*********");
		password.setLocation(115,395);
		password.setSize(350, 35);
    	add(password);
    	password.setEnabled(false);
    	
    	addAccountButton = new JButton("Add new Account");
    	addAccountButton.setLocation(200,530);
		addAccountButton.setSize(180, 35);
    	add(addAccountButton);    
    	
    	
    	// add labels
		logo = new JLabel(new ImageIcon("onestop logo.png"));
		logo.setLocation(-305,0);
		logo.setSize(890, 74);
		logo.setOpaque(true);
    	add(logo);
    }
    
    
}