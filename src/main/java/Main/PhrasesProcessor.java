package Main;

import Phrase.Affirmation;
import Phrase.Phrase;
import Phrase.Question;

public class PhrasesProcessor {

	public Phrase process(String string) {
		
		Phrase phrase = processType(string);
		
		processExtractor(phrase);
		
		return phrase;
//		processAnswer(phrase);
	}

	private void processExtractor(Phrase phrase) {
		if(phrase.getStringPhrase().contains("Credits"))
		{
			
		}
		else
		{
			
		}
	}

	private Phrase processType(String string) {
		if(string != null && string.contains("?"))
		{
			return new Question();
		}
		return new Affirmation();
	}

}
