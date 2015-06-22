package logicaArvore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import estruturaDaArvore.Arvore;
import estruturaDaArvore.No;

public class LogicaDaArvore {

	
	private List<String> caminhosPercorridos = new ArrayList<String>();
	//private static List<List<No>> listaDeCaminhos = new ArrayList<>();
	private List <List<Integer>>numerosDosCaminhos = new ArrayList<List<Integer>>();

	public static Map<List<No>, List<No>> mapaDeCaminhos = new HashMap();
	int arvoreParaIniciar;
	
	public int arvoreIniciada(StringBuilder stringBuilder){
		String string = stringBuilder.toString();
		String [] caminho = string.split("-");
		
		int posicaoDaCategoria = 1;
		
		for (int i = 0; i < caminho.length; i++) {
			if(caminho[i].equals("coletivo")){
				posicaoDaCategoria = 1;
				return posicaoDaCategoria;
				
			}else if (caminho[i].equals("individual")){
				posicaoDaCategoria = 2;
				return posicaoDaCategoria;
			}
		}
		return posicaoDaCategoria;
	}
	
	public void adicionaCaminho(StringBuilder sb){
		
		String stringCaminho = sb.toString();
		
		caminhosPercorridos.add(stringCaminho);
		
		sb.setLength(0);
		
	}
	
	public void valoresDosCaminhos(List<Integer> listaDeValoresDeCaminhos){
		numerosDosCaminhos.add(listaDeValoresDeCaminhos);
		listaDeValoresDeCaminhos.clear();
	}
	
	/**Este metodo inicia uma nova consulta restartando a arvore
	 * @return 
	 * **/
	public static void iniciaNovamente() {
		int opcaoDeInicio;
		System.out.println("");
		System.out.println("Você quer iniciar novamente?");
		System.out.println("1-Sim\n2-Não");
		Scanner scan = new Scanner(System.in);
		opcaoDeInicio = scan.nextInt();
		if (opcaoDeInicio == 1) {
			new Arvore("Qual sua idade?").inicia();
		} 
		scan.close();

	}
}
