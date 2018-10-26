package br.com.alura.threads;

public class Banheiro {

	private boolean ehSujo = true;

	public void fazNumero1() {

		String name = Thread.currentThread().getName();
		System.out.println(name + " batendo na porta");
		synchronized (this) {
			System.out.println(name + " entrando no banheiro");
			while (ehSujo) {
				esperaLaFora(name);
			}
			System.out.println(name + " fazendo coisa rapida");

			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			ehSujo = true;
			System.out.println(name + " dando descarga");
			System.out.println(name + " lavando a mao");
			System.out.println(name + " saindo do banheiro");
		}
	}

	public void fazNumero2() {

		String name = Thread.currentThread().getName();
		System.out.println(name + " batendo na porta");
		synchronized (this) {
			System.out.println(name + " entrando no banheiro");
			while (ehSujo) {
				esperaLaFora(name);
			}
			System.out.println(name + " fazendo coisa demorada");

			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			ehSujo = true;
			System.out.println(name + " dando descarga");
			System.out.println(name + " lavando a mao");
			System.out.println(name + " saindo do banheiro");
		}
	}

	public void limpa() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		synchronized (this) {

			System.out.println(nome + " entrando no banheiro");

			if (!this.ehSujo) {
				System.out.println(nome + ", não está sujo, vou sair");
				return;
			}

			System.out.println(nome + " limpando o banheiro");
			this.ehSujo = false;

			try {
				Thread.sleep(13000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			this.notifyAll();

			System.out.println(nome + " saindo do banheiro");
		}
	}

	private void esperaLaFora(String nome) {
		System.out.println(nome + " eca, banheiro está sujo");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
