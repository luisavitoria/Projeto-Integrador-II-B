package servidores;

public class Proventos {
	
	private double proventos;
	private double eventuais;
	private double judiciais;
	private double tetoRedutor;
	private double irrf;
	private double contribPrev;
	private double totalLiquido;
	
	public Proventos(double proventos, double eventuais, double judiciais, double tetoRedutor, double irrf, double contribPrev) {
		this.proventos = proventos;
		this.eventuais = eventuais;
		this.judiciais = judiciais;
		this.tetoRedutor = tetoRedutor;
		this.irrf = irrf;
		this.contribPrev = contribPrev;
	}
	
	public double getProventos() {
		return proventos;
	}
	
	public void setProventos(double proventos) {
		this.proventos = proventos;
	}
	
	public double getEventuais() {
		return eventuais;
	}
	
	public void setEventuais(double eventuais) {
		this.eventuais = eventuais;
	}
	
	public double getJudiciais() {
		return judiciais;
	}
	
	public void setJudiciais(double judiciais) {
		this.judiciais = judiciais;
	}
	
	public double getTetoRedutor() {
		return tetoRedutor;
	}
	
	public void setTetoRedutor(double tetoRedutor) {
		this.tetoRedutor = tetoRedutor;
	}
	
	public double getIrrf() {
		return irrf;
	}
	
	public void setIrrf(double irrf) {
		this.irrf = irrf;
	}
	
	public double getContribPrev() {
		return contribPrev;
	}
	
	public void setContribPrev(double contribPrev) {
		this.contribPrev = contribPrev;
	}
	
	public double getTotalLiquido() {
		this.calculaTotalLiquido();
		return totalLiquido;
	}
	
	public void calculaTotalLiquido() {
		this.totalLiquido = this.proventos + this.eventuais - this.judiciais - 
				this.tetoRedutor - this.irrf - this.contribPrev;
	}
	
	@Override
    public String toString() {
    	return  "\n Proventos: " +
    			"\n Proventos: " + this.proventos + 
    			"\n Valor total líquido: " + this.getTotalLiquido(); 
    }
	
}
