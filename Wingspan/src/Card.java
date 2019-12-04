package wingspan;


public class Card {
	
	private String birdInfo; //Contains info on bird attributes
	private int eggCapacity; //Contains the egg capacity 
	public boolean whenPlayedPower; //True if the card has a when played power
	private int wPPower;
	private boolean whenActivatedPower; //True if the card has a when activated player.
	private String foodCost; 
	private String type;
	
	// Constructor that sets all the card attributes
	public Card()
	{
		birdInfo = "";
		eggCapacity = 0;
		whenPlayedPower = false ;
		whenActivatedPower= false;
		foodCost = "";
		type = "";
	}
	public String getType()
	{
		return type;
	}
	public Card(String info, int egg, boolean act, boolean play,String f, String t) //initialize cards using this constructor
	{
		birdInfo = info;
		eggCapacity = egg;
		whenPlayedPower = play;
		whenActivatedPower= act;
		foodCost = f;
		type = t;

	}
	
	
	void setegg(int string)
	{
		eggCapacity = string;
	}
	
	void setinfo(String info)
	{
		birdInfo = info;
	}
	String getFoodCost()
	{
		return foodCost;
	}
	
	int getegg()
	{
		return eggCapacity;
	}
	 
	String getcapacity()
	{
		String x = "" + eggCapacity;
		return x;
	}
	
	String getplayed()
	{
		return "" + whenPlayedPower;
	}
	
	String getActivated()
	{
		return "" + whenActivatedPower;
	}
	//print the card info as a string
	void print()
	{
		System.out.println(birdInfo+ " "+ eggCapacity+ " " +whenPlayedPower+ " " + whenActivatedPower);
	}
	
	@Override
	public String toString() {
		return (birdInfo+ " "+ eggCapacity+ " " +whenPlayedPower+ " " + whenActivatedPower);		
	}

}
