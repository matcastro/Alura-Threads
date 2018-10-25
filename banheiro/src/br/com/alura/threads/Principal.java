package br.com.alura.threads;

public class Principal {

	public static void main(String[] args) {
		Banheiro banheiro = new Banheiro();
		Thread t1 = new Thread(new TarefaDemorada(banheiro), "Mateus");
		Thread t2 = new Thread(new TarefaRapida(banheiro), "Tati");
		
		t1.start();
		t2.start();
	}

}
