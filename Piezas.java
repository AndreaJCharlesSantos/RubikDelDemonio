/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubik;

/**
 *
 * @author PC JORGE
 */
public class Piezas{
	
	public Central central[];
	public Lateral lateral[];
	public Esquina esquina[];
        public CentralR centralr[];
	public LateralR lateralr[];
	public EsquinaR esquinar[];
        public char color2;

	public Piezas(){
		central=new Central[6];
		for(int i=0;i<central.length;i++){
			central[i]=new Central();
		}
		lateral=new Lateral[12];
		for(int i=0;i<lateral.length;i++){
			lateral[i]=new Lateral();
		}
		esquina=new Esquina[8];
		for(int i=0;i<esquina.length;i++){
			esquina[i]=new Esquina();
		}
                
                centralr=new CentralR[6];
		for(int i=0;i<central.length;i++){
			centralr[i]=new CentralR();
		}
		lateralr=new LateralR[12];
		for(int i=0;i<lateral.length;i++){
			lateralr[i]=new LateralR();
		}
		esquinar=new EsquinaR[8];
		for(int i=0;i<esquina.length;i++){
			esquinar[i]=new EsquinaR();
		}
	}


	public char quienCentral(char orient){
		boolean esta = false;
		char color = ' ';
		int i = 0;
		int j = 0;
		while (i < central.length && !esta){
			j=0;
			while (j < central[i].cubo.orientacion.length && !esta){
				if (central[i].cubo.orientacion[j] == orient){
					esta = true;
					color = central[i].cubo.color[j];
				}else{
					j++;
				}
			}
			i++;
		}
		return color;
	}

