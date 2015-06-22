package listasDeEsportes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import logicaArvore.LogicaDaArvore;
import estruturaDaArvore.Arvore;
import estruturaDaArvore.No;

public class EsportesAquaticos extends No {
	private LogicaDaArvore la = new LogicaDaArvore();
	//private No no;

	private List<String[]> listaDeEsportesAquaticos;

	public EsportesAquaticos(int opcao) {
		super(opcao);
	}

	public void selecionaEsporte(int opcao) {
		switch (opcao) {
		case 1:

			System.out.println("Esportes sugeridos:");
			for (String[] strings : criaLista(opcao)) {
				for (String string : strings) {
					System.out.println(string);
				}
			}
			
			System.out.println("O caminho percorrido foi:");
			System.out.println(super.getCaminho());
			la.iniciaNovamente();
			break;

		}

	}

	private List<String[]> criaLista(int opcao) {

		int arvoreSelecionada = la.arvoreIniciada(super.getCaminho());
		switch (opcao) {
		case 1:
			listaDeEsportesAquaticos = new ArrayList<>();

			if (arvoreSelecionada == 1) {
 
				return listaDeEsportesAquaticos;
			} else if (arvoreSelecionada == 2) {
				listaDeEsportesAquaticos.add(new String[] { "natação", "recreação na água",
						"ski-aquatico" });
				return listaDeEsportesAquaticos;
			}
		case 2:
			listaDeEsportesAquaticos = new ArrayList<>();

			if (arvoreSelecionada == 1) {
				listaDeEsportesAquaticos.add(new String[] { "Remo" });
				return listaDeEsportesAquaticos;
			} else if (arvoreSelecionada == 2) {
				listaDeEsportesAquaticos.add(new String[] { "natação", "recreação na água",
						"ski-aquatico","Surf", "Wind-Surf" });
				return listaDeEsportesAquaticos;
			}
		case 3:
			listaDeEsportesAquaticos = new ArrayList<>();

			if (arvoreSelecionada == 1) {
				listaDeEsportesAquaticos.add(new String[] { "nado sincronizado, salto ornamental" });
				return listaDeEsportesAquaticos;
			} else if (arvoreSelecionada == 2) {
				listaDeEsportesAquaticos.add(new String[] { "natação", "recreação na água",
						"hidro-ginastica" });
				return listaDeEsportesAquaticos;
			}
		case 4:
			listaDeEsportesAquaticos = new ArrayList<>();

			if (arvoreSelecionada == 1) {
				listaDeEsportesAquaticos.add(new String[] { "nado sincronizado","hidroginastica" });
				return listaDeEsportesAquaticos;
			} else if (arvoreSelecionada == 2) {
				listaDeEsportesAquaticos.add(new String[] { "natação", "recreação na água",
						"hidro-ginastica" });
				return listaDeEsportesAquaticos;
			}
		case 5:
			listaDeEsportesAquaticos = new ArrayList<>();

			if (arvoreSelecionada == 1) {
				listaDeEsportesAquaticos.add(new String[] { "nado sincronizado","hidroginastica" });
				return listaDeEsportesAquaticos;
			} else if (arvoreSelecionada == 2) {
				listaDeEsportesAquaticos.add(new String[] { "natação", "recreação na água",
						"hidro-ginastica" });
				return listaDeEsportesAquaticos;
			}
			
		}
		return listaDeEsportesAquaticos;

	}
}