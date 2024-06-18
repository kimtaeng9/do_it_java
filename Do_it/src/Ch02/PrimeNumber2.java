package Ch02;

class PrimeNumber2 {
	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2;  // 첫 번째 소수를 배열에 저장하고 포인터 증가
		
		for(int n = 3; n <= 1000; n += 2) { // 3부터 1000까지의 홀수를 대상으로 소수 찾는다. 짝수는 2외에는 소수가 아니므로 홀수만 검사
			int i;
			for(i = 1; i <ptr; i ++) {
				counter++;
				if(n % prime[i] == 0) // 나누어 떨어지면 소수 아님
					break;
			}
			if(ptr == i) // 끝까지 나누어 떨어지지 않으면 소수
				prime[ptr++] = n;
		}
		for (int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		System.out.println("나눗셈 수행한 횟수 : " + counter);
		}
	}

}
