package Ch03;

class SeqSearchMethod {
    // 선형 검색(보초법) 메서드
    static int SeqSearchSen1(int[] a, int n, int key) {
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
    // 선형 검색(보초법) 메서드
    static int SeqSearchSen2(int[] a, int n, int key) {
    	
        a[n] = key;  // 배열의 끝에 보초(key)를 추가

        // 무한 루프를 통해 배열의 요소를 순차적으로 검색
        for(int  i = 0; i < a.length ; i++) {
        	if (a[i] == key)
                return i;  // 검색 성공 시 반복문 종료
        }
		return -1;
        
    }
	
	
}
//SeqSearchSen1 메서드의 조건 검사 a[i] != key
//a[i]가 key와 다를 동안 반복문 실행
//a[i]가 key와 같다면 반복문 종료 > 이 조건 덕분에 배열의 끝까지 도달하지 않아도 key 찾으면 즉시 반복 멈춤

