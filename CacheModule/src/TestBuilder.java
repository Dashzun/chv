import org.junit.Test;

import org.junit.Assert;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
/**
 * 
 * @author DaShzun, Todd
 *
 */
public class TestBuilder {

	@Test
	/**
	 * Testing the sort of the builder class by randomly shuffling an array 100
	 * times and then sorting it, and checking it against its original form,
	 * 1000 times
	 */
	public void testSort() {
		Builder builder = new Builder();
		String[] testArray = new String[10];
		testArray[0] = "apple";
		testArray[1] = "banana";
		testArray[2] = "cantelope";
		testArray[3] = "durian";
		testArray[4] = "eggplant";
		testArray[5] = "fig";
		testArray[6] = "grape";
		testArray[7] = "honeydew";
		testArray[8] = "ita";
		testArray[9] = "jujube";

		String[] correct = testArray;
		Random randy = new Random();
		for (int y = 0; y < 1000; y++) {
			for (int i = 0; i < 100; i++) {
				int x = randy.nextInt(10);
				String temp = testArray[x];
				try {
					testArray[x] = testArray[x - 1];
					testArray[x - 1] = temp;
				} catch (IndexOutOfBoundsException e) {
					testArray[x] = testArray[9];
					testArray[9] = temp;
				}

			}

			builder.parsedList = testArray;
			builder.sort();
			Assert.assertArrayEquals(correct, testArray);
		}
	}

	@Test
	/**
	 * Testing the writing function of the builder class by reading out a list
	 * from file, writing it, and reading it again to se if it is the same
	 */
	public void testWriter() {
		String[] writeList;
		ArrayList<String> list = new ArrayList<String>();
		try {
			// fileReader reading the text
			FileReader fileReader = new FileReader("Cache.txt");

			// Wrapping the file reader in a BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			// the raw input from the file
			String input;
			// while we are getting input from the file
			while ((input = bufferedReader.readLine()) != null) {
				list.add(input);
			}
			// close the file
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("File error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writeList = list.toArray(new String[list.size()]);
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
		String[] testArray = testList.toArray(new String[testList.size()]);

		Assert.assertArrayEquals(writeList, testArray);

	}
}
