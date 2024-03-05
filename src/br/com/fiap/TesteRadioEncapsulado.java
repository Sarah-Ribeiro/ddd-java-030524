package br.com.fiap;

public class TesteRadioEncapsulado {

	public static void main(String[] args) {

		RadioEncapsulado radio1 = new RadioEncapsulado();

		radio1.setVolume(10);
		radio1.setEstacao(95.5f);

		radio1.aumentarVolume();
		radio1.aumentarVolume();
		radio1.diminuirVolume();

		radio1.setEstacao(100.5f);

		radio1.mostrar();

	}

}
