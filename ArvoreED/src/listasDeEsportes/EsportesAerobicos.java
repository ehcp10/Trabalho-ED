package listasDeEsportes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import logicaArvore.LogicaDaArvore;
import estruturaDaArvore.Arvore;
import estruturaDaArvore.No;

public class EsportesAerobicos extends No {
	private int opcao;
	private LogicaDaArvore la = new LogicaDaArvore();
	// private No no;

	private List<String[]> listaDeEsportesAerobicos;

	public EsportesAerobicos(int opcao) {
		super(opcao);
		this.opcao = opcao;
	}

	public void selecionaEsporte(int opcao) {

		System.out.println("Esportes sugeridos:");
		for (String[] strings : criaLista(opcao)) {
			for (String string : strings) {
				System.out.println(string);
			}
		}
		la.iniciaNovamente();

	}

	private List<String[]> criaLista(int opcao) {
		int arvoreSelecionada = la.arvoreIniciada(super.getCaminho());

		switch (opcao) {
		case 1:
			if (arvoreSelecionada == 1) {
				listaDeEsportesAerobicos = new ArrayList<>();
				listaDeEsportesAerobicos.add(new String[] { "" });
				return listaDeEsportesAerobicos;
			} else {
				listaDeEsportesAerobicos = new ArrayList<>();
				listaDeEsportesAerobicos.add(new String[] { "Caminhada",
						"Corrida", "marcha atlética" });
				return listaDeEsportesAerobicos;
			}
		case 2:
			if (arvoreSelecionada == 1) {
				listaDeEsportesAerobicos = new ArrayList<>();
				listaDeEsportesAerobicos.add(new String[] { "" });
				return listaDeEsportesAerobicos;
			} else {
				listaDeEsportesAerobicos = new ArrayList<>();
				listaDeEsportesAerobicos.add(new String[] { "Corrida",
						"100 m livres", "200 m livres" });
				return listaDeEsportesAerobicos;
			}
		case 3:

			if (arvoreSelecionada == 1) {
				listaDeEsportesAerobicos = new ArrayList<>();
				listaDeEsportesAerobicos.add(new String[] { "" });
				return listaDeEsportesAerobicos;
			} else {
				listaDeEsportesAerobicos = new ArrayList<>();
				listaDeEsportesAerobicos.add(new String[] { "spinning",
						"jumping", "esteira" });
				return listaDeEsportesAerobicos;
			}
		case 4:
			if (arvoreSelecionada == 1) {
				listaDeEsportesAerobicos = new ArrayList<>();
				listaDeEsportesAerobicos.add(new String[] { "" });
				return listaDeEsportesAerobicos;
			} else {
				listaDeEsportesAerobicos = new ArrayList<>();
				listaDeEsportesAerobicos.add(new String[] { "Caminhada", "esteira" });
				return listaDeEsportesAerobicos;
			}
		case 5:
			if (arvoreSelecionada == 1) {
				listaDeEsportesAerobicos = new ArrayList<>();
				listaDeEsportesAerobicos.add(new String[] { "" });
				return listaDeEsportesAerobicos;
			} else {
				listaDeEsportesAerobicos = new ArrayList<>();
				listaDeEsportesAerobicos.add(new String[] { "Caminhada", "Esteira" });
				return listaDeEsportesAerobicos;
			}

		default:
			System.out.println("Erro");
		}
		return listaDeEsportesAerobicos;

	}
}