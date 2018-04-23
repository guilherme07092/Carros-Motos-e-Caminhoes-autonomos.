package Projeto;

/**
* Carro.java - Classe que constrói o objeto carro .
* @see Veiculo
*/

public class Carro extends Veiculo {

	
	/**
	 * Construtor do Carro sem Parâmetro
	 */
	public Carro() {
		super();
	}
	
	/**
	 * Construtor do Carro com Parâmetro
	 * @param x posição x do carro
	 * @param y posição x do carro
	 * @param velocidade velocidade do carro
	 */
	public Carro(int x,int y,int velocidade) {	
		super(x,y,velocidade);	
	}
	
}
