package jogodavelhauninter;

import java.util.Scanner;

public class Humano extends Jogador{
	//Classe filha de Jogador.
	public Scanner entrada = new Scanner(System.in);
	
	public Humano(int jogador){
		//Mostra se o jogador escolhido foi Humano.
		super(jogador);
		this.jogador = jogador;
		System.out.println("Jogador 'Humano' criado!");
	}
	
	@Override
	public void jogar(Tabuleiro tabuleiro){
		Tentativa(tabuleiro);
		tabuleiro.setPosicao(tentativa, jogador);
	}
	
	@Override
	public void Tentativa(Tabuleiro tabuleiro){
		//Mensagens que aparecem em cada rodada para setar a jogada linha e coluna.
		do{
			do{
				System.out.println("* --------  --------------------------  ------- *");
				System.out.print("* Escolha uma Linha:   ------------------------ *");
				tentativa[0] = entrada.nextInt();
				if( tentativa[0] > 3 ||tentativa[0] < 1) {
					System.out.println("* --------  --------------------------  ------- *");
					System.out.println("* ---- Informe outra Linha entre 1, 2 ou 3 ---- *");
					System.out.println("* --------  --------------------------  ------- *");
				}
				}while( tentativa[0] > 3 ||tentativa[0] < 1);
			do{
				System.out.println("* --------  --------------------------  ------- *");
				System.out.print("* Escolha uma Coluna:   ----------------------- *");
				tentativa[1] = entrada.nextInt();
				if(tentativa[1] > 3 ||tentativa[1] < 1) {
					System.out.println("* --------  --------------------------  ------- *");
					System.out.println("* --- Informe outra coluna entre 1, 2 ou 3. --- *");
					System.out.println("* --------  --------------------------  ------- *");
				}
				}while(tentativa[1] > 3 ||tentativa[1] < 1);
			
				tentativa[0]--;
				tentativa[1]--;
				
				if(!checaTentativa(tentativa, tabuleiro)) {
					//Faz a verificação se o espaço está livre para a jogada.
					System.out.println("* --------  --------------------------  ------- *");
					System.out.println("* --------- Este local já foi marcado --------- *");
					System.out.println("* -------------- Tente novamente ---------------*");
					System.out.println("* --------  --------------------------  ------- *");
				}
				}while( !checaTentativa(tentativa, tabuleiro) );
	}

}
