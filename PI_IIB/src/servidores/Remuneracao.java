package servidores;

public class Remuneracao {
	
	private double remuneracaoBase;
	private double comissao;
	private double beneficios;
	private double eventuais;
	private double horasExtras;
	private double judiciais;
	private double tetoRedutor;
	private double irrf;
	private double contribPrev;
	private double totalLiquido;
	
	public Remuneracao(double remuneracaoBase, double comissao, double beneficios, double eventuais, double horasExtras,
			double judiciais, double tetoRedutor, double irrf, double contribPrev) {
		this.remuneracaoBase = remuneracaoBase;
		this.comissao = comissao;
		this.beneficios = beneficios;
		this.eventuais = eventuais;
		this.horasExtras = horasExtras;
		this.judiciais = judiciais;
		this.tetoRedutor = tetoRedutor;
		this.irrf = irrf;
		this.contribPrev = contribPrev;
	}
	
	public double getRemuneracaoBase() {
		return remuneracaoBase;
	}
	
	public void setRemuneracaoBase(double remuneracaoBase) {
		this.remuneracaoBase = remuneracaoBase;
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double getBeneficios() {
		return beneficios;
	}
	
	public void setBeneficios(double beneficios) {
		this.beneficios = beneficios;
	}
	
	public double getEventuais() {
		return eventuais;
	}
	
	public void setEventuais(double eventuais) {
		this.eventuais = eventuais;
	}
	
	public double getHorasExtras() {
		return horasExtras;
	}
	
	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
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
		this.totalLiquido = this.remuneracaoBase + this.comissao + this.beneficios + this.eventuais +
							this.horasExtras - this.judiciais - this.tetoRedutor - this.irrf - this.contribPrev;
	}
	
	@Override
    public String toString() {
    	return  "\n Remuneração: " +
    			"\n Remuneração base: " + this.remuneracaoBase + 
    			"\n Valor total líquido: " + this.getTotalLiquido(); 
    }

}
