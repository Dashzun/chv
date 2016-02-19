import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;

public class TestPathFinder {

	//working
	//@Test
	public void testNeighbors() {
		//example puzzle
		String[][] puzzle = new String[3][3];
		//row 1
		puzzle[0][0] = "N";
		puzzle[0][1] = "H";
		puzzle[0][2] = "C";
		//row 2
		puzzle[1][0] = "A";
		puzzle[1][1] = "E";
		puzzle[1][2] = "E";
		//row 3
		puzzle[2][0] = "F";
		puzzle[2][1] = "S";
		puzzle[2][2] = "E";
		//example start place
		int row = 2;
		int col = 0;
		//neighbors
		Tuple neighbor0 = new Tuple(row-1, col+1);
		Tuple neighbor1 = new Tuple(row-1, col-1);
		Tuple neighbor2 = new Tuple(row-1, col);
		Tuple neighbor3 = new Tuple(row, col-1);
		Tuple neighbor4 = new Tuple(row, col+1);
		Tuple neighbor5 = new Tuple(row+1, col);
		Tuple neighbor6 = new Tuple(row+1, col+1);
		Tuple neighbor7 = new Tuple(row+1, col-1);

		ArrayList<Tuple> neighbors = new ArrayList<Tuple>();
		neighbors.add(neighbor0);
		neighbors.add(neighbor1);
		neighbors.add(neighbor2);
		neighbors.add(neighbor3);
		neighbors.add(neighbor4);
		neighbors.add(neighbor5);
		neighbors.add(neighbor6);
		neighbors.add(neighbor7);

		for(Tuple t: neighbors){
			t.printTuple();
		}
	}

	//working
	//@Test
	public void testNeighborValuesAndTestBounds() {
		//example puzzle
		String[][] puzzle = new String[3][3];
		//row 1
		puzzle[0][0] = "N";
		puzzle[0][1] = "H";
		puzzle[0][2] = "C";
		//row 2
		puzzle[1][0] = "A";
		puzzle[1][1] = "E";
		puzzle[1][2] = "E";
		//row 3
		puzzle[2][0] = "F";
		puzzle[2][1] = "S";
		puzzle[2][2] = "E";
		//example start place
		int col = 2;
		int row = 0;
		//neighbors
		Tuple neighbor0 = new Tuple(row-1, col+1);
		Tuple neighbor1 = new Tuple(row-1, col-1);
		Tuple neighbor2 = new Tuple(row-1, col);
		Tuple neighbor3 = new Tuple(row, col-1);
		Tuple neighbor4 = new Tuple(row, col+1);
		Tuple neighbor5 = new Tuple(row+1, col);
		Tuple neighbor6 = new Tuple(row+1, col+1);
		Tuple neighbor7 = new Tuple(row+1, col-1);

		ArrayList<Tuple> neighbors = new ArrayList<Tuple>();
		neighbors.add(neighbor0);
		neighbors.add(neighbor1);
		neighbors.add(neighbor2);
		neighbors.add(neighbor3);
		neighbors.add(neighbor4);
		neighbors.add(neighbor5);
		neighbors.add(neighbor6);
		neighbors.add(neighbor7);

		for(Tuple t: neighbors){
			int r = t.getR();
			int c = t.getC();
			if(r >= 3 || c >= 3 || r < 0 || c < 0 ){
				System.out.println("out of bounds");
			}
			else{
				System.out.println(puzzle[t.getR()][t.getC()]);

			}	
		}
	}
	
	//works
	//@Test
	public void testUsedSet() {
		HashSet<String> keys = new HashSet<String>();
		int r = 2;
		int c = 1;
		String rkey = Integer.toString(r);
		String ckey = Integer.toString(c);
		String key = rkey+ckey;
		keys.add(key);
		if( keys.contains(key)){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
		
	}
	
	//works
	@Test
	public void testPathFinders() {
		//example puzzle
		String[][] puzzle = new String[3][3];
		//row 1
		puzzle[0][0] = "N";
		puzzle[0][1] = "H";
		puzzle[0][2] = "C";
		//row 2
		puzzle[1][0] = "A";
		puzzle[1][1] = "E";
		puzzle[1][2] = "E";
		//row 3
		puzzle[2][0] = "F";
		puzzle[2][1] = "S";
		puzzle[2][2] = "E";
		//keep track of start place
		int row = 0;
		int col = 2;
		PathFinder pathy = new PathFinder(puzzle);
		ArrayList<String> mikesWords = pathy.findWordsStarter(6);
		for(String word: mikesWords){ 	
			System.out.println(word);
		}
	}

}
