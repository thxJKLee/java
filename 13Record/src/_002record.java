/**
 * _002record
 * 
 * 특정한 서식의 클래스의 내부값들을 자동으로 생성한다.
 * equals, toString, hashCode 조차도 자동으로 생성해줌
 */
public class _002record {

    public static void main(String[] args) {
        Point01 pt = new Point01(100, 200);
        System.out.println(pt);

        int x = pt.x();
        int y = pt.y();
        System.out.printf("%d %d\n", x, y);

        Point01 pt2 = new Point01(100, 200);
        System.out.println(pt.equals(pt2));

        //

        Point01 pt3 = GetMidPoint(pt);
        System.out.println(pt3);
    }

    public static Point01 GetMidPoint(Point01 pt) {
        return new Point01(pt.x() / 2, pt.y() / 2);
    }
}

record Point01(int x, int y) {
}