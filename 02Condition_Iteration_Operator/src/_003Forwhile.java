/**
 * _003Forwhile
 * 
 * for
 * while
 * do while
 * continue
 * break
 * 
 * continue 와 break는 가능하면 지양해라.
 * break는 가끔 쓰이는데
 * continue는 체감상 별로 안쓰는 듯
 */
public class _003Forwhile {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            System.out.println(i);
        System.out.println();

        //

        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }

        //

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*  */
        System.out.println();
        int last = 10;
        while (last > 0) {
            System.out.println(last);
            last -= 1;
        }

        System.out.println();
        int num = 10;
        do {
            System.out.println(num);
            if (num == 4)
                break;
            num--;
        } while (num < 10);

        //
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
    }
}