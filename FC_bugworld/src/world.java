import java.util.ArrayList;

public class world {

	private static final int worldHeighty = 10;
	private static final int worldWidthx = 40;
	private ArrayList<bug> bugList;
	
	public world() {
		
		
	} //end constructor
	
	public int getWorldHeight() {
		return this.worldHeighty;
	}
	
	public int getWorldWidth() {
		return this.worldWidthx;
	}
	
	public void drawWorld(ArrayList bugs) {
		//drawing board
		//System.out.println("|--------------------|");
		//System.out.println("|                    |");
		//System.out.println("|                    |");
		//System.out.println("|                    |");
		//System.out.println("|                    |");
		//System.out.println("|                    |");
		//System.out.println("|                    |");
		//System.out.println("|                    |");
		//System.out.println("|                    |");
		//System.out.println("|--------------------|");
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
					//written=false;
					}
				//written=false;
				
			} //end x loop
		} //end y loop
	} //end drawWorld
} //end class
