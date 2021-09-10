
public class Nome 
	{
		private String nomeProp;
		private String nomeMeio;
		private String nomeFam;
		
	
		
		// construtor
		public Nome(String propReceb, String meioReceb, String famReceb)
		{
			nomeProp = propReceb;
			nomeMeio = meioReceb;
			nomeFam = famReceb;
		}
		
		
		// rúbrica: retorna iniciais do nome completo em caracteres minúsculos;
		public String rub()
		{
			// recebe os primeiros caracteres de cada nome
			char n1 = nomeProp.charAt(0);
			char n2 = nomeMeio.charAt(0);
			char n3 = nomeFam.charAt(0);
			// converte para lowercase
			n1 = Character.toLowerCase(n1);
			n2 = Character.toLowerCase(n2);
			n3 = Character.toLowerCase(n3);
			
			// junta os char em uma string, que é retornada.
			String rubrica = new StringBuilder().append(n1).append(n2).append(n3).toString();
			return rubrica;
		}
		
		// assinatura: retorna as iniciais nos nomes próprio e do meio (com pontos)
		// e o nome da família por completo, "R.L.Gregory"
		public String assin()
		{
			char n1 = nomeProp.charAt(0);
			char n2 = nomeMeio.charAt(0);
			String assinatura = new StringBuilder().append(n1).append(".").append(n2).append(".").append(nomeFam).toString();
			return assinatura;
		}
	}
