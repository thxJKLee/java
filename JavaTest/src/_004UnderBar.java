/**
 * _004UnderBar
 * 
 * Long 타입에 한해서 중간에 밑줄이 허용됩니다.
 * 
 * 사실은 다른 숫자형도 다 가능합니다. [가능은 하지만, 굳이 쓸 이유는 없기 때문에]
 * 예외조건이 있긴 하지만요.
 * 1. _1234, 1234_ 처럼 제일 앞,제일 뒤 불가
 * 2. 1._234 1_.234 처럼 소수점 앞뒤 불가
 * 3. 0x_1234 처럼 접두사 바로 뒤에 쓸 수 없습니다.
 */
public class _004UnderBar {

    public static void main(String[] args) {
        long price = 123_456_789_000L;
        System.out.println(price);
    }
}