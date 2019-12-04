package wingspan;

import java.util.ArrayList;

public class GameBoard {
	
	private int boardNum;
	private int rows=3;
	private int cols=5;
	private int eggCost= 0;
	
	private Space board[][] = new Space [rows][cols];
	
	
	GameBoard() {
		//initializing each space on the board to space object, doing this for the entire board here
	Space object1 = new Space(1, "Forest", false,false,false); 
	board[0][0]= object1;
		
	Space object2 = new Space(1, "Forest", true,false,false);  
	board[0][1]= object2;
	
	Space object3 = new Space(2, "Forest", false,false,false); 
	board[0][2]= object3;
	
	Space object4 = new Space(2, "Forest", true,false,false); 
	board[0][3]= object4;
	
	Space object5 = new Space(3, "Forest", false,false,false); 
	board[0][4]= object5;
	//-----------------
	Space object6 = new Space(1, "Grasslands", false,false,false); 
	board[1][0]= object6;
		
	Space object7 = new Space(2, "Grasslands", true,false,false);  
	board[1][1]= object7;
	
	Space object8 = new Space(3, "Grasslands", false,false,false); 
	board[1][2]= object8;
	
	Space object9 = new Space(3, "Grasslands", true,false,false); 
	board[1][3]= object9;
	
	Space object10 = new Space(4, "Grasslands", false,false,false); 
	board[1][4]= object10;
	//------------------

	Space object11 = new Space(1, "Wetlands", false,false,false); 
	board[2][0]= object11;
		
	Space object12 = new Space(1, "Wetlands", true,false,false);  
	board[2][1]= object12;
	
	Space object13 = new Space(2, "Wetlands", false,false,false); 
	board[2][2]= object13;
	
	Space object14 = new Space(2, "Wetlands", true,false,false); 
	board[2][3]= object14;
	
	Space object15 = new Space(3, "Wetlands", false,false,false); 
	board[2][4]= object15;
	
	}
	public void setboardNum(int n)
	{
		boardNum=n;
	}
	public int getboardNum()
	{
		return boardNum;
	}
	public int traversalVoid(String userAction,Player p) // this is used if a person choses to play the gain food action
	{
		ArrayList<Card> playerCards = new ArrayList<>();
		playerCards = p.getCardList();
		int row = 0;
		//determining the row number by what option the user chose.
		if(userAction == "G" || userAction == "g") //Gain Food->G/g
		{
			row=0;
			
		}
		if(userAction == "L" || userAction == "l") //Lay eggs ->L/l
		{
			row=1;
			
		}
		if(userAction == "D" || userAction == "d") //Draw bird ->D/d
		{
			row=2;
			
		}
		//determining the column number by finding the left most available spot
		for(int j=0; j<cols;j++)
		{
			if(board[row][j].ifplaced == false)
			{
				board[row][j].ifCube=true; //this is just to keep track of where the action cube is on the board
				return board[row][j].object; //we return the type of habitat the user has placed card on as this will later
											//be used by the player to decide how many die to pick up from the bid feeder
			}
			else
			{
				//returning the die num as they appear on the board for each habitat
				if(userAction == "G" || userAction == "g") //Gain Food->G/g
				{
					return 3;
					
				}
				if(userAction == "L" || userAction == "l") //Lay eggs ->L/l
				{
					return 5;
					
				}
				if(userAction == "D" || userAction == "d") //Draw bird ->D/d
				{
					return 3;
					
				}
			}
			 
		}
		return 0;
		
		
	}
	
	Card traversal(String userAction,Player p,int cardNum) //this function is same as above but does not return any dienum as it 
															//keeps track of play a bird action from the deck of each player
	{
		ArrayList<Card> playerCards = new ArrayList<>();
		playerCards = p.getCardList();
		int row = 0;
		//determining the row number by what option the user chose.
		if(userAction == "G" || userAction == "g") //Gain Food->G/g
		{
			row=0; 
			
		}
		if(userAction == "L" || userAction == "l") //Lay eggs ->L/l
		{
			row=1;
			
		}
		if(userAction == "D" || userAction == "d") //Draw bird ->D/d
		{
			row=2;
			
		}
		//determining the column number by finding the left most available spot
		for(int j=0; j<cols;j++)
		{
			if(board[row][j].ifplaced == false) //finding the left most available spot
			{
				board[row][j].placed = playerCards.get(cardNum); //we place the player's card on the board space 
				board[row][j].ifplaced=true; //and mark it true
				if(j == 1 || j == 2)
				{
					eggCost = 1;
				}
				else if(j==3|| j==4)
				{
					eggCost = 2;
				}
			}
			 
		}
		return playerCards.get(cardNum); //gives us the details of what card player picked
		
		
	}
	public int eggSubtraction(Player p) //to subtract the eggs held by the player after the lay eggs action
	{
		return (p.getEggsHeld() - eggCost);
	}
	
	
}