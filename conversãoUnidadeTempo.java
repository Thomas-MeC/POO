
public class convers�oUnidadeTempo {
	
	//m�todo anos para dias
	public static double anoParaDias(double ano)
	{
		 double dias = ano * 365.25;
		 return dias;
	}
	
	//m�todo m�s para dias
	public static double m�sParaDias(double m�s)
	{
		 double dias = m�s * 30;
		 return dias;
	}
	
	//m�todo semana para dias
		public static double semanaParaDias(double semana)
		{
			 double dias = semana * 7;
			 return dias;
		}
		
		
	//m�todo dia para segundos
		public static double diaParaSegundos(int dia)
		{
			 int segundos = dia * 86400;
			 return segundos;
		}
		
	//m�todo dia para minutos 
		public static double diaParaMinutos(int dia)
		{
			 int minutos = dia * 1440;
			 return minutos;
		}
	//m�todo dia para horas
		public static double diaParaHoras(int dia)
		{
			 double Horas = dia * 24;
			 return Horas;
		}
	
	//m�todo horas para minutos
		public static double horaParaMinutos(double hora)
		{
			 double minutos = hora * 60;
			 return minutos;
		}
		
	//m�todo minutos para segundos
		public static double minutoParaSegundos(double minuto)
		{
			 double segundos = minuto * 60;
			 return segundos;
		}
	
}
