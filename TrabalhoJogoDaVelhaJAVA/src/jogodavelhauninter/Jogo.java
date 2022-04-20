package jogodavelhauninter;

import java.util.Scanner;

public class Jogo {
	private Tabuleiro tabuleiro;
	private int rodada=1, vez=1;
	private Jogador jogador1;
	private Jogador jogador2;
	public Scanner entrada = new Scanner(System.in);
	public Scanner nivelset = new Scanner(System.in);
	public int opcaoD;
	
	public void exibeDificuldade() {
		if(this.opcaoD == 1) {
			System.out.println("-------------------------------------------------");
			System.out.println("-------- Nível Fácil - O computador apenas ------");
			System.out.println("--------------- chuta uma jogada... -------------");
			System.out.println("-------------------------------------------------");
		}else if(this.opcaoD == 2) {
			System.out.println("-------------------------------------------------");
			System.out.println("-------- Nível médio - Será mais complicado -----");
			System.out.println("-------------- fazer com que eu perca! ----------");
			System.out.println("-------------------------------------------------");
		}else if(this.opcaoD == 3) {
			System.out.println("-------------  HAHAHAHHAAHAHAHAHAH! -------------");
			System.out.println("-------------------------------------------------");
			System.out.println("--- Nível Difícil - Você não tem chance Humano!--");
			System.out.println("----- Fui programado para dominar esse jogo! ----");
			System.out.println("-------------------------------------------------");
		}else {
			System.out.println("------------  Oops! Tente denovo --------------");
		}
	}
	
	public Jogo(){
		//Começa o Jogo criando o tabuleiro e iniciando os jogadores.
		tabuleiro = new Tabuleiro();
		tabuleiro.introducaoTela();
		iniciarJogadores();
		while(Jogar());
		tabuleiro.finalizarTela();
	}
	
	public void iniciarJogadores(){
		//Aqui o usuário escolhe se quer humano ou computador.
		System.out.println("-------------------------------------------------");	
		System.out.println("--------  Escolha o Primeiro Jogador...  --------");
		int opt = escolherJogador();
		if(opt == 1) {
			this.jogador1 = new Humano(1);
		}else {
			dificuldade();
			this.jogador1 = new Computador(1);
		}
		System.out.println("-------------------------------------------------");	
		System.out.println("--------  Escolha o segundo Jogador...   --------");
		opt = escolherJogador();
		if(opt == 1) {
			this.jogador2 = new Humano(-1);
		}
		else {
			dificuldade();
			this.jogador2 = new Computador(-1);
		}
				
	}
	
	public void dificuldade() {
		//Nesta parte o jogador pode escolher a dificuldade do computador.
		try {
			Scanner nivelset = new Scanner(System.in);
			System.out.println("-------------------------------------------------");
			System.out.println("-------------- Níveis de Dificuldade ------------");
			System.out.println("-------------------------------------------------");
			System.out.println("---------- Escolha entre os níveis abaixo: ------");
			System.out.println("-------------------- Fácil [1] ------------------");
			System.out.println("-------------------- Médio [2] ------------------");
			System.out.println("------------------- Difícil [3] -----------------");
			System.out.println("-------------------------------------------------");
	
			setOpcao(nivelset.nextInt());
			exibeDificuldade();
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
			
	}
	
	public int escolherJogador(){
		//Opções de jogador
		int opcao;
		do{
			System.out.println("-------------------------------------------------");
			System.out.println("----------------- Humano [1] --------------------");
			System.out.println("--------------- Computador [2] ------------------");
			System.out.println("-------------------------------------------------");
			System.out.println("-------------  DIGITE UMA OPÇÃO -----------------");
			System.out.println("-------------------------------------------------");
			
			opcao = entrada.nextInt();
			System.out.println();
			
		}while(opcao == 1 && opcao == 2);
			return opcao;

	}
	
//	public int getOpcao() {
//		return opcaoD;
//	}

	public void setOpcao(int opcao) {
		if(opcao == 1 || opcao == 2 || opcao == 3) {
			this.opcaoD = opcao;
		}else {
			throw new RuntimeException("-- Você escolheu uma dificuldade que não existe -\n---------  e agora pode ficar complicado! -------");
		}
		
	}
	
	public boolean Jogar(){
		tabuleiro.exibeTabuleiro();		
		if(ganhou() == 0 ){
			System.out.println("");
			System.out.println("*** ** * Rodada " + rodada + " * ** ***");
			
			if(vez()== 1)
				jogador1.jogar(tabuleiro);
			
			if(vez() == 2)
				jogador2.jogar(tabuleiro);
			
			if(tabuleiro.tabuleiroCompleto()){
				tabuleiro.exibeTabuleiro();
				//Se o tabuleiro estiver Cheio mostra a mensagem e finaliza.
				System.out.println("-------------------------------------------------");
				System.out.println("---------------       Oops!    ------------------");
				System.out.println("-------------    Ninguém ganhou   ---------------");
				System.out.println("----------  Desta vez jogue novamente!  ---------");
				System.out.println("-------------------------------------------------");
					return false;
				}
			
				vez++;
				
				rodada++;
				return true;
			}else{
				//Verifica quem ganhou e mostra mensagem
				if(ganhou() == -1 ) {
					System.out.println("-------------------------------------------------");
					System.out.println("------------------ Parabéns! --------------------");
					System.out.println("------------- Jogador 1 vc ganhou!---------------");
					System.out.println("-------------------------------------------------");
				}
				if(ganhou()==1) {
					System.out.println("-------------------------------------------------");
					System.out.println("------------------ Parabéns! --------------------");
					System.out.println("------------- Jogador 2 vc ganhou!---------------");
					System.out.println("-------------------------------------------------");
				}
				return false;
			}
	}
	
	public int vez(){
		// Escolhe a vez de cada jogador
		if(vez%2 == 1) {
			System.out.println("--------------  Vez do Jogador 1  ---------------");
			System.out.println("-------------------------------------------------");
			return 1;
		}
		else {
			System.out.println("--------------  Vez do Jogador 2  ---------------");
			System.out.println("-------------------------------------------------");
			return 2;
		}
	}
	
	public int ganhou(){
		//Faz a leitura de quem ganhou o jogo utilizando os metodos 
		if(tabuleiro.Linhas() == 1) {
			return 1;
		}
		if(tabuleiro.Colunas() == 1) {
			return 1;
		}
		if(tabuleiro.Diagonais() == 1) {
			return 1;
		}
		if(tabuleiro.Linhas() == -1) {
			return -1;
		}
		if(tabuleiro.Colunas() == -1) {
			return -1;
		}
		if(tabuleiro.Diagonais() == -1) {
			return -1;
		}
		return 0;
	}	
}
	


