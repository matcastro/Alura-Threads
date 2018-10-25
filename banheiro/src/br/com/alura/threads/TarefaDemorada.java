package br.com.alura.threads;

public class TarefaDemorada implements Runnable {

	private Banheiro banheiro;

	public TarefaDemorada(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		this.banheiro.fazNumero2();
	}

}
