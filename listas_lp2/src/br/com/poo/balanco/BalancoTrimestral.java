package br.com.poo.balanco;

public class BalancoTrimestral {

	public static void main(String[] args) {
		
		BalancoTrimestral_Integer bti = new BalancoTrimestral_Integer();
		bti.soma();
		bti.soma(10000);
		bti.soma(10, 50);
		bti.soma(80, 90, 100);

		BalancoTrimestral_Double btd = new BalancoTrimestral_Double();
		btd.soma ();
		btd.soma (258);
		btd.soma (5000, 3000);
		btd.soma (0, 0, 0);
		
		BalancoTrimestral_BigDecimal btb = new BalancoTrimestral_BigDecimal();
		btb.soma ();
		btb.soma (2500);
		btb.soma (80000, 230);
		btb.soma (12, 13000, 560);
	}

}
