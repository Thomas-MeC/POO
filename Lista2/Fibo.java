
public class Fibo 
	{
		static int Fibonacci(int n)
		{
			int a2 = 0; int a1 = 0; 
			
			for (int i = 1; i <= n; i++)
			{
				if(i == 1)
				{
					a2 = 0;
					a1 = 1;
				}else {
					a1 = a1 + a2;
					a2 = a1 - a2;
				}
			}
			return a1;
		}
	}
