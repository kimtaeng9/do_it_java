package Ch02;

import java.util.Scanner;

class ArrayEqual {
	// 두 배열 a,b의 요소가 같은가 ? 
	static boolean equals(int[] a, int[] b) {
		// 배열 a, b 길이가 같지않으면 false 
		if(a.length != b.length)
			return false;
		// 배열의  요소가 같지않으면 false
		for (int i = 0; i < a.length; i++) {
			if(a[i] != b[i])
				return false;
		}
		// 둘다 해당되지 않으면 true
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열 a의 요솟수");
		int na = scan.nextInt();
		int[] a = new int[na]; // 입력받은 크기만큼의 배열 생성
		
		for(int i = 0; i < na; i++) {
			System.out.print("a["+i+"]:");
			a[i] = scan.nextInt();
		}
		
		System.out.println("배열 b의 요솟수");
		int nb = scan.nextInt();
		int[] b = new int[nb]; // 입력받은 크기만큼의 배열 생성
		
		for(int i = 0; i <nb; i++) {
			System.out.print("b["+i+"]:");
			b[i] = scan.nextInt();
		}
		System.out.println("배열 a와 b는" + (equals(a,b)?"같다":"다르다"));
	}

}
