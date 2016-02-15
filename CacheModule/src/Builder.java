
/**
 * 
 * @author DaShzun, Todd
 *
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Builder {
	public Parser parser;
	public String[] parsedList;
	public File[] fileList;

	/**
	 * Normal Constructor created from Main
	 * 
	 * @param fileList
	 */
	public Builder(File[] fileList) {
		this.fileList = fileList;
		this.parser = new Parser(fileList);
		this.parsedList = parser.getList();
		this.sort();
		this.writeList();

	}

	/**
	 * Test Constructor used by JUnit
	 */
	public Builder() {

	}

	/**
	 * Sort the parsed list alphabetically
	 */
	public void sort() {
		Arrays.sort(parsedList);
	}

	/**
	 * This method writes the sorted and parsed list into a file for the cache
	 */
	public void writeList() {
		try {
			// fileWriter writing the text
			FileWriter fileWriter = new FileWriter("Cache.txt");

			// Wrapping the file writer in a BufferedWriter.
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for (String word : this.parsedList) {
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
	}

}
