/**
 * _01FunctionalInterface
 * 
 * 인터페이스.
 * 이것을 타입으로 하여 함수 자체를 저장할 수 있다.
 * js에 있는거 마냥
 */
public class _01FunctionalInterface {

    public static void main(String[] args) {
        PlusOne po1 = (int i) -> {
            return i + 1;
        };
        PlusOne po2 = (int i) -> i + 1;
        PlusOne po3 = (i) -> i + 1;
        PlusOne po4 = i -> i + 1;

        System.out.println(po1.plus(3)); // po1(3) 이 아니라. 인터페이스니깐. 
        // 내부의 메서드 하나를 실행한다는 개념
    }
}

interface PlusOne {
    int plus(int i);
}