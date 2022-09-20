import java.util.Scanner;

/**
 * 원래는 System.in이 버퍼 객체로 감싸고, 문자열을 받고, 타입변환해야하고, 예외처리 할 것도 많았지만.
 * 
 * Scanner 데이터 추출 클래스를 활용합니다.
 * 
 * java.util.Scanner를 이용합니다.
 */
public class _002Scanner {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.print("이름: ");
        String name = scaner.nextLine();
        System.out.println("안녕하세요. " + name + "님");

        System.out.print("나이:  ");
        int age = scaner.nextInt();
        System.out.println("당신은 " + age + "살");

        scaner.close();
    }
}
/* 대표적으로
 * nextInt() int형
 * nextDouble() double형
 * nextLine() 문자열
 * nextBoolean() boolean형
 * 
 * 추가내용 2022-09-20 17:46:23
 * next()도 있는데 이거는 공백을 구분자로 사용하기 때문에. space bar 도 인식하고 그 앞까지 잘라버립니다.
 * [scanf나 std::cin>> 과 닮은 꼴. 정확히는 스페이스바가 구분자로 사용되고, 변수로 저장안된 나머지 문자열은 버퍼에 남게 된다.]
 */