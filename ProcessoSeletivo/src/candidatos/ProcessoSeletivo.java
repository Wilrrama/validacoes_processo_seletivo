package candidatos;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		imprimirSelecionados();
	}
	
		//case 3
		static void imprimirSelecionados() {
		String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO", "AUGUSTO"};
		System.out.println("Imprimindo a lista dos candidatos informando o indice");
		
		for (int indice=0; indice < candidatos.length;indice++) {
			System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
		}
		System.out.println();
		
		System.out.println("Forma abreviada de interação for each");
		
		for(String candidato:candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
		
	}
	//case 2
	static void selecaoCandidatos() {
		String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO", "AUGUSTO", "MONICA", "FRABRICIO", "MIRELA", "DANIELA"};	
	
		int candidatosSelecionados = 0;
		int candidatoAtual=0;
		double salarioBase=2000.0;
		while( candidatosSelecionados < 5 && candidatoAtual <candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato "+ candidato + " Solicitou este valode salário "+ salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	//case 1
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o Candidato");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o Candidato com contra Proposta");
		} else {
			System.out.println("Aguardando demais candidatos");
		}
		
	}
}
