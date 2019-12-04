package wingspan;


public class Space {
	
	public int object;//different for diff habitats: die, egg, card
	private String habitat;
	private boolean action;
	public Card placed; //card that is placed on the space
	public boolean ifCube; //if there is a cube on space
	
	public boolean ifplaced; //if card on space->true
	
	Space()
	{
		object=0;
		habitat=" ";
		action= false;
		ifplaced=false;
		ifCube = false;
	}
	Space(int o, String h, boolean act,boolean flag, boolean flag2)
	{
		object=o;
		habitat=h;
		action= act;
		ifplaced= flag;
		ifCube = flag2;	
	}
	

}

