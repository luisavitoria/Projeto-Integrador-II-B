package servidores;

public class ServidorInativo extends Servidor {

	private Proventos proventos;
	private String dataAposentadoria;
	
	public ServidorInativo(Proventos proventos, String dataAposentadoria, String nome, String dataNascimento, String cpf, String dataContratacao, String vinculo, int matricula) {
		super(nome, dataNascimento, cpf, dataContratacao, vinculo, matricula);
		this.proventos = proventos;
		this.dataAposentadoria = dataAposentadoria;
	}
	
	public Proventos getProventos() {
		return proventos;
	}
	
	public void setProventos(Proventos proventos) {
		this.proventos = proventos;
	}
	
	public String getDataAposentadoria() {
		return dataAposentadoria;
	}
	
	public void setDataAposentadoria(String dataAposentadoria) {
		this.dataAposentadoria = dataAposentadoria;
	}
	
	public String getStatusServidor() {
		return "\nServidor Inativo \n" +
				this.getDadosPessoais() + 
				this.getDadosContratuais();
		
	}

}
