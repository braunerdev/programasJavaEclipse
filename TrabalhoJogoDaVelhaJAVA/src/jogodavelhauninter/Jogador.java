package jogodavelhauninter;

public abstract class Jogador {
	//Instancia os jogadores essa classe é abstrata.
	protected int[] tentativa = new int[2];
	protected int jogador;
	protected int computador;
	public int opcaoD;
	
	
		
	public Jogador(int jogador) {
		if(jogador==1)
			this.jogador = jogador;
		else if(jogador==2)
			this.computador = -1;
	}
	
//	public void OpcaoDificuldade(int opcaoD) {
//		this.opcaoD = opcaoD;
//	}
	
	
		
	public abstract void jogar(Tabuleiro tabuleiro);
	
	public abstract void Tentativa(Tabuleiro tabuleiro);
	
	public boolean checaTentativa(int[] tentativa, Tabuleiro tabuleiro){
		if(tabuleiro.getPosicao(tentativa) == 0)
			return true;
		else
			return false;
	}
}
