

public class bug {
 //variables
	private String species;
	private  String name;
	private  char symbol;
	private  int xpos;
	private  int ypos;
	private  int energy;
	private  int uniqueID;
	
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
		this.species=sp;
	}	
	public String getSpecies () {
		return this.species;
	}
	
	public void setName (String n) {
		this.name=n;
	}	
	public String getName () {
		return this.name;
	}
	
	public void setSymbol(char c) {
		this.symbol=c;
	}
	public char getSymbol() {
		return this.symbol;
	}
	
	public void setXpos(int x) {
		this.xpos=x;
	}
	public int getXpos() {
		return this.xpos;
	}
	
	public void setYpos(int y) {
		this.ypos=y;
	}
	public int getYpos() {
		return this.ypos;
	}
	
	public void setEnergy(int e) {
		this.energy=e;
	}
	public int getEnergy() {
		return this.energy;
	}
	
	public void setUniqueID(int u) {
		this.uniqueID=u;
	}
	public int getUniqueID() {
		return this.uniqueID;
	}
	
}
