import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;

public class main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		world startWorld=new world(); //create world object
		startWorld.populate();
		
		
		startWorld.draw();
		System.out.println("draw");
		startWorld.updateWorld();
		System.out.println("update");
		startWorld.draw();
		System.out.println("new");
		
	}

	
}
