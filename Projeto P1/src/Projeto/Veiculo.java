package Projeto;
import java.util.Random;

/**
* Veiculo.java - Essa classe é a base das classes Carro, Caminhão e Moto.
*/
public class Veiculo {

	/**
	 * Construtor do Veículo
	 * @param x2 posição x dos veículos  
	 * @param y2 posição y dos veículos  
	 * @param velocidade velocidade dos veículos  
	 */
	public Veiculo(int x2, int y2,int velocidade) {
		x = x2;
		y = y2;
	}
	
	/**
	 * Construtor sem Parâmetro do Veículo
	 */
	public Veiculo() {		
	};
	
	/**
	 * Esse método pega a posição x dos veículos e retorna para ser usado
	 * @return Retorna a posição x dos veículos
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Esse método pega a posição y dos veículos e retorna para ser usado
	 * @return Retorna a posição y dos veículos
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Esse método verifica se o objeto está na fábrica ou não
	 * @return retorna se o objeto está na fábrica ou não
	 */
	public Boolean getFabrica() {
		
		return fabrica;
	};
	
	/**
	 * Muda a verificação da fábrica
	 * @param ver Essa parâmetro serve para mudar se o veículo estiver na fábrica ou não
	 */
	public void setFabrica(Boolean ver){	
		fabrica = ver;	
	}
	
	/**
	 * Faz os objetos andar aleatoriamente 
	 * @param velocidade define a velocidade dos objetos
	 */
	public void move(int velocidade){		
	
		if(velocidade == 1) {
			Random Gerador = new Random();
			int controle = Gerador.nextInt(4);
			
			if(controle == 0) {		
				if(y == 59) {
					y = 0;	
				}else {		
					y = y + 1;
				};	
			}else if(controle == 1) {		
				if(x == 29) {
					x = 0;		
				}else {				
					x = x+1;
				};
			}else if(controle == 2) {			
				if(x == 0) {			
					x = 29;					
				}else {
					x = x-1;
				};
			}else if(controle == 3) {	
				if(y == 0) {
					y = 59;
				}else {
					y = y -1;			
				};
			};
		};
		if(velocidade == 2) {
			Random Gerador = new Random();
			int Controle2 = Gerador.nextInt(4);
			
			if(Controle2 == 0) {
				if(y == 59) {
					y = 1;
				}else if( y == 58) {
					y = 0;
				}else {
					y = y + 2;
				};
			}else if(Controle2 == 1) {
				if(x == 29) {
					x = 1;
				}else if(x ==  28) {
					x = 0;
				}else {
					x = x + 2;
				};
			}else if(Controle2 == 2) {
				if(x == 0) {
					x = 28;			
				}else if(x == 1) {
					x = 29;
				}else {
					x = x - 2;	
				};
				
			}else if(Controle2 == 3) {
				if(y == 0) {
					y = 58;
				}else if(y == 1) {
					y = 59;
				}else {
					y = y - 2;
				};	
			};	
		};
		if(velocidade == 3) {
			Random Gerador = new Random();
			int controle = Gerador.nextInt(4);
			if(controle == 0) {
				if(y == 57) {
					y = 0;
				}else if(y == 58) {					
					y = 1;
				}else if (y == 59) {
					y = 2;					
				}else {
					y = y + 3;
				};			
			}else if(controle == 1) {
				if(x == 27) {
					x = 0;
				}else if(x == 28) {
					x = 1;
				}else if(x == 29) {
					x = 2;
				}else {
					x = x + 3;
				};			
			}else if(controle == 2) {
				if(y == 0) {
					y = 57;
				}else if(y == 1) {
					y = 58;
				}else if(y == 2) {			
					y=59;
				}else {
					y = y-3;
				};
			}else if(controle == 3) {
				if(x == 0) {
					x = 27;
				}else if(x == 1) {
					x = 28;
				}else if(x == 2) {
					x = 29;
				}else {
					x = x - 3;
				}		
			}	
		
		};
	};
	
	private int x;
	private int y;
	private Boolean fabrica = false;

}
