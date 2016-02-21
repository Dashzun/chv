import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestWordValidater {

	@Test
	public void testInit() {
		WordValidater wordVal = new WordValidater();
		assertTrue(wordVal.cacheDriver != null);
	}
	
	@Test
	public void testValidate(){
		WordValidater wordVal = new WordValidater();
		ArrayList<String> poss = new ArrayList<String>();
		poss.add("NOtawordsd");
		poss.add("Word");
		poss.add("Computer");
		poss.add("Engineering");
		poss.add("123notawoasdadrd");
		assertTrue(poss.size() == 5);
		poss = wordVal.validate(poss);
		assertTrue(poss.size() == 3);
	}

}
