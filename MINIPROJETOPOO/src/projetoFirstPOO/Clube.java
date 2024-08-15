package projetoFirstPOO;

public class Clube {
	
	String nome;
	int pontos;
	int saldoGols;
	
	public Clube(String nome) {
		this.nome = nome;
		this.pontos = 0;
		this.saldoGols = 0;
	}
	
	void ganhar(int saldoGols) {
		
		pontos += 3;
		this.saldoGols = saldoGols;
		
	}
	
	void empatar() {
		pontos += 1;
	}
	
	void perdeu(int saldoGols) {
		
		this.saldoGols = saldoGols;
		
	}
	
	public void exibirInfo() {
		
		System.out.println("O nome do clube é "+ this.nome);
		System.out.println("Ele tem essa quantidade de pontos: " + this.pontos);
		System.out.println("O seu saldo de gols é: " + this.saldoGols);
	}

}
