/**
 * _007Textblockescape
 * 
 * \s 는 앞의 공백을 남기는 효과를 가졌다.
 * 
 * 아래의 str은 \s가 없다면 is 다음에 곧장 이하늘 이라고 적힌다.
 */
public class _007Textblockescape {

    public static void main(String[] args) {
        String s = """
                이름   \s
                나이  \s
                값 \s
                """;
        System.out.println(s);

        String name = "이하늘";
        String str = """
                hi,
                my name is \s""" + name + """
                .
                nice to meet you.
                """;
        System.out.println(str);
    }
}