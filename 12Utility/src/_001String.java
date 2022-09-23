/**
 * _001String
 */
public class _001String {

    public static void main(String[] args) {
        String str = "빛과 어둠, 한줄기 빛으로";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.charAt(3));

        String cmpstr1 = "ABCD";
        String cmpstr2 = "abcd";
        System.out.println(cmpstr1.equals(cmpstr2));
        System.out.println(cmpstr1.equalsIgnoreCase(cmpstr2)); // ignoreCase는 대소문자 구분 없이. 아마 내부에서 소문자로 변경하는 과정 거친다음에 진행할
                                                               // 듯
        System.out.println(cmpstr1.compareTo(cmpstr2)); // 사전순. 문자코드의 크고 작음으로 확인. 예를들어 A는 a보다 작으니 A-a 하니깐 음수 나오는 것.
        System.out.println(cmpstr1.compareToIgnoreCase(cmpstr2));

        String str1 = "abcdefghijklmnopqrstuvwxyyz|abcdefghijklmnopqrstuvwxyyz";
        System.out.println(str1.indexOf('a')); // 사실 argument로 int fromIndex가 생략되어 있음
        System.out.println(str1.indexOf("abc"));
        System.out.println(str1.lastIndexOf('a')); // 기본적으로 indexOf는 발견하는 순간 그 인덱스를 반환하며 종료하기 때문에. 맨끝부터 찾는 방식도 있음.
        System.out.println(str1.lastIndexOf("abc"));
        // 아니면. 위치가 아니라 단순히 있는지 없는지를 찾고 싶다면.
        // boolean startsWith(String prefix)
        // boolean endsWith(String suffix) 를 이용

        String name = "             Lee Jun Kyeong         ";
        System.out.println(name.toUpperCase()); // 모두 대문자
        System.out.println(name.toLowerCase()); // 모두 소문자
        System.out.println(name.trim()); // 좌우 공백 제거
        System.out.println(name.concat("[이준경]")); // 문자열 합치기
        System.out.println(name.replace('e', 'T')); // 모든 'e' 를 'T'로
        System.out.println(name.replace("Lee", "Park")); // 모든 "Lee" 를 "Park" 로
        System.out.println(name.replaceFirst("Jun", "Kyeong")); // 처음 만나는 Jun 을 Kyeong로

        String name1 = name.trim();
        System.out.println(name1.substring(3, 5)); // endIndex는 생략 가능.
        // 원래는 replaceAll 이라는 메서드도 하나 있는데. 이거는 정규표현식을 사용해서.
        // 물론 replaceFirst 도 정규표현식 사용 가능.
        // 위의 것은 문자열 자체를 바꾸는게 아니라, 반환하는 것

        // 토큰 분할
        // 문자열을 여러 문자열로 쪼개는 거임.
        String dir = "C:/user/data/app/local";
        String[] token = dir.split("/"); // 뒤에 limit도 지정할 수 있는데. 이 개수만큼 토큰으로 하고, 나머지 뒤쪽은 모두 합쳐버린다.

        for (String s : token) {
            System.out.println(s);
        }
        System.out.println();

        // join. static입니다.
        String path = String.join("/", "C:", "user", "data", "app", "local");
        System.out.println(path);
        // 뒤의 ...elements 부분에는 대신. 문자열 컬렉션을 넣어도 됩니다.
    }
}
/*
 * 그 외
 * String repeat(int n) // n번 문자열 반복해서 리턴
 * boolean isBlank() // 말그대로 isEmpty는 아예 비어있는지, isBlank는 공백까지 살펴봐서 보이는 것이 비어있는지
 * String strip() // trim은 유니코드에서는 공백이 아니라고 생각하지만, strip은 유니코드에 있는 공백까지
 * strip은 앞만 지우는 stripLeading, 뒤만 지우는 stripTrailing
 * Stream<String> lines() // 개행 문자를 기준으로 문자열 배열로.
 * 
 * String indent(int n) // n만큼의 공백을 삽입하여 들여쓰기. [파이썬 같은경우 들여쓰기가 곧 블록을 나누기 때문에 필요]
 * 
 * <R> R transform(Function <? super String, ? extends R> f)
 * => 맨 앞의 <R> 은 C++에서 봤던 맨 처음에 제네릭을 선언해주는 것[나 이런거 쓸거다. 라는 의미]
 * => Function 부분은 람다식으로 표현[또는, 익명메서드나, 그냥 메서드 그 자체를]
 * => 단순히 얘기하면 형식을 바꿔버린다고 생각해도 됨.[람다식에서 자세히 배우는거로]
 */