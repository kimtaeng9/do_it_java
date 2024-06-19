package Ch03;  // Ch03 패키지에 속하는 클래스

import java.util.Scanner;  // Scanner 클래스 임포트

// 선형검색(보초법)
class SeqSearchSen {

    // 선형 검색(보초법) 메서드
    static int SeqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;  // 배열의 끝에 보초(key)를 추가

        // 무한 루프를 통해 배열의 요소를 순차적으로 검색
        while (true) {
            if (a[i] == key)
                break;  // 검색 성공 시 반복문 종료
            i++;
        }
        
        // 검색 결과에 따라 인덱스 반환 (보초를 찾은 경우 n을 반환하여 -1을 처리)
        return i == n ? -1 : i;
    }

    // 메인 메서드: 프로그램의 진입점
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Scanner 객체 생성

        System.out.print("요솟수 : ");
        int num = scan.nextInt();  // 배열의 요솟수 입력
        int[] x = new int[num + 1];  // 요솟수가 num인 배열 선언 (보초를 위해 크기를 1 증가)

        // 배열 요소 입력
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scan.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = scan.nextInt();  // 검색할 값 입력

        int idx = SeqSearchSen(x, num, ky);  // SeqSearchSen 메서드를 통해 검색 수행

        // 검색 결과 출력
        if (idx == -1)
            System.out.println("그 값의 요소가 없다");
        else
            System.out.println(ky + "은(는) x[" + idx + "]에 있다.");
    }

}

