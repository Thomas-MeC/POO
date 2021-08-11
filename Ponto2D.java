package questão4;

public class Ponto2D 
{
	private double x;
	private double y;
	
	public void setX(double xRecebido)
	{
		x = xRecebido;
	}
	
	public void setY(double yRecebido)
	{
		y = yRecebido;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	//construtor
	public Ponto2D(double xAReceber, double yAReceber)
	{
		x = xAReceber;
		y =  yAReceber;
	}
}
