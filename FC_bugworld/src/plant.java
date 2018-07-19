
public class plant extends item {
	
	//variables
	private static int xPos;
	private static int yPos;
	private static int age;
	private static char symbol;
	
	public plant(int x, int y) { //constructor
		this.xPos=x;
		this.yPos=y;
		this.age=(int)(Math.random()*(10));
		//this.symbol=
	} //end constructor
	
	public void ageUp() {
		this.age++;
	}
	
	public char getSymbol() {
		this.symbol=(char)age;
		return this.symbol;
	}
	
	
//	public int getXpos() {
//		return xPos;
//	}
//	public void setXpos(int x) {
//		this.xPos=x;
//	}
	
//	public int getYpos() {
//		return yPos;
//	}
//	public void setYpos(int y) {
//		this.yPos=y;
//	}
	
	public int getAge() {
		return age;
	}
	
//	public boolean checkCollide(int objX, int objY) {
//		if(this.xPos==objX && this.yPos==objY) {
//			return true; //if collision, return true
//		}else {
//			return false; //if no collision, return false
//		}
		
//	} //end checkCollide
	
} //end class
