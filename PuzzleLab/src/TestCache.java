import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
/**
 * 
 * @author DaShzun, Todd
 *
 */
public class TestCache {

	@Test
	/**
	 * Test the read function in the cache by creating an array, writing it to a
	 * file, and then reading it, and then checking if the read list and the
	 * written list are the same
	 */
	public void testRead() {
		String[] writeList = new String[10];
		writeList[0] = "apple";
		writeList[1] = "banana";
		writeList[2] = "cantelope";
		writeList[3] = "durian";
		writeList[4] = "eggplant";
		writeList[5] = "fig";
		writeList[6] = "grape";
		writeList[7] = "honeydew";
		writeList[8] = "ita";
		writeList[9] = "jujube";

		try {
			// fileWriter writing the text
			FileWriter fileWriter = new FileWriter("test.txt");

			// Wrapping the file writer in a BufferedWriter.
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for (String word : writeList) {
				bufferedWriter.write(word + "\n");
			}
			// close the file
			bufferedWriter.close();
		} catch (FileNotFoundException ex) {
			System.out.println("File error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ArrayList<String> testList = new ArrayList<String>();
		try {
			// fileReader reading the text
			FileReader fileReader = new FileReader("test.txt");

			// Wrapping the file reader in a BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			// the raw input from the file
			String input;
			// while we are getting input from the file
			while ((input = bufferedReader.readLine()) != null) {
				testList.add(input);
			}
			// close the file
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("File error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] readList = testList.toArray(new String[testList.size()]);

		Assert.assertArrayEquals(writeList, readList);
	}
}
