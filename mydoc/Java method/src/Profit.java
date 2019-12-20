
public class Profit {
	public float calculateProfit(int x,int y, int z)
	{
	
		float costPrice=y/12f;
		float profit=z-costPrice;
		float pPercentage=(profit/costPrice)*100f;
	
	   return pPercentage;
	}
}

