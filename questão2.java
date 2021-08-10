

public class questão2 
{
	public static void main (String[] args)
	{
		empregado empregado1 = new empregado("João", "DI", 30, 40);
		
		System.out.println("Nome: " + empregado1.recebNome() + "\nDepartamento: " + empregado1.recebDepartamento() + "\nHoras trabalhadas neste mês: " + empregado1.recebHoras() + " horas \nSalário: R$ " + empregado1.recebSalário() + ",00/ hora");
		int sum = empregado1.recebSalário() * empregado1.recebHoras();
		System.out.println("\nSalário neste mês: R$ " + sum + ",00");
	}

	
}

 