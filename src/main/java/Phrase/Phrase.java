package Phrase;

import java.util.HashMap;

import Extractors.InformationExtractor;

public class Phrase {

	String stringPhrase;
	InformationExtractor extractor;
	HashMap<String, String> valueWords;
	
	public String getStringPhrase() {
		return stringPhrase;
	}
	public void setStringPhrase(String stringPhrase) {
		this.stringPhrase = stringPhrase;
	}
	public InformationExtractor getExtractor() {
		return extractor;
	}
	public void setExtractor(InformationExtractor extractor) {
		this.extractor = extractor;
	}
	public HashMap<String, String> getValueWords() {
		return valueWords;
	}
	public void setValueWords(HashMap<String, String> valueWords) {
		this.valueWords = valueWords;
	}
	
	
}
