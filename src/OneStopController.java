import java.util.Random;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


// OneStopController class
public class OneStopController extends JFrame {
	
	OneStopModel    aOneStopModel;
	OneStopView     aOneStopView;
	int 			filter; // binary length 3 ,'fb tw gg'. : 0 - 'not selected', 1 - 'seleted';
	Timer           aTimer, apprTimer, ntfyTimer, alrtTimer, fTimer, gTimer, tTimer;
	int 		    i,x,c;
	boolean         f,g,t;
        
    // constructor
	public OneStopController(String title, OneStopModel model, OneStopView view){
		super(title);
		aOneStopModel = model;
		aOneStopView = view;		
		add(aOneStopView);
	
		
		//initailize feeds
		updateFeeds();
		filter = 111;

		handleInvisibleMenu();
		handleVisibleMenu();
				
		/*OneStopDesktopIcon listener*/
		aOneStopView.openButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleOpenButton();
				//handleHidAndShow();
				rInvisibleMenu();
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"4");
			}
		});
	
		/*Menu listerners*/
		// exit button
		aOneStopView.exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleExitButton();
			}
		});
		
		aOneStopView.cards.aOneStopLogin.loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"0");
				rVisibleMenu();				          		
			}
		});
		
		
		//CHANGE SOCIAL MEDIA LISTENERS
		aOneStopView.cards.aSMChangePass.fbChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"6");
				aOneStopView.cards.aSMChangePass.ggChange.setEnabled(false);
				aOneStopView.cards.aSMChangePass.twChange.setEnabled(false);				          		
			}
		});
		aOneStopView.cards.aSMChangePass.ggChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"6");
				aOneStopView.cards.aSMChangePass.fbChange.setEnabled(false);
				aOneStopView.cards.aSMChangePass.twChange.setEnabled(false);			          		
			}
		});
		aOneStopView.cards.aSMChangePass.twChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"6");
				aOneStopView.cards.aSMChangePass.fbChange.setEnabled(false);
				aOneStopView.cards.aSMChangePass.ggChange.setEnabled(false);			          		
			}
		});
		aOneStopView.cards.aSMChangePass.changePassButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"5");
				aOneStopView.cards.aSMChangePass.ggChange.setEnabled(true);
				aOneStopView.cards.aSMChangePass.twChange.setEnabled(true);
				aOneStopView.cards.aSMChangePass.fbChange.setEnabled(true);				          		
			}
		});
		
		aOneStopView.cards.aOSChangePass.changePassButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"5");
							          		
			}
		});
		
		//ADD SM SITE
		aOneStopView.cards.aAddSMSite.fbChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"6");
				aOneStopView.cards.aAddSMSite.ggChange.setEnabled(false);
				aOneStopView.cards.aAddSMSite.twChange.setEnabled(false);				          		
			}
		});
		aOneStopView.cards.aAddSMSite.ggChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"6");
				aOneStopView.cards.aAddSMSite.fbChange.setEnabled(false);
				aOneStopView.cards.aAddSMSite.twChange.setEnabled(false);			          		
			}
		});
		aOneStopView.cards.aAddSMSite.twChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"6");
				aOneStopView.cards.aAddSMSite.fbChange.setEnabled(false);
				aOneStopView.cards.aAddSMSite.ggChange.setEnabled(false);			          		
			}
		});
		aOneStopView.cards.aAddSMSite.addAccountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"5");
				aOneStopView.cards.aAddSMSite.ggChange.setEnabled(true);
				aOneStopView.cards.aAddSMSite.twChange.setEnabled(true);
				aOneStopView.cards.aAddSMSite.fbChange.setEnabled(true);				          		
			}
		});
		
		//DELETE SM SITE
		aOneStopView.cards.aDelSMSite.fbChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"6");
				aOneStopView.cards.aDelSMSite.ggChange.setEnabled(false);
				aOneStopView.cards.aDelSMSite.twChange.setEnabled(false);				          		
			}
		});
		aOneStopView.cards.aDelSMSite.ggChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"6");
				aOneStopView.cards.aDelSMSite.fbChange.setEnabled(false);
				aOneStopView.cards.aDelSMSite.twChange.setEnabled(false);			          		
			}
		});
		aOneStopView.cards.aDelSMSite.twChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"6");
				aOneStopView.cards.aDelSMSite.fbChange.setEnabled(false);
				aOneStopView.cards.aDelSMSite.ggChange.setEnabled(false);			          		
			}
		});
		aOneStopView.cards.aDelSMSite.delAccountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"5");
				aOneStopView.cards.aDelSMSite.ggChange.setEnabled(true);
				aOneStopView.cards.aDelSMSite.twChange.setEnabled(true);
				aOneStopView.cards.aDelSMSite.fbChange.setEnabled(true);				          		
			}
		});
		
		//SETTINGS LISTENERS
		aOneStopView.cards.aOSSetting.changeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"6");
							          		
			}
		});
		aOneStopView.cards.aOSSetting.uButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"7");
							          		
			}
		});
		aOneStopView.cards.aOSSetting.addNetworkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"8");			          		
			}
		});
		aOneStopView.cards.aOSSetting.delButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"9");			          		
			}
		});
		
		
		aOneStopView.oButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//show OneStopPage
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"0");
				if(aOneStopView.isMin){
					handleHidAndShow();
				}
				c = 0;								          		
			}
		});
		aOneStopView.fButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//show facebookPage
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"1");
				if(aOneStopView.isMin){
					handleHidAndShow();
				}
				fTimer.stop();
				aOneStopView.fButton.setIcon(new ImageIcon("fB.png"));				
				c = 1;				           
			}
		});
		aOneStopView.gButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//show googlePage
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"2");
				if(aOneStopView.isMin){
					handleHidAndShow();
				}
				gTimer.stop();
				aOneStopView.gButton.setIcon(new ImageIcon("g.png")); 					
				c = 2;	          
			}
		});
		aOneStopView.tButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//show twitterPage
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"3");           
				if(aOneStopView.isMin){
					handleHidAndShow();
				}
				tTimer.stop();
				aOneStopView.tButton.setIcon(new ImageIcon("t.png"));
				c = 3;	
			}
		});
		aOneStopView.minButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleHidAndShow();				
			}
		});
		aOneStopView.setButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Connects to the settings page which is being built
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"5");           
				if(aOneStopView.isMin){
					handleHidAndShow();
				}
				/*
				aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"4");           
				if(aOneStopView.isMin){
					handleHidAndShow();
				}
				c = 4; 
				*/         
		}});
		
		aOneStopView.exitButton.addMouseListener(new MouseAdapter(){
			 public void mouseEntered(MouseEvent evt){handleVisibleMenu();}
			 public void mouseExited(MouseEvent evt){handleInvisibleMenu();}
		});
		aOneStopView.tButton.addMouseListener(new MouseAdapter(){
			 public void mouseEntered(MouseEvent evt){handleVisibleMenu();}
			 public void mouseExited(MouseEvent evt){handleInvisibleMenu();}
		});	
		aOneStopView.gButton.addMouseListener(new MouseAdapter(){
			 public void mouseEntered(MouseEvent evt){handleVisibleMenu();}
			 public void mouseExited(MouseEvent evt){handleInvisibleMenu();}
		});
		aOneStopView.oButton.addMouseListener(new MouseAdapter(){
			 public void mouseEntered(MouseEvent evt){handleVisibleMenu();}
			 public void mouseExited(MouseEvent evt){handleInvisibleMenu();}
		});	
		aOneStopView.fButton.addMouseListener(new MouseAdapter(){
			 public void mouseEntered(MouseEvent evt){handleVisibleMenu();}
			 public void mouseExited(MouseEvent evt){handleInvisibleMenu();}
		});
		aOneStopView.minButton.addMouseListener(new MouseAdapter(){
			 public void mouseEntered(MouseEvent evt){handleVisibleMenu();}
			 public void mouseExited(MouseEvent evt){handleInvisibleMenu();}
		});	
		aOneStopView.setButton.addMouseListener(new MouseAdapter(){
			 public void mouseEntered(MouseEvent evt){handleVisibleMenu();}
			 public void mouseExited(MouseEvent evt){handleInvisibleMenu();}
		});
		aOneStopView.sPane.addMouseListener(new MouseAdapter(){
			 public void mouseEntered(MouseEvent evt){handleVisibleMenu();}
			 public void mouseExited(MouseEvent evt){handleInvisibleMenu();}
		});	
		aOneStopView.mPane.addMouseListener(new MouseAdapter(){
			 public void mouseEntered(MouseEvent evt){handleVisibleMenu();}
			 public void mouseExited(MouseEvent evt){handleInvisibleMenu();}
		});
		//END OF MENU CODE

                
                       
		/* Timers listeners*/
        aTimer = new Timer(25000 ,new ActionListener(){
        	public void actionPerformed(ActionEvent e){
            	handleTimerTick();
            }
        }); 
        fTimer = new Timer(500 ,new ActionListener(){
        	public void actionPerformed(ActionEvent e){
            	handleFTimerTick();
            }
        }); 
        gTimer = new Timer(500 ,new ActionListener(){
        	public void actionPerformed(ActionEvent e){
            	handleGTimerTick();
            }
        }); 
        tTimer = new Timer(500 ,new ActionListener(){
        	public void actionPerformed(ActionEvent e){
            	handleTTimerTick();
            }
        }); 			
        ntfyTimer = new Timer(20 ,new ActionListener(){
        	public void actionPerformed(ActionEvent e){
            	handleNtfyTimerTick();
            }
        }); 
        apprTimer = new Timer(5000 ,new ActionListener(){
        	public void actionPerformed(ActionEvent e){
            	handleApprTimerTick();
            }
        }); 
        alrtTimer = new Timer(15000 ,new ActionListener(){
        	public void actionPerformed(ActionEvent e){
            	handleAlrtTimerTick();
            }
        }); 	       	
        		  
        	    
        /* Listeners in OneStopPage*/
        aOneStopView.cards.aOneStopPage.postButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		handlePostButton();
        	}
        });
        
        aOneStopView.cards.aOneStopPage.fbToggle.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		handleFBToggle();
        	}
        });
        
        aOneStopView.cards.aOneStopPage.twToggle.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		handleTWToggle();
        	}
        });
        
        aOneStopView.cards.aOneStopPage.ggToggle.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		handleGGToggle();
        	}
        });	        
		
		// Frame settings
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1920,918);
		setResizable(false);		
    }
        
    // Opens the program
    public void handleOpenButton() {
    	if(!aOneStopView.isOpen){
    		c = 0;
    		i = 0;
       		x = 1336;
       		f = true;
			g = true;
			t = true;
			/*
    		aOneStopView.layered.remove(aOneStopView.back2);
    		aOneStopView.layered.add(aOneStopView.sPane);
    		aOneStopView.layered.add(aOneStopView.mPane);
    		aOneStopView.layered.add(aOneStopView.back2);*/
    		ImageIcon tempI = new ImageIcon("max.png");
			aOneStopView.minButton.setIcon(tempI);
			aOneStopView.minButton.setToolTipText("Hide App");
			aOneStopView.isMin = false;
			aOneStopView.layered.remove(aOneStopView.back2);
			aOneStopView.layered.add(aOneStopView.sPane);
    		aOneStopView.layered.add(aOneStopView.mPane);
			aOneStopView.layered.add(aOneStopView.cards);
			aOneStopView.layered.add(aOneStopView.back2);
			aOneStopView.notification.setVisible(false);
			apprTimer.stop();
			ntfyTimer.stop();   		
    		
    		aOneStopView.isOpen = true;   		
    		aOneStopView.minButton.setToolTipText("Show App");	
    		aTimer.start();
    		alrtTimer.start();
    	}
    }
    
    //Exits the program
    public void handleExitButton() {    		
		Object[] options = {"Quit","Logout","Cancel"}; 
		int result = JOptionPane.showOptionDialog(null, 
		 											  "Quit or Logout?", 
													  "Exit", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
		 											  null, options, options[2]); 
		if (result == 2) {
	    	System.out.println(0);
			rInvisibleMenu();
	 		aOneStopView.cards.layoutManager.show(aOneStopView.cards.slides,"4");
		} 
		else if (result == 1) {
			handleExitButton();
		} 
		else {
			//dunno what this is doing
			i = 0;
	       	x = 1336;  	
	    	aOneStopView.layered.remove(aOneStopView.back2);
	    	aOneStopView.layered.remove(aOneStopView.sPane);
	    	aOneStopView.layered.remove(aOneStopView.mPane);
	    	aOneStopView.layered.remove(aOneStopView.cards);
	    	aOneStopView.layered.add(aOneStopView.back2);
	    	aOneStopView.isOpen = false;
	    	ImageIcon tempI = new ImageIcon("min.png");
			aOneStopView.minButton.setIcon(tempI);
			aOneStopView.isMin = true;  
			aOneStopView.notification.setVisible(false);			
	    	aTimer.stop();
	    	alrtTimer.stop();
	    	apprTimer.stop();
	    	ntfyTimer.stop();
	    	fTimer.stop();
	    	gTimer.stop();
	    	tTimer.stop();
	    	c = 0;
		} 		    		
    }
    
	public void handleVisibleMenu(){
		aOneStopView.mPane.setOpaque(true);
		aOneStopView.sPane.setOpaque(true);
		aOneStopView.setButton.setVisible(true);
		aOneStopView.minButton.setVisible(true);
		aOneStopView.oButton.setVisible(true);
		aOneStopView.fButton.setVisible(true);
		aOneStopView.gButton.setVisible(true);
		aOneStopView.tButton.setVisible(true);
		aOneStopView.exitButton.setVisible(true);
	}
	
	public void handleInvisibleMenu(){
		aOneStopView.mPane.setOpaque(false);
		aOneStopView.sPane.setOpaque(false);
		aOneStopView.setButton.setVisible(false);
		aOneStopView.minButton.setVisible(false);
		aOneStopView.oButton.setVisible(false);
		aOneStopView.fButton.setVisible(false);
		aOneStopView.gButton.setVisible(false);
		aOneStopView.tButton.setVisible(false);
		aOneStopView.exitButton.setVisible(false);
	}
	
	public void rVisibleMenu(){
		aOneStopView.mPane.setVisible(true);
		aOneStopView.sPane.setVisible(true);
		aOneStopView.setButton.setVisible(true);
		aOneStopView.minButton.setVisible(true);
		aOneStopView.oButton.setVisible(true);
		aOneStopView.fButton.setVisible(true);
		aOneStopView.gButton.setVisible(true);
		aOneStopView.tButton.setVisible(true);
		aOneStopView.exitButton.setVisible(true);
	}
	
	public void rInvisibleMenu(){
		aOneStopView.mPane.setVisible(false);
		aOneStopView.sPane.setVisible(false);
		aOneStopView.setButton.setVisible(false);
		aOneStopView.minButton.setVisible(false);
		aOneStopView.oButton.setVisible(false);
		aOneStopView.fButton.setVisible(false);
		aOneStopView.gButton.setVisible(false);
		aOneStopView.tButton.setVisible(false);
		aOneStopView.exitButton.setVisible(false);
	}
	
    public void handleHidAndShow(){
    	if(aOneStopView.isMin){
			ImageIcon tempI = new ImageIcon("max.png");
			aOneStopView.minButton.setIcon(tempI);
			aOneStopView.minButton.setToolTipText("Hide App");
			aOneStopView.isMin = false;
			aOneStopView.layered.remove(aOneStopView.back2);
			aOneStopView.layered.add(aOneStopView.cards);
			aOneStopView.notification.setVisible(false);
			apprTimer.stop();
			ntfyTimer.stop();
		}
		else{
			ImageIcon tempI = new ImageIcon("min.png");
			aOneStopView.minButton.setIcon(tempI);
			aOneStopView.minButton.setToolTipText("Show App");
			aOneStopView.isMin = true;
			aOneStopView.layered.remove(aOneStopView.back2);
			aOneStopView.layered.remove(aOneStopView.cards);
			aOneStopView.layered.add(aOneStopView.back2);
		}
    }
    
  
    /* OneStopPage handlers*/
    // postbutton handler 
	public void handlePostButton() {
		// no text
		if(aOneStopView.cards.aOneStopPage.aTextField.getText().trim().length() == 0){
		}
		// fb,tw,gg checked
		else if (aOneStopView.cards.aOneStopPage.fbCheckBox.isSelected() && aOneStopView.cards.aOneStopPage.twCheckBox.isSelected() && aOneStopView.cards.aOneStopPage.ggCheckBox.isSelected()){
			Post fbtwgg = new Post("fbtwgg","me",aOneStopView.cards.aOneStopPage.aTextField.getText());
			for(int i=6;i>0;i--){
        		aOneStopModel.currentFeeds[i] = aOneStopModel.currentFeeds[i-1];
        	}
        	aOneStopModel.currentFeeds[0] = fbtwgg;       
		}
		// fb,tw checked
		else if (aOneStopView.cards.aOneStopPage.fbCheckBox.isSelected() && aOneStopView.cards.aOneStopPage.twCheckBox.isSelected()){
			Post fbtw = new Post("fbtw","me",aOneStopView.cards.aOneStopPage.aTextField.getText());
			for(int i=6;i>0;i--){
        		aOneStopModel.currentFeeds[i] = aOneStopModel.currentFeeds[i-1];
        	}
        	aOneStopModel.currentFeeds[0] = fbtw;       
		}
		// tw,gg checked
		else if (aOneStopView.cards.aOneStopPage.twCheckBox.isSelected() && aOneStopView.cards.aOneStopPage.ggCheckBox.isSelected()){
			Post twgg = new Post("twgg","me",aOneStopView.cards.aOneStopPage.aTextField.getText());
			for(int i=6;i>0;i--){
        		aOneStopModel.currentFeeds[i] = aOneStopModel.currentFeeds[i-1];
        	}
        	aOneStopModel.currentFeeds[0] = twgg;       
		}
		// fb,gg checked
		else if (aOneStopView.cards.aOneStopPage.fbCheckBox.isSelected() && aOneStopView.cards.aOneStopPage.ggCheckBox.isSelected()){
			Post fbgg = new Post("fbgg","me",aOneStopView.cards.aOneStopPage.aTextField.getText());
			for(int i=6;i>0;i--){
        		aOneStopModel.currentFeeds[i] = aOneStopModel.currentFeeds[i-1];
        	}
        	aOneStopModel.currentFeeds[0] = fbgg;       
		}
		// fbchecked
		else if (aOneStopView.cards.aOneStopPage.fbCheckBox.isSelected()){
			Post fb = new Post("facebook","me",aOneStopView.cards.aOneStopPage.aTextField.getText());
			for(int i=6;i>0;i--){
        		aOneStopModel.currentFeeds[i] = aOneStopModel.currentFeeds[i-1];
        	}
        	aOneStopModel.currentFeeds[0] = fb;       
		}
		// twchecked
		else if (aOneStopView.cards.aOneStopPage.twCheckBox.isSelected()){
			Post tw = new Post("twitter","me",aOneStopView.cards.aOneStopPage.aTextField.getText());
			for(int i=6;i>0;i--){
        		aOneStopModel.currentFeeds[i] = aOneStopModel.currentFeeds[i-1];
        	}
        	aOneStopModel.currentFeeds[0] = tw;			
		}
		// ggchecked
		else if (aOneStopView.cards.aOneStopPage.ggCheckBox.isSelected()){
			Post gg = new Post("google","me",aOneStopView.cards.aOneStopPage.aTextField.getText());
			for(int i=6;i>0;i--){
        		aOneStopModel.currentFeeds[i] = aOneStopModel.currentFeeds[i-1];
        	}
        	aOneStopModel.currentFeeds[0] = gg;			
		}
		else{      
			JOptionPane.showMessageDialog(null, "No network has been chosen!",  "Error", JOptionPane.ERROR_MESSAGE); 
		}		
		
		aOneStopView.cards.aOneStopPage.aTextField.setText("");
		updateFeeds();
    }
    
    // fbtoggle handler
    public void handleFBToggle(){
    	// select fb
    	if(aOneStopView.cards.aOneStopPage.fbToggle.isSelected()){
    		aOneStopView.cards.aOneStopPage.fbToggle.setIcon(new ImageIcon("Facebook Toggle.png"));
    		if (filter == 000){
    			filter = 100;
    		}
    		else if (filter == 001){    			
    			filter = 101;
    		}
    		else if (filter == 010){    			
    			filter = 110;
    		}
    		else if (filter == 011){    			
    			filter = 111;
    		} 
    		 		
    		
    	}
    	// de-select fb
    	else if (!aOneStopView.cards.aOneStopPage.fbToggle.isSelected()){
    		aOneStopView.cards.aOneStopPage.fbToggle.setIcon(new ImageIcon("Facebook Untoggled.png"));
    		if (filter == 100){
    			filter = 100;
    			aOneStopView.cards.aOneStopPage.fbToggle.setIcon(new ImageIcon("Facebook Toggle.png"));
    			aOneStopView.cards.aOneStopPage.fbToggle.setSelected(true);
    		}
    		else if (filter == 101){    			
    			filter = 001;
    		}
    		else if (filter == 110){    			
    			filter = 010;
    		}
    		else if (filter == 111){    			
    			filter = 011;
    		}
    		
    	}
    	filterFeeds();
    	aTimer.restart();
    }
    
    // twtoggler handler
    public void handleTWToggle(){
    	// select tw
    	if(aOneStopView.cards.aOneStopPage.twToggle.isSelected()){
    		aOneStopView.cards.aOneStopPage.twToggle.setIcon(new ImageIcon("Twitter Toggle.png"));
    		if (filter == 000){    			
    			filter = 010;    			
    		}
    		else if (filter == 001){    			
    			filter = 011;
    		}
    		else if (filter == 100){    			
    			filter = 110;
    		}
    		else if (filter == 101){    			
    			filter = 111;
    		}
    		
    	}
    	// de-select tw
    	else if (!aOneStopView.cards.aOneStopPage.twToggle.isSelected()){
    		aOneStopView.cards.aOneStopPage.twToggle.setIcon(new ImageIcon("Twitter Untoggled.png"));
    		if (filter == 010){   
    			filter = 010;		
    			aOneStopView.cards.aOneStopPage.twToggle.setIcon(new ImageIcon("Twitter Toggle.png"));
    			aOneStopView.cards.aOneStopPage.twToggle.setSelected(true);
    		}
    		else if (filter == 011){    			
    			filter = 001;
    		}
    		else if (filter == 110){    			
    			filter = 100;
    		}
    		else if (filter == 111){    			
    			filter = 101;
    		}
    		
    	}
    	filterFeeds();
    	aTimer.restart();
    }
    
    // ggtoggle handler
    public void handleGGToggle(){
    	// select gg
    	if(aOneStopView.cards.aOneStopPage.ggToggle.isSelected()){
    		aOneStopView.cards.aOneStopPage.ggToggle.setIcon(new ImageIcon("Google Toggle.png"));
    		if (filter == 000){ 			
    			filter = 001;    			
    		}
    		else if (filter == 100){   			
    			filter = 101;    			
    		}
    		else if (filter == 010){    			
    			filter = 011;
    		}
    		else if (filter == 110){    			
    			filter = 111;
    		}    		
    		
    	}
    	// de-select gg
    	else if (!aOneStopView.cards.aOneStopPage.ggToggle.isSelected()){
    		aOneStopView.cards.aOneStopPage.ggToggle.setIcon(new ImageIcon("Google Untoggled.png"));
    		if (filter == 001){    			
    			filter = 001;
    			aOneStopView.cards.aOneStopPage.ggToggle.setIcon(new ImageIcon("Google Toggle.png"));
    			aOneStopView.cards.aOneStopPage.ggToggle.setSelected(true);
    		}
    		else if (filter == 101){    			
    			filter = 100;
    		}
    		else if (filter == 011){    			
    			filter = 010;
    		}
    		else if (filter == 111){    			
    			filter = 110;
    		}
    		
    	}
    	filterFeeds();
    	aTimer.restart();
    }
    /*end oneStopPage handlers*/
    
    /* Timers handlers */    
    
    //	aTimer handler
    public void handleTimerTick(){ /* generate feeds according to the filter*/   	                
    	Post aPost; 
    	// filter == 001	
    	if (filter == 001){
    		aPost = new Post(aOneStopModel.randomNetwork(filter),aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
    	}
    	// filter == 010
    	else if (filter == 010){
    		aPost = new Post(aOneStopModel.randomNetwork(filter),aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
    	}
    	// filter == 100
    	else if (filter == 100){
    		aPost = new Post(aOneStopModel.randomNetwork(filter),aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
    	}
    	// filter == 011
    	else if (filter == 011){
    		aPost = new Post(aOneStopModel.randomNetwork(filter),aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
    	}
    	// filter == 101
    	else if (filter == 101){
    		aPost = new Post(aOneStopModel.randomNetwork(filter),aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
    	}
    	// filter == 110
    	else if (filter == 110){
    		aPost = new Post(aOneStopModel.randomNetwork(filter),aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
    	}
    	// filter == 111
    	else{
    		aPost = new Post(aOneStopModel.randomNetwork(),aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
    	}    	
    	
		for(int i=6;i>0;i--){
        	aOneStopModel.currentFeeds[i] = aOneStopModel.currentFeeds[i-1];
        }
        aOneStopModel.currentFeeds[0] = aPost;                 
        updateFeeds();
        
        if(aOneStopView.isMin && aOneStopView.isOpen){
        	aOneStopView.notification.nwImage.setIcon(aOneStopModel.getImageIcon(aPost.network));
        	aOneStopView.notification.author.setText(aPost.author);
        	aOneStopView.notification.message.setText(aPost.message);	
        	aOneStopView.notification.setVisible(true);	
        	apprTimer.start();        	
        }	  
    }
    
    // apprTimer handler
    public void handleApprTimerTick(){
    	i = 0;
        x = 1336;
    	apprTimer.stop();
    	ntfyTimer.start();
    }
    
    public void handleNtfyTimerTick(){    	
    	if(i<50){
    		x = x+11;
    		aOneStopView.notification.setLocation(x,753);
    		i++;	
    	}	    	
    	if(i == 50){
    		aOneStopView.notification.setVisible(false);
    		aOneStopView.notification.setLocation(1336,753);
    		ntfyTimer.stop();    		    		
    	}	
    }
    
    // alrtTimer handler
    public void handleAlrtTimerTick(){
    	int a;
    	Random r = new Random();
		a = r.nextInt(3);
		
		if(a == 0){
			if(c != 1){
				fTimer.start();						
			}	
		}
		else if(a == 1){
			if(c != 3){			
				tTimer.start();	
			}
		}
		else{
			if(c != 2){			
				gTimer.start();	
			}	
		}
    }
    
    // fTimer handler
    public void handleFTimerTick(){    	
    	if(f){
    		aOneStopView.fButton.setIcon(new ImageIcon("fbAlert.png"));
    		f = false;
    	}
    	else{
    		aOneStopView.fButton.setIcon(new ImageIcon("fbAlert2.png"));
    		f = true;
    	}
    }
    
    // gTimer handler
    public void handleGTimerTick(){    	
    	if(g){
    		aOneStopView.gButton.setIcon(new ImageIcon("gAlert.png"));
    		g = false;
    	}
    	else{
    		aOneStopView.gButton.setIcon(new ImageIcon("gAlert2.png"));
    		g = true;
    	}    
    }
    
    // tTimer handler
    public void handleTTimerTick(){    	
    	if(t){
    		aOneStopView.tButton.setIcon(new ImageIcon("tAlert.png"));
    		t = false;
    	}
    	else{
    		aOneStopView.tButton.setIcon(new ImageIcon("tAlert2.png"));
    		t = true;
    	}    
    }
    /*End Timers functions*/
    
    
    /*local functions*/
    
    // updateFeeds
    public void updateFeeds(){/* update oneStopPage components according to the current feeds*/
    	aOneStopView.cards.aOneStopPage.icon1.setIcon(aOneStopModel.getImageIcon(aOneStopModel.currentFeeds[0].network));
		aOneStopView.cards.aOneStopPage.icon2.setIcon(aOneStopModel.getImageIcon(aOneStopModel.currentFeeds[1].network));
		aOneStopView.cards.aOneStopPage.icon3.setIcon(aOneStopModel.getImageIcon(aOneStopModel.currentFeeds[2].network));
		aOneStopView.cards.aOneStopPage.icon4.setIcon(aOneStopModel.getImageIcon(aOneStopModel.currentFeeds[3].network));
		aOneStopView.cards.aOneStopPage.icon5.setIcon(aOneStopModel.getImageIcon(aOneStopModel.currentFeeds[4].network));
		aOneStopView.cards.aOneStopPage.icon6.setIcon(aOneStopModel.getImageIcon(aOneStopModel.currentFeeds[5].network));
		aOneStopView.cards.aOneStopPage.icon7.setIcon(aOneStopModel.getImageIcon(aOneStopModel.currentFeeds[6].network));
		aOneStopView.cards.aOneStopPage.author1.setText(aOneStopModel.currentFeeds[0].author);
		aOneStopView.cards.aOneStopPage.author2.setText(aOneStopModel.currentFeeds[1].author);
		aOneStopView.cards.aOneStopPage.author3.setText(aOneStopModel.currentFeeds[2].author);
		aOneStopView.cards.aOneStopPage.author4.setText(aOneStopModel.currentFeeds[3].author);
		aOneStopView.cards.aOneStopPage.author5.setText(aOneStopModel.currentFeeds[4].author);
		aOneStopView.cards.aOneStopPage.author6.setText(aOneStopModel.currentFeeds[5].author);
		aOneStopView.cards.aOneStopPage.author7.setText(aOneStopModel.currentFeeds[6].author);
		aOneStopView.cards.aOneStopPage.message1.setText(aOneStopModel.currentFeeds[0].message);
		aOneStopView.cards.aOneStopPage.message2.setText(aOneStopModel.currentFeeds[1].message);
		aOneStopView.cards.aOneStopPage.message3.setText(aOneStopModel.currentFeeds[2].message);
		aOneStopView.cards.aOneStopPage.message4.setText(aOneStopModel.currentFeeds[3].message);
		aOneStopView.cards.aOneStopPage.message5.setText(aOneStopModel.currentFeeds[4].message);
		aOneStopView.cards.aOneStopPage.message6.setText(aOneStopModel.currentFeeds[5].message);
		aOneStopView.cards.aOneStopPage.message7.setText(aOneStopModel.currentFeeds[6].message);
    }
    
    // feeds filtering
    public void filterFeeds(){/* filter feeds according to the filter value*/
    	int toFill = 7;
    	Post[] keep = new Post[7];
    	// filter 001
    	if (filter == 001){
    		for(int i=0;i<7;i++){        		
        		if(aOneStopModel.currentFeeds[i].network == "google") {
        			keep[7-toFill] = aOneStopModel.currentFeeds[i];
        			toFill--;
        		}
        	}
        	for(int i=7-toFill;i<7;i++){
        		keep[i] = new Post("google",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());        		
        	}
        	for(int i=0;i<7;i++){        		
        		aOneStopModel.currentFeeds[i] = keep[i];
        	}
    	}
    	// filter 010
    	else if (filter == 010){
    		for(int i=0;i<7;i++){        		
        		if(aOneStopModel.currentFeeds[i].network == "twitter") {
        			keep[7-toFill] = aOneStopModel.currentFeeds[i];
        			toFill--;
        		}
        	}
        	for(int i=7-toFill;i<7;i++){
        		keep[i] = new Post("twitter",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());        		
        	}
        	for(int i=0;i<7;i++){        		
        		aOneStopModel.currentFeeds[i] = keep[i];
        	}
    		
    	}
    	// filter 011
    	else if (filter == 011){
    		for(int i=0;i<7;i++){        		
        		if(aOneStopModel.currentFeeds[i].network == "twitter" || aOneStopModel.currentFeeds[i].network == "google") {
        			keep[7-toFill] = aOneStopModel.currentFeeds[i];
        			toFill--;
        		}
        	}
        	for(int i=7-toFill;i<7;i++){
        		keep[i] = new Post(aOneStopModel.randomNetwork(filter),aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());        		
        	}
        	if(toFill <= 1){
        		if (keep[0].network == "twitter"){
        			keep[5] = new Post("google",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
        			keep[6] = new Post("google",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
        		}
        		else{
        			keep[5] = new Post("twitter",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
        			keep[6] = new Post("twitter",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
        		}
        		
        	}
        	for(int i=0;i<7;i++){        		
        		aOneStopModel.currentFeeds[i] = keep[i];
        	}
    		
    	}
    	// filter 100
    	else if (filter == 100){
    		
    		for(int i=0;i<7;i++){        		
        		if(aOneStopModel.currentFeeds[i].network == "facebook") {
        			keep[7-toFill] = aOneStopModel.currentFeeds[i];
        			toFill--;
        		}
        	}
        	for(int i=7-toFill;i<7;i++){
        		keep[i] = new Post("facebook",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());        		
        	}
        	for(int i=0;i<7;i++){        		
        		aOneStopModel.currentFeeds[i] = keep[i];
        	}    	
    	}
    	// filter 110
    	else if (filter == 110){
    		for(int i=0;i<7;i++){        		
        		if(aOneStopModel.currentFeeds[i].network == "facebook" || aOneStopModel.currentFeeds[i].network == "twitter") {
        			keep[7-toFill] = aOneStopModel.currentFeeds[i];
        			toFill--;
        		}
        	}
        	for(int i=7-toFill;i<7;i++){
        		keep[i] = new Post(aOneStopModel.randomNetwork(filter),aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());        		
        	}
        	if(toFill <= 1){
        		if (keep[0].network == "twitter"){
        			keep[5] = new Post("facebook",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
        			keep[6] = new Post("facebook",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
        		}
        		else{
        			keep[5] = new Post("twitter",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
        			keep[6] = new Post("twitter",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
        		}
        		
        	}
        	for(int i=0;i<7;i++){        		
        		aOneStopModel.currentFeeds[i] = keep[i];
        	}
    		
    	}
    	// filter == 101
    	else if (filter == 101){
    		for(int i=0;i<7;i++){        		
        		if(aOneStopModel.currentFeeds[i].network == "facebook" || aOneStopModel.currentFeeds[i].network == "google") {
        			keep[7-toFill] = aOneStopModel.currentFeeds[i];
        			toFill--;
        		}
        	}
        	for(int i=7-toFill;i<7;i++){
        		keep[i] = new Post(aOneStopModel.randomNetwork(filter),aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());        		
        	}
        	if(toFill <= 1){
        		if (keep[0].network == "google"){
        			keep[5] = new Post("facebook",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
        			keep[6] = new Post("facebook",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
        		}
        		else{
        			keep[5] = new Post("google",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
        			keep[6] = new Post("google",aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
        		}
        		
        	}
        	for(int i=0;i<7;i++){        		
        		aOneStopModel.currentFeeds[i] = keep[i];
        	}
    		
    	}
    	// filter == 111
    	else {
    		for(int i=0;i<7;i++){
        		aOneStopModel.currentFeeds[i] = new Post(aOneStopModel.randomNetwork(),aOneStopModel.randomAuthor(),aOneStopModel.randomMessage());
        	}
    	}
    	updateFeeds(); 
    	 
    }
    /* end local functions */
    
    // Main function
    public static void main(String[] args) {
    	OneStopModel aModel = new OneStopModel();
    	new OneStopController("OneStop Prototype", aModel, new OneStopView()).setVisible(true);
    	// check program running
    	//System.out.println("The program is running!");
    }
}
