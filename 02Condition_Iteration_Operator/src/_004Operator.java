/**
 * _004Operator
 * 햇갈리는 것 위주로
 * 
 * Integer.parseInt 와
 * String.valueOf
 * 
 * 그리고
 * >>> 연산
 * 
 * << 와 >> 은 순수하게 비트만 보는 연산이라고 생각하면 되고
 * 
 * >>> 는 무조건 최상위 비트가 0으로 채워짐
 * [굳이 규칙성을 찾자면. int형은 >>>31하면 1, >>>32 하면 자기자신이 됨.]
 */
public class _004Operator {

    public static void main(String[] args) {
        String str = "123";
        int value = Integer.parseInt(str);
        System.out.println(value + str);
        value++;

        str = String.valueOf(value);
        System.out.println(value + str);

        //
        System.out.println();
        System.out.println(2 << 3);
        System.out.println(16 >> 3);
        System.out.println(-16 >> 3);
        System.out.println(-16 >>> 31);
    }
}