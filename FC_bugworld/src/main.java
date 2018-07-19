import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;

public class main {

	//private static int numberOfBugs = 10;
	//private static int worldX;
	//private static int worldY;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//bug bug1=new bug();
		//bug1.toText();		
			
		
		world startWorld=new world(); //create world object
		startWorld.populate();
		//worldY=startWorld.getWorldHeight(); //extract world height
		//worldX=startWorld.getWorldWidth(); //extract world width
		//ArrayList<bug> bugs=new ArrayList<bug>() { //create arraylist to hold bug objects
		//};
		
		
		//for(int i=0;i<numberOfBugs;i++) { //populate arraylist with bugs, inside world size
		//	int xPos = 2+(int)(Math.random()*(worldX-2));
		//	int yPos = 2+(int)(Math.random()*(worldY-2));
			
		//	for(int j=0;j<bugs.size();j++) {	
		//		int xVal=bugs.get(j).getXpos();
		//		int yVal=bugs.get(j).getYpos();
		//		if(xPos == xVal && yPos==yVal) {
					//System.out.println("avoided");
		//			xPos = 2+(int)(Math.random()*(worldX-2));
		//			yPos = 2+(int)(Math.random()*(worldY-2));
		//		} //end if
		//	} //end for bugs loop
		//	bug bugTemp=new bug(xPos,yPos);
			//System.out.println(xPos+" "+yPos);
		// 
		//	bugs.add(bugTemp);
	//	}//end for number of bugs loop

		//System.out.println("Size of ArrayList bugs: "+bugs.size());
		
		
		startWorld.draw();
		System.out.println("draw");
		startWorld.updateWorld();
		System.out.println("update");
		startWorld.draw();
		System.out.println("new");
		
	}

	
}
