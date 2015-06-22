package esportes;

import java.util.Scanner;

import listasDeEsportes.EsportesComBola;
import listasDeEsportes.EsportesGenericos;
import estruturaDaArvore.No;

public class Bola extends No {
	
	private int op;

	public Bola(String pergunta) {
		super(pergunta);
	}
	
	public void decide(){
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(this.getPergunta());
		System.out.println("1-Quadra");
		System.out.println("2-Grama");
		System.out.println("3-Areia");
		System.out.println("4-N�o importa");
		System.out.println("5-N�o sei");
		this.op = scan.nextInt();
		
		selecionaOpcao(op);
		
		scan.close();
	}

	private void selecionaOpcao(int op) {
		switch (op) {
		case 1:
			super.adionaCaminho("Quadra");
			super.adicionaValorDoCaminho(1);
			new EsportesComBola(op).selecionaEsporte(op);
			break;
		case 2:
			super.adionaCaminho("Grama");
			super.adicionaValorDoCaminho(2);
			new EsportesComBola(op).selecionaEsporte(op);;
			break;
		case 3:
			super.adionaCaminho("Areia");
			super.adicionaValorDoCaminho(3);
			new EsportesComBola(op).selecionaEsporte(op);;
			break;
		case 4:
			super.adionaCaminho("N�o sei");
			super.adicionaValorDoCaminho(4);
			new EsportesComBola(op).selecionaEsporte(op);
			break;
		case 5:
			super.adionaCaminho("N�o Importa");
			super.adicionaValorDoCaminho(1);
			new EsportesComBola(op).selecionaEsporte(8);
			break;
		default:
			System.out.println("Opcao Inv�lida");
			break;
		}
	}

}
