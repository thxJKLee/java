/**
 * _001Boxing
 */
public class _001Boxing {

    public static void main(String[] args) {
        Integer i = 12;
        // Integer j = new Integer(13); // Deprecated => 이유는 아래.

        Integer k = Integer.valueOf(13); // 위에 비해서 메모리 절약 효과가 있음.
        // 힙에 이미 생성한 래퍼를 돌려줌.

        String str = i.toString(); // toString은 너무 유명하고.
        int parse = Integer.parseInt(str); // 문자열을 숫자로 바꿔버리기~ parse시리즈

        System.out.println(k);
        System.out.println(parse);
        // 정확히는 정수형에 대해서는
        // static int parseInt(String s[, int radix]); ==> radix 부분이 추가로 붙는다.[진수 겠지]

        /*
         * 언박싱 이 있긴 한데. 굳이?
         * 타입변환도 그냥 캐스팅연산으로 하면 되니깐.
         * 이거는 굳이굳이굳이 필요하면 검색하자
         */

        // 그리고 예를들어 굳이 래퍼클래스를 받는 클래스나 메서드가 매우 많을텐데.
        // 여기에는 그냥 기본형 넣어도 알아서 박싱해줌

        // 레퍼 멤버. [Integer의 예시.]
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.TYPE);

        // binary string
        System.out.println(Integer.toBinaryString(1234));
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(0.1f)));
        // float -> int 이고, double -> long 이다.
        System.out.println(Long.toBinaryString(1234L));
        System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(0.1)));

        // 그 외 MIN_EXPONENT, MAX_EXPONENT .. 이거는 검색
        System.out.println("아래부분은 좀 특수한 실수들");
        System.out.println(3.14 / 0.0);
        System.out.println(-3.14 / 0.0);
        System.out.println(Math.sqrt(-2));

        System.out.println(Double.isNaN(Math.sqrt(-2)));
        System.out.println(Double.isInfinite(3.14 / 0.0));
        System.out.println(Double.isFinite(3.14 / 0.0));
        // 위의 경우들은. static으로도 비슷하게 선언되어 있고, 일반 메서드로도 선언되어 있음. 필요할때 적절히 사용

        // 다만 NaN은 그냥 상태라서. ==도 false. 크기비교도 false가 나온다.
        // 이거는 컴퓨터 구조 시간에 배웠을 텐데, 일반적인 Infinite는 특정 비트범위의 비트가 모두 0이다.
        // 그런데 NaN은 이게 0이 아닌경우. 라서 다를 가능성이 매우 높다.
        // 사실은 약속이지만 이렇게 접근하는 것도 괜찮은 듯

    }
}