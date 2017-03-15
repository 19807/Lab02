package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;


public class AlienDictionary {
	
	private List <Word> aDictionary = new LinkedList <Word>();
	
	public void addWord(String alienWord, String translation){	
		boolean t = false;
		Word w = new Word(alienWord, translation);
		
		for(Word ww : aDictionary)
			if(ww.compare(alienWord)!=null){ //parola non presente
				ww.setTranslation(translation);
				t=true;}
		if(!t && alienWord.matches("[a-zA-Z]*") && translation.matches("[a-zA-Z]*"))
				aDictionary.add(w);	

		
	}
	
	public String translateWord(String alienWord){
		boolean trovato = false;
		String traduzione ="";
		
		for(Word ww : aDictionary){
			if(ww.compare(alienWord)!=null) 
				trovato = true;
			traduzione = ww.getTranslation();
			break;
		}
		
		if(trovato)
		return traduzione;
		else
			return null;
		
	}

	public List<Word> getaDictionary() {
		return aDictionary;
	}

	public void setaDictionary(List<Word> aDictionary) {
		this.aDictionary = aDictionary;
	}
	
	
	
	

}
