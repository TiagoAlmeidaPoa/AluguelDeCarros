package aluguelDeCarros.com.br.aluguelDeCarros.com.br.entities;

//aqui criei a classe fatura representando a fatura com os 
//atributos pagamento basico e taxa, tambem criei um metodo pagamento total para calcular 
// a soma do pagamento basico + taxa . 

public class Fatura {
	
	private Double pagamentoBasico;
	private Double taxa;
	
	public Fatura(Double pagamentoBasico, Double taxa) {
		super();
		this.pagamentoBasico = pagamentoBasico;
		this.taxa = taxa;
	}

	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public void setPagamentoBasico(Double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	//criei o metodo pagamento total que soma o pagamento basico + a taxa;
	public double pagamentoTotal() {
		return getPagamentoBasico() + getTaxa();
	}

}
