package Projeto;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
* Main.java - Usada para a criação dos obejtos e das condições .
* @author Guilherme Bazzo
* @version 1.0
*/


public class Main {
	public static void main(String[]args) {
	
		Random generator = new Random();	
		
		Mundo mapa = new Mundo();
		
		
		/**
		 * Cria 10 carros iniciais 
		 */
		ArrayList <Carro> vei_Carro = new ArrayList<>();
		for(int i = 0; i < 10;i++) {
			vei_Carro.add(new Carro(generator.nextInt(30),generator.nextInt(60),2));	
		}
		
		
		/**
		 * Cria 10 motos iniciais 
		 */
		ArrayList <Moto> vei_Moto = new ArrayList<>();
		for(int i = 0; i < 10;i++) {
			vei_Moto.add(new Moto(generator.nextInt(30),generator.nextInt(60),3));	
		}
		
		/**Cria 10 caminhões iniciais 
		 * 
		 */
		ArrayList <Caminhao> vei_Caminhao = new ArrayList<>();
		for(int i = 0; i < 10;i++) {
			vei_Caminhao.add(new Caminhao(generator.nextInt(30),generator.nextInt(60),1));	
		}
	
		
		Timer timer = new Timer();
		
		/**
		 * define o tempo de atulização
		 */
		final long SEGUNDOS = (250 * 1);
		
		TimerTask tarefa = new TimerTask(){
			@Override
			public void run() {

				/**
				 * Desenha Mundo
				 */
				mapa.desenhaMundo(vei_Moto,vei_Carro,vei_Caminhao);
				
				
				/**
				 * Movimenta	o Carro
				 */
				for(int i = 0 ; i < vei_Carro.size(); i++) {					
					vei_Carro.get(i).move(2);					
				};
				
				/**
				 * Movimenta	o Moto
				 */
				for(int i = 0 ; i < vei_Moto.size(); i++) {					
					vei_Moto.get(i).move(3);					
				};
				
				/**
				 * Movimenta	o Caminhão
				 */
				for(int i = 0 ; i < vei_Caminhao.size(); i++) {					
					vei_Caminhao.get(i).move(1);					
				};
				
				
				/**
				 * Verifica colisão entre carro e moto
				 */
				for(int i = 0; i < vei_Carro.size(); i++) {
					for(int j = 0; j < vei_Moto.size(); j++) {
						if(vei_Carro.get(i).getX() == vei_Moto.get(j).getX() && vei_Carro.get(i).getY() == vei_Moto.get(j).getY()) {				
							vei_Moto.remove(j);	
						};			
					};
				};	
				
				/**
				 * Verifica colisão entre Caminhão e moto
				 */
				for(int i = 0; i < vei_Caminhao.size(); i++) {
					for(int j = 0; j < vei_Moto.size(); j++) {
						if(vei_Caminhao.get(i).getX() == vei_Moto.get(j).getX() && vei_Caminhao.get(i).getY() == vei_Moto.get(j).getY()) {				
							vei_Moto.remove(j);	
						};			
					};
				};	
				
				/**
				 * Verifica colisão entre Caminhão e carro
				 */
				for(int i = 0; i < vei_Caminhao.size(); i++) {
					for(int j = 0; j < vei_Carro.size(); j++) {
						if(vei_Caminhao.get(i).getX() == vei_Carro.get(j).getX() && vei_Caminhao.get(i).getY() == vei_Carro.get(j).getY()) {				
							vei_Carro.remove(j);		
						};			
					};
				};
				
				/**
				 * Verifica colisão entre carro e carro 
				 */
				for(int i = 0; i < vei_Carro.size(); i++) {
					for(int j = 0; j < vei_Carro.size(); j++) {
						if(i != j) {	
							if(vei_Carro.get(i).getX() == vei_Carro.get(j).getX() && vei_Carro.get(i).getY() == vei_Carro.get(j).getY()) {				
								vei_Carro.remove(j);
								vei_Carro.remove(i);	
							};			
						};
					};
				};
				
				/**
				 * Verifica colisão entre moto e moto 
				 */
				for(int i = 0; i < vei_Moto.size(); i++) {
					for(int j = 0; j < vei_Moto.size(); j++) {
						if(i != j) {	
							if(vei_Moto.get(i).getX() == vei_Moto.get(j).getX() && vei_Moto.get(i).getY() == vei_Moto.get(j).getY()) {				
								vei_Moto.remove(j);
								vei_Moto.remove(i);	
							};			
						};
					};
				};
				
				/**
				 * Verifica colisão entre caminhão e caminhão 
				 */
				for(int i = 0; i < vei_Caminhao.size(); i++) {
					for(int j = 0; j < vei_Caminhao.size(); j++) {
						if(i != j) {	
							if(vei_Caminhao.get(i).getX() == vei_Caminhao.get(j).getX() && vei_Caminhao.get(i).getY() == vei_Caminhao.get(j).getY()) {				
								vei_Caminhao.remove(j);
								vei_Caminhao.remove(i);	
							};			
						};
					};
				};
				
				/**
				 * Gera um mundo sem veículos para a comparação
				 */
				mapa.mundo();
				
				/**
				 * Verifica se o carro tá na fábrica , se tiver cria outro objeto
				 */
				for(int i = 0;i<vei_Carro.size();i++) {
					if(vei_Carro.get(i).getFabrica() == false) {
						if(mapa.verificaoPos(vei_Carro.get(i).getX(), vei_Carro.get(i).getY()) == 2) {
							vei_Carro.get(i).setFabrica(true);
							vei_Carro.add(new Carro(generator.nextInt(30),generator.nextInt(60),2));	
						}else {
							vei_Carro.get(i).setFabrica(false);
						}
					}else {
						if(mapa.verificaoPos(vei_Carro.get(i).getX(), vei_Carro.get(i).getY()) == 2) {
							vei_Carro.get(i).setFabrica(true);
						}else {
							vei_Carro.get(i).setFabrica(false);
						}
					}
				};
				
				/**
				 * Verifica se o caminhão tá na fábrica , se tiver cria outro objeto
				 */
				for(int i = 0;i<vei_Caminhao.size();i++) {
					if(vei_Caminhao.get(i).getFabrica() == false) {
						if(mapa.verificaoPos(vei_Caminhao.get(i).getX(), vei_Caminhao.get(i).getY()) == 2) {
							vei_Caminhao.get(i).setFabrica(true);
							vei_Caminhao.add(new Caminhao(generator.nextInt(30),generator.nextInt(60),1));	
						}else {
							vei_Caminhao.get(i).setFabrica(false);
						}
					}else {
						if(mapa.verificaoPos(vei_Caminhao.get(i).getX(), vei_Caminhao.get(i).getY()) == 2) {
							vei_Caminhao.get(i).setFabrica(true);
						}else {
							vei_Caminhao.get(i).setFabrica(false);
						}
					}
				};
				
				/**
				 * Verifica se a moto tá na fábrica, se tiver cria outro objeto
				 */
				for(int i = 0;i<vei_Moto.size();i++) {
					if(vei_Moto.get(i).getFabrica() == false) {
						if(mapa.verificaoPos(vei_Moto.get(i).getX(), vei_Moto.get(i).getY()) == 2) {
							vei_Moto.get(i).setFabrica(true);
							vei_Moto.add(new Moto(generator.nextInt(30),generator.nextInt(60),3));	
						}else {
							vei_Moto.get(i).setFabrica(false);
						}
					}else {
						if(mapa.verificaoPos(vei_Moto.get(i).getX(), vei_Moto.get(i).getY()) == 2) {
							vei_Moto.get(i).setFabrica(true);
						}else {
							vei_Moto.get(i).setFabrica(false);
						}
					}
				};
				
				/**
				 * Contador de Objetos
				 */
				System.out.printf("Carro: %d\n",vei_Carro.size()); 
				System.out.printf("Moto: %d\n",vei_Moto.size());
				System.out.printf("Caminhao: %d\n",vei_Caminhao.size());
				
				
			};
		};
			
		 while(vei_Caminhao.size() != 0 ) {
			
			timer.scheduleAtFixedRate(tarefa, 0, SEGUNDOS);				
			
		};
			
	};
};