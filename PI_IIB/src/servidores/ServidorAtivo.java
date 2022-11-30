package servidores;

public class ServidorAtivo extends Servidor {

	private Profissao profissao;
	private Remuneracao remuneracao;
	private boolean ferias;
	
	public ServidorAtivo(Profissao profissao, Remuneracao remuneracao, boolean ferias, String nome, String dataNascimento, String cpf, String dataContratacao, String vinculo, int matricula) {
		super(nome, dataNascimento, cpf, dataContratacao, vinculo, matricula);
		this.profissao = profissao;
		this.remuneracao = remuneracao;
		this.ferias = ferias;
	}
	
	public Profissao getProfissao() {
		return profissao;
	}
	
	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}
	
	public Remuneracao getRemuneracao() {
		return remuneracao;
	}
	
	public void setRemuneracao(Remuneracao remuneracao) {
		this.remuneracao = remuneracao;
	}
	
	public String getFerias() {
		if(ferias == true) {
			return "Servidor de férias.";
		}else {
			return "Servidor trabalhando.";
		}
	}
	
	public void setFerias(boolean ferias) {
		this.ferias = ferias;
	}
	
	public String getStatusServidor() {
		return "Servidor Ativo" + 
				"\n Status atual: " + this.getFerias() + "\n" +
				this.getDadosPessoais() + 
				this.getDadosContratuais();
		
	}

}
