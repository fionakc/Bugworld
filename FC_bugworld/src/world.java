import java.util.ArrayList;

public class world {
	//variables
	private  final int worldHeighty = 10;
	private  final int worldWidthx = 20;
	private ArrayList<bug> bugList=new ArrayList<bug>();
	private ArrayList<plant> plantList=new ArrayList<plant>();
	//private ArrayList<generalObject> allObjects = new ArrayList<generalObject>();
	private static int numberOfBugs = 5;
	private static int numberOfPlants = 3;
	private String [][] field = new String [this.worldHeighty][this.worldWidthx];
	
	//constructor
	public world() {
		
		//initialising the field array to empty spaces
		for(int y=0;y<this.worldHeighty;y++) {
			for(int x=0;x<this.worldWidthx;x++) {
				this.field[y][x]=".";
			} //end x loop
			
		} //end y loop
			
		
	} //end constructor
	
	public void populate() {
	
		
	//	  fill arraylist with plants
				for(int i=0;i<this.numberOfPlants;i++) { //populate arraylist with plants, inside world size
					int xPos = 1+(int)(Math.random()*(this.worldWidthx-2));
					int yPos = 1+(int)(Math.random()*(this.worldHeighty-2));
				
					for(int n=0;n<this.plantList.size();n++) {
						int xVal=this.plantList.get(n).getXpos(); //replace with collide?
						int yVal=this.plantList.get(n).getYpos();
						
						if(xPos == xVal && yPos==yVal) {
							//System.out.println("avoided");
							xPos = 1+(int)(Math.random()*(this.worldWidthx-2));
							yPos = 1+(int)(Math.random()*(this.worldHeighty-2));					
						} //end if
						
					} //end for plants arraylist loop
					
					//System.out.println(xPos+" "+yPos);
					
					plant plantTemp=new plant(xPos,yPos);
					//char sym=(char)plantTemp.getAge();
					System.out.println("Plant at "+xPos+" "+yPos+" of age "+plantTemp.getAge());
					this.plantList.add(plantTemp);
					
					//generalObject objTemp=new generalObject(xPos,yPos,sym);
					//this.allObjects.add(objTemp);
				}//end for number of bugs loop
				System.out.println("Size of ArrayList plants: "+plantList.size());
		
				
		//===========================================
		
		
		
		//fill arraylist with bugs
		for(int i=0;i<this.numberOfBugs;i++) { //populate arraylist with bugs, inside world size
		
			int xPos = 1+(int)(Math.random()*(this.worldWidthx-2)); //create new bug position values
			int yPos = 1+(int)(Math.random()*(this.worldHeighty-2));

			for(int j=0;j<this.bugList.size();j++) {
				
				int xVal=this.bugList.get(j).getXpos(); //extract bug values from arraylist
				int yVal=this.bugList.get(j).getYpos();
				
				//-----fix this
				if(xPos == xVal && yPos==yVal) { //if bug collides, assign new values
					//System.out.println("avoided");
					xPos = 1+(int)(Math.random()*(this.worldWidthx-2));
					yPos = 1+(int)(Math.random()*(this.worldHeighty-2));
					
				} //end if
			} //end for bugs arraylist loop
			
			bug bugTemp=new bug(xPos,yPos);

			this.bugList.add(bugTemp);

			
		}//end for number of bugs loop
	

		
	} //end populate
	

	//----------------------------------------------------------
	
