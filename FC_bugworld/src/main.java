
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bug bug1=new bug();
		bug1.toText();
		
		bug bug2=new bug();
		bug2.toString();
		
		bug bug3=new bug("spider","Bob",'b',40, 50, 3, 3);
		bug3.toText();
				
		bug bug4=new bug("moth","Carl",'c',25,36,4,4);
		bug4.toString();
		
		bug2.setName("Dave");
		bug2.toString();
	}

}