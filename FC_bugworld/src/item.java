
public class item {

	//shared variables
	public int xPos;
	public int yPos;
	public char symbol;
	
	
	public item() {
		
	
	} //end constructor
	
	public void setXpos(int x) {
		this.xPos=x;
	}
	
	public int getXpos() {
		return this.xPos;
	}
	
	public void setYpos(int y) {
		this.yPos=y;
	}
	
	public int getYpos() {
		return this.yPos;
	}
	
	public boolean checkCollide(int objX, int objY) {
		if(this.xPos==objX && this.yPos==objY) {
			return true; //if collision, return true
		}else {
			return false; //if no collision, return false
		}
		
	} //end checkCollide
	
} //end class
