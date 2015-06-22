package elementosAdicionais;

import java.util.Scanner;

import estruturaDaArvore.No;

public class Sexo extends No {
	

	public Sexo(String pergunta) {
		super(pergunta);

		
	}
	
	@Override
	public String getPergunta() {
		return super.getPergunta();
	}
	
	public void expoeNaTela(){
		int op;
		Scanner scan = new Scanner(System.in);
		System.out.println(this.getPergunta());
		System.out.println("1-Masculino");
		System.out.println("2-Feminino");
		op = scan.nextInt();
		
		switch(op){
		case 1:
			super.adicionaValorDoCaminho(1);
			super.adionaCaminho("Masculino-");
			new CategoriaDeEsporte("Qual seu tipo de esporte?").decideEsporte();

			break;
		case 2:
			super.adionaCaminho("Feminino-");
			super.adicionaValorDoCaminho(2);
			new CategoriaDeEsporte("Qual seu tipo de esporte?").decideEsporte();
			
			break;
		default:
			System.out.println("Não definido");
			break;
		
		}
		scan.close();
	}

	
}
