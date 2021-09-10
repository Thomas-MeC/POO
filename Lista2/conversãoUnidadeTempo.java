
public class conversãoUnidadeTempo {
	
	//método anos para dias
	public static double anoParaDias(double ano)
	{
		 double dias = ano * 365.25;
		 return dias;
	}
	
	//método mês para dias
	public static double mêsParaDias(double mês)
	{
		 double dias = mês * 30;
		 return dias;
	}
	
	//método semana para dias
		public static double semanaParaDias(double semana)
		{
			 double dias = semana * 7;
			 return dias;
		}
		
		
	//método dia para segundos
		public static double diaParaSegundos(int dia)
		{
			 int segundos = dia * 86400;
			 return segundos;
		}
		
	//método dia para minutos 
		public static double diaParaMinutos(int dia)
		{
			 int minutos = dia * 1440;
			 return minutos;
		}
	//método dia para horas
		public static double diaParaHoras(int dia)
		{
			 double Horas = dia * 24;
			 return Horas;
		}
	
	//método horas para minutos
		public static double horaParaMinutos(double hora)
		{
			 double minutos = hora * 60;
			 return minutos;
		}
		
	//método minutos para segundos
		public static double minutoParaSegundos(double minuto)
		{
			 double segundos = minuto * 60;
			 return segundos;
		}
	
}
