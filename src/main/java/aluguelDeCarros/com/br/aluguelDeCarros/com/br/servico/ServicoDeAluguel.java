package aluguelDeCarros.com.br.aluguelDeCarros.com.br.servico;

import java.util.regex.Matcher;

import aluguelDeCarros.com.br.aluguelDeCarros.com.br.entities.AluguelDoVeiculo;
import aluguelDeCarros.com.br.aluguelDeCarros.com.br.entities.Fatura;

//criei a classe ServicoDeAluguel com a ideia de cobrar um valor por hora até 12 horas apos esse periodo
// será cobrado um valor por dia.

public class ServicoDeAluguel {

	private double precoPorDia;
	private double precoPorHora;

	private ServicoDeTaxa servicoDeTaxa;

	public ServicoDeAluguel(double precoPorDia, double precoPorHora, ServicoDeTaxa servicoDeTaxa) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.servicoDeTaxa = servicoDeTaxa;
	}

	public void notaDePagamento(AluguelDoVeiculo aluguelDoVeiculo) {

		// utilizei o getTime para passar para milessegundos.

		double t1 = aluguelDoVeiculo.getInicio().getTime();
		double t2 = aluguelDoVeiculo.getFim().getTime();

		// aqui eu dividi por 1000 para transformar em segundos depois
		// por 60 pra minutos e depois por 60 para transformar em horas
		// e coloquei um cast pra double

		double horas = (double) (t2 - t1) / 1000 / 60 / 60;

		// aqui estou verificando a quantia de horas para ver se sera
		// cobrado o valor por hora ou por dia, tambem estou arredondando as horas.

		double pagamentoBasico;
		if (horas <= 12.0) {
			pagamentoBasico = precoPorHora * Math.ceil(horas);
		} else {
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24);
		}

		// Agora pra calcular a taxa usei o pagamentoBasico e setei a fatura
		// passando uma instancia da fatura como argumento.

		double taxa = servicoDeTaxa.taxa(pagamentoBasico);
		aluguelDoVeiculo.setFatura(new Fatura(pagamentoBasico, taxa));

	}

}
