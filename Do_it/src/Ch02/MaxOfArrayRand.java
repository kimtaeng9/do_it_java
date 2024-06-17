package Ch02;

import java.util.Random;
import java.util.Scanner;

class MaxOfArrayRand {

	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최대값");
		System.out.println("사람 수 : ");
		int num = scan.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i = 0; i <num; i++) {
			height[i] = 100 + rand.nextInt(90); 
			System.out.println("height["+i+"]:" + height[i]);
		}
		System.out.println("최댓값은 " + maxOf(height));
	}

}

// 난수 생성 단계.
// 1. Random 클래스를 간단한 이름으로 사용하기 위해 형 import 선언
// 2. Random 클래스형의 변수를 만들기 위한 선언
// 3. 변수 rand에 대한 난수를 생성하는 메서드 nextInt를 호출