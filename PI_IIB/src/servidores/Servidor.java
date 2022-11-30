package servidores;

import java.util.Date;

public abstract class Servidor {
	
	private String nome;
	private int idade;
	private String cpf;
	private Endereco endereco;
	private String telefone;
	private Date dataContratacao;
	private String vinculo;
	private int matricula;
	
	public Servidor(String nome, int idade, String cpf, Endereco endereco, String telefone, Date dataContratacao, String vinculo, int matricula) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
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
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
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
	
	public Date getDataContratacao() {
		return this.dataContratacao;
	}
	
	public void setDataContratacao(Date data) {
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
	
	public abstract String getStatusServidor();
	
}
