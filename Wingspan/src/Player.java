

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Player {
	
		private int number;
	    private Card[] arr;
	    private int size=3; //max size of array
	 
		
	     public Player(int num)
	     {
	    	 number=num;
	     }
	     
	     public Player() {
			// TODO Auto-generated constructor stub
		}

		int Getnum()
	      {
	    	    	
		 	return number;
	    	  
	      }
		void setCard(Card[] ar)
		{
			arr = ar;
		}
		void setsize(int s)
		{
			size=s;
		}
		void displayCardArray()
		{
			for(int i=0; i< size; i++)
			{
				arr[i].print();
			}
		}
	     
//		String getFoodfromDice()
//		{
//			
//			String food = die.getfoodstr();
//			
//			return food;
//			
//		}
		
		void diefunc()
		{
			Dice d= new Dice();
			System.out.println("Player " +number + " "+ d.setget());
		}
	     
}