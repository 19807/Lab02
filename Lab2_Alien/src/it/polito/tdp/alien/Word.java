package it.polito.tdp.alien;

import java.util.Map;
import java.util.TreeMap;

public class Word {
	
	private String alienWord;
	private String translation;
	
	
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
	}
	
	public String compare(String alienW){
		if(alienW.compareTo(alienWord)==0)
		return alienWord; 
		else
			return null;
			}
	


	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public String getTranslation() {
		return translation;
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

}
