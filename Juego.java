import java.util.Random;
import java.util.*;

public class Juego{
	
	public Scanner teclado=new Scanner(System.in);
	public char [][][]cubo=new char [6][3][3];
	public char [][][]Resuelto=new char [6][3][3];
	public char [][][]movimiento=new char [6][3][3];
	public int colores[]=new int[6];
	public int toco;	
	public Random color=new Random();
	public boolean exit = false;


	public void rellenar(){
		colores[0]=8;
		colores[1]=8;
		colores[2]=8;
		colores[3]=8;
		colores[4]=8;
		colores[5]=8;
		char letra=' ';
		//se encarga de hacer el resultado final del jugador
		for(int i=0;i<6;i++){
			if(i==0){
				letra='W';
			}else if(i==1){
				letra='O';
			}else if(i==2){
				letra='G';
			}else if(i==3){
				letra='B';
			}else if(i==4){
				letra='R';
			}else if(i==5){
				letra='Y';
			}
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					Resuelto[i][j][k]=letra;
				}
			}
		}
		//se encarga de rellenar de forma aleatoria el cubo del jugador
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					if(j==1&&k==1){
						cubo[i][j][k]=Resuelto[i][j][k];
					}else{
						do{
							toco=color.nextInt(6);
						}while(colores[toco]==0);
						if(toco==0){
							letra='W';
						}else if(toco==1){
							letra='O';
						}else if(toco==2){
							letra='G';
						}else if(toco==3){
							letra='B';
						}else if(toco==4){
							letra='R';
						}else if(toco==5){
							letra='Y';
						}
						cubo[i][j][k]=letra;
						colores[toco]=colores[toco]-1;
					}
				}
			}
		}
		imprimir();
	}	

	public void imprimir(){
		superior();
		int cara1=0,cara2=3,cara3=2,cara4=5,cara=0;
		for(int i=0;i<4;i++){
			if(i==1){
				break;
			}
			for(int j=0;j<3;j++){
				for(int g=0;g<4;g++){
					if(g==0){
						cara=cara1;
					}if(g==1){
						cara=cara2;
					}
					if(g==2){
						cara=cara4;
					}
					if(g==3){
						cara=cara3;
					}
					for(int k=0;k<3;k++){
						System.out.print(cubo[cara][j][k]);
						if(k<2){
							System.out.print(",");
						}
					}
					System.out.print("\t");
				}
				System.out.println("\n");
			}
		}
		inferior();
		Menu();
	}

	public void superior(){
		//cara naranja 1
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				System.out.print(cubo[1][j][k]);
				if(k<2){
					System.out.print(",");
				}
			}
			System.out.println("\n");
		}
	}

	public void inferior(){
		//cara roja 4
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				System.out.print(cubo[4][j][k]);
				if(k<2){
					System.out.print(",");
				}
			}
			System.out.println("\n");
		}
	}

	public void Menu(){
		int pasa;
		do{
			pasa=0;
			ganador();
			System.out.println("w - girar la parte superior en el sentido de las agujas del reloj");
			System.out.println("x - Gire la parte inferior en sentido horario");
			System.out.println("a - Gire a la izquierda en el sentido de las agujas del reloj");
			System.out.println("d - Gire a la derecha en sentido horario");
			System.out.println("s - Gire el frente en sentido horario");
			System.out.println("e - Gire la parte posteriro hacia la derecha");
			System.out.println("q - Salir");
			String letra = teclado.nextLine();
			switch(letra){
				case "w":
					movimientosuperior();
					break;
				case "x":
					movimientoinferiro();
					break;
				case "a":
					movimientoizquierda();
					break;
				case "d":
					movimientoderecha();
					break;
				case "s":
					movimientofrente();
					break;
				case "e":
					movimientoposterior();
					break;
				case "q":
					System.exit(0);
				case "o":
					solucion();
					ganador();
					break;
				default:
					System.out.println("Opcion no valida");
					pasa=1;
			}
		}while(pasa==1);
	}

	public void movimientosuperior(){
		//superior 1
		int a=0,b=3;
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				b=b-1;
				System.out.println(b+","+a);
				movimiento[1][j][k]=cubo[1][b][a];
			}
			a=a+1;
			b=3;
		}
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				cubo[1][j][k]=movimiento[1][j][k];
			}
		}
		imprimir();
	}

	public void movimientoinferiro(){
		//inferior 4
		int a=0,b=3;
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				b=b-1;
				System.out.println(b+","+a);
				movimiento[4][j][k]=cubo[4][b][a];
			}
			a=a+1;
			b=3;
		}
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				cubo[4][j][k]=movimiento[4][j][k];
			}
		}
		imprimir();
	}

	public void movimientoizquierda(){
		//izquierda 2
		int a=0,b=3;
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				b=b-1;
				System.out.println(b+","+a);
				movimiento[2][j][k]=cubo[2][b][a];
			}
			a=a+1;
			b=3;
		}
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				cubo[2][j][k]=movimiento[2][j][k];
			}
		}
		imprimir();
	}

	public void movimientoderecha(){
		//derecha 3
		int a=0,b=3;
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				b=b-1;
				System.out.println(b+","+a);
				movimiento[3][j][k]=cubo[3][b][a];
			}
			a=a+1;
			b=3;
		}
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				cubo[3][j][k]=movimiento[3][j][k];
			}
		}
		imprimir();
	}

	public void movimientofrente(){
		//frontal 0
		int a=0,b=3;
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				b=b-1;
				System.out.println(b+","+a);
				movimiento[0][j][k]=cubo[0][b][a];
			}
			a=a+1;
			b=3;
		}
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				cubo[0][j][k]=movimiento[0][j][k];
			}
		}
		imprimir();
	}

	public void movimientoposterior(){
		//posterior 5
		int a=0,b=3;
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				b=b-1;
				System.out.println(b+","+a);
				movimiento[5][j][k]=cubo[5][b][a];
			}
			a=a+1;
			b=3;
		}
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				cubo[5][j][k]=movimiento[5][j][k];
			}
		}
		imprimir();
	}

	public void ganador(){
		int contador=2,contador2=0;
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					if(contador==2){
						if(cubo[i][j][k]==Resuelto[i][j][k]){
							contador2=1;
						}else{
							contador2=0;
							contador=1;
						}
					}
					
				}
			}
		}
		if(contador2==1&&contador==2){
			System.out.println("Lo lograste");
			System.exit(0);
		}
	}

	public void solucion(){
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					cubo[i][j][k]=Resuelto[i][j][k];
				}
			}
		}
	}
}