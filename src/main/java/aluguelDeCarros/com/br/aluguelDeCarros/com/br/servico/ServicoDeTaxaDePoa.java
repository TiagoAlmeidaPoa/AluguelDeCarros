package aluguelDeCarros.com.br.aluguelDeCarros.com.br.servico;

//aqui estou implementando a classe ServicoDeTaxaPoa e preenchendo o metodo taxa de acordo 
//com a politica de taxa de Poa, ou seja se o montante for menor ou igual a  100 é cobrada 
//uma taxa de 20%, se não é cobrada uma taxa de 15%.

public class ServicoDeTaxaDePoa implements ServicoDeTaxa {

	public double taxa(double montante) {
		if (montante <= 100) {
			return montante * 0.2;
		} else {
			return montante * 0.15;
		}
	}

}
