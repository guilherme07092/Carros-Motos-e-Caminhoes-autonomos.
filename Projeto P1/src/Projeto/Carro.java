package Projeto;

/**
* Carro.java - Classe que constr�i o objeto carro .
* @see Veiculo
*/

public class Carro extends Veiculo {

	
	/**
	 * Construtor do Carro sem Par�metro
	 */
	public Carro() {
		super();
	}
	
	/**
	 * Construtor do Carro com Par�metro
	 * @param x posi��o x do carro
	 * @param y posi��o x do carro
	 * @param velocidade velocidade do carro
	 */
	public Carro(int x,int y,int velocidade) {	
		super(x,y,velocidade);	
	}
	
}
