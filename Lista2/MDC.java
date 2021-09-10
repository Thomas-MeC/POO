
public class MDC 
	{
		public static int maxDiv(int M, int N)
		{
			int resto;
			
			if(N == 0)
			{
				return M;
			}else
				{
					return maxDiv(N, M%N);
				}
		}
	}
