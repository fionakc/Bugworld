import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

//public class bug extends item{
	public class bug{
 //variables
	private String species;
	private  String name;
	private  char symbol;
	private  int Xpos;
	private  int Ypos;
	private  int energy;
	private  int uniqueID;
	private Scanner sc;
	
	//default constructor
	public bug() {
		this.species = "bug";
		this.name = "Allen";
		this.symbol = 'a';
		this.Xpos = 20;
		this.Ypos = 30;
		this.energy = 2;
		this.uniqueID = 1;
		
	}
	
	//constructor with specified positions
	public bug(int x, int y) {
		this.species = "bug";
		this.name = "Allan";
		Random r = new Random();
		this.symbol = (char)(r.nextInt(26) + 'a');; //generates random letter for symbol
		this.Xpos = x;
		this.Ypos = y;
		this.energy = (int)((Math.random()*2)+1);
		this.uniqueID = 1;
		
	}
	
	
	//constructor with user input
	public bug (String sp, String n, char sy, int x, int y, int e, int u) {
		this.species = sp;
		this.name = n;
		this.symbol = sy;
		this.Xpos = x;
		this.Ypos = y;
		this.energy = e;
		this.uniqueID = u;
	}
	
	//toString, print summary of info
	public String toString() {
		System.out.println("The bug of species "+this.species+" has the name "+this.name+
				" and the symbol "+this.symbol+
				" and is located at "+this.Xpos+","+this.Ypos);
		System.out.println("");
		return null;
	}
	
	
	//toText, print full attributes
	public void toText() {
		System.out.println("The bug attributes are: ");
		System.out.println("Species: "+this.species);
		System.out.println("Name: "+this.name); 
		System.out.println("Symbol: "+this.symbol);
		System.out.println("X position: "+this.Xpos);
		System.out.println("Y position: "+this.Ypos);
		System.out.println("Energy: "+this.energy);
		System.out.println("Unique ID: "+this.uniqueID);
		System.out.println("");
	}
	
	//getters and setters for attributes
	public void setSpecies (String sp) {
		this.species=sp;}	
	public String getSpecies () {
		return this.species;}
	
	public void setName (String n) {
		this.name=n;}	
	public String getName () {
		return this.name;}
	
	public void setSymbol(char c) {
		this.symbol=c;}
	public char getSymbol() {
		return this.symbol;}
	
	public void setXpos(int x) {
		this.Xpos=x;}
	public int getXpos() {
		return this.Xpos;}
	
	public void setYpos(int y) {
		this.Ypos=y;}
	public int getYpos() {
		return this.Ypos;}
	
	public void setEnergy(int e) {
		this.energy=e;}
	public int getEnergy() {
		return this.energy;}
	
	public void setUniqueID(int u) {
		this.uniqueID=u;}
	public int getUniqueID() {
		return this.uniqueID;}

	
	//move bug in one of four directions
	public void move(int xMove, int yMove) {
		this.Xpos+=xMove;
		this.Ypos+=yMove;
	}
	 //move bug in random direction
	public void bugMove() {
		int direction = (int)(Math.random()*4);		
		switch (direction) {			
			case 0: move(1,0);
					break;
			case 1:	move(0,1);
					break;
			case 2: move(-1,0);
					break;
			case 3: move(0,-1);
					break;		
		} //end switch
		
	} //end bugMove
	
	public boolean checkCollide(int objX, int objY) {
		if(this.Xpos==objX && this.Ypos==objY) {
			return true; //if collision, return true
		}else {
			return false; //if no collision, return false
		}
		
	} //end checkCollide
	
	
	
	
} //end class

