package servidores;

public class Profissao {
	private String orgao;
	private String cargo;
	private String funcao;
	
	public Profissao(String orgao, String cargo, String funcao) {
		this.orgao = orgao;
		this.cargo = cargo;
		this.funcao = funcao;
	}
	
	public Profissao(String orgao, String cargo) {
		this.orgao = orgao;
		this.cargo = cargo;
	}
	
	public String getOrgao() {
		return orgao;
	}
	
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getFuncao() {
		if(this.funcao == null) {
			this.funcao = "Função não informada.";
		}
		return funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	@Override
    public String toString() {
    	return "\n Profissão: \n Orgão: " + this.orgao + "\n Cargo: " + this.cargo + "\n Função: " + this.getFuncao();
	}
}
