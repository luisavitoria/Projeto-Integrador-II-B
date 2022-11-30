package servidores;

public class Endereco {
	
    private String rua;
    private String bairro;
    private int numero;
    private String CEP;
    private String cidade;
    private String estado;

    public Endereco(String rua, String bairro, int numero, String CEP, String cidade, String estado) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.CEP = CEP;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public String getRua() {
        return this.rua;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    } 
    
    public String getCEP() {
        return this.CEP;
    }
    
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
    	return "Endereço: \n 	Rua: " + this.rua + ", Número: " + this.numero + "\n 	Bairro: " + this.bairro + "\n 	Cidade: " + this.cidade + ", Estado: " + this.estado; 
    }
    
}
