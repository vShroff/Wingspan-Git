import java.util.Random;

public class Dice {
	
	
	 public String[] foodarr = {"fish", "cherry", "leafLikeSomething", "worm", "food", "moreFood"};
	 private String foodstr;
	 private int pos;
	 
	 String setget()
	 {
		 Random rand = new Random(); 	
		    pos = rand.nextInt(6); //0-5 num is generated
		    foodstr= foodarr[pos];
		   
		    return foodstr;
	 }
	
}
	 
