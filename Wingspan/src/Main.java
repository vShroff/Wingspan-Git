
public class Main {
	
	public static void main(String[] args)
	{  
		ArrayList<Card> cardarr1 = new ArrayList<Card>();
		ArrayList<Card> cardarr2 = new ArrayList<Card>();
		//Card[] cardarr1 = (Card[]) new Card[3];
		//Card[] cardarr2 = (Card[]) new Card[3];
	
		
		System.out.println("-----------------Intial Information for both Players------------------");
		
		cardarr1[0] = new Card("Flamingo related information", 3, false, false);
		cardarr1[1] = new Card("Peacock related information", 2, false, false);
		cardarr1[2]= new Card("Vulture related information", 5, false, false);

		cardarr2[0]= new Card("Crow related information", 3, false, false);
		cardarr2[1]= new Card("Pigeon related information", 4, false, false);
		cardarr2[2]= new Card("Woodpecker related information", 1, false, false);
		
		Player p1= new Player(1);
		Player p2= new Player(2);
		
		p1.setCard(cardarr1);
		p2.setCard(cardarr2);
		
		System.out.println("------Player1's Cards in the beginning------");
		p1.displayCardArray();
		System.out.println("------Player2's Cards in the beginning------");
		p2.displayCardArray();
		
		//System.out.println(p1.getFoodfromDice());
//		Dice d= new Dice();
//		//System.out.println(d.foodarr[1]);
//		System.out.println(d.setget());
		
		System.out.println("------Gain food ACTION for Players------");
	    p1.diefunc();
		p2.diefunc();
		
		//cardarr1= ArrayUtils.remove(cardarr1,2);
		cardarr1.remove(cardarr1.size()-1);
		 
		System.out.println("------Player1's Cards afterwards------");
			p1.displayCardArray();
			System.out.println("------Player2's Cards afterwards------");
			p2.displayCardArray();
	
	
	}

	
}
