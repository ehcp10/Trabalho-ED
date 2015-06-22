package listasDeEsportes;

import java.util.ArrayList;
import java.util.List;

import estruturaDaArvore.No;
import logicaArvore.LogicaDaArvore;

public class EsportesGenericos extends No {

	private int opcao;
	private LogicaDaArvore la = new LogicaDaArvore();

	private List<String[]> listaDeEsportesGenericos;

	public EsportesGenericos(int opcao) {
		super(opcao);
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
		
		la.iniciaNovamente();

	}

	private List<String[]> criaLista(int opcao) {

		switch (opcao) {
		case 7:
			listaDeEsportesGenericos = new ArrayList<>();
			listaDeEsportesGenericos.add(new String[] { "Futsal",
					"Basquete", "Hoquei de Quadra", "Volei" });
			return listaDeEsportesGenericos;
		case 8:
			listaDeEsportesGenericos = new ArrayList<>();
			listaDeEsportesGenericos.add(new String[] { "Futebol",
					"Futebol Americano", "Rugbi" });
			return listaDeEsportesGenericos;
	
		default:
			return null;

		}

	}
}
