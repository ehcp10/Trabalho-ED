package listasDeEsportes;

import java.util.ArrayList;
import java.util.List;

import estruturaDaArvore.No;
import logicaArvore.LogicaDaArvore;

public class EsportesComBola extends No {
	//private int opcao;
	private LogicaDaArvore la = new LogicaDaArvore();

	private List<String[]> listaDeEsportesComBola;

	public EsportesComBola(int opcao) {
		super(opcao);
		//this.opcao = opcao;
	}

	public void selecionaEsporte(int opcao) {

		System.out.println("Esportes sugeridos");
		for (String[] strings : criaLista(opcao)) {
			for (String string : strings) {
				System.out.println(string);
			}
		}
		System.out.println("O caminho percorrido foi:");
		System.out.println(super.getCaminho());
		la.adicionaCaminho(super.getCaminho());
		la.valoresDosCaminhos(super.getCaminhoPercorrido());
		
		la.iniciaNovamente();

	}

	private List<String[]> criaLista(int opcao) {
		int arvoreSelecionada = la.arvoreIniciada(super.getCaminho());

		switch (opcao) {
		case 1:
			if (arvoreSelecionada == 1) {
				listaDeEsportesComBola = new ArrayList<>();
				listaDeEsportesComBola.add(new String[] { "Tenis","Squash" });
				return listaDeEsportesComBola;
			} else  {
				listaDeEsportesComBola = new ArrayList<>();
				listaDeEsportesComBola.add(new String[] { "Futsal", "Basquete",
						"Hoquei de Quadra", "Volei" });
				return listaDeEsportesComBola;
			}

			// listaDeEsportesComBolaQuadra = new ArrayList<>();
			// listaDeEsportesComBolaQuadra.add(new String[] { "Futsal",
			// "Basquete", "Hoquei de Quadra", "Volei" });
			// return listaDeEsportesComBolaQuadra;
		case 2:
			if (arvoreSelecionada == 1) {
				listaDeEsportesComBola = new ArrayList<>();
				listaDeEsportesComBola.add(new String[] { "Tenis", });
				return listaDeEsportesComBola;
			} else if(arvoreSelecionada == 2) {
				listaDeEsportesComBola = new ArrayList<>();
				listaDeEsportesComBola.add(new String[] { "Futebol",
						"Futebol Americano", "Rugbi" });
				return listaDeEsportesComBola;
			}
			
//			listaDeEsportesComBola = new ArrayList<>();
//			listaDeEsportesComBola.add(new String[] { "Futebol",
//					"Futebol Americano", "Rugbi" });
//			return listaDeEsportesComBola;
		case 3:
			if (arvoreSelecionada == 1) {
				listaDeEsportesComBola = new ArrayList<>();
				listaDeEsportesComBola.add(new String[] { "Tenis", });
				return listaDeEsportesComBola;
			} else if(arvoreSelecionada == 2) {
				listaDeEsportesComBola = new ArrayList<>();
				listaDeEsportesComBola.add(new String[] { "Volei de areia",
						"Futebol de Areia", "FutVolei", "Altinha" });
				return listaDeEsportesComBola;
			}
			
			
			
//			listaDeEsportesComBola = new ArrayList<>();
//			listaDeEsportesComBola.add(new String[] { "Volei de areia",
//					"Futebol de Areia", "FutVolei", "Altinha" });
//			return listaDeEsportesComBola;
		default:
			return listaDeEsportesComBola;

		}

	}

}
