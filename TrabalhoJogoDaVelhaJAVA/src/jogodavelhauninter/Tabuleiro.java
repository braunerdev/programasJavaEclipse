package jogodavelhauninter;

public class Tabuleiro {
	//Instanciando a matriz 3x3 para o tabuleiro do jogo da velha.
	private int[][] tabuleiro= new int[3][3];
	public Tabuleiro(){}//Contrutor vazio
	
	public void exibeTabuleiro(){ 
		//Atravéz de laços de repetição o tabuleiro é exibido.
		System.out.println("============X======O====X====O======X===========");
		System.out.println("");
		for(int linha=0 ; linha<3 ; linha++){
			System.out.print("*   ====           ");
			for(int coluna=0 ; coluna<3 ; coluna++){
				
				if(tabuleiro[linha][coluna]== - 1){
					System.out.print("_X_");
				}
				
				if(tabuleiro[linha][coluna]== 1){
					System.out.print("_O_");
				}
				
				if(tabuleiro[linha][coluna]== 0){
					System.out.print("___");
				}
								
				if(coluna==0 || coluna==1) {
                    System.out.print("|");
				}
				
			}
			System.out.print("          ====   *");
			System.out.println("");
		}
		System.out.println("");
		System.out.println("============O======X====O====X======O===========");
	}
	
	public int getPosicao(int[] tentativa){
		//Faz a leitura e pega as posiçoes do tabuleiro.
		return tabuleiro[tentativa[0]][tentativa[1]];
	}
	
	public void setPosicao(int[]  tentativa, int jogador){
		//Define as posições no tabuleiro.
		if(jogador == 1) {
			tabuleiro[tentativa[0]][tentativa[1]] =  -1;
		}else {
			tabuleiro[tentativa[0]][tentativa[1]] = 1;
		}
	}
	
	public int Linhas(){ 
		//Faz a varredura das linhas no Tabuleiro.
		for(int linha=0 ; linha<3 ; linha++){
			
			if( (tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) ==  -3) {
				return -1;
			}
			
			if( (tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == 3) {
				return 1;
			}
		}
			
		return 0;
	}
	
	public int Colunas(){
		//Faz a Varredura das colunas no tabuleiro.
		for(int coluna=0 ; coluna<3 ; coluna++){
		
			if( (tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) ==  -3) {
				return -1;
			}
			
			if( (tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == 3) {
				return 1;
			}
		}
		
		return 0;
	}
	
	public int Diagonais(){
		//Faz a varredura das diagonais no tabuleiro.
		if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == - 3) {
			return -1;
		}
	
		if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == 3) {
			return 1;
		}
		
		if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) ==  -3) {
			return -1;
		}
		
		if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == 3) {
			return 1;
		}
		
		return 0;
	}
	
	public void finalizarTela() {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++     Trabalho Uninter     ++++++++++++");
		System.out.println("++++++++++   Programação Orientada   ++++++++++++");
		System.out.println("++++++++++++       a Objetos       ++++++++++++++");
		System.out.println("++++++++++++++                   ++++++++++++++++");
		System.out.println("++++++++++++++++ Jogo da velha ++++++++++++++++++");
		System.out.println("++++++++++++++++     v.1.3     ++++++++++++++++++");
		System.out.println("+++++++++++    Obrigado por jogar   +++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++    Finalizando Jogo...    +++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++   develop by: Clóvis RU.3676101   ++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public void introducaoTela() {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++ Jogo da velha ++++++++++++++++++");
		System.out.println("++++++++++++++++     v.1.3     ++++++++++++++++++");
		System.out.println("+++++++++++                         +++++++++++++");
		System.out.println("++++++++++++++++   1   2   3  +++++++++++++++++++");
		System.out.println("++++++++++++++                  +++++++++++++++++");
		System.out.println("++++++++++++  1   ___|_X_|___    ++++++++++++++++");
		System.out.println("+++++++++++   2   _O_|_O_|_X_     +++++++++++++++");
		System.out.println("++++++++++++  3   _X_|___|_O_    ++++++++++++++++");
		System.out.println("+++++++++++++++                ++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++    Iniciando Jogo ...    +++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++   develop by: Clóvis RU.3676101   ++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public boolean tabuleiroCompleto(){
		//Faz a varredura do Tabuleiro completo
		for(int linha=0 ; linha<3 ; linha++) {
			for(int coluna=0 ; coluna<3 ; coluna++) {
				
				if( tabuleiro[linha][coluna]==0 ) {
					return false;
				}
			}
		}
		return true;
	}
	
}
