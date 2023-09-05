package br.com.poo.balanco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestral_Double {
	
	private Double gastosJaneiro = 15000.00;
	private Double gastosFevereiro = 23000.00;
	private Double gastosMarco = 17000.00;
	
	private Double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	private static Logger logger = Logger.getLogger (BalancoTrimestral_Double.class.getName());
	
	public double soma() {
		logger.log(Level.INFO, "O balanço trimestral é de R$ " + somaTotal);
		return somaTotal;
	}
	public double soma(double janeiro) {
		logger.log(Level.INFO, "O balanço de janeiro é de R$ " + janeiro);
		return janeiro;
	}
	public double soma(double janeiro, double fevereiro) {
		double somaBi = janeiro + fevereiro;
		logger.log(Level.INFO, "O balanço bimestral é de R$ " + somaBi);
		return somaBi;
	}
	public double soma(double janeiro, double fevereiro, double marco) {
		double somaTri = janeiro + fevereiro + marco;
		logger.log(Level.INFO, "O balanço trimestral é de R$ " + somaTri);
		return somaTri;
	}
}
