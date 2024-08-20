package projetoFirstPOO;

import java.util.Random;

public class Campeonato {

	Clube[] clubes;
	
	public Campeonato(int tamanho){
		int tam = tamanho;
		if (tam % 2 == 0) {
			clubes = new Clube[tam];
		} else {
			System.out.println("AQUI NAO PODE QUANTIDADE IMPAR NÃO!");
		}
		
	}
	
	void adicionar(Clube clube) {
		boolean adicionou = false;
		for (int i = 0; i < clubes.length; i++) {
			if (clubes[i] == null) {
				clubes[i] = clube;
				adicionou = true;
				break;
			}
		}
		if (!adicionou) {
			System.out.println("TEM ESPAÇO MAIS NÃO!!!");
		}
	}
	
	public void jogarPartida(Clube clube1, Clube clube2) {
		Random random = new Random();
		int golsClube1 = random.nextInt(6);
		int golsClube2 = random.nextInt(6);
		
		System.out.println("O jogo do " + clube1.nome + " contra o " + clube2.nome + " saiu de: " + golsClube1 + " x " + golsClube2 + " respectivamente");
		int saldoGolsOne = golsClube1 - golsClube2;
		int saldoGolsTwo = golsClube2 - golsClube1;
		if (golsClube1 > golsClube2) {
			clube1.ganhar(saldoGolsOne);
			clube2.perdeu(saldoGolsOne);
		} else if (golsClube2 > golsClube1) {
			clube2.ganhar(saldoGolsTwo);
			clube1.perdeu(saldoGolsTwo);
		}else if(golsClube2 == golsClube1) {
			clube1.empatar();
			clube2.empatar();
		}
	}
	
	public void jogarCampeonato() {
		
		int tamVetor = clubes.length;
		System.out.println(tamVetor);
		
		for (int i = 0; i < clubes.length-1; i++) {
			for (int j = i + 1; j < clubes.length; j++) {
				if(clubes[j] != null) {
					System.out.println("-----------------------------");
					jogarPartida(clubes[i], clubes[j]);
					jogarPartida(clubes[j], clubes[i]);
					System.out.println("-----------------------------");
				}else {
					System.out.println("é nulo de alguma forma");
				}
			}
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
		}
		/* Nesse método o primeiro for faz 
		 * com que o primeiro time jogue com todos os proximos times do array.
		 */
	}
	
	public String clasificacao() {
		
		String resultado = "";
		
		
		for (int i = 0; i < clubes.length - 1; i++) {
			for (int j = i + 1; j < clubes.length; j++) {
				if (clubes[i].pontos < clubes[j].pontos ||
		                   (clubes[i].pontos == clubes[j].pontos &&
		                    clubes[i].saldoGols < clubes[j].saldoGols)) {
					Clube temp = clubes[i];
					clubes[i] = clubes[j];
					clubes[j] = temp;
				}
			}
		}
		
		System.out.println("TABELA DE RESULTADOS DO CAMPEONATO");
		
		for (Clube clube : clubes) {
			resultado += clube.nome + "\n Pontos: " + clube.pontos + " | Saldo de gols: " + clube.saldoGols + "\n";
		}
		return resultado;
	}
	
	public void Campeao() {
		System.out.println("Parabéns " + clubes[0].nome + " você foi o CAMPEÃO!!");
	}
}

