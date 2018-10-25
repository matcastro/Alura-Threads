package br.com.alura.threads;

public class Banheiro {
	public void fazNumero1() {

		String name = Thread.currentThread().getName();
		System.out.println(name + " batendo na porta");
		synchronized (this) {
			System.out.println(name + " entrando no banheiro");
			System.out.println(name + " fazendo coisa rapida");

			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

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
			System.out.println(name + " fazendo coisa demorada");

			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(name + " dando descarga");
			System.out.println(name + " lavando a mao");
			System.out.println(name + " saindo do banheiro");
		}
	}

}
