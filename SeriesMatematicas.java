
public class SeriesMatematicas
{
	public static int elevadoA(int x, int y)
	{
		int resultado = x;
		for (int i = 1; i < y; i++)
		{
			resultado = resultado * x;
		}
		return resultado;
	}
}
