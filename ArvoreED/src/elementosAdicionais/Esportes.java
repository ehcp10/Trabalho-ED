package elementosAdicionais;

import java.util.Scanner;

import listasDeEsportes.EsportesGenericos;
import esportes.Aerobico;
import esportes.Aquatico;
import esportes.Bola;
import esportes.Motor;
import estruturaDaArvore.No;
import esportes.Luta;

public class Esportes extends No {
	private int op;

	public Esportes(String pergunta) {
		super(pergunta);
	}
	
	public void selecionaEsporte(){
		Scanner scan =  new Scanner(System.in);
		System.out.println(this.getPergunta());
		System.out.println("1-Bola");
		System.out.println("2-Luta");
		System.out.println("3-Aerobica");
		System.out.println("4-Agua");
		System.out.println("5-Motor");
		System.out.println("6-Não Sei");
		System.out.println("7-Não importa");
		
		this.op = scan.nextInt();
		
		selecionaCaminho(op);
		
		scan.close();
		
		
	}

	private void selecionaCaminho(int op) {
		switch (op) {
		case 1:
			super.adicionaValorDoCaminho(1);
			super.adionaCaminho("Bola-");
			System.out.println(getCaminhoPercorrido());
			new Bola("Onde se pratica seu esporte").decide();
			break;
		case 2:
			super.adionaCaminho("Luta-");
			super.adicionaValorDoCaminho(2);
			new Luta("Sua luta envolve").decide();
			break;
		case 3:
			super.adionaCaminho("Aerobico-");
			super.adicionaValorDoCaminho(2);
			new Aerobico("Seu esporte acontece?").decide();
			break;
		case 4:
			super.adionaCaminho("Água-");
			super.adicionaValorDoCaminho(4);
			new Aquatico("Seu esporte acontece?").decide();
			break;
		case 5:
			super.adionaCaminho("Motor-");
			super.adicionaValorDoCaminho(5);
			new Motor("Você prefere").decide();
			break;
		case 6:
			super.adionaCaminho("Não sei-");
			super.adicionaValorDoCaminho(6);
			new EsportesGenericos(op).selecionaEsporte(op);
			break;
		case 7:
			super.adionaCaminho("Não importa-");
			super.adicionaValorDoCaminho(7);
			new EsportesGenericos(op).selecionaEsporte(op);
		default:
			System.out.println("op inválida");
			break;
		}
		
	}

}
