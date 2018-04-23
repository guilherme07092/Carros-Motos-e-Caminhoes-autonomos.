package Projeto;

import java.util.ArrayList;

public class Mundo {

	private int tamanho_x = 30;
	private int tamanho_y = 60;
	private int mapa[][];
	
	//Construtor
	public Mundo(){
		mapa = new int[tamanho_x][tamanho_y];		
	};
	
	//Usado para indentificar a posição da Fábrica
	public int verificaoPos(int x,int y) {
		
		return mapa[x][y];
		
	};
	
	//Usado para Gerar um mundo sem veículos
	public void mundo() {
		
		for(int i2 = 0;i2 < tamanho_x;i2++) {
			for(int j2 = 0;j2 < tamanho_y; j2++) {
				mapa[i2][j2] = 0;
				mapa[0][j2] = 1;
				mapa[i2][0] = 1;
				mapa[i2][59] = 1;
				mapa[29][j2] = 1;
				
			};	
		};
		
		//Fábrica 01
		for(int i = 4;i < 7;i++) {
			for(int j = 6;j < 11;j++) {
				mapa[i][j] = 2;		
			}
		};
		
		//Fábrica 02
		for(int i = 4;i < 7;i ++) {
			for(int j = 43; j < 48;j ++ ) {
				mapa[i][j] = 2;
			}
		}
		
		//Fábrica 03
		for(int i = 21;i < 24;i ++) {
			for(int j = 6; j < 11;j ++ ) {
				mapa[i][j] = 2;
			}
		}
		
		//Fábrica 04
		for(int i = 21;i < 24;i ++) {
			for(int j = 43; j < 48;j ++ ) {
				mapa[i][j] = 2;
			}
		}
		
		//Fábrica 05
		for(int i = 13;i < 16;i ++) {
			for(int j = 26; j < 31;j ++ ) {
				mapa[i][j] = 2;
			}
		}
		
	}
	
	//Usado Para Desenha o Mundo com os Objetos
	public void desenhaMundo(ArrayList<Moto> moto,ArrayList<Carro> carro,ArrayList<Caminhao> caminhao) {

		//Criando o mapa com bordas
		for(int i2 = 0;i2 < tamanho_x;i2++) {
			for(int j2 = 0;j2 < tamanho_y; j2++) {
				mapa[i2][j2] = 0;
				mapa[0][j2] = 1;
				mapa[i2][0] = 1;
				mapa[i2][59] = 1;
				mapa[29][j2] = 1;
				
			};	
		};
		
		//Fábrica 01
		for(int i = 4;i < 7;i++) {
			for(int j = 6;j < 11;j++) {
				mapa[i][j] = 2;		
			}
		};
		
		//Fábrica 02
		for(int i = 4;i < 7;i ++) {
			for(int j = 43; j < 48;j ++ ) {
				mapa[i][j] = 2;
			}
		}
		
		//Fábrica 03
		for(int i = 21;i < 24;i ++) {
			for(int j = 6; j < 11;j ++ ) {
				mapa[i][j] = 2;
			}
		}
		
		//Fábrica 04
		for(int i = 21;i < 24;i ++) {
			for(int j = 43; j < 48;j ++ ) {
				mapa[i][j] = 2;
			}
		}
		
		
		//Fábrica 05
		for(int i = 13;i < 16;i ++) {
			for(int j = 26; j < 31;j ++ ) {
				mapa[i][j] = 2;
			}
		}

		//Coloca os Carros no Mapa
		for(int i = 0; i < carro.size(); i++ ) {
			mapa[carro.get(i).getX()][carro.get(i).getY()] = 4;		
		};
		//Coloca as Motos no Mapa
		for(int i = 0;i < moto.size(); i++) {
			mapa[moto.get(i).getX()][moto.get(i).getY()] = 3;	
		};
		//Coloca os Caminhões no Mapa
		for(int i = 0; i < caminhao.size(); i++) {
			mapa[caminhao.get(i).getX()][caminhao.get(i).getY()] = 5;	
		};
		//Imprime o Mundo
		for(int i3 = 0;i3<tamanho_x;i3++) {
			for(int j3 = 0;j3 < tamanho_y;j3++) {
				System.out.print(mapa[i3][j3]);
			};
			System.out.println();	
		};	
	};				
};

