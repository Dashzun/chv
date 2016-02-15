import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author DaShzun, Todd
 *
 */
public class MainDriver {
	private Cache cache;
	private File[] fileList;

	public MainDriver() {
        //comment
		cache = new Cache();
		this.getFiles();// get the files out of the resource folder
		boolean update = checkDate();
		if (update) {// if the cache's list needs to be updated
			System.out.println("Updating cache...");
			Builder builder = new Builder(fileList);
			cache.readList();
		}
		System.out.println("Cache up to date");
		query();// Query the user for their word

	}

	/**
	 * Get the files from our resource folder
	 */
	public void getFiles() {
		File folder = new File("Resources/");
		fileList = folder.listFiles();
	}

	/**
	 * While the user is searching, continue to ask them to enter words to find.
	 * Quit this process by entering 999
	 */
	public void query() {
		boolean done = false;
		Scanner scan = new Scanner(System.in);
		while (!done) {
			System.out.println("Enter a word to find. Enter 999 to quit.");
			String word = (String) scan.nextLine();
			if (word.equals("999")) {
				done = true;
			} else {
				boolean hit = binSearch(word);
				if (hit) {
					System.out.println("Hit!");
				} else {
					System.out.println("Miss! Check your spelling.");
				}
			}
		}
	}

	/**
	 * Searches the cache for the user's word
	 * 
	 * @param word
	 * @return true or false, as to whether or not the word exists in the cache
	 */
	public boolean binSearch(String word) {
		int found = Arrays.binarySearch(cache.cacheList, word);
		if (found >= 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Compare the last modified date of the cache to the newest file, if the
	 * resource folder has a newer file than that of our cache's we need to
	 * update our cache's list
	 * 
	 * @return boolean update, whether or not the need to update is true or
	 *         false
	 */
	public boolean checkDate() {
		boolean update = false;
		long cacheDate = this.cache.getDate();
		long fileDate = getLatestDate();
		if (cacheDate < fileDate) {
			update = true;
		}
		return update;
	}

	/**
	 * Get the latest modified file's modified data
	 * 
	 * @return
	 */
	public long getLatestDate() {
		long latestDate = 0;
		for (File file : fileList) {
			if (file.lastModified() > latestDate) {
				latestDate = file.lastModified();
			}
		}
		return latestDate;
	}

	public static void main(String[] args) {
		MainDriver main = new MainDriver();

	}
}
