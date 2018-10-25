package br.com.alura.threads;

public class Principal {
	public static void main(String[] args) {
		String nomeProcurado = "(M)(\\s|\\w)*";
		
		Thread threadAss1 = new Thread(new TarefaBuscaNome("assinaturas1.txt",nomeProcurado));
		Thread threadAss2 = new Thread(new TarefaBuscaNome("assinaturas2.txt",nomeProcurado));
		Thread threadAut = new Thread(new TarefaBuscaNome("autores.txt",nomeProcurado));
		
		threadAss1.start();
		threadAss2.start();
		threadAut.start();
	}
}
