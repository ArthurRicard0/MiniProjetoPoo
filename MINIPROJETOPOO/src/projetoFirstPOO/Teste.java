package projetoFirstPOO;

public class Teste {
	public static void main(String[] args) {
		
	Clube clube1 = new Clube("São Paulo");
        Clube clube2 = new Clube("Flamengo");
        Clube clube3 = new Clube("Vascão");
        Clube clube4 = new Clube("Palmeiras");
        
        //Clube[] clubes = {clube1, clube2, clube3, clube4};
        
        Campeonato campeonato = new Campeonato(4);
        campeonato.adicionar(clube1);
        //clube1.exibirInfo();
        campeonato.adicionar(clube2);
        //clube2.exibirInfo();
        campeonato.adicionar(clube3);
        //clube3.exibirInfo();
        campeonato.adicionar(clube4);
        //clube4.exibirInfo();
        
        campeonato.jogarCampeonato();
        
        System.out.println(campeonato.clasificacao());
        
        campeonato.Campeao();
        
	}
}
