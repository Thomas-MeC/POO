import java.util.Scanner;
public class comparaVetor 
	{
	

	
	static void vetorDif() 
	{
		int vetor[] = new int[10];
		
		for (int i=0;i<10;i++)
		{
			Scanner entrVetor = new Scanner(System.in);
			vetor[i] = entrVetor.nextInt(); 
			if (i==9)
			{
				for (int u=8;u>-1;u--)
				{
					if(vetor[9]==vetor[u]) 
					{
						System.out.println("Esse número já foi inserido, inseria um número diferente: ");
						i = i - 1;
						break;
					}
				}
				
			}else if (i==8)
			{
				for (int u=7;u>-1;u--)
				{
					if(vetor[8]==vetor[u]) 
					{
						System.out.println("Esse número já foi inserido, inseria um número diferente: ");
						i = i - 1;
						break;
					}
					}
			}else if (i==7)
			{
				for (int u=6;u>-1;u--)
				{
					if(vetor[7]==vetor[u]) 
					{
						System.out.println("Esse número já foi inserido, inseria um número diferente: ");
						i = i - 1;
						break;
					}
				}
			}else if (i==6)
			{
				for (int u=5;u>-1;u--)
				{
					if(vetor[6]==vetor[u]) 
					{
						System.out.println("Esse número já foi inserido, inseria um número diferente: ");
						i = i - 1;
						break;
					} 
				}
			}else if (i==5)
			{
				for (int u=4;u>-1;u--)
				{
					if(vetor[5]==vetor[u]) 
					{
						System.out.println("Esse número já foi inserido, inseria um número diferente: ");
						i = i - 1;
						break;
					} 
				}	
			}else if (i==4)
				{
					for (int u=3;u>-1;u--)
					{
						if(vetor[4]==vetor[u]) 
						{
							System.out.println("Esse número já foi inserido, inseria um número diferente: ");
							i = i - 1;
							break;
						} 
					}	
				}else if (i==3)
					{
						for (int u=2;u>-1;u--)
						{
							if(vetor[3]==vetor[u]) 
							{
								System.out.println("Esse número já foi inserido, inseria um número diferente: ");
								i = i - 1;
								break;
							} 
						}
					}
							else if (i==2)
							{
								for (int u=1;u>-1;u--)
								{
									if(vetor[2]==vetor[u]) 
									{
										System.out.println("Esse número já foi inserido, inseria um número diferente: ");
										i = i - 1;
										break;
									} 
								}
							}else if (i==1)
							{
								for (int u=0;u>-1;u--)
								{
									if(vetor[1]==vetor[u]) 
									{
										System.out.println("Esse número já foi inserido, inseria um número diferente: ");
										i = i - 1;
										break;
									} 
							}
			
			
			
			 
			 /*
			for (int u=0;u<10;u++)
			{	
				if(x==vetor[u]) 
				{
					System.out.println("Esse número já foi inserido, inseria um número diferente: ");
					i = i - 1;
					break;  
				}
				*/
			}
			
			
			
			
		}
		
		
	}
	
}