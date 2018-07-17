import java.util.ArrayList;

public class world {
	//variables
	private static final int worldHeighty = 10;
	private static final int worldWidthx = 40;
	private ArrayList<bug> bugList;
	//private ArrayList<bug> bugStop;
	//private ArrayList<bug> bugStart;
	
	public world() {
		
	} //end constructor
	
	public int getWorldHeight() {
		return this.worldHeighty;
	}
	
	public int getWorldWidth() {
		return this.worldWidthx;
	}
	
	//----------------------------------------------------------	
	public void drawWorld(ArrayList bugs) {
		//drawing board

		this.bugList=bugs;
		
		boolean written=false;
		for (int y=1;y<=worldHeighty; y++) {
			for (int x=1; x<=worldWidthx; x++) {
				
				written=false; //checking if something is drawn
				
				if(x==1) {
					System.out.print("|"); //print first stick
					written=true;
				} 
				else if (y==1 && x>1 && x< worldWidthx) {
					System.out.print("-"); //print top row
					written=true;
				}
				else if (x==worldWidthx) {
					System.out.println("|"); //print last stick
					written=true;
				} 				
				else if (y==worldHeighty && x>1 && x<worldWidthx) {
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
	
	public ArrayList updateWorld(ArrayList bugs) {		
		//this.bugStop.clear();
		//this.bugStart.clear();
		ArrayList<bug> bugStart=bugs;
		int xValStart;
		int yValStart;
		//int xValStop;
		//int yValStop;
		//int bugStopSize=0;
		//System.out.println(bugStopSize);
		for (int i=0;i<bugStart.size();i++) { //loop through all bug arraylist
			xValStart=bugStart.get(i).getXpos(); //extract bug xVal
			yValStart=bugStart.get(i).getYpos(); //extract bug yVal
			boolean collide = true;
			bug bugTemp=new bug(xValStart,yValStart); //create new temp bug with x and y vals
			
			while(collide) {
			bugTemp.bugMove(); //apply a random movement
			//check if inside boundaries
			if(bugTemp.getXpos()==0 || bugTemp.getXpos()==worldWidthx || bugTemp.getYpos()==0 || bugTemp.getYpos()==worldHeighty) {
				bugTemp.setXpos(xValStart); //if outside, reset position
				bugTemp.setYpos(yValStart); //which will then collide with loop and reset
				System.out.println("wall collide");
			}
			//check if any collisions
				for (int j=0;j<bugStart.size();j++) {
					collide=bugTemp.checkCollide(bugTemp.getXpos(), bugTemp.getYpos(), bugStart.get(j).getXpos(), bugStart.get(j).getYpos());
					if(collide) { //if collision detected, stop looking, reset, and apply a new movement
						bugTemp.setXpos(xValStart);
						bugTemp.setYpos(yValStart);
						System.out.println("object collide");
						break;				
					}
				} //end collide check loop
				
			} //end while loop
			
			//at this point, there should be no collisions for the new bug position
			
			bugStart.get(i).setXpos(bugTemp.getXpos()); //change bug to new movement
			bugStart.get(i).setYpos(bugTemp.getYpos());
			
			//this.bugStop.add(bugStart.get(i));
			//bugStopSize = this.bugStop.size();
			//bugStop.get(bugStopSize).bugMove();
			//xValStop=bugStop.get(bugStopSize).getXpos();
			//yValStop=bugStop.get(bugStopSize).getYpos();
			//if(xVal)
			
			//System.out.println(bugStopSize);
		} //end for loop
		
		
		return bugList;
	} //end updateWorld
	
} //end class
