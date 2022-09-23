import java.util.Random;

/**
 * _002Math
 */
public class _002Math {

    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println();

        System.out.println(Math.abs(-2.2));
        System.out.println(Math.min(1, 2));
        System.out.println(Math.max(1, 2));
        System.out.println();

        System.out.println(Math.ceil(-2.2));
        System.out.println(Math.floor(-2.2));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(1.5));
        System.out.println(Math.rint(2.5));
        System.out.println(Math.rint(1.5)); // 위의 round와의 차이점은 README.md 확인
        System.out.println();

        // 특정 소수점을 반올림 하고 싶다면
        double value = 12.34567890;
        // 이걸 내가 12.3457 으로 만들고 싶다면
        value *= 10000;
        value = Math.round(value);
        value /= 10000;
        System.out.println(value);
        System.out.println();

        // 난수 파트
        for (int i = 0; i < 10; i++)
            System.out.printf("%4.2f ", Math.random());
        System.out.println();
        System.out.println();

        // java.util 패키지에 있는 Random클래스가 쪼끔더 고급적이다고 함.
        var R = new Random(); // 매개변수로 seed 값 넣을 수 있음. 생략하면 알아서
        for (int i = 0; i < 10; i++)
            System.out.printf("%d ", R.nextInt(10));
        System.out.println();
        System.out.println();
    }
}