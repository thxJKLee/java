/**
 * _002Newswitch01
 * 문자열 자체를 case로 할 수 있다.
 * 
 * 처음 C로 배울때는 숫자로밖에 안됐던거로 기억나서
 * string으로 넣어서. 각각 compare 한다음에 숫자로 했었나?
 */
public class _002Newswitch01 {

    public static void main(String[] args) {
        String firstName = "Lee";

        switch (firstName.toLowerCase()) {
            case "kim":
                System.out.println("김씨");
                break;
            case "lee":
                System.out.println("이씨");
                break;
            case "choi":
                System.out.println("최씨");
                break;
            case "park":
                System.out.println("박씨");
                break;
        }
    }
}