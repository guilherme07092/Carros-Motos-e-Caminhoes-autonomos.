package Projeto;

/**
* Moto.java - Classe que constrói o objeto moto .
* @see Veiculo
*/

public class Moto extends Veiculo {

	/**
	 * Construtor da Moto sem Parâmetro
	 * @param x posição x do moto
	 * @param y posição x do moto
	 * @param velocidade velocidade da moto
	 */
	public Moto(int x,int y,int velocidade) {
		super(x,y,velocidade);
	}
	/**
	 * Construtor da Moto com Parâmetro
	 */
	public Moto() {		
		super();
	}
	
};