	public void draw() {
		
		//empty out array
		for(int y=0;y<this.worldHeighty;y++) {
			for(int x=0;x<this.worldWidthx;x++) {
				this.field[y][x]=".";				
			} //end x loop			
		} //end y loop	
		
		//feed in the border
		for (int y=0;y<this.worldHeighty; y++) {
			for (int x=0; x<this.worldWidthx; x++) {
				
				if(x==0) {
					this.field[y][x]="|";
					//System.out.print("|"); //print first stick
					//written=true;
				} 
				if (y==0 && x>0 && x< this.worldWidthx-1) {
					this.field[y][x]="-";
					//System.out.print("-"); //print top row
					//written=true;
				}
				if (x==this.worldWidthx-1) {
					this.field[y][x]="|";
					//System.out.println("|"); //print last stick
					//written=true;
				} 				
				else if (y==this.worldHeighty-1 && x>0 && x<this.worldWidthx-1) {
					this.field[y][x]="-";
					//System.out.print("-"); //print bottom row
					//written=true;
				}
				
				
				//written=false; //checking if something is drawn
				
			//	if(x==0 || x==(this.worldWidthx-1)) {
			//		field[y][x]="|";
					//System.out.print("|"); //print first stick
					//written=true;
			//	} 
			//	if ((y==0 && x>0 && x<(this.worldWidthx-1)) || (y==(this.worldHeighty-1) && x>0 && x<(this.worldWidthx-1))) {
			//		field[y][x]="-";
					//System.out.print("-"); //print top row
					//written=true;
			//	}
			} //end x loop
		} //end y loop
					
		//feed in the bugs in array - assume no collisions
		for (int i=0;i<this.bugList.size();i++) {	
			
			int xValue=this.bugList.get(i).getXpos(); //extract values
			//System.out.println(xValue);
			int yValue=this.bugList.get(i).getYpos();
			//System.out.println(yValue);
			String symbol = String.valueOf(this.bugList.get(i).getSymbol());
			//System.out.println(symbol);
			this.field[yValue][xValue]=symbol;
			//System.out.println(field[yValue][xValue]);			
		} //end draw bug for loop
									
		//feed in the plants - assume no collisions
		for (int i=0;i<this.plantList.size();i++) {	
					
			int xVal=this.plantList.get(i).getXpos(); //extract values
			//System.out.println(xVal);
			int yVal=this.plantList.get(i).getYpos();
			//System.out.println(yVal);
			String symbol = String.valueOf(this.plantList.get(i).getSymbol());
			//System.out.println(symbol);
			this.field[yVal][xVal]=symbol;
			//System.out.println(field[yVal][xVal]);					
		} //end draw plant for loop			
			
		//draw out array
		for(int y=0;y<this.worldHeighty;y++) {
			for(int x=0;x<this.worldWidthx;x++) {
				System.out.print(this.field[y][x]);
				
			} //end x loop
			System.out.println();
		} //end y loop		
			
		
	} //end draw
	
	//----------------------------------------------------------	
	public void drawWorld() {
		//drawing board


		boolean written=false;
		for (int y=1;y<=this.worldHeighty; y++) {
			for (int x=1; x<=this.worldWidthx; x++) {
				
				written=false; //checking if something is drawn
				
				if(x==1) {
					System.out.print("|"); //print first stick
					written=true;
				} 
				else if (y==1 && x>1 && x< this.worldWidthx) {
					System.out.print("-"); //print top row
					written=true;
				}
				else if (x==this.worldWidthx) {
					System.out.println("|"); //print last stick
					written=true;
				} 				
				else if (y==this.worldHeighty && x>1 && x<this.worldWidthx) {
					System.out.print("-"); //print bottom row
					written=true;
				}
			 				
				else {
					int xVal;
					int yVal; 
								
					
					
					for (int i=0;i<this.bugList.size();i++) {	
						xVal=this.bugList.get(i).getXpos();
						yVal=this.bugList.get(i).getYpos();
						
						if(y==yVal && x==xVal) {
							System.out.print(this.bugList.get(i).getSymbol());
							written=true;
							break;
						} //end bug check if stmt
						
					} //end bug for loop
									
					
				} //end last else loop
				
				if(!written) {	
					System.out.print(".");
					}
				
			} //end x loop
		} //end y loop
	} //end drawWorld
	
	//----------------------------------------------------------
	public void update() {
		//System.out.println("err1");
		//age plants
		for(int i=0;i<this.plantList.size();i++) {
			this.plantList.get(i).ageUp();
			//System.out.println("err2");
		} //end age plants
		//System.out.println("err3");
		//move bugs
		//ArrayList<bug> bugMovement = new ArrayList<bug>();
		
		for(int j=0;j<this.bugList.size();j++) {
			int xTempStart=this.bugList.get(j).getXpos();
			int yTempStart=this.bugList.get(j).getYpos();
			int xTempStop=xTempStart;
			int yTempStop=yTempStart;
			bug bugTemp=new bug(xTempStart,yTempStart);
			//bugTemp.bugMove();
			boolean doesCollide=true;
			//System.out.println("err4 "+j);
			while(doesCollide) {	
				doesCollide=false;
				//System.out.println("err5 "+doesCollide);
				bugTemp.bugMove(); //apply movement
				doesCollide=detectCollideAll(bugTemp.getXpos(),bugTemp.getYpos()); //find if collides
				//System.out.println("err6 "+doesCollide);
				if(doesCollide) { //if does, reset bugTemp to bugList values
					//System.out.println("err7 "+doesCollide);
					bugTemp.setXpos(xTempStart);
					bugTemp.setYpos(yTempStart);
					//bugTemp.bugMove();
				} //end if doesCollide
				else {
					xTempStop=bugTemp.getXpos();
					yTempStop=bugTemp.getYpos();
				}
				//System.out.println("err8 "+doesCollide);
				//break;
				//if !doesCollide, will exit the while loop
			} //end while doesCollide
			//System.out.println("err9 "+doesCollide);
			//it now shouldn't collide with anything
			//bugMovement.add(bugTemp);
			this.bugList.get(j).setXpos(xTempStop);
			this.bugList.get(j).setYpos(yTempStop);
		} //end bug move for loop
		//System.out.println("err10 ");
		//now need to assign complete bugMovement to original bugList
		//this.bugList = bugMovement;
		
	} //end update
	
	
	//----------------------------------------------------------
	
