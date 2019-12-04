package aluguelDeCarros.com.br.aluguelDeCarros.com.br.servico;

//aqui estou implementando a classe ServicoDeTaxaSP e preenchendo o metodo taxa de acordo 
//com a politica de taxa de SP, ou seja se o montante for menor ou igual a  150 é cobrada 
//uma taxa de 30%, se não é cobrada uma taxa de 20%.
public class ServicoDeTaxaDeSP implements ServicoDeTaxa {

	public double taxa(double montante) {
		if (montante <= 150) {
			return montante * 0.3;
		} else {
			return montante * 0.2;
		}
	}

}
