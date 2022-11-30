package servidores;


public abstract class Servidor {
	
	private String nome;
	private String dataNascimento;
	private String cpf;
	private Endereco endereco;
	private String telefone;
	private String dataContratacao;
	private String vinculo;
	private int matricula;
	
	public Servidor(String nome, String dataNascimento, String cpf, String dataContratacao, String vinculo, int matricula) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.dataContratacao = dataContratacao;
		this.vinculo = vinculo;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setDataNascimento(String data) {
		this.dataNascimento = data;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;;
	}
	
	public String getDataContratacao() {
		return this.dataContratacao;
	}
	
	public void setDataContratacao(String data) {
		this.dataContratacao = data;
	}
	
	public String getVinculo() {
		return this.vinculo;
	}
	
	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}

	public int getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getDadosPessoais() {
		String infoPessoais = 	"\n Dados Pessoais: " + 
								"\n Nome: " + this.nome + 
								"\n Data de nascimento: " + this.dataNascimento + 
								"\n CPF: " + this.cpf;
		String infoEndereco = "Endereço não informado";
		String infoTelefone = "Telefone não informado";
		if(this.endereco == null && this.telefone == null) { 
			return infoPessoais + 
					"\n " + infoEndereco +
					"\n Telefone: " + infoTelefone + "\n";
		}
		if(this.telefone == null) {
			return infoPessoais + 
					"\n " + this.getEndereco() +
					"\n Telefone: " + infoTelefone + "\n" ;
		}
		if(this.endereco == null) {
			return infoPessoais + 
					"\n " + infoEndereco +
					"\n Telefone: " + this.getTelefone() + "\n";
		}
		
		return infoPessoais + 
				"\n " + this.getEndereco() +
				"\n Telefone: " + this.getTelefone() + "\n" ;
		
	}
	
	public String getDadosContratuais() {
		return "\n Dados Contratuais: " + 
				"\n Data de contratação: " + this.dataContratacao +
				"\n Vínculo: " + this.vinculo + 
				"\n Matrícula: " + this.matricula;
	}
	
	public abstract String getStatusServidor();
	
}
