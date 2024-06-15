package Ch01;

import java.util.Scanner;

public class Q17 {
	// n단 숫자 피라미드
	
	static void npira(int n) {
		for(int i = 1;i <= n; i++) {
			for(int j = 1; j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i -1; k++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("양의 정수 n 입력");
			n = scan.nextInt();
		}while(n<=0);
		
		npira(n);
		
		scan.close();
	}

}
