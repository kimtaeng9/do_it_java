package Ch03;

import java.util.Scanner;

class SeqSearch {
    // 요솟수 n인 배열 a에서 key와 같은 요소를 선형 검색
	// 요솟수 : 배열에 포함된 요소의 개수
    static int seqSearch(int[] a, int n, int key) {
        int i = 0; // 인덱스를 초기화
        
        // 무한 루프를 사용하여 배열의 모든 요소를 검색
        // 종료 조건 1) i == n이 성립하는 경우 : 검색 실패이므로 -1 반환
        // 종료 조건 2) a[i] == key가 성립하는 경우 : 검색 성공이므로 i를 반환
        while (true) {
            if (i == n) return -1; // 검색 실패! (배열의 끝에 도달했을 때 -1 반환)
            if (a[i] == key) return i; // 검색 성공! (key 값을 찾으면 인덱스를 반환)
            i++; // 인덱스를 증가시켜 다음 요소를 검사
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 사용자 입력을 받기 위한 스캐너 객체 생성
        
        System.out.println("요솟수: ");
        int num = scan.nextInt(); // 배열의 요솟수를 입력받음
        int x[] = new int[num]; // 요솟수가 num인 배열을 생성
        
        // 배열의 각 요소를 사용자로부터 입력받음
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scan.nextInt();
        }
        
        System.out.print("검색할 값: "); // 검색할 키 값을 입력받음
        int ky = scan.nextInt();
        int idx = seqSearch(x, num, ky); // 배열 x에서 키 값이 ky인 요소를 검색
        
        // 검색 결과를 출력
        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다."); // 키 값을 찾지 못한 경우
        else
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다."); // 키 값을 찾은 경우
    }
}
