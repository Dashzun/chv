import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author DaShzun, Todd
 *
 */

public class Cache {
	public File file;
	public String[] cacheList;
	public int count;
	public long date;

	public Cache() {
		file = new File("Cache.txt");
		readList();
		count = cacheList.length;
		date = file.lastModified();
	}

	/**
	 * File reader that reads the already sorted and parsed list in from the
	 * cache.txt text file
	 */
	public void readList() {
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
		this.cacheList = list.toArray(new String[list.size()]);
	}

	public long getDate() {
		return date;
	}

	public int getCount() {
		return count;
	}

}
