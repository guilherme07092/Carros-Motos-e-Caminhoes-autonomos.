package Projeto;

/**
* Caminhão.java - Classe que constrói o objeto caminhão .
* @see Veiculo
*/


public class Caminhao extends Veiculo {

	/**
	 * Construtor do Caminhão sem Parâmetro
	 */
	public Caminhao() {
		super();
	}
	
	/**
	 * Construtor do Caminhão com Parâmetro
	 * @param x posição x do Caminhão 
	 * @param y posição y do Caminhão 
	 * @param velocidade velocidade do Caminhão 
	 */
	public Caminhao(int x,int y,int velocidade) {
		super(x,y,velocidade);
	}
		
}
