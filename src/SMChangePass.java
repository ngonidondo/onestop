import java.awt.*;
import javax.swing.*;
import java.util.*;

public class SMChangePass extends JPanel{
	JLabel 		   logo, userNameLogo, oldPasswordLogo, newPasswordLogo;
	JToggleButton  fbChange, twChange,ggChange ;
	JTextField	       userName, password;
	JButton		   changePassButton;

    public SMChangePass() {
    	setLayout(null);
    	this.setBackground(Color.WHITE);
    	
    	JLabel label = new JLabel("Select Site to change:");
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
    	
    	oldPasswordLogo = new JLabel("Old Password:");
		oldPasswordLogo.setLocation(115,360);
		oldPasswordLogo.setSize(110, 30);
    	add(oldPasswordLogo);
    	
    	password = new JTextField("*********");
		password.setLocation(115,395);
		password.setSize(350, 35);
    	add(password);
    	password.setEnabled(false);
    	
    	newPasswordLogo = new JLabel("New Password:");
		newPasswordLogo.setLocation(115,450);
		newPasswordLogo.setSize(110, 30);
    	add(newPasswordLogo);
    	
    	password = new JTextField("*********");
		password.setLocation(115,485);
		password.setSize(350, 35);
    	add(password);
    	password.setEnabled(false);
    	
    	changePassButton = new JButton("Change Password");
    	changePassButton.setLocation(200,530);
		changePassButton.setSize(180, 35);
    	add(changePassButton);    
    	
    	
    	// add labels
		logo = new JLabel(new ImageIcon("onestop logo.png"));
		logo.setLocation(-305,0);
		logo.setSize(890, 74);
		logo.setOpaque(true);
    	add(logo);
    }
    
    
}