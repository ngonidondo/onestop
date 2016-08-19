import java.util.*;
import java.awt.*;
import javax.swing.*;
// OneStopModel class
public class OneStopModel {	
    final int MAXIMUM_FEEDS_SIZE = 7;
    Post[] currentFeeds;
    String[] authors;
    String[] messages;
    String[] networks;
	ImageIcon facebookIcon, googleIcon, twitterIcon, fbtwggIcon, fbtwIcon, twggIcon, fbggIcon;
	
    // constructor    
    public OneStopModel() {
		currentFeeds = new Post[MAXIMUM_FEEDS_SIZE];
        facebookIcon = new ImageIcon("Facebook Icon.png");
        googleIcon = new ImageIcon("Google Icon.png");
        twitterIcon = new ImageIcon("Twitter Icon.png");
        fbtwIcon = new ImageIcon("fbtw Icon.png");
        twggIcon = new ImageIcon("twgg Icon.png");
        fbggIcon = new ImageIcon("fbgg Icon.png");
        fbtwggIcon = new ImageIcon("fbtwgg Icon.png");
        networks = new String[] {"facebook","twitter","google"};
        authors = new String[]{"John Doe","Anne Bell","Colin Brown","Emily Coleman","Gavin Fisher","Julia Ince","Edward Thomson","Isaac Walsh","Megan Hughes","Matt Marshall"};
        messages = new String[] {"a","b","c","d","e","f","g","h","i","j"};
        
        for(int i=0;i<7;i++){
        	currentFeeds[i] = new Post(randomNetwork(),randomAuthor(),randomMessage());
        }
        
			
    }
    
    // functions
    public String randomNetwork(){
    	Random n = new Random();     	
    	return networks[n.nextInt(3)];
    }
    public String randomNetwork(int filter){
    	Random n = new Random();     	
    	int filteredNetwork = n.nextInt(3);	
    		
    	if (filter == 001){
			filteredNetwork = 2;		    		
    	}
    	else if (filter == 010){
    		filteredNetwork = 1;
    	}
    	else if (filter == 100){
    		filteredNetwork = 0;
    	}
    	else if (filter == 011){
    		while(filteredNetwork == 0){
    			filteredNetwork = n.nextInt(3);
    		}
    	}
    	else if (filter == 101){
    		while(filteredNetwork == 1){
    			filteredNetwork = n.nextInt(3);
    		}    		
    	}
    	else if (filter == 110){
    		while(filteredNetwork == 2){
    			filteredNetwork = n.nextInt(3);
    		}    		
    	}

    	return networks[filteredNetwork];
    } 
    public String randomAuthor(){
    	Random a = new Random();
		return authors[a.nextInt(10)];
    } 
    public String randomMessage(){
    	Random m = new Random();
    	return messages[m.nextInt(10)];

    } 	
    public ImageIcon getImageIcon(String img){
    	if(img == "facebook")
    		return facebookIcon;
    	else if(img == "twitter")
    		return twitterIcon;
    	else if (img == "google")
    		return googleIcon;
    	else if (img == "fbtwgg")
    		return fbtwggIcon;
    	else if (img == "fbtw")
    		return fbtwIcon;
    	else if (img == "twgg")
    		return twggIcon;
    	else if (img == "fbgg")
    		return fbggIcon;			
    	else 
    		return null;
    } 			      
}