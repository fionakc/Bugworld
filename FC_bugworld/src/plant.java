
public class plant {
	
	//variables
	private static int xPos;
	private static int yPos;
	private static int age;
	//private static int symbol;
	
	public plant(int x, int y) { //constructor
		this.xPos=x;
		this.yPos=y;
		this.age=(int)(Math.random()*(10));
		//this.symbol=
	} //end constructor
	
	public void ageUp() {
		this.age++;
	}
	
	public int getXpos() {
		return xPos;
	}
	
	public int getYpos() {
		return yPos;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean checkCollide(int plantX, int plantY, int objX, int objY) {
		if(plantX==objX && plantY==objY) {
			return true; //if collision, return true
		}else {
			return false; //if no collision, return false
		}
		
	} //end checkCollide
	
} //end class
