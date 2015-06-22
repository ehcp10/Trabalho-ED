package elementosAdicionais;

import java.util.Scanner;

import estruturaDaArvore.No;

public class CategoriaDeEsporte extends No {
	
	private int op;
	

	public CategoriaDeEsporte(String pergunta) {
		super(pergunta);
		
	}

	public void decideEsporte() {
		Scanner scan = new Scanner(System.in);
		System.out.println(this.getPergunta());
		System.out.println("1-Coletivo");
		System.out.println("2-Individaul");
		System.out.println("3-Não importa");
		System.out.println("4-Não Sei");
		
		op = scan.nextInt();
		decideCaminho(op);
		
		scan.close();
	}

	private void decideCaminho(int opcao) {
		switch (opcao) {
		case 1:
			super.adicionaValorDoCaminho(1);
			super.adionaCaminho("coletivo-");
			new Esportes("Seu esporte envolve: ").selecionaEsporte();
		
			break;
		case 2:
			super.adicionaValorDoCaminho(2);
			super.adionaCaminho("individual-");
			new Esportes("Seu esporte envolve: ").selecionaEsporte();
			break;
		case 3:

			super.adicionaValorDoCaminho(3);
			super.adionaCaminho("Não importa-");
			new Esportes("Seu esporte envolve: ").selecionaEsporte();
			//System.out.println(super.getCaminho());
			break;
		case 4:
			super.adionaCaminho("Não sei-");
			super.adicionaValorDoCaminho(4);
			new Esportes("Seu esporte envolve: ").selecionaEsporte();
			//System.out.println(super.getCaminho());
			break;
		default:
			System.out.println("opção inválida");
			break;

		}
	}
}
