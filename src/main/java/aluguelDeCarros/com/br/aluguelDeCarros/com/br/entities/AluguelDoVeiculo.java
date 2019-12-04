package aluguelDeCarros.com.br.aluguelDeCarros.com.br.entities;
// criei a classe aluguel do veiculo para representar como o aluguel sera cogrado 
//coloquei atributos inicio e fim para representar o momento que o carro foi retirado 
//e o momento que foi devolvido, o aluguel esta associado com o veiculo e com a fatura
// por isso criei os atributos veiculo e fatura;

public class AluguelDoVeiculo {

	private Double inicio;
	private Double fim;

	private Veiculo veiculo;
	private Fatura fatura;

	public AluguelDoVeiculo(Double inicio, Double fim, Veiculo veiculo) {
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
