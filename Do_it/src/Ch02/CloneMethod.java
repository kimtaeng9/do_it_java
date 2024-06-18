package Ch02;

import java.util.Arrays;

public class CloneMethod {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		int[][] b = a.clone();
		a[0][1] = 10;
		System.out.println("a[][] 배열 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		System.out.println("\nb[][] 배열 : ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(Arrays.toString(b[i]));
		}

		int[] c = { 1, 2, 3, 4 };
		int[] d = c.clone();

		c[0] = 10;
		System.out.println("\nc[] 배열 : ");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println("\nd[] 배열 : ");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

	}

}
