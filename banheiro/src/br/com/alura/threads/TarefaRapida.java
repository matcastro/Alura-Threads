package br.com.alura.threads;

public class TarefaRapida implements Runnable {

	private Banheiro banheiro;

	public TarefaRapida(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		this.banheiro.fazNumero1();
	}

}
