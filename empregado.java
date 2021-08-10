//classe empregado
public class empregado {
		private String nome;
		private String departamento;
		private int horasTrabalhadasNoMês;
		private int salárioPorHora;
		
		//métodos para setar
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
			horasTrabalhadasNoMês = horasComputadas;
		}
		
		public void setSalário(int salárioReceber)
		{
			salárioPorHora = salárioReceber;
		}
		
		// métodos para retorno
		
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
			return horasTrabalhadasNoMês;
		}
		
		public int recebSalário() 
		{
			return salárioPorHora;
		}
		
		//construtor
		public empregado( String nomeDoEmpregado, String departamentoOndeTrabalha, int horasTrabalhadas, int salárioEmpregado) 
		{
			nome = nomeDoEmpregado;
			departamento = departamentoOndeTrabalha;
			horasTrabalhadasNoMês = horasTrabalhadas;
			salárioPorHora = salárioEmpregado;
			
		}
}
