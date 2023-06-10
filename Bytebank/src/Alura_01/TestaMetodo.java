package Alura_01;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoDaniel = new Conta();

		contaDoDaniel.saldo = 100;
		contaDoDaniel.deposita(50);
		System.out.println(contaDoDaniel.saldo);

		boolean conseguiuRetirar = contaDoDaniel.saca(20);
		System.out.println(contaDoDaniel.saldo);
		System.out.println(conseguiuRetirar);

	    Conta contaDaMarcela = new Conta();
	    contaDaMarcela.deposita(1000);
	
	    contaDaMarcela.transfere(300, contaDoDaniel);
	    System.out.println(contaDaMarcela.saldo);
	    System.out.println(contaDoDaniel.saldo);
	}

}
