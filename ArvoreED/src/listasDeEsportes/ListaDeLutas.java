package listasDeEsportes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import logicaArvore.LogicaDaArvore;
import estruturaDaArvore.Arvore;

public class ListaDeLutas {
	private int opcao;
	private LogicaDaArvore la = new LogicaDaArvore();

	private List<String[]> listaDeLutas;

	public ListaDeLutas(int opcao) {
		this.opcao = opcao;
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
			la.iniciaNovamente();
			break;

		}

	}

	private List<String[]> criaLista(int opcao) {

		switch (opcao) {
		case 1:
			listaDeLutas = new ArrayList<>();
			listaDeLutas.add(new String[] { "Boxe" });
			return listaDeLutas;
		case 2:
			listaDeLutas = new ArrayList<>();
			listaDeLutas.add(new String[] { "Muay-Thai","Taekwondo","Kung-Fu", "Carate" });
			return listaDeLutas;
		case 3:
			listaDeLutas = new ArrayList<>();
			listaDeLutas.add(new String[] { "Jiu Jitsu", "Judô" });
			return listaDeLutas;
		case 4:
			listaDeLutas = new ArrayList<>();
			listaDeLutas.add(new String[] { "Boxe", "kung-Fu", "Judô" });
			return listaDeLutas;
		case 5:
			listaDeLutas = new ArrayList<>();
			listaDeLutas.add(new String[] { "Boxe", "kung-Fu", "Judô" });
			return listaDeLutas;
		}
		return null;

	}

}
