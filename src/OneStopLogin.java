import java.awt.*;
import javax.swing.*;
import java.util.*;


public class OneStopLogin extends JPanel{

	// components
	JLabel 		   logo, userNameLogo, passwordLogo;
	JTextField	       userName, password;
	JButton		   loginButton;
	
	
    public OneStopLogin() {
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
    	
    	passwordLogo = new JLabel("Password:");
		passwordLogo.setLocation(115,360);
		passwordLogo.setSize(110, 30);
    	add(passwordLogo);
    	
    	password = new JTextField("*********");
		password.setLocation(115,395);
		password.setSize(350, 35);
    	add(password);
    	password.setEnabled(false);
    	
    	loginButton = new JButton("Login");
    	loginButton.setLocation(200,470);
		loginButton.setSize(180, 35);
    	add(loginButton);    
    	
    	
    	// add labels
		logo = new JLabel(new ImageIcon("onestop logo.png"));
		logo.setLocation(-305,0);
		logo.setSize(890, 74);
		logo.setOpaque(true);
    	add(logo);
    }
    
    
}