	public char quienLateral(char orient1, char orient2, char orientColor) {
		boolean esta = false;
		boolean pos1 = false;
		boolean pos2 = false;
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < lateral.length && esta!=true) {
			j = 0;
			while (j < lateral[i].cubo.orientacion.length && pos1==true) {
				if (esquina[i].cubo.orientacion[j]==orient1 && esquina[i].cubo.orientacion[j+1] == orient2 ) {
					esta=true;
                                        color2=esquina[i].cubo.color[j];
				} 
                                j++;
			}
                    i++;
		}
		return color2;
	}


	public char quienEsquina(char orient1, char orient2, char orient3,char orientColor) {
		boolean esta = false;
                int pos1,pos2,pos3;
		for(int i=0;i<esquina.length;i++){
                    if(esquina[i].cubo.orientacion[0]==orient1 && esquina[i].cubo.orientacion[1]==orient2 && esquina[i].cubo.orientacion[2]==orient3){
                        if(esquina[i].cubo.orientacion[0]==orientColor){
                            color2=esquina[i].cubo.color[0];
                        }else if(esquina[i].cubo.orientacion[1]==orientColor){
                            color2=esquina[i].cubo.color[1];
                        }else if(esquina[i].cubo.orientacion[2]==orientColor){
                            color2=esquina[i].cubo.color[2];
                        }
                    }
                }
            return color2;
	}

	public void iniciar() {
		central[0].cubo.color[0] = 'B';
		central[0].cubo.orientacion[0] = 'R';
		central[1].cubo.color[0] = 'Y';
		central[1].cubo.orientacion[0] = 'F';
		central[2].cubo.color[0] = 'R';
		central[2].cubo.orientacion[0] = 'U';
		central[3].cubo.color[0] = 'G';
		central[3].cubo.orientacion[0] = 'L';
		central[4].cubo.color[0] = 'O';
		central[4].cubo.orientacion[0] = 'D';
		central[5].cubo.color[0] = 'W';
		central[5].cubo.orientacion[0] = 'B';
                //Laterales
		lateral[0].cubo.color[0] = 'R';
		lateral[0].cubo.orientacion[0] = 'U';
		lateral[0].cubo.color[1] = 'Y';
		lateral[0].cubo.orientacion[1] = 'F';
		lateral[1].cubo.color[0] = 'B';
		lateral[1].cubo.orientacion[0] = 'R';
		lateral[1].cubo.color[1] = 'Y';
		lateral[1].cubo.orientacion[1] = 'F';
		lateral[2].cubo.color[0] = 'O';
		lateral[2].cubo.orientacion[0] = 'D';
		lateral[2].cubo.color[1] = 'Y';
		lateral[2].cubo.orientacion[1] = 'F';
		lateral[3].cubo.color[0] = 'G';
		lateral[3].cubo.orientacion[0] = 'L';
		lateral[3].cubo.color[1] = 'Y';
		lateral[3].cubo.orientacion[1] = 'F';
		lateral[4].cubo.color[0] = 'R';
		lateral[4].cubo.orientacion[0] = 'U';
		lateral[4].cubo.color[1] = 'B';
		lateral[4].cubo.orientacion[1] = 'R';
		lateral[5].cubo.color[0] = 'R';
		lateral[5].cubo.orientacion[0] = 'U';
		lateral[5].cubo.color[1] = 'G';
		lateral[5].cubo.orientacion[1] = 'L';
		lateral[6].cubo.color[0] = 'O';
		lateral[6].cubo.orientacion[0] = 'D';
		lateral[6].cubo.color[1] = 'B';
		lateral[6].cubo.orientacion[1] = 'R';
		lateral[7].cubo.color[0] = 'O';
		lateral[7].cubo.orientacion[0] = 'D';
		lateral[7].cubo.color[1] = 'G';
		lateral[7].cubo.orientacion[1] = 'L';
		lateral[8].cubo.color[0] = 'R';
		lateral[8].cubo.orientacion[0] = 'U';
		lateral[8].cubo.color[1] = 'W';
		lateral[8].cubo.orientacion[1] = 'B';
		lateral[9].cubo.color[0] = 'G';
		lateral[9].cubo.orientacion[0] = 'L';
		lateral[9].cubo.color[1] = 'W';
		lateral[9].cubo.orientacion[1] = 'B';
		lateral[10].cubo.color[0] = 'B';
		lateral[10].cubo.orientacion[0] = 'R';
		lateral[10].cubo.color[1] = 'W';
		lateral[10].cubo.orientacion[1] = 'B';
		lateral[11].cubo.color[0] = 'O';
		lateral[11].cubo.orientacion[0] = 'D';
		lateral[11].cubo.color[1] = 'W';
		lateral[11].cubo.orientacion[1] = 'B';
                //esquina
		esquina[0].cubo.color[0] = 'R';
		esquina[0].cubo.orientacion[0] = 'U';
		esquina[0].cubo.color[1] = 'Y';
		esquina[0].cubo.orientacion[1] = 'F';
		esquina[0].cubo.color[2] = 'B';
		esquina[0].cubo.orientacion[2] = 'R';
		esquina[1].cubo.color[0] = 'R';
		esquina[1].cubo.orientacion[0] = 'U';
		esquina[1].cubo.color[1] = 'Y';
		esquina[1].cubo.orientacion[1] = 'F';
		esquina[1].cubo.color[2] = 'G';
		esquina[1].cubo.orientacion[2] = 'L';
		esquina[2].cubo.color[0] = 'O';
		esquina[2].cubo.orientacion[0] = 'D';
		esquina[2].cubo.color[1] = 'Y';
		esquina[2].cubo.orientacion[1] = 'F';
		esquina[2].cubo.color[2] = 'B';
		esquina[2].cubo.orientacion[2] = 'R';
		esquina[3].cubo.color[0] = 'O';
		esquina[3].cubo.orientacion[0] = 'D';
		esquina[3].cubo.color[1] = 'Y';
		esquina[3].cubo.orientacion[1] = 'F';
		esquina[3].cubo.color[2] = 'G';
		esquina[3].cubo.orientacion[2] = 'L';
		esquina[4].cubo.color[0] = 'R';
		esquina[4].cubo.orientacion[0] = 'U';
		esquina[4].cubo.color[1] = 'B';
		esquina[4].cubo.orientacion[1] = 'R';
		esquina[4].cubo.color[2] = 'W';
		esquina[4].cubo.orientacion[2] = 'B';
		esquina[5].cubo.color[0] = 'R';
		esquina[5].cubo.orientacion[0] = 'U';
		esquina[5].cubo.color[1] = 'G';
		esquina[5].cubo.orientacion[1] = 'L';
		esquina[5].cubo.color[2] = 'W';
		esquina[5].cubo.orientacion[2] = 'B';
		esquina[6].cubo.color[0] = 'O';
		esquina[6].cubo.orientacion[0] = 'D';
		esquina[6].cubo.color[1] = 'B';
		esquina[6].cubo.orientacion[1] = 'R';

		esquina[6].cubo.color[2] = 'W';
		esquina[6].cubo.orientacion[2] = 'B';
		esquina[7].cubo.color[0] = 'O';
		esquina[7].cubo.orientacion[0] = 'D';
		esquina[7].cubo.color[1] = 'G';
		esquina[7].cubo.orientacion[1] = 'L';
		esquina[7].cubo.color[2] = 'W';
		esquina[7].cubo.orientacion[2] = 'B';
	}

	public void imprimir() {
           
            System.out.println("      " + quienEsquina('U', 'L', 'B', 'U') +quienLateral('U', 'B', 'U') + quienEsquina('U', 'R', 'B', 'U'));
            System.out.println("      " + quienLateral('U', 'L', 'U') +quienCentral('U') + quienLateral('U', 'R', 'U'));
            System.out.println("      " + quienEsquina('U', 'F', 'L', 'U') +quienLateral('U', 'F', 'U') + quienEsquina('U', 'F', 'R', 'U'));
            
            
            System.out.println("      " + quienEsquina('U', 'L', 'B', 'U') +quienLateral('U', 'B', 'U') + quienEsquina('U', 'R', 'B', 'U'));
            System.out.println("      " + quienLateral('U', 'L', 'U') +quienCentral('U') + quienLateral('U', 'R', 'U'));
            System.out.println("      " + quienEsquina('U', 'F', 'L', 'U') +quienLateral('U', 'F', 'U') + quienEsquina('U', 'F', 'R', 'U'));
            /*
            System.out.println("      " + quienEsquina('U', 'L', 'B', 'U') +quienLateral('U', 'B', 'U') + quienEsquina('U', 'R', 'B', 'U'));
            
            System.out.println("      " + quienLateral('U', 'L', 'U') +quienCentral('U') + quienLateral('U', 'R', 'U'));
            System.out.println("      " + quienEsquina('U', 'F', 'L', 'U') +quienLateral('U', 'F', 'U') + quienEsquina('U', 'F', 'R', 'U'));
            
            System.out.print(" "+ quienEsquina('L', 'U', 'B', 'L') +quienLateral('L', 'U', 'L') + quienEsquina('L', 'U', 'F', 'L') + " ");
            System.out.print(" "+ quienEsquina('F', 'U', 'L', 'F') +quienLateral('F', 'U', 'F') + quienEsquina('F', 'U', 'R', 'F') + " ");
            System.out.print(" "+ quienEsquina('F', 'U', 'R', 'R') +quienLateral('R', 'U', 'R') + quienEsquina('R', 'U', 'B', 'R') + " ");
            
		System.out.println(" "+ quienEsquina('B', 'U', 'R', 'B') +quienLateral('B', 'U', 'B') + quienEsquina('B', 'U', 'L', 'B') + " ");
		System.out.print(" "+ quienLateral('L', 'B', 'L') +quienCentral('L') + quienLateral('L', 'F', 'L') + " ");
		System.out.print(" "+ quienLateral('L', 'F', 'F') +quienCentral('F') + quienLateral('F', 'R', 'F') + " ");
		System.out.print(" "+ quienLateral('F', 'R', 'R') +quienCentral('R') + quienLateral('R', 'B', 'R') + " ");

		System.out.println(" "+ quienLateral('R', 'B', 'B') +quienCentral('B') + quienLateral('L', 'B', 'B') + " ");
		System.out.print(" "+ quienEsquina('L', 'D', 'B', 'L') +quienLateral('L', 'D', 'L') + quienEsquina('L', 'D', 'F', 'L') + " ");
		System.out.print(" "+ quienEsquina('F', 'D', 'L', 'F') +quienLateral('F', 'D', 'F') + quienEsquina('F', 'D', 'R', 'F') + " ");
		System.out.print(" "+ quienEsquina('F', 'D', 'R', 'R') +quienLateral('R', 'D', 'R') + quienEsquina('R', 'D', 'B', 'R') + " ");
		System.out.println(" "+ quienEsquina('B', 'D', 'R', 'B') +quienLateral('B', 'D', 'B') + quienEsquina('B', 'D', 'L', 'B') + " ");
		System.out.println(" " + quienEsquina('D', 'L', 'F', 'D') +quienLateral('D', 'F', 'D') + quienEsquina('D', 'F', 'R', 'D'));
		System.out.println(" " + quienLateral('D', 'L', 'D') +quienCentral('D') + quienLateral('D', 'R', 'D'));
		System.out.println(" " + quienEsquina('D', 'L', 'B', 'D') +quienLateral('D', 'B', 'D') + quienEsquina('D', 'R', 'B', 'D'));
		System.out.println("");
*/
	}
}
