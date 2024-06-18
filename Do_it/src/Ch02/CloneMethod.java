package Ch02;

import java.util.Arrays;

public class CloneMethod {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		int[][] b = a.clone();
		
		a[0][1] = 10;
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(Arrays.toString(b[i]));
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}

	}

}

