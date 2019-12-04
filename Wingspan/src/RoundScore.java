package wingspan;

public class RoundScore {

	private int roundNum;
	
	public RoundScore(int n)
	{
		roundNum= n;
	}
	
	public void updateroundNum()
	{
		roundNum++;
	}
	public int getroundNum()
	{
		return roundNum;
	}
	
}
