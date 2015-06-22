package estruturaDaArvore;

import java.util.Scanner;

import elementosAdicionais.Sexo;

public class Arvore extends No {

	public Arvore(String pergunta) {
		super(pergunta);
	}

	public void inicia() {
		int opSelecionada;
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.getPergunta());

		System.out.println("1-Menos de 15 anos");
		System.out.println("2-Mais de 60");
		System.out.println("3-Entre 15 e 60");

		opSelecionada = scanner.nextInt();

		if (opSelecionada == 1) {
			super.adionaCaminho("Menos de 15 anos-");
			super.adicionaValorDoCaminho(1);
			new Sexo("Qual seu sexo?").expoeNaTela();
		}

		if (opSelecionada == 2) {
			super.adionaCaminho("Mais de 60 anos-");
			super.adicionaValorDoCaminho(2);
			new Sexo("Qual seu sexo?").expoeNaTela();

		}
		if (opSelecionada == 3) {
			super.adicionaValorDoCaminho(3);
			super.adionaCaminho("Entre 15 e 60 anos-");
			new Sexo("Qual seu sexo?").expoeNaTela();

		}
		scanner.close();
	}

	
	public static void main(String[] args) {

		Arvore arv = new Arvore("Qual sua idade?");
		arv.inicia();


	}
}
