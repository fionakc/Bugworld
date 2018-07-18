
public class generalObject {

	private static int xPos;
	private static int yPos;
	private static char symbol;
	public generalObject(int x, int y, char sym) {
		this.xPos=x;
		this.yPos=y;
		this.symbol=sym;
	}
	
	public int getXpos() {
		return xPos;
	}
	
	public int getYpos() {
		return yPos;
	}
	
	public char getSymbol() {
		return symbol;
	}
	
	
} //end class
