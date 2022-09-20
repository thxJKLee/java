/**
 * System.out.println()
 * &
 * System.out print()
 * 
 *  ',' 로 여러개가 아니라.
 * 
 *  한 String 으로 묶어서 명령합니다.
 * 덧셈을 할 때는 
 * String이 우선시 된다. 라고만 이해하고 있으면 됩니다.
 */
public class _001Print {

    public static void main(String[] args) {
        System.out.println("hello");

        int i = 1;
        double d = 2.2;
        String str = "문자열";
        System.out.println("i=" + i + ", d=" + d + ", str=" + str);
    }
}