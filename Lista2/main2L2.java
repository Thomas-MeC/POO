
public class main2L2 {
	
	public static void main (String[] args)
	{
		for(int X = -100; X <= 100; X++)
		{
			for(int Y=-100; Y<=100;Y++)
			{
				if (X+Y == 100 || X+Y == -100)
				{
					System.out.println("X: " + X + " Y: " + Y);
				}
			}
		}
	}
}
