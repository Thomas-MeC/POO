
public class CArta {
	private int valor;
	private int naipe;
	
	//construtor
	public CArta(int valorRecebido, int naipeEscolhido)
	{
		valor = valorRecebido;
		naipe = naipeEscolhido;
	}
	

	//método para retornar a string equivalente ao naipe da carta:
	public String toNaipe()
	{
		String naipeDaCarta = null;
		// switch
		switch(naipe)
		{
		case 1:
			naipeDaCarta = "ouros";
			break;
		case 2:
			naipeDaCarta = "paus";
			break;
		case 3:
			naipeDaCarta = "copas";
			break;
		case 4:
			naipeDaCarta = "espadas";
			break;
		}
		return naipeDaCarta;
	}
	
	//método para retornar a string equivalente a carta:
	public String toString ()
	{	
		String numDacarta = null;
		// switch:
		
		switch (valor)
		{
		case 1: 
			numDacarta = "Ás";
			break;
		case 2: 
			numDacarta = "Dois";
			break;
		case 3: 
			numDacarta = "Três";
			break;
		case 4: 
			numDacarta = "Quatro";
			break;
		case 5: 
			numDacarta = "Cinco";
			break;
		case 6: 
			numDacarta = "Seis";
			break;
		case 7: 
			numDacarta = "Sete";
			break;
		case 8: 
			numDacarta = "Oito";
			break;
		case 9: 
			numDacarta = "Nove";
			break;
		case 10: 
			numDacarta = "Dez";
			break;
		case 11: 
			numDacarta = "Valete";
			break;
		case 12: 
			numDacarta = "Dama";
			break;
		case 13: 
			numDacarta = "Rei";
			break;
		
		}
		return numDacarta;
		
	}
	
	
}
