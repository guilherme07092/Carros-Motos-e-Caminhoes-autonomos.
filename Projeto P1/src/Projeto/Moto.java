package Projeto;

/**
* Moto.java - Classe que constr�i o objeto moto .
* @see Veiculo
*/

public class Moto extends Veiculo {

	/**
	 * Construtor da Moto sem Par�metro
	 * @param x posi��o x do moto
	 * @param y posi��o x do moto
	 * @param velocidade velocidade da moto
	 */
	public Moto(int x,int y,int velocidade) {
		super(x,y,velocidade);
	}
	/**
	 * Construtor da Moto com Par�metro
	 */
	public Moto() {		
		super();
	}
	
};
