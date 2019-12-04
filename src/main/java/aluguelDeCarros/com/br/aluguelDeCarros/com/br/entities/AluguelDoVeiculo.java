package aluguelDeCarros.com.br.aluguelDeCarros.com.br.entities;

import java.util.Date;

// criei a classe aluguel do veiculo para representar como o aluguel sera cogrado 

//coloquei atributos inicio e fim para representar o momento que o carro foi retirado 
//e o momento que foi devolvido, o aluguel esta associado com o veiculo e com a fatura
// por isso criei os atributos veiculo e fatura;

public class AluguelDoVeiculo {

	private Date inicio;
	private Date fim;

	private Veiculo veiculo;
	private Fatura fatura;

	public AluguelDoVeiculo(Date inicio, Date fim, Veiculo veiculo) {
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
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
