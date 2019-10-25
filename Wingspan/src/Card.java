
public class Card {
	
		
		private String birdInfo;
		private int eggCapacity; 
		private boolean whenPlayedPower ;
		private boolean whenActivatedPower;

		
		public Card()
		{
			birdInfo = "";
			eggCapacity = 0;
			whenPlayedPower = false ;
			whenActivatedPower= false;
		}

		public Card(String info, int egg, boolean act, boolean play) //initialize cards using this constructor
		{
			birdInfo = info;
			eggCapacity = egg;
			whenPlayedPower = play;
			whenActivatedPower= act;

		}
		
		void setegg(int string)
		{
			eggCapacity = string;
		}
		
		void setinfo(String info)
		{
			birdInfo = info;
		}
		
		int getegg()
		{
			return eggCapacity;
			
		}
		 
		String getinfo()
		{
			return birdInfo;
		}
		
		void print()
		{
			System.out.println(birdInfo+ " "+ eggCapacity+ " " +whenPlayedPower+ " " + whenActivatedPower);
		}
		
		


}
