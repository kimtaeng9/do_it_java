package Ch02;

public class PrimeNumber3 {

	public static void main(String[] args) {
		int counter = 0; // 소수 판별 과정에서 수행된 곱셈과 나눗셈의 횟수를 저장
		int ptr = 0; // 배열에서 소수를 저장할 위치
		int[] prime = new int[500]; // 최대 500개의 소수를 저장할 수 있는 prime 배열 생성
		
		prime[ptr++] = 2; // prime[0]에 2 저장 후 ptr 은 1
		prime[ptr++] = 3; // prime[1]에 3 저장 후 prt은 2
		
		for(int n = 5; n <= 1000; n += 2) { // n은 5부터 1000까지 홀수만 검사 
			boolean flag = false; // 현재 수 'n'이 소수인지 여부를 표시하는 플래그
			for(int i =1; prime[i] * prime[i] <= n; i++) { // 
				counter += 2;
				if (n % prime[i] == 0) { // n이 prime[i]로 나누어 떨어지는 경우 
					flag = true; // 소수가 아니므로 flag를 true로 설정하고 내부 루프를 종료
					break;
				}
			}
			if(!flag) { // 내부 루프를 돌았는데도 flag가 false라면 n은 소수
				prime[ptr++] = n; // 프라임 배열에 소수 n을 저장하고 prt 1 증가
				counter++; // 소수 발견시 곱셈과 나눗셈의 횟수를 1증가
			}
		}
		
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
	}

}


