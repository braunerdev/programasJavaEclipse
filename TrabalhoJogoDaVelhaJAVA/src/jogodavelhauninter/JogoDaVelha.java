package jogodavelhauninter;

public class JogoDaVelha {
	
	private static Jogo jogo1;

	//Faz com que o jogo come�e.
	public static void main(String[] args) { 
		setJogo1(new Jogo());
	}
	
	public static Jogo getJogo1() {
		return jogo1;
	}

	public static void setJogo1(Jogo jogo1) {
		JogoDaVelha.jogo1 = jogo1;
	
	}

}
/* Criei este jogo com ajuda de tutoriais na internet e n�o foi de inteira autoria minha, mas foi completamente digitado por mim.
Adicionei eu mesmo o todas as fun��es e corrigi in�meros bugs que existiam no projeto inicial, cheguei ainda a criar
outras vers�es mas que n�o atenderam n�o minimo exigido por isso precisei de ajuda para entender a l�gica.
Esta � minha vers�o final depois de bastante tempo.

Fonte na qual come�ei o projeto:
https://www.javaprogressivo.net/2012/10/Como-fazer-um-Jogo-da-Velha-em-Java.html

 Enjoy!

*/