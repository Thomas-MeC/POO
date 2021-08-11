import java.util.Scanner;
public class CalculadoraQuestão11 {
	public static void main(String[] args)
	{
		int n1, n2;
		String operador = "";
		Scanner entrada = new Scanner(System.in);
		
		//entrada de operador
		System.out.println("Digite o operador: ");
		operador = entrada.nextLine();
		
		//entradas dos valores
		System.out.println("Digite um valor: ");
		n1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite outro valor: ");
		n2 = Integer.parseInt(entrada.next());

		if(operador.equals("+")) 
		{
			System.out.println("Resultado: " + (n1 + n2));
		}else if(operador.equals("-"))
			{
			System.out.println("Resultado: " + (n1 - n2));
			}else if(operador.equals("*"))
				{
				System.out.println("Resultado: " + (n1 * n2));
				}else if(operador.equals("/"))
					{
					if(n2 == 0)
					{System.out.println("impossível dividir por zero");}
					System.out.println("Resultado: " + (n1 / n2));
					}else 
					{
					System.out.println("Esse operador não é válido");
					}
		
		
		
		
	}
}
