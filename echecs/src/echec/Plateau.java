package echec;

public class Plateau {

	public static void main(String[] args)
	{
		char [][] plateau = new char [8][8];
		plateau[0][0] = 0; plateau[1][0] = 1; plateau[2][0] = 0; plateau[3][0] = 1; plateau[4][0] = 0; plateau[5][0] = 1; plateau[6][0] = 0; plateau[7][0] = 1;
		plateau[0][1] = 1; plateau[1][1] = 0; plateau[2][1] = 1; plateau[3][1] = 0; plateau[4][1] = 1; plateau[5][1] = 0; plateau[6][1] = 1; plateau[7][1] = 0;
		plateau[0][2] = 0; plateau[1][2] = 1; plateau[2][2] = 0; plateau[3][2] = 1; plateau[4][2] = 0; plateau[5][2] = 1; plateau[6][2] = 0; plateau[7][2] = 1;
		plateau[0][3] = 1; plateau[1][3] = 0; plateau[2][3] = 1; plateau[3][3] = 0; plateau[4][3] = 1; plateau[5][3] = 0; plateau[6][3] = 1; plateau[7][3] = 0;
		plateau[0][4] = 0; plateau[1][4] = 1; plateau[2][4] = 0; plateau[3][4] = 1; plateau[4][4] = 0; plateau[5][4] = 1; plateau[6][4] = 0; plateau[7][4] = 1;
		plateau[0][5] = 1; plateau[1][5] = 0; plateau[2][5] = 1; plateau[3][5] = 0; plateau[4][5] = 1; plateau[5][5] = 0; plateau[6][5] = 1; plateau[7][5] = 0;
		plateau[0][6] = 0; plateau[1][6] = 1; plateau[2][6] = 0; plateau[3][6] = 1; plateau[4][6] = 0; plateau[5][6] = 1; plateau[6][6] = 0; plateau[7][6] = 1;
		plateau[0][7] = 1; plateau[1][7] = 0; plateau[2][7] = 1; plateau[3][7] = 0; plateau[4][7] = 1; plateau[5][7] = 0; plateau[6][7] = 1; plateau[7][7] = 0;
		for (int i=0; i<plateau.length; i++){
			for (int j=0; j<plateau.length; j++){
				System.out.print(plateau[i][j]);
			}
			System.out.println();	
		}
		
	}
}


