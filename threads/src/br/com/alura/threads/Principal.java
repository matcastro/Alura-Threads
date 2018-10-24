package br.com.alura.threads;

public class Principal {
	
	public static void main(String[] args) {
		Thread thread = new Thread(new ImprimeString());
		thread.start();
	}
}
