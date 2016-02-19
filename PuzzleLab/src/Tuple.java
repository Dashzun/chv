
public class Tuple {
	private int r;
	private int c;
	
	/**
	 * Simple "tuple" like data structure
	 * @param r, int
	 * @param c, int
	 */
	public Tuple(int x, int y){
		this.r = x;
		this.c = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public void printTuple(){
		System.out.println("Representing location ("+r+","+c+")");
	}
}
