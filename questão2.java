

public class quest�o2 
{
	public static void main (String[] args)
	{
		empregado empregado1 = new empregado("Jo�o", "DI", 30, 40);
		
		System.out.println("Nome: " + empregado1.recebNome() + "\nDepartamento: " + empregado1.recebDepartamento() + "\nHoras trabalhadas neste m�s: " + empregado1.recebHoras() + " horas \nSal�rio: R$ " + empregado1.recebSal�rio() + ",00/ hora");
		int sum = empregado1.recebSal�rio() * empregado1.recebHoras();
		System.out.println("\nSal�rio neste m�s: R$ " + sum + ",00");
	}

	
}

 