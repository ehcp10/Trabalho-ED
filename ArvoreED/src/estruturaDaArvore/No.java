package estruturaDaArvore;

import java.util.ArrayList;
import java.util.List;

public class No {

	private String pergunta;
	private List<No> filhos;
	private static List <Integer>caminhoPercorrido  = new ArrayList<>();
	private static StringBuilder caminho = new StringBuilder();;

	public No(String pergunta) {
		this.pergunta = pergunta;
		filhos = null;
	}
	
	public No(int opcao){
		
	}
	
	public void adicionarFilho(No filho){
		filhos.add(filho);
	}
	
	public String getPergunta() {
		return pergunta;
	}

	public  StringBuilder getCaminho() {
		return caminho;
	}

	public void adionaCaminho(String caminho) {
		this.caminho.append(caminho);
	}
	
	public void adicionaValorDoCaminho(int caminho){
		caminhoPercorrido.add(caminho);
	}
	
	public List<Integer> getCaminhoPercorrido() {
		return caminhoPercorrido;
	}
	

	
}
