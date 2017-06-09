import java.util.*;

public class MatrixProduct {
	//行列積を計算するプログラム
	public static void setMatrix (int[][] m) {
		//行列を定めるメソッド
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j ++) {
				m[i][j] = 1; //new Random().nextInt(int);
				//System.out.printf("%5d", m[i][j]);
			}
			//System.out.println();
		}
		//System.out.println();
	}
	
	public static void multiplication(int[][] x, int[][] y, int[][] z) {
		for(int i = 0; i < z.length; i++) {
				for(int j = 0; j <z[i].length; j++) {
					z[i][j] = 0;
					for(int k = 0; k <y.length; k++) {
						z[i][j] += x[i][k] * y[k][j];
					}
				}
		}
	}
	public static void main(String[] args) throws Exception {
			int x = Integer.parseInt(args[0]);
			int[][] mat_a = new int[x][x];
			//int[][] mat_b = new int[x][x];
			int[][] ans = new int[mat_a.length][mat_a[0].length];
		
			setMatrix(mat_a);
			//setMatrix(mat_b);
		
			long start = System.currentTimeMillis();
			multiplication(mat_a, mat_a, ans);
			long end = System.currentTimeMillis();
			 System.out.printf("time: %.6f sec\n", (end - start) / 1000.0);
 	}
}