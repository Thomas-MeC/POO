import java.util.Scanner;
public class main3L2 {

	public static void main (String[] args)
	{
		Scanner mscan = new Scanner(System.in);
		
		System.out.println("insira N: ");
		int n = mscan.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			System.out.println(Fibo.Fibonacci(i));
		}
	}
}
