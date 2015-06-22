package esportes;

import java.util.Scanner;

import listasDeEsportes.ListaDeLutas;
import estruturaDaArvore.No;

public class Luta extends No {
	private int op;

	public Luta(String pergunta) {
		super(pergunta);
	}

	public void decide() {

		Scanner scan = new Scanner(System.in);

		System.out.println(this.getPergunta());
		System.out.println("1-M�os");
		System.out.println("2-M�os e p�s");
		System.out.println("3-Solo");
		System.out.println("4-N�o importa");
		System.out.println("5-N�o sei");
		this.op = scan.nextInt();

		selecionaOpcao(op);

		scan.close();
	}

	private void selecionaOpcao(int op) {
		
		switch(op){
		case 1:
			super.adionaCaminho("M�os");
			super.adicionaValorDoCaminho(1);
			new ListaDeLutas(op).selecionaEsporte(op);
			break;
		case 2:
			super.adionaCaminho("M�os e P�s");
			super.adicionaValorDoCaminho(2);
			new ListaDeLutas(op).selecionaEsporte(op);
			
			break;
		case 3:
			super.adionaCaminho("Solo");
			super.adicionaValorDoCaminho(3);
			new ListaDeLutas(op).selecionaEsporte(op);
			break;
		case 4:
			super.adionaCaminho("N�o Sei");
			super.adicionaValorDoCaminho(4);
			new ListaDeLutas(op).selecionaEsporte(op);
			break;
		case 5:
			super.adionaCaminho("N�o Importa");
			super.adicionaValorDoCaminho(5);
			new ListaDeLutas(op).selecionaEsporte(op);
			break;
		
		}

	}

}
