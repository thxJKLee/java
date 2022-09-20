/**
 * _004Radix
 * 
 * 진법 작성은 그냥 기억만 하면 된다.
 * 
 * 10 10진수
 * 010 8진수
 * 0x10 16진수
 * 0b10 2진수 (자바 7부터)
 */
public class _004Radix {

    public static void main(String[] args) {
        int a = 111;
        int b = 0111;
        int c = 0x111;
        int d = 0b111;

        System.out.println(a); // 111
        System.out.println(b); // 73
        System.out.println(c); // 273
        System.out.println(d); // 7
    }
}