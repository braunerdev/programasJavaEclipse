package jogodavelhauninter;

import java.util.Random;
import java.util.Scanner;

public class Computador extends Jogador{
	
	
	//Classe filha de jogador
	public Scanner entrada = new Scanner(System.in);
	
	public Computador(int computador){
		//Mostra se o jogador escolhido foi computador.
		super(computador);
		this.computador = computador;
		System.out.println("          Jogador 'Computador' criado!          ");
			
	}
	
	

	public int geraJogada() {
		Random lincol = new Random();
				
		return lincol.nextInt(3) + 1;
	}
	
	@Override
	public void jogar(Tabuleiro tabuleiro){
		Tentativa(tabuleiro);
		tabuleiro.setPosicao(tentativa, computador);
	}
	
	
	
	@Override
	public void Tentativa(Tabuleiro tabuleiro){
		do{
			do{
				tentativa[0] = geraJogada();
				System.out.println(tentativa[0]);
				}while(tentativa[0] > 3 ||tentativa[0] < 1);
			do{
				
				tentativa[1] = geraJogada();
				System.out.println(tentativa[1]);
				}while(tentativa[1] > 3 ||tentativa[1] < 1);
			
			tentativa[0]--;
			tentativa[1]--;
				
			}while( !checaTentativa(tentativa, tabuleiro) );
		
	}
}
