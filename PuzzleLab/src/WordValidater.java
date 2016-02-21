import java.util.ArrayList;

public class WordValidater {
	CacheDriver cacheDriver;
	
	public WordValidater(){
		cacheDriver = new CacheDriver();
	}
	
	
	public ArrayList<String> validate(ArrayList<String> possWords){
		ArrayList<String> words = new ArrayList<String>();
		for (int i = 0; i < possWords.size(); i++){
			if (cacheDriver.query(possWords.get(i).toLowerCase())){
				words.add(possWords.get(i));
			}
		}
		return words;
	}

}
