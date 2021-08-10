//classe empregado
public class empregado {
		private String nome;
		private String departamento;
		private int horasTrabalhadasNoM�s;
		private int sal�rioPorHora;
		
		//m�todos para setar
		public void setNome(String nomeRecebido)
		{
			nome = nomeRecebido;
		}
		
		public void setDepart(String departRecebido)
		{
			departamento = departRecebido;
		}
		
		public void setHoras(int horasComputadas)
		{
			horasTrabalhadasNoM�s = horasComputadas;
		}
		
		public void setSal�rio(int sal�rioReceber)
		{
			sal�rioPorHora = sal�rioReceber;
		}
		
		// m�todos para retorno
		
		public String recebNome() 
		{
			return nome;
		}
		
		public String recebDepartamento() 
		{
			return departamento;
		}
		
		public int recebHoras() 
		{
			return horasTrabalhadasNoM�s;
		}
		
		public int recebSal�rio() 
		{
			return sal�rioPorHora;
		}
		
		//construtor
		public empregado( String nomeDoEmpregado, String departamentoOndeTrabalha, int horasTrabalhadas, int sal�rioEmpregado) 
		{
			nome = nomeDoEmpregado;
			departamento = departamentoOndeTrabalha;
			horasTrabalhadasNoM�s = horasTrabalhadas;
			sal�rioPorHora = sal�rioEmpregado;
			
		}
}
