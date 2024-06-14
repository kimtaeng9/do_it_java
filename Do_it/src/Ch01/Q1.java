package Ch01;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		System.out.println("max4(1,2,3,4) = " +max4(1,2,3,4)); 
		System.out.println("max3(1,2,3) = " +min3(1,2,3)); 
		System.out.println("max3(0,1,2,3) = " +min4(0,1,2,3)); 
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
	
	}
	// Q1
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		return max;
	}
	// Q2
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
	// Q3
	static int min4(int a,int b, int c, int d) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		return min;
	}
}
