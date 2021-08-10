
public class comparadorTempo 
{
	public static void main (String[] args)
	{
		data data1 = new data(26, 11, 2001);
		data data2 = new data(10, 8, 2021);
		
		if(data1.getAno() < data2.getAno()) 
		{
			boolean vemAntes = true;
			System.out.println("A primeira data ocorre antes");
		} else if (data1.getAno() > data2.getAno())
			{
			boolean vemAntes = false;
			System.out.println("A primeira data ocorre depois");
			}else if (data1.getMês() < data2.getMês())
				{
				boolean vemAntes = true;
				System.out.println("A primeira data ocorre antes");
				}else if(data1.getMês() > data2.getMês())
				{
					boolean vemAntes = false;
					System.out.println("A primeira data ocorre depois");
				}else if(data1.getDia() < data2.getDia())
					{
					boolean vemAntes = true;
					System.out.println("A primeira data ocorre antes");
					}else if(data1.getDia() > data2.getDia())
					{
						boolean vemAntes = false;
						System.out.println("A primeira data ocorre depois");
					} else {
						boolean vemAntes = true;
						System.out.println("A primeira data ocorre antes");
					}
		
		
			
	}
}
