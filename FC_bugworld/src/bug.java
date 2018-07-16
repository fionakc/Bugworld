import java.util.Scanner;
import java.lang.Math;

public class bug {
 //variables
	private String species;
	private  String name;
	private  char symbol;
	private  int xpos;
	private  int ypos;
	private  int energy;
	private  int uniqueID;
	private Scanner sc;
	
	//default constructor
	public bug() {
		this.species = "caterpillar";
		this.name = "Allen";
		this.symbol = 'a';
		this.xpos = 20;
		this.ypos = 30;
		this.energy = 2;
		this.uniqueID = 1;
		
	}
	
	//constructor with user input
	public bug (String sp, String n, char sy, int x, int y, int e, int u) {
		this.species = sp;
		this.name = n;
		this.symbol = sy;
		this.xpos = x;
		this.ypos = y;
		this.energy = e;
		this.uniqueID = u;
	}
	
	//toString, print summary of info
	public String toString() {
		System.out.println("The bug of species "+this.species+" has the name "+this.name+
				" and is located at "+this.xpos+","+this.ypos);
		System.out.println("");
		return null;
	}
	
	
	//toText, print full attributes
	public void toText() {
		System.out.println("The bug attributes are: ");
		System.out.println("Species: "+this.species);
		System.out.println("Name: "+this.name); 
		System.out.println("Symbol: "+this.symbol);
		System.out.println("X position: "+this.xpos);
		System.out.println("Y position: "+this.ypos);
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
		this.xpos=x;}
	public int getXpos() {
		return this.xpos;}
	
	public void setYpos(int y) {
		this.ypos=y;}
	public int getYpos() {
		return this.ypos;}
	
	public void setEnergy(int e) {
		this.energy=e;}
	public int getEnergy() {
		return this.energy;}
	
	public void setUniqueID(int u) {
		this.uniqueID=u;}
	public int getUniqueID() {
		return this.uniqueID;}

	//require user input to set attributes
	public void setAttributes() {
		System.out.print("What kind of bug is it? ");
		this.sc=new Scanner (System.in);
		this.species=sc.next();
		
		System.out.print("What is the bug's name? ");
		this.sc=new Scanner (System.in);
		this.name=sc.next();
		
		System.out.print("What is the bug's symbol? ");
		this.sc=new Scanner (System.in);
		this.symbol=sc.next().trim().charAt(0);
		
		System.out.print("What is the bug's horizontal position? ");
		this.sc=new Scanner (System.in);
		this.xpos=sc.nextInt();
		
		System.out.print("What is the bug's vertical position? ");
		this.sc=new Scanner (System.in);
		this.ypos=sc.nextInt();
		
		System.out.print("What is the bug's energy? ");
		this.sc=new Scanner (System.in);
		this.energy=sc.nextInt();
		
		System.out.print("What is the bug's unique ID? ");
		this.sc=new Scanner (System.in);
		this.uniqueID=sc.nextInt();
		
		System.out.println();
		
	} //end setAttributes
	
	//move bug in one of four directions
	public void move(int xMove, int yMove) {
		this.xpos+=xMove;
		this.ypos+=yMove;
	}
	

	public void bugMoveTest() {
		for(int i=0;i<100;i++) {
			int direction = (int)(Math.random()*4);
			switch (direction) {			
				case 1: move(1,0);
						break;
				case 2:	move(0,1);
						break;
				case 3: move(-1,0);
						break;
				case 4: move(0,-1);
						break;
			
			} //end switch
			System.out.print ("x: "+xpos+",y: "+ypos+"|");
		} //end loop
		System.out.println();
	} //end bugMoveTest
	
	
} //end class

