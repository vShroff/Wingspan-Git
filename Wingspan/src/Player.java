package wingspan;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {
	
		private int number; //to represent the player number
	    ArrayList<Card> arr = new ArrayList<Card>(); // holds player's card
	    ArrayList<String> foodHeld = new ArrayList<String>(); //food tokens that the player is holding
	    ArrayList<String> rolledFood = new ArrayList<String>(); //food that was rolled in a turn
		public String[] foodarr = {"fish", "fruit", "invertebrate", "rodent", "seed"}; //array holding the food a player has
		private String foodstr; // a string representing a type of food.
		private int pos; // position in the food array
		public int actionCubes = 8;
		public int eggsHeld = 10;
	    //constructor that sets the player number.
		int getNum()
		{
			return number;
		}
		public Player(int num)
	    {
	    	 	number=num;
	    	 	foodHeld.add("invertibrate"); //initializing each player's food held 
		    	foodHeld.add("fruit");
		    	foodHeld.add("rodent");
		    	foodHeld.add("seed");
		    	foodHeld.add("invertibrate");
		    	foodHeld.add("rodent");
		    	foodHeld.add("seed");
		    	foodHeld.add("invertibrate");
		    	foodHeld.add("fruit");
		    	foodHeld.add("seed");
	    }
		public int getEggsHeld()
		{
			return eggsHeld;
		}
	    public ArrayList<Card> getCardList()
	    {
			return arr;	
	    }
	    public Player() {
		
	    	// TODO Auto-generated constructor stub
		}
	    
	    void setFood() //setfood function for player
	    {
	    	foodHeld.add("invertibrate");
	    	foodHeld.add("fruit");
	    	foodHeld.add("rodent");
	    	foodHeld.add("seed");
	    	foodHeld.add("invertibrate");
	    	foodHeld.add("rodent");
	    	foodHeld.add("seed");
	    	foodHeld.add("invertibrate");
	    	foodHeld.add("fruit");
	    	foodHeld.add("seed");
	    }
	    //getter that returns the player number
		int Getnum()
	    {
	    	    	
			return number;
	    	  
	    }
		
		//setter that sets the card array
		void setCard(ArrayList<Card> ar)
		{
			arr = ar;
		}
		
		//function that displays the card array
		void displayCardArray()
		{
				System.out.println(arr.toString());	    
		}

		String setget() //rolls one die and return it's value
		{
			 Random rand = new Random(); 	
			    pos = rand.nextInt(5); //0-5 num is generated
			    foodstr= foodarr[pos];
			   
			    return foodstr;
		}
		
		void roll() //rolls five dice and adds it to this turn's list
		{
			rolledFood.clear();
			for(int i = 0; i < 5; i++)
			{
				rolledFood.add(setget());
			}
		}
		
		void takeDice(int dices) //takes a the amount of dices from the list depending on the space you're on
		{
			int num;
			for (int i = 0; i < dices; i++)
			{
				//num  = i+1;
				//try to separate model and view
				//System.out.println("take dice #" + num);
				//System.out.println(" ");
				
				for (int j = 0; j < rolledFood.size(); j++)
				{
					int num2 = j+1;
					System.out.println(num2 + ".  " + rolledFood.get(j) );
				}
				//Scanner pickNum = new Scanner(System.in);
				//int picked = pickNum.nextInt();
				//foodHeld.add(rolledFood.get(picked));
				//rolledFood.remove(dices);
				rollSomeDie(dices);
			}
		}
		//function will roll a number die and remove those element numbers from food array and add those food tokens from the food array.
		void rollSomeDie(int die)
		{
			 Random rand = new Random(); 
			for(int i= 0; i < die; i++)
			{
				pos = rand.nextInt(5); //0-5 num is generated
			    foodHeld.add(foodarr[pos]);
			    rolledFood.remove(foodarr[pos]);
			}
			//return foodHeld;
		}
		
		void diefunc() //displays food that was rolled
		{
			System.out.println("Player " +number + " "+ rolledFood);
		}
		
		void diefunc2() //displays food that is held
		{
			System.out.println("Player " +number + " "+ foodHeld);
		}
	    //returns the correct element in the array list based on the integer (element number) passed in.
		Card getPlayerCard(int num)
		{
			
			return arr.get(num);
			
		}
		void print()
		{
			System.out.println("So, NOW Player "+number + "'s :-");
			System.out.println("Food Held "+ foodHeld.toString());
			System.out.println("actionCubes left "+ actionCubes);
			System.out.println("Cards "+ arr.toString());
			System.out.println("Eggs Held "+ eggsHeld);
			System.out.println(" ");
			
		}

}