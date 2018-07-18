import java.util.ArrayList;

public class world {
	//variables
	private static final int worldHeighty = 10;
	private static final int worldWidthx = 40;
	private ArrayList<bug> bugList=new ArrayList<bug>();
	private ArrayList<plant> plantList=new ArrayList<plant>();
	private ArrayList<generalObject> allObjects = new ArrayList<generalObject>();
	private static int numberOfBugs = 10;
	private static int numberOfPlants = 5;
	
	//constructor
	public world() {
		
		
	} //end constructor
	
	public void populate() {
		
		//fill arraylist with plants --this collide code doesn't work for some reason????
			//	for(int k=0;k<this.numberOfPlants;k++) {
			//		int xPosPlant = 2+(int)(Math.random()*(this.worldWidthx-2));
			//		int yPosPlant = 2+(int)(Math.random()*(this.worldWidthx-2));
			//		boolean plantCollide = true;
			//		
			//		while(plantCollide) {
			//			for(int m=0;m<this.plantList.size();m++) {
			//				plantCollide=this.plantList.get(m).checkCollide(this.plantList.get(m).getXpos(),this.plantList.get(m).getYpos(),xPosPlant,yPosPlant);
			//				if(plantCollide) {
			//					xPosPlant = 2+(int)(Math.random()*(this.worldWidthx-2));
			//					yPosPlant = 2+(int)(Math.random()*(this.worldWidthx-2));
			//					break; //end for loop
			//				} //end if loop
			//			} //end plant for mloop
			//			
			//		} //end plantCollide while loop
			//		plant plantTemp=new plant(xPosPlant,yPosPlant);
			//		plantList.add(plantTemp);
			//	} //end for number of plants loop
		
		//===========================================
		//fill arraylist with plants
				for(int i=0;i<this.numberOfPlants;i++) { //populate arraylist with bugs, inside world size
					int xPos = 2+(int)(Math.random()*(this.worldWidthx-2));
					int yPos = 2+(int)(Math.random()*(this.worldHeighty-2));
					
					for(int n=0;n<this.plantList.size();n++) {
						int xVal=this.plantList.get(n).getXpos(); //replace with collide?
						int yVal=this.plantList.get(n).getYpos();
						
						if(xPos == xVal && yPos==yVal) {
							//System.out.println("avoided");
							xPos = 2+(int)(Math.random()*(this.worldWidthx-2));
							yPos = 2+(int)(Math.random()*(this.worldHeighty-2));					
						} //end if
						
					} //end for plants arraylist loop
					
					//System.out.println(xPos+" "+yPos);
					
					plant plantTemp=new plant(xPos,yPos);
					char sym=(char)plantTemp.getAge();
					System.out.println("Plant at "+xPos+" "+yPos+" of age "+plantTemp.getAge());
					this.plantList.add(plantTemp);
					
					generalObject objTemp=new generalObject(xPos,yPos,sym);
					this.allObjects.add(objTemp);
				}//end for number of bugs loop
				System.out.println("Size of ArrayList plants: "+plantList.size());
		
				
		//===========================================
		
		
		
		//fill arraylist with bugs
		for(int i=0;i<this.numberOfBugs;i++) { //populate arraylist with bugs, inside world size
			int xPos = 2+(int)(Math.random()*(this.worldWidthx-2));
			int yPos = 2+(int)(Math.random()*(this.worldHeighty-2));
			
		//	for(int n=0;n<this.plantList.size();n++) {
		//		int xVal=this.plantList.get(n).getXpos(); //replace with collide?
		//		int yVal=this.plantList.get(n).getYpos();
		//		
		//		if(xPos == xVal && yPos==yVal) {
		//			//System.out.println("avoided");
		//			xPos = 2+(int)(Math.random()*(this.worldWidthx-2));
		//			yPos = 2+(int)(Math.random()*(this.worldHeighty-2));					
		//		} //end if
		//		
		//	} //end for plants arraylist loop
			
			
			for(int j=0;j<this.bugList.size();j++) {
				
				int xVal=this.bugList.get(j).getXpos(); //replace with collide?
				int yVal=this.bugList.get(j).getYpos();
				
				if(xPos == xVal && yPos==yVal) {
					//System.out.println("avoided");
					xPos = 2+(int)(Math.random()*(this.worldWidthx-2));
					yPos = 2+(int)(Math.random()*(this.worldHeighty-2));
					
				} //end if
			} //end for bugs arraylist loop
			
			
			
			//System.out.println(xPos+" "+yPos);
			
			bug bugTemp=new bug(xPos,yPos);
			char sym=(char)bugTemp.getSymbol();
			System.out.println("Bug at "+xPos+" "+yPos);
			this.bugList.add(bugTemp);
			generalObject objTemp=new generalObject(xPos,yPos,sym);
			this.allObjects.add(objTemp);
			
		}//end for number of bugs loop
		
		
		
		
		
	} //end populate
	
	//public int getWorldHeight() {
	//	return this.worldHeighty;
	//}
	
	//public int getWorldWidth() {
	//	return this.worldWidthx;
	//}
	
	//----------------------------------------------------------	
	public void drawWorld() {
		//drawing board

		//this.bugList=bugs;
		
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
								
					for (int j=0;j<this.allObjects.size();j++) {
						xVal=this.allObjects.get(j).getXpos();
						yVal=this.allObjects.get(j).getYpos();
						if(y==yVal && x==xVal) {
							System.out.print(this.allObjects.get(j).getSymbol());
							
							written=true;
							//break;
						} //end bug check if stmt
											
					} //end plantList for loop
					
				//	for (int i=0;i<this.bugList.size();i++) {	
				//		xVal=this.bugList.get(i).getXpos();
				//		yVal=this.bugList.get(i).getYpos();
						
				//		if(y==yVal && x==xVal) {
				//			System.out.print(this.bugList.get(i).getSymbol());
				//			written=true;
				//			break;
				//		} //end bug check if stmt
						
				//	} //end bug for loop
									
					
				} //end last else loop
				
				if(!written) {	
					System.out.print(".");
					}
				
			} //end x loop
		} //end y loop
	} //end drawWorld
	
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
				//System.out.println("wall collide");
			}
			//check if any collisions
				for (int j=0;j<bugStart.size();j++) {
					collide=bugTemp.checkCollide(bugTemp.getXpos(), bugTemp.getYpos(), bugStart.get(j).getXpos(), bugStart.get(j).getYpos());
					if(collide) { //if collision detected, stop looking, reset, and apply a new movement
						bugTemp.setXpos(xValStart);
						bugTemp.setYpos(yValStart);
						//System.out.println("object collide");
						break;				
					}
				} //end collide check for loop
				
			} //end while loop
			
			//at this point, there should be no collisions for the new bug position
			
			bugStart.get(i).setXpos(bugTemp.getXpos()); //change bug to new movement
			bugStart.get(i).setYpos(bugTemp.getYpos());
				
		} //end for loop		
	} //end updateWorld
	
} //end class
