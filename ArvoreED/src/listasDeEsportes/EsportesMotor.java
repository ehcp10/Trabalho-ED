package listasDeEsportes;

import java.util.ArrayList;
import java.util.List;

import logicaArvore.LogicaDaArvore;
import estruturaDaArvore.No;

public class EsportesMotor extends No {
	
	private int opcao;
	private LogicaDaArvore la = new LogicaDaArvore();
	private List<String[]> esportesDeMotor;

	public EsportesMotor(int opcao) {
		super(opcao);
		this.opcao = opcao;

	}
	
	public void selecionaEsporte(int opcao) {
		switch (opcao) {
		case 1:

			System.out.println("Esportes sugeridos:");
			for (String[] strings : criaLista(opcao)) {
				for (String string : strings) {
					System.out.println(string);
				}
			}
			System.out.println("O caminho percorrido foi:");
			System.out.println(super.getCaminho());
			
			la.iniciaNovamente();
			break;

		}

	}

	private List<String[]> criaLista(int opcao) {

		esportesDeMotor = new ArrayList<>();
		switch (opcao) {
		case 1:
			esportesDeMotor.add(new String[] { "24 horas Le Mans", "Stock Car", "endurance" });
						
			return esportesDeMotor;
		case 2:
			esportesDeMotor.add(new String[]{"Formula 1","Fórmula Indy","Protótipos"});
			return esportesDeMotor;
		case 3:
			esportesDeMotor.add(new String[]{"Kart"});
			return esportesDeMotor;
		case 4:
			esportesDeMotor.add(new String[]{"Turismo"});
			return esportesDeMotor;
		case 5:
			esportesDeMotor.add(new String[]{"Turismo"});
		}
		return esportesDeMotor;

	}

}
