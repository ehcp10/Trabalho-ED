package esportes;

import java.util.Scanner;

import listasDeEsportes.EsportesAerobicos;
import listasDeEsportes.ListaDeLutas;
import estruturaDaArvore.No;

public class Aerobico extends No {

	public Aerobico(String pergunta) {
		super(pergunta);
	}

	private int op;

	public void decide() {

		Scanner scan = new Scanner(System.in);

		System.out.println(this.getPergunta());
		System.out.println("1-Ar livre");
		System.out.println("2-Pista");
		System.out.println("3-Academia");
		System.out.println("4-Não importa");
		System.out.println("5-Não sei");
		this.op = scan.nextInt();

		selecionaOpcao(op);

		scan.close();
	}

	private void selecionaOpcao(int op) {

		switch(op){
		case 1:
			super.adionaCaminho("Ar livre");
			super.adicionaValorDoCaminho(1);
			new EsportesAerobicos(op).selecionaEsporte(op);
			break;
		case 2:
			super.adionaCaminho("Pista");
			super.adicionaValorDoCaminho(2);
			new EsportesAerobicos(op).selecionaEsporte(op);
			
			break;
		case 3:
			super.adionaCaminho("Academia");
			super.adicionaValorDoCaminho(3);
			new EsportesAerobicos(op).selecionaEsporte(op);
			break;
		case 4:
			super.adionaCaminho("Não Sei");
			super.adicionaValorDoCaminho(4);
			new EsportesAerobicos(op).selecionaEsporte(op);
			break;
		case 5:
			super.adionaCaminho("Não Importa");
			super.adicionaValorDoCaminho(5);
			new EsportesAerobicos(op).selecionaEsporte(op);
			break;
		
		}


	}

}
