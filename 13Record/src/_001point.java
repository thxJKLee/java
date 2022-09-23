/**
 * _001point
 * 
 * 1. x,y축의 거리가 각각 필요함. 핵심필드여서 private. 굳이 변경안하니 final
 * 2. 생성하자마자 초기화. 그래서 빈 기본생성자가 없음.
 * 3. get함수 제공. set은 쓰기전용이라 제외
 * 4. 상등비교는 equals. 같다는 것의 증명인 hashCode을 오버라이딩.
 * 5. 디버깅 편의성[출력] 을 위해서 toString 오버라이딩.
 * 
 * 생각해보면 단순한 집합인데, 굳이 이렇게 길게 클래스로 써야 할까.
 * [이론상으로는 클래스니깐 처음 배울때는 이렇게 배우는게 적절하긴 함]
 */
public class _001point {

    public static void main(String[] args) {
        Point pt = new Point(100, 200);
        System.out.println(pt);

        int x = pt.x();
        int y = pt.y();
        System.out.printf("%d %d\n", x, y);

        Point pt2 = new Point(100, 200);
        System.out.println(pt.equals(pt2));
    }
}

class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x() {
        return x;
    }

    int y() {
        return y;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Point == false) // 여기 !쓰려면 전체 괄호 해야됨
            return false;
        Point otherPoint = (Point) other;
        return otherPoint.x == x && otherPoint.y == y;
    }

    @Override
    public int hashCode() {
        return x * 10000 + y;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

}