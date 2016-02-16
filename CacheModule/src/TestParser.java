import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;
/**
 * 
 * @author DaShzun, Todd
 *
 */
public class TestParser {

	//@Test
	public void testFileRead() throws IOException {
		FileReader fileReader = new FileReader("10.txt");

		// Wrapping the file reader in a BufferedReader.
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		// the current line of the
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
			
		}

		bufferedReader.close();
	}

	@Test
	public void testFilter() {// test passes if returns false true false true
		String a = "alskdjasklj";
		Boolean contains = false;
		if (a.matches(".*\\d.*")) {// check to see if the string has a digit
			contains = true;
		} else {
			contains = false;
		}
		System.out.println(contains);// should return false in this case

		String b = "alskdja3456354635sk2lj";
		contains = false;
		if (b.matches(".*\\d.*")) {// check to see if the string has a digit
			contains = true;
		} else {
			contains = false;
		}
		System.out.println(contains);// should return true in this case

		String c = "a";
		Boolean bigNuf = false;
		if (c.length() < 2) {// check to see if the string has more than 1 digit
			bigNuf = false;
		} else {
			bigNuf = true;
		}
		System.out.println(bigNuf);// should return false in this case

		c = "ad";
		bigNuf = false;
		if (c.length() < 2) {// check to see if the string has more than 1 digit
			bigNuf = false;
		} else {
			bigNuf = true;
		}
		System.out.println(bigNuf);// should return true in this case
	}

	@Test
	public void testFilterTwo() {
		ArrayList<String> parsedData = new ArrayList<String>();
		try {
			// fileReader reading the txt
			FileReader fileReader = new FileReader("more_words.txt");

			// Wrapping the file reader in a BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			// the raw input from the file
			String input;
			// while we are getting input from the file
			while ((input = bufferedReader.readLine()) != null) {
				// split on spaces for the txt files that are not separated on
				// each line CHECK TO SEE IF SINGLE LETTER FILTER IS WORKING
				String[] lines = input.split(" ");
				for (String line : lines) {
					if (line.matches(".*\\d.*") || line.length() < 2) {// check
																		// to
																		// see
																		// if
																		// the
																		// string
																		// has a
																		// digit
																		// or is
																		// 1
																		// character
																		// long
						// do nothing, this line is filtered out
					} else {
						// parsedData.add(line+"\n");
						parsedData.add(line);
					}
				}
			}
			// close the file
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("File error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// for(String word : parsedData){
		// System.out.println(word);
		// }
		System.out.println(parsedData);
	}
}
