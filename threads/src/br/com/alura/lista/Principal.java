package br.com.alura.lista;

import java.util.List;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
//		List<String> lista = new ArrayList<String>();
//		List<String> lista = new Vector<String>();
		Lista lista = new Lista();
		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionarElemento(lista, i)).start();
		}
		
		new Thread(new TarefaImprimir(lista)).start();
	}

}
