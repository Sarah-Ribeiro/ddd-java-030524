package br.com.fiap.televisor;

public class TesteTelevisorEncapsulada {

	public static void main(String[] args) {
		TelevisorEncapsulada televisorEncapsulada = new TelevisorEncapsulada();
		
		televisorEncapsulada.setCanal(7);
		televisorEncapsulada.setVolume(19);
		
		televisorEncapsulada.mostrar();
		
		televisorEncapsulada.aumentarVolume();
		
		televisorEncapsulada.setCanal(2);
		
		televisorEncapsulada.mostrar();
	}
	
	
	
}
