import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * 
 * @author DaShzun, Todd
 *
 */
public class Parser {

	private ArrayList<String> files;
	private File[] resources;
	public Set<String> parsedData;

	public Parser(File[] resources) {
		this.resources = resources;
		this.initiateFiles();
		this.parseFiles();
	}

	/**
	 * Gets the file names out of the file resources
	 */
	private void initiateFiles() {
		//for every file, get the file name and add it to the list of files we need to parse
		files = new ArrayList<String>();
		for(File file: resources){
			files.add(file.getName());
		}
	}


	/**
	 * This method parses the files 
	 */
	public void parseFiles() {
		// data to be returned from parsed files, not in order
		parsedData = new HashSet<String>();
		for (String name : files) {
			//for every file name in the files string
			try {
				// fileReader reading the text
				FileReader fileReader = new FileReader("Resources/"+name);
				// Wrapping the file reader in a BufferedReader.
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				//the raw input from the file
				String input;
				//while we are getting input from the file
				while ((input = bufferedReader.readLine()) != null) {
					//split on spaces for the text files that are not separated on each line CHECK TO SEE IF SINGLE LETTER FILTER IS WORKING
					String[] lines = input.split(" ");
					for(String line : lines){
						if (line.matches(".*\\d.*") || line.length() < 2) {// check to see if the string has a digit or is 1 character long, if the fits either condition its filtered out
							//do nothing, this line is filtered out
						} 
						else {
							line = line.toLowerCase();
							parsedData.add(line);

						}
					}
				} 
				// close the file
				bufferedReader.close();
			}catch (FileNotFoundException ex) {
				System.out.println("File error in Parser");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Gets the parsedData arraylist
	 * @return ArrayList<String> parsedData
	 */
	public String[] getList() {
		//Array is easier to work with, we'll change our arraylist to an array here and return it to the builder

		String[] data = parsedData.toArray(new String[parsedData.size()]);
		return data;
	}
}
