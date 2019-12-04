package aluguelDeCarros.com.br.aluguelDeCarros.com.br.servico;

//criei a interface serviço de taxa para representar a taxa a ser cobrada na 
// qual outras classes poderam usar o metodo e preencher a taxa de acordo com sua politica de taxa.

public interface ServicoDeTaxa {

	double taxa(double montante);

}
