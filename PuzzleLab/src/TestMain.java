import org.junit.Test;

import java.io.File;
import java.util.Arrays;

import org.junit.Assert;
/**
 * 
 * @author DaShzun, Todd
 *
 */
public class TestMain {

	@Test
	/**
	 * Testing the get files function of the main driver by retrieving a list of
	 * files from directory, and checking if their names are the same as a list
	 * I made of their names
	 */
	public void testGetFiles() {
		String[] fileNames = { "apple.txt", "banana.txt", "cantelope.txt", "durian.txt" };
		String[] getNames = new String[4];
		File[] fileList;
		File folder = new File("TestResources/");
		fileList = folder.listFiles();
		for (int i = 0; i < 4; i++) {
			getNames[i] = fileList[i].getName();
		}
		Assert.assertArrayEquals(fileNames, getNames);
	}

	@Test
	/**
	 * Testing the get latest date function of the main by checking the dates of
	 * the test files and getting the latest one, and then seeing if that is the
	 * same file as the one I last edited, apple.txt
	 */
	public void testGetLatestDate() {
		File folder = new File("TestResources/");
		File[] fileList;
		fileList = folder.listFiles();
		File latestFile = null;
		long latestDate = 0;
		for (File file : fileList) {
			if (file.lastModified() > latestDate) {
				latestDate = file.lastModified();
				latestFile = file;
			}
		}
		File testFile = new File("TestResources/apple.txt");

		Assert.assertEquals(testFile, latestFile);

	}

	@Test
	/**
	 * Testing the search function of the main by searching an array for
	 * elements, and failing if they are not found
	 */
	public void testbinSearch() {
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
		for (int i = 0; i < 10; i++) {
			int found = Arrays.binarySearch(testArray, testArray[i]);
			if (found >= 0) {
			} else {
				Assert.fail();
			}
		}

	}

}
