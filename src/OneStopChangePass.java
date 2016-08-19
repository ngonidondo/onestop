import java.awt.*;
import javax.swing.*;
import java.util.*;


public class OneStopChangePass extends JPanel{
	JLabel 		   logo, userNameLogo, oldPasswordLogo, newPasswordLogo;
	JTextField	       userName, password;
	JButton		   changePassButton;

    public OneStopChangePass() {
    	setLayout(null);
    	this.setBackground(Color.WHITE);
    	
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