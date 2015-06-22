package esportes;

import java.util.Scanner;

import listasDeEsportes.EsportesAquaticos;
import listasDeEsportes.EsportesComBola;
import estruturaDaArvore.No;

public class Aquatico extends No {

	private int op;
	
	public Aquatico(String pergunta) {
		super(pergunta);
	}



	public void decide(){
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(this.getPergunta());
		System.out.println("1-Lago");
		System.out.println("2-Mar");
		System.out.println("3-Piscina");
		System.out.println("4-Não importa");
		System.out.println("5-Não sei");
		this.op = scan.nextInt();
		
		selecionaOpcao(op);
		
		scan.close();
	}

	private void selecionaOpcao(int op) {
		switch (op) {
		case 1:
			super.adionaCaminho("Lago-");
			super.adicionaValorDoCaminho(1);
			new EsportesAquaticos(op).selecionaEsporte(op);;
			break;
		case 2:
			super.adionaCaminho("Mar-");
			super.adicionaValorDoCaminho(2);
			new EsportesAquaticos(op).selecionaEsporte(op);
			break;
		case 3:
			super.adionaCaminho("Rio-");
			super.adicionaValorDoCaminho(3);
			new EsportesAquaticos(3);
			break;
		case 4:
			super.adionaCaminho("Não Importa-");
			super.adicionaValorDoCaminho(4);
			new EsportesAquaticos(op).selecionaEsporte(op);
			break;
		case 5:
			super.adionaCaminho("Não sei");
			super.adicionaValorDoCaminho(5);
			new EsportesAquaticos(op).selecionaEsporte(op);
			break;

		default:
			System.out.println("Opcao Inválida");
			break;
		}
	}

}
