import java.awt.*;
import javax.swing.*;
import java.util.*;

// OneStopView class
public class OneStopView extends JPanel{
	
	// components
	JLabel 		 		sMenu, mMenu, back2;
	JButton		 		openButton, exitButton, oButton, fButton, tButton, gButton, minButton, setButton;
	OneStopCards 		cards;
	OneStopNotification notification;
	JPanel 		 		sPane, mPane;
	JLayeredPane 		layered;
	boolean 	 		isMin = true, isOpen = false;
	
    // constructor
    public OneStopView() {

    	setLayout(null);
    	layered = new JLayeredPane();
    	layered.setSize(2000,2000);
    	//add(layered);
    	
    	//START OF MENU BAR CODE
    	int menuLocX = 1845;
    	int menuLocY = 250;
    	int iconSize = 60;
    	int menuLocY2 = menuLocY +180;
    	
    	
    	//setting menu bar
    	sPane = new JPanel();
    	sPane.setLayout(null);
    	sPane.setSize(60,155);
    	sPane.setLocation(menuLocX, menuLocY);
    	sPane.setBackground(Color.DARK_GRAY);
    	sPane.setBorder(null);
    	
    	exitButton = new JButton(new ImageIcon("exit.png"));
    	exitButton.setLocation(0,0);
		exitButton.setSize(iconSize, iconSize/2);
		exitButton.setToolTipText("Exit");
    	sPane.add(exitButton);
    	//layered.add(minButton,300,1);
        exitButton.setEnabled(true);
    	
    	minButton = new JButton(new ImageIcon("min.png"));
    	minButton.setLocation(0, 5 + iconSize/2);    	
		minButton.setSize(iconSize, iconSize);
		minButton.setToolTipText("Show App");
    	sPane.add(minButton);
    	//layered.add(minButton,300,1);
        minButton.setEnabled(true);
        
        setButton = new JButton(new ImageIcon("set.png"));
    	setButton.setLocation(0,5 + iconSize *3/2);
		setButton.setSize(iconSize, iconSize);
		setButton.setToolTipText("Settings");
    	sPane.add(setButton);
    	//layered.add(setButton,300,1);
        setButton.setEnabled(true);
    	
    	//layered.add(sPane,300,1);
		
		//Social media menu bar
		mPane = new JPanel();
    	mPane.setLayout(null);
    	mPane.setSize(60,255);
    	mPane.setLocation(menuLocX, menuLocY2);
    	mPane.setBackground(Color.DARK_GRAY);
    	    	
		
		oButton = new JButton(new ImageIcon("oS.png"));
        oButton.setBorderPainted(false); 
        oButton.setContentAreaFilled(false); 
        oButton.setFocusPainted(false); 
        oButton.setOpaque(false);
    	oButton.setLocation(0,0);
		oButton.setSize(iconSize, iconSize);
		oButton.setToolTipText("Open OneStop App");
    	mPane.add(oButton);
        oButton.setEnabled(true);
        
        fButton = new JButton(new ImageIcon("fB.png"));
        fButton.setBorderPainted(false); 
        fButton.setContentAreaFilled(false); 
        fButton.setFocusPainted(false); 
        fButton.setOpaque(false);
    	fButton.setLocation(0,5*1+ iconSize * 1);
		fButton.setSize(iconSize, iconSize);
		fButton.setToolTipText("Facebook");
    	mPane.add(fButton);
        fButton.setEnabled(true);
        
        gButton = new JButton(new ImageIcon("g.png"));
        gButton.setBorderPainted(false); 
        gButton.setContentAreaFilled(false); 
        gButton.setFocusPainted(false); 
        gButton.setOpaque(false);
    	gButton.setLocation(0,5*2+ iconSize * 2);
		gButton.setSize(iconSize, iconSize);
		gButton.setToolTipText("Google +");
    	mPane.add(gButton);
        gButton.setEnabled(true);
        
        tButton = new JButton(new ImageIcon("t.png"));
        tButton.setBorderPainted(false); 
        tButton.setContentAreaFilled(false); 
        tButton.setFocusPainted(false); 
        tButton.setOpaque(false);
    	tButton.setLocation(0,5*3+ iconSize * 3);
		tButton.setSize(iconSize, iconSize);
		tButton.setToolTipText("Twitter");
    	mPane.add(tButton);
        tButton.setEnabled(true);
		
		//layered.add(mPane);
		//END OF MENU BAR CODE
		notification = new OneStopNotification();
    	notification.setLocation(1336,753);
		notification.setBackground(Color.WHITE);
		notification.setSize(584,98);   
		notification.setVisible(false);   
	    add(notification);	  
    	
    	//Add labels
    	JLabel label = new JLabel(new ImageIcon("taskbar.png"));
		label.setLocation(0,850);
		label.setSize(1920, 40);
    	layered.add(label);   	    	
    	
    	back2 = new JLabel(new ImageIcon("desktop.png"));
    	back2.setLocation(0,0);
    	back2.setSize(1920,1080);
    	layered.add(back2);        
        
    	//Add buttons
    	openButton = new JButton(new ImageIcon("oSIcon.png"));
    	openButton.setBorderPainted(false); 
    	openButton.setLocation(10,10);
		openButton.setSize(65, 82);
    	layered.add(openButton, 300,1);
        openButton.setEnabled(true);
		
		//Add Panel
		cards = new OneStopCards();
		cards.setLocation(1336,-7);
		cards.setBackground(Color.WHITE);
		cards.setSize(584,860);
		//layered.add(cards);	
		/*
		label = new JLabel(new ImageIcon("osIcon.png"));
		label.setLocation(584,800);
		label.setSize(65, 82);
    	layered.add(label); */
		
		add(layered);
		
		
	
    }    
}