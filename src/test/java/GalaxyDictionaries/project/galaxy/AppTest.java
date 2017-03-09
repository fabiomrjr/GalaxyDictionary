package GalaxyDictionaries.project.galaxy;

import Main.PhrasesProcessor;
import Phrase.Affirmation;
import Phrase.Phrase;
import Phrase.Question;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
    public void testGetQuestions()
    {
        PhrasesProcessor processor = new PhrasesProcessor();
        Phrase phrase = processor.process("how much is pish tegj glob glob ?");
        
        assertEquals(true, phrase instanceof Question);
    }
    
    public void testGetAffirmations()
    {
    	 PhrasesProcessor processor = new PhrasesProcessor();
         Phrase phrase = processor.process("prok is V");
         
         assertEquals(true, phrase instanceof Affirmation);
    }
}
