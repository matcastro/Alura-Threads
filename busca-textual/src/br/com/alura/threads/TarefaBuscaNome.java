package br.com.alura.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaNome implements Runnable {

	
	private String nomeArquivo;
	private String nome;

	public TarefaBuscaNome(String nomeArquivo, String nome) {
		this.nomeArquivo = nomeArquivo;
		this.nome = nome;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(new File(nomeArquivo))) {
			int numeroLinha = 1;
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				if(linha.toLowerCase().matches(nome.toLowerCase())) {
					System.out.println(nomeArquivo + " - " + numeroLinha + " - " + linha);
				}
				numeroLinha++;
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		
	}

}
