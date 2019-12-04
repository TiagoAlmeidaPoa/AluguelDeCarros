package aluguelDeCarros.com.br.aluguelDeCarros.com.br.entities;

public class AluguelDoVeiculo {

	private Double inicio;
	private Double fim;

	private Veiculo veiculo;
	private Fatura fatura;

	public AluguelDoVeiculo(Double inicio, Double fim, Veiculo veiculo) {
		super();
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	public Double getInicio() {
		return inicio;
	}

	public void setInicio(Double inicio) {
		this.inicio = inicio;
	}

	public Double getFim() {
		return fim;
	}

	public void setFim(Double fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

}
