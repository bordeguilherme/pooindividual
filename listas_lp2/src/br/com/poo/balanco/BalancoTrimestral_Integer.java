package br.com.poo.balanco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestral_Integer {

	private Integer gastosJaneiro = 15000;
	private Integer gastosFevereiro = 23000;
	private Integer gastosMarco = 17000;
	
	private Integer somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	private static Logger logger = Logger.getLogger (BalancoTrimestral_Integer.class.getName());	
	public int soma() {
		logger.log (Level.INFO, "O balanço trimestral é de: R$ " + somaTotal); 
		return somaTotal;
	}
	public int soma(int janeiro) {
		logger.log (Level.INFO, "O balanço trimestral é de: R$ " + janeiro); 
		return janeiro;
	}
	public int soma(int janeiro, int fevereiro) {
		int somaBi = janeiro + fevereiro;
		logger.log (Level.INFO, "O balanço trimestral é de: R$ " + somaBi); 
		return somaBi;
	}
	public int soma(int janeiro, int fevereiro, int marco) {
		int somaTri = janeiro + fevereiro + marco;
		logger.log (Level.INFO, "O balanço trimestral é de: R$ " + somaTri); 
		return somaTri;
	}
}
