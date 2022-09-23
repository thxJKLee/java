/**
 * _003record
 * 
 * 물론. 물론.
 * 더 복잡한 형태로 쓰기도 원하긴 할수 있다.
 * 예를들어 오류방지 같은. 그건 아래 있음
 */
public class _003record {

    public static void main(String[] args) {
        Point02 pt = new Point02(-3, 12);
        System.out.println(pt);
    }
}

record Point02(int x, int y) {
    Point02 {
        if (x < 0)
            x = 0;
        if (y < 0)
            y = 0;
    } // 이 부분은 마지막에 적용될 것임. 

}