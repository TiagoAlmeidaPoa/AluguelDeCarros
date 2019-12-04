package aluguelDeCarros.com.br.aluguelDeCarros.com.br.entities;
//criei a classe veiculo com o atributo modelo para representar o modelo do carro

public class Veiculo {
	
	String modelo;
	
	public Veiculo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
