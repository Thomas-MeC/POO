
public class Criptografia 
	{
		public static String resultado;
		public static String codificaRot13(String entrada)
		{
			// StringBuilder para alocar uma string dinâmica e juntar os char no final
			StringBuilder stringRetorna = new StringBuilder();
			
			
			for (int i = 0; i < entrada.length(); i++)
			{
				
			// tirando cada char da string recebida
				char car = entrada.charAt(i);	
			
				// codificação em si
		        if       (car >= 'a' && car <= 'm') car += 13;
	            else if  (car >= 'A' && car <= 'M') car += 13;
	            else if  (car >= 'n' && car <= 'z') car -= 13;
	            else if  (car >= 'N' && car <= 'Z') car -= 13;
		        stringRetorna.append(car);
			}
			
			resultado = stringRetorna.toString();
			return resultado;
		}
		
		public static String decodificaRot13()
		{
			Criptografia.codificaRot13(resultado);
			return resultado;
		}
	}
