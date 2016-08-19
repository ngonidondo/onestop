import java.awt.*;
import javax.swing.*;
import java.util.*;

// OneStopView class
public class OneStopCards extends JPanel{
	
	// components
	JPanel 		 slides;
	OneStopPage  aOneStopPage;
	OneStopLogin aOneStopLogin;
	OneStopSettingPage aOSSetting;
	OneStopChangePass aOSChangePass;
	CardLayout   layoutManager;
	SMChangePass aSMChangePass;
	addSMSite aAddSMSite;
	delSMSite aDelSMSite;
	// get/set methods

    // constructor
    public OneStopCards() {
		aOneStopPage = new OneStopPage();
		aOneStopLogin = new OneStopLogin();
		aOSSetting = new OneStopSettingPage();
		aOSChangePass = new OneStopChangePass();
		aSMChangePass = new SMChangePass();
		aAddSMSite = new addSMSite();
		aDelSMSite = new delSMSite();
			
    	setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    	
		slides = new JPanel(); 
		slides.setSize(546,860);
		slides.setBackground(Color.WHITE); 
		slides.setLayout(layoutManager = new CardLayout(0,0)); 			
		
		// add cards 'slides.add("cardname", "component")' 	
		slides.add("0", aOneStopPage); 
		slides.add("1", new JLabel(new ImageIcon("Facebook.png"))); 
		slides.add("2", new JLabel(new ImageIcon("Google.png"))); 
		slides.add("3", new JLabel(new ImageIcon("Twitter.png"))); 
		slides.add("4", aOneStopLogin);
		slides.add("5", aOSSetting);
		slides.add("6",aOSChangePass);
		slides.add("7",aSMChangePass);
		slides.add("8",aAddSMSite);
		slides.add("9",aDelSMSite);

		
		add(slides);
		
		

    }    
}