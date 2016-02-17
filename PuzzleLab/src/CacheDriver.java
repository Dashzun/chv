import java.io.File;
import java.util.Arrays;
/**
 * This cache driver is a form of the cache that is used only to
 * query for words in our dictionary, this form has no user interface
 * 
 * @author DaShzun
 *
 */
public class CacheDriver {
	private Cache cache;
	private File[] fileList;

	public CacheDriver() {
		cache = new Cache();
		this.getFiles();// get the files out of the resource folder
		boolean update = checkDate();
		if (update) {// if the cache's list needs to be updated
			Builder builder = new Builder(fileList);
			cache.readList();
		}
	}

	/**
	 * Get the files from our resource folder
	 */
	public void getFiles() {
		File folder = new File("Resources/");
		fileList = folder.listFiles();
	}

	/**
	 * Query now just checks our cache for the word
	 * we are looking for, it returns a boolean which
	 * value depends on whether or not the word is in the 
	 * dictionary.
	 * @param String searchWord
	 */
	public boolean query(String word) {
		boolean hit = this.binSearch(word);
		if (hit) {
			return true;
		} else {
			return false;
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
}
