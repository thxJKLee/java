/**
 * _001Printf
 * %b
 * %d // %ld, %lld 가 없다는 점
 * %o
 * %x, %X
 * 
 * %f, %e [%lf가 없다는 점.]
 * 
 * %s
 * %c
 */
public class _001Printf {

    public static void main(String[] args) {
        int i = 1;
        double d = 3.141592;
        String str = "string";

        System.out.printf("%d %f %s\n", i, d, str);

        System.out.printf("3$d %1$f %2$s\n", d, str, i); // 파이썬의 포매팅처럼 순서로 정할 수도

        System.out.printf("%1$d %1$d %1$d\n", i, i, i);

        System.out.printf("|%5d|\n|%-5d|\n|%05d|\n|%4$6.3f|\n|%06.3f|\n|%04.2f|\n", i, i, i, d, d); // 소수점, 정수 자리채우기 같은
    }
}