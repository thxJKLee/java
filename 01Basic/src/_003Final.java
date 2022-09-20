/**
 * _003final
 * 
 * 절대 변하지 않는.
 * 상수로 처리할 때.
 * 
 * 다른 언어에서는 const, #define 으로 하곤 하지만.
 * 자바에서는 final이다.
 */
public class _003Final {

    public static void main(String[] args) {
        final double pi = 3.141592;
        // pi = 2.5; // fail
        System.out.println(pi);
    }
}