/**
 * _001Elseif
 * 다른 언어와 다를바 없지만, 핵심 내용이라
 */
public class _001Elseif {

    public static void main(String[] args) {
        var in = new java.util.Scanner(System.in);

        int x = in.nextInt();

        if (x < 0) {
            System.out.println("0미만");
        } else if (x < 10) {
            System.out.println("10미만");
        } else if (x < 20) {
            System.out.println("20미만");
        } else if (x < 30) {
            System.out.println("30미만");
        } else if (x < 40) {
            System.out.println("40미만");
        } else if (x < 50) {
            System.out.println("50미만");
        } else if (x < 60) {
            System.out.println("60미만");
        } else if (x < 70) {
            System.out.println("70미만");
        } else if (x < 80) {
            System.out.println("80미만");
        } else if (x < 90) {
            System.out.println("90미만");
        } else {
            System.out.println("o.w.");
        }

        in.close();
    }
}