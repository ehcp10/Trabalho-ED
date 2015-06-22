package esportes;

import java.util.Scanner;

import listasDeEsportes.EsportesAquaticos;
import listasDeEsportes.EsportesComBola;
import listasDeEsportes.EsportesMotor;
import estruturaDaArvore.No;

public class Motor extends No {

	private int op;
	
	public Motor(String pergunta) {
		super(pergunta);
	}



	public void decide(){
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(this.getPergunta());
		System.out.println("1-Turismo");
		System.out.println("2-Rodas expostas");
		System.out.println("3-Kart");
		System.out.println("4-N�o importa");
		System.out.println("5-N�o sei");
		this.op = scan.nextInt();
		
		selecionaOpcao(op);
		
		scan.close();
	}

	private void selecionaOpcao(int op) {
		switch (op) {
		case 1:
			super.adionaCaminho("Turismo-");
			super.adicionaValorDoCaminho(1);
			new EsportesMotor(op).selecionaEsporte(op);
			break;
			
		case 2:
			super.adionaCaminho("Rodas Expostas-");
			super.adicionaValorDoCaminho(2);
			new EsportesMotor(op).selecionaEsporte(op);
			break;
		case 3:
			super.adionaCaminho("Kart-");
			super.adicionaValorDoCaminho(3);
			new EsportesMotor(op).selecionaEsporte(op);
			break;
		case 4:
			super.adionaCaminho("N�o Sei-");
			super.adicionaValorDoCaminho(3);
			new EsportesMotor(op).selecionaEsporte(op);
			break;
		case 5:
			super.adionaCaminho("N�o Importa-");
			super.adicionaValorDoCaminho(3);
			new EsportesMotor(op).selecionaEsporte(op);
			break;
		default:
			System.out.println("Opcao Inv�lida");
			break;
		}
	}

}