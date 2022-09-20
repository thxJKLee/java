/**
 * _006Textblock
 * 문자열을 블록형태로.
 * 
 * 사용 이유는 다른 언어와 결합을 유연하게 하기 위해.
 * 
 * 아래 둘은 완전히 같은 String. 포매팅의 개념
 */
public class _006Textblock {

    public static void main(String[] args) {
        String s1 = """
                안녕 하세요
                녕 하세요안
                 하세요안녕
                하세요안녕
                세요안녕 하
                요안녕 하세
                안녕 하세요
                """;
        String s2 = "안녕 하세요\n" +
                "녕 하세요안\n" +
                " 하세요안녕\n" +
                "하세요안녕\n" +
                "세요안녕 하\n" +
                "요안녕 하세\n" +
                "안녕 하세요\n";

        System.out.println(s1);
        System.out.println(s1 == s2);

    }
}