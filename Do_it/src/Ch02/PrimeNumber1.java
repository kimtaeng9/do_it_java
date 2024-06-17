package Ch02;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int counter = 0; // 나눗셈의 횟수를 세는 변수
		
		for(int n = 2; n<= 9; n++) { // 2부터 1000까지의 모든 수에 대해 소수인지 확인
			int i; 
			// 2부터 n-1까지의 수로 n을 나누어 봄
			for(i= 2; i < n; i++) { 
				counter++; // 나눗셈 횟수 증가
				if(n % i == 0) // n이 i로 나누어 떨어지면
					break;  // 소수가 아니므로 더 이상 검사할 필요가 없음
			}
			// n이 i와 같다면 즉 n이 어떤수로도 나누어지지 않았다면 소수
			if(n == i) // 위의 반복문에서 n%i!=0이라면 마지막에 i++로 후위연산자 받고 내려오니까 i는 n과 같아진다.
				System.out.println(n); // 소수출력
		}
		// 총 나눗셈 횟수 출력
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}

}
