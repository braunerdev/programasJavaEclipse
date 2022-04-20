package jogodavelhauninter;

public class JogoDaVelha {
	
	private static Jogo jogo1;

	//Faz com que o jogo começe.
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
/* Criei este jogo com ajuda de tutoriais na internet e não foi de inteira autoria minha, mas foi completamente digitado por mim.
Adicionei eu mesmo o todas as funções e corrigi inúmeros bugs que existiam no projeto inicial, cheguei ainda a criar
outras versões mas que não atenderam não minimo exigido por isso precisei de ajuda para entender a lógica.
Esta é minha versão final depois de bastante tempo.

Fonte na qual começei o projeto:
https://www.javaprogressivo.net/2012/10/Como-fazer-um-Jogo-da-Velha-em-Java.html

 Enjoy!

*/