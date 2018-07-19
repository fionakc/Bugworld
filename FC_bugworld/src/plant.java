
//public class plant extends item {
	public class plant{
	//variables
	private int xPos;
	private int yPos;
	private int age;
	private char symbol;
	
	public plant(int x, int y) { //constructor
		this.xPos=x;
		this.yPos=y;
		this.age=(int)(Math.random()*(10));
		//this.symbol=
	} //end constructor
	
	public void ageUp() {
		if(this.age!=9) {
			this.age++;
		}
	}
	
	public char getSymbol() {		
		this.symbol=(char)(this.age+'0');
		return this.symbol;
	}
	
	
	public int getXpos() {
		return xPos;
	}
	public void setXpos(int x) {
		this.xPos=x;
	}
	
	public int getYpos() {
		return yPos;
	}
	public void setYpos(int y) {
		this.yPos=y;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean checkCollide(int objX, int objY) {
		if(this.xPos==objX && this.yPos==objY) {
			return true; //if collision, return true
		}else {
			return false; //if no collision, return false
		}
		
	} //end checkCollide
	
} //end class
