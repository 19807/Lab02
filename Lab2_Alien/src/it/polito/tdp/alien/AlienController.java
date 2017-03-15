package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
    
    AlienDictionary ad = new AlienDictionary();
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	    	String parola = txtWord.getText().toLowerCase();
    	    	
    	    	
    	    	
    	    	if(parola.contains(" ")){
    	    	String par[] = parola.split(" ");
    	    	ad.addWord(par[0], par[1]);
    	    	txtResult.appendText(par[0]+" "+par[1]+"\n");
    	    	}
    	    	
    	    	else{
    	    		String trad = ad.translateWord(parola);
    	    		if(trad != null)
    	    		txtResult.appendText(trad+"\n");
    	    		
    	    		else
    	    			txtResult.appendText("Parola non presente nel vocabolario\n");
    	    	}
  	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    }
    
}
