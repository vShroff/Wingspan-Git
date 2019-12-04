package wingspan;

//****************FOR MY REFERENCE : VESION v4.2 WORKS***************************//
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args)
	{  
		int p1score=0;
		int p2score=0;
		Player p1= new Player(1);
		Player p2= new Player(2);
		GameBoard g1 = new GameBoard();
		g1.setboardNum(1);
		GameBoard g2 = new GameBoard();
		g2.setboardNum(2);
		Deck deck = new Deck();
		
		RoundScore round= new RoundScore(1);
		
		deck.drawCard(p1); // draw 3 cards from deck per player
		deck.drawCard(p1);
		deck.drawCard(p1);
		
		deck.drawCard(p2);
		deck.drawCard(p2);
		deck.drawCard(p2);
		
		Player currentPlayer = p1;
		GameBoard currentBoard = g1;
		
		int actionChoice = 0;
		String userAction = null;
		Card currentCard;
		boolean gameNotOver =true; // will be false when game is over
		while(gameNotOver)
		{
			System.out.println("ROUND NUMBER : " + round.getroundNum() ); //round.getroundNum());
			System.out.println("Player " + currentPlayer.getNum() + " What action would you like to perform on Gameboard "
								+ currentBoard.getboardNum()+ " ?");
			System.out.println("1. Play Bird");
			System.out.println("2. Gain Food");
			System.out.println("3. Lay Eggs");
			System.out.println("4. Draw Bird");
			System.out.println("5. Quit");
			actionChoice = 1; 
			Scanner sc = new Scanner(System.in);
			actionChoice= sc.nextInt();

			System.out.println("You have chosen option "+ actionChoice);

			if(actionChoice == 1)
			{
				
				System.out.println("pick a card to place");
				for(int i=0; i<currentPlayer.arr.size(); i++)
					System.out.println(i + ".  " + currentPlayer.arr.get(i));
				
				Scanner choice = new Scanner(System.in);
				int chosenCard = choice.nextInt();
				
				userAction = currentPlayer.arr.get(chosenCard).getType();
				
				currentCard = currentBoard.traversal(userAction, currentPlayer, chosenCard);
				
				currentPlayer.actionCubes--;
				
				
				String foodCost = currentCard.getFoodCost();
				System.out.println("FoodCost is "+ foodCost);
				currentPlayer.foodHeld.remove(foodCost);
				int eggsLeft = currentBoard.eggSubtraction(currentPlayer);
				
				currentPlayer.print();
				currentPlayer= toggle(currentPlayer, p1, p2);
				currentBoard= switchfunc(currentBoard, g1, g2);
/*			
THIS FEATURE TO BE HANDELED IN THE NEXT ITERATION				
			if(currentCard.whenPlayedPower == true)
				{
					//handle the when played power
				}
				else
				{
					//handle 
				}
*/				
				
			}
			//if user chooses to gain food
			if(actionChoice ==2)
			{
				
				//must find first available spot in gain food row
//				System.out.println("pick a card to place");
//				for(int i=0; i<p1.arr.size(); i++)
//					System.out.println(i + ".  " + p1.arr.get(i));
//				
//				Scanner choice = new Scanner(System.in);
//				int chosenCard = choice.nextInt();
				
				userAction = "G";
				int dieNum = currentBoard.traversalVoid(userAction, currentPlayer);
				System.out.println("Dienum " +dieNum);// Not sure what output to expect??
				currentPlayer.takeDice(dieNum);
				currentPlayer.actionCubes--; //Check If NEEDED
				currentPlayer.print();
				currentPlayer= toggle(currentPlayer, p1, p2);
				currentBoard= switchfunc(currentBoard, g1, g2);
				
			}
			if(actionChoice ==3)
			{
				//lay egg
			}
			if(actionChoice ==4)
			{
				//draw bird card
			}
			if(actionChoice == 5)
			{
				 //Display score here, at a later stage?
				gameNotOver =false;
			}
			
			//Checking if both players action cubes are 0
			if(actionChoice !=5 && (p1.actionCubes ==0  && p2.actionCubes==0))
			{
				System.out.println("ROUND OVER! ");
				//checking food held by each player
				int size1 = p1.foodHeld.size();
				int size2=  p2.foodHeld.size();
				if(size1 > size2 )
				{
					System.out.println("Player 1 wins this round");
					p1score++;
				}
				else if(size1 < size2 )
				{
					System.out.println("Player 2 wins this round");
					p2score++;
				}
				else
				{
					System.out.println("It's a Tie in this round, both players gain a point! ");
					p1score++;
					p2score++;
				}
					
				round.updateroundNum();
				
			}
			
					
			
		}
		
		System.out.println("Game Over! ");
		
		
//		System.out.println("------Player1's Cards------");
//		p1.displayCardArray();
//		System.out.println("------Player2's Cards------");
//		p2.displayCardArray();			
		System.out.println("P1 score: "+ p1score);
		System.out.println("P2 score: "+ p2score);
		if(p1score> p2score)
		{
			System.out.println("P1 wins !!");
		}
		else if(p1score < p2score)
		{
			System.out.println("P2 wins !!");
		}
		else 
		{
			System.out.println("It's a Tie !!");
		}
			
		
	}
	//toggle function to switch between players, try will try to make it use only two parameters by 11/13- Vrinda
public static Player toggle(Player Person, Player person1, Player person2) { 
		
		if (person1.getNum() == Person.getNum()) {
			return person2;
		} 
		else {
		return person1;
	}
	
	}

public static GameBoard switchfunc(GameBoard board, GameBoard board1, GameBoard board2) { 
	
	if (board1.getboardNum() == board.getboardNum()) {
		return board2;
	} 
	else {
	return board1;
}

}
}