	public void updateWorld() {				
		ArrayList<bug> bugStart=this.bugList;
		int xValStart;
		int yValStart;
		
		for (int i=0;i<bugStart.size();i++) { //loop through all bug arraylist
			
			xValStart=bugStart.get(i).getXpos(); //extract bug xVal
			yValStart=bugStart.get(i).getYpos(); //extract bug yVal
			boolean collide = true;
			bug bugTemp=new bug(xValStart,yValStart); //create new temp bug with x and y vals
			
			
			while(collide) {
			bugTemp.bugMove(); //apply a random movement
			//check if inside boundaries
			
			if(bugTemp.getXpos()==0 || bugTemp.getXpos()==this.worldWidthx || bugTemp.getYpos()==0 || bugTemp.getYpos()==this.worldHeighty) {
				bugTemp.setXpos(xValStart); //if outside, reset position
				bugTemp.setYpos(yValStart); //which will then collide with loop and reset
				System.out.println("wall collide");
				break;
			}
			//check if any collisions
				for (int j=0;j<bugStart.size();j++) {
					collide=bugTemp.checkCollide(bugStart.get(j).getXpos(), bugStart.get(j).getYpos());
					
					if(collide) { //if collision detected, stop looking, reset, and apply a new movement
						bugTemp.setXpos(xValStart);
						bugTemp.setYpos(yValStart);
						System.out.println("object collide");
						break;				
					}
					
				} //end collide check for loop
				
			} //end while loop
			
			//at this point, there should be no collisions for the new bug position
			
			bugStart.get(i).setXpos(bugTemp.getXpos()); //change bug to new movement
			bugStart.get(i).setYpos(bugTemp.getYpos());
				
		} //end for loop	
		
		this.bugList=bugStart; //assign values back to original arraylist
		
	} //end updateWorld
	
	//----------------------------------------------------------
	
	private boolean detectCollideAll(int x, int y) {
		int xVal = x;
		int yVal = y;
		
		//boolean collides=true;
		//while(collides) {
		boolean	collides=false;
			//System.out.println("Collides "+collides);
			//check if collides with walls
			if(!collides) {
				//System.out.println("Check walls "+collides);
				//collides with sides
				if(xVal==0 || xVal==this.worldWidthx-1) {
					collides=true;
					//break;
				}
				//collides with top and bottom
				if(yVal==0 || yVal==this.worldHeighty-1) {
					collides=true;
					//break;
				}	
				//System.out.println("Done walls "+collides);
			} //end if !collides walls
		
		
			//check if collides with plants
			if(!collides) {
				//System.out.println("Check plants "+collides);
				for (int i=0;i<this.plantList.size();i++) {
					//collides=itemTemp.checkCollide(this.plantList.get(i).getXpos(), this.plantList.get(i).getYpos());
					if(xVal==this.plantList.get(i).getXpos() && yVal==this.plantList.get(i).getYpos()) {
						collides=true;
						break;
					} //end if check
				} //end for plantList
				//System.out.println("Done plants "+collides);
			} //end if !collides plants
			
			//check if collides with bugs
			if(!collides) {
				//System.out.println("Check bugs "+collides);
				for (int i=0;i<this.bugList.size();i++) {
					//System.out.println("Check bugs1 "+collides);
					//System.out.println("xVal "+xVal);
					//System.out.println("yVal "+yVal);
					//System.out.println("i "+i);
					//System.out.println("xPos "+this.bugList.get(i).getXpos());
					//System.out.println("yPos "+this.bugList.get(i).getYpos());
					//collides=itemTemp.checkCollide(this.bugList.get(i).getXpos(), this.bugList.get(i).getYpos());
					if(xVal==this.bugList.get(i).getXpos() && yVal==this.bugList.get(i).getYpos()) {
						//System.out.println("Check bugs2 "+collides);
						collides=true;
						//System.out.println("Check bugs3 "+collides);
						break;
					} //end if check
					//System.out.println("Check bugs4 "+collides);
				} //end for bugList
				//System.out.println("Done bugs "+collides);
			} //end if !collides bugs
			//System.out.println("Checked all "+collides);
		//} //end while collides loop
	return collides;
		
	} //end detectCollideAll
	
} //end class
