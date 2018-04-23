package Projeto;

/**
* Caminh�o.java - Classe que constr�i o objeto caminh�o .
* @see Veiculo
*/


public class Caminhao extends Veiculo {

	/**
	 * Construtor do Caminh�o sem Par�metro
	 */
	public Caminhao() {
		super();
	}
	
	/**
	 * Construtor do Caminh�o com Par�metro
	 * @param x posi��o x do Caminh�o 
	 * @param y posi��o y do Caminh�o 
	 * @param velocidade velocidade do Caminh�o 
	 */
	public Caminhao(int x,int y,int velocidade) {
		super(x,y,velocidade);
	}
		
}
