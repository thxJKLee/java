/**
 * _002Time
 * 시간 측정하는 메서드.
 * 나름 요긴하게 쓴다.
 * 다른 클래스로 있긴 하지만. 이건 좀더 원론적인
 * 
 * 70년 1월 1일 부터 경과한 시간. ms 단위. long 타입
 * 
 * 
 * 시간, 분, 초 자체를 가져올때는 이게 제일 편할 수 있음.
 * 날짜를 가져올때는 좀 어려울만하고
 * 
 * long nanoTime() 이라고 해서. nano초를 가져올 수도 있긴 함 [고해상도 타이머가 내장된 경우.]
 * 일반적인 선에서는 그냥 ms까지만 가져와도 충분
 */
public class _002Time {

    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // 이것을 실행하는 순간의 시간을 변수로 저장.
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + "번째 줄");
        }
        long end = System.currentTimeMillis();

        System.out.println((end-start)/1000.0 + "초");
    }
}