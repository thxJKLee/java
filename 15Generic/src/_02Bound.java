
/**
 * _02Bound
 * 
 * T extends upper.
 * 보통 의미는 upper를 상속한 T들만 허용.[아래 예시에서는 비교가능성 인터페이스를 받은 녀석들만.]
 * 왜냐하면 내부 메서드를 지원 안할수도 있기 때문에
 * 제한하는게 많이 안정적이라.
 * 
 * 보통.
 * 1. 직접선언한 클래스나 인터페이스로 제한하고 싶으면 제일 상단 부모로 제한.
 * 2. 비교가능성, 스레드같은 경우
 * 위 두가지가 제일 가능성 높다.
 * 
 * 이거는 상속, 구현 개념이 아니라서,
 * 추가로 더 제한하고 싶으면 &로 여러개 덧붙이면 됨.
 * <T extends A & B & C>
 */
public class _02Bound {

    static <T extends Comparable<T>> T max(T a, T b) {
        if (a.compareTo(b) > 0)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int result = _02Bound.max(5, 10);
        System.out.println(result);
    }
}