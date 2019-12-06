package aluguelDeCarros.com.br.aluguelDeCarros.com.br;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import aluguelDeCarros.com.br.aluguelDeCarros.com.br.entities.AluguelDoVeiculo;
import aluguelDeCarros.com.br.aluguelDeCarros.com.br.entities.Veiculo;
import aluguelDeCarros.com.br.aluguelDeCarros.com.br.servico.ServicoDeAluguel;
import aluguelDeCarros.com.br.aluguelDeCarros.com.br.servico.ServicoDeTaxaDePoa;

public class AppTest{
	
	@Test
	public void testaValorCobradoMenosDeDozeHoras() throws ParseException {
		// aqui estou testando se o valor cobrado foi menor que 12 horas.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");		
		Date inicio = sdf.parse("06/12/2019 16:39");
		Date fim = sdf.parse("06/12/2019 21:39");
		String modelo = "Clio";		
		double precoPorDia = 200.0;
		double precoPorHora = 10.0;
		
		AluguelDoVeiculo aluguelDoVeiculo = new AluguelDoVeiculo(inicio, fim, new Veiculo(modelo));
		ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoPorDia, precoPorHora, new ServicoDeTaxaDePoa());
		servicoDeAluguel.notaDePagamento(aluguelDoVeiculo);
		
		double basico = aluguelDoVeiculo.getFatura().getPagamentoBasico();
		
		assertEquals(50.0, basico,1);
		
	}
	
	@Test
	public void testaValorCobradoDozeHoras() throws ParseException {
		// Aqui estou testando se o valor cobrado foi igual a 12 horas ou seja o valor ainda é cobrado por hora.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");		
		Date inicio = sdf.parse("06/12/2019 10:00");
		Date fim = sdf.parse("06/12/2019 22:00");
		String modelo = "Clio";		
		double precoPorDia = 200.0;
		double precoPorHora = 10.0;
		
		AluguelDoVeiculo aluguelDoVeiculo = new AluguelDoVeiculo(inicio, fim, new Veiculo(modelo));
		ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoPorDia, precoPorHora, new ServicoDeTaxaDePoa());
		servicoDeAluguel.notaDePagamento(aluguelDoVeiculo);
		
		double pagamentoTotal = aluguelDoVeiculo.getFatura().pagamentoTotal();
		double taxa = aluguelDoVeiculo.getFatura().getTaxa();
		double basico = aluguelDoVeiculo.getFatura().getPagamentoBasico();
		
		assertEquals(120.0, basico,1);
		
	}
	
	@Test
	public void testaValorCobradoMaisDeDozeHoras() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");		
		Date inicio = sdf.parse("06/12/2019 10:00");
		Date fim = sdf.parse("06/12/2019 23:00");
		String modelo = "Clio";		
		double precoPorDia = 200.0;
		double precoPorHora = 10.0;
		
		AluguelDoVeiculo aluguelDoVeiculo = new AluguelDoVeiculo(inicio, fim, new Veiculo(modelo));
		ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoPorDia, precoPorHora, new ServicoDeTaxaDePoa());
		servicoDeAluguel.notaDePagamento(aluguelDoVeiculo);
		
		double pagamentoTotal = aluguelDoVeiculo.getFatura().pagamentoTotal();
		double taxa = aluguelDoVeiculo.getFatura().getTaxa();
		double basico = aluguelDoVeiculo.getFatura().getPagamentoBasico();
		
		assertEquals(200.0, basico,1);
		
	}
	
	@Test
	public void testaValorCobradoMaisDeUmDia() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");		
		Date inicio = sdf.parse("06/12/2019 10:00");
		Date fim = sdf.parse("16/12/2019 10:00");
		String modelo = "Clio";		
		double precoPorDia = 200.0;
		double precoPorHora = 10.0;
		
		AluguelDoVeiculo aluguelDoVeiculo = new AluguelDoVeiculo(inicio, fim, new Veiculo(modelo));
		ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoPorDia, precoPorHora, new ServicoDeTaxaDePoa());
		servicoDeAluguel.notaDePagamento(aluguelDoVeiculo);
		
		double pagamentoTotal = aluguelDoVeiculo.getFatura().pagamentoTotal();
		double taxa = aluguelDoVeiculo.getFatura().getTaxa();
		double basico = aluguelDoVeiculo.getFatura().getPagamentoBasico();
		
		assertEquals(2000.0, basico,1);
		
	}
	
	@Test
	public void testaValorDaTaxaDePoa() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");		
		Date inicio = sdf.parse("06/12/2019 10:00");
		Date fim = sdf.parse("06/12/2019 11:00");
		String modelo = "Clio";		
		double precoPorDia = 200.0;
		double precoPorHora = 10.0;
		
		AluguelDoVeiculo aluguelDoVeiculo = new AluguelDoVeiculo(inicio, fim, new Veiculo(modelo));
		ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoPorDia, precoPorHora, new ServicoDeTaxaDePoa());
		servicoDeAluguel.notaDePagamento(aluguelDoVeiculo);
		
		double pagamentoTotal = aluguelDoVeiculo.getFatura().pagamentoTotal();
		double taxa = aluguelDoVeiculo.getFatura().getTaxa();
		double basico = aluguelDoVeiculo.getFatura().getPagamentoBasico();
		
		assertEquals(2.0, taxa,1);
		
	}
	
}
