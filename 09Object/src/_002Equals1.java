/**
 * _002Equals1
 * 원본 equals 에는 아쉬운 점이.
 * 내부 데이터가 같더라도. 메모리의 주소를 가리키는 방향이 다르면
 * 다르다고 나옴.
 * 
 * 이를 오버라이딩으로 수정할 수 있음.
 */
public class _002Equals1 {

    public static void main(String[] args) {
        var kim1 = new Human03(20, "kim");
        var lee1 = new Human03(30, "lee");
        var lee2 = new Human03(30, "lee");
        var kim2 = kim1;

        System.out.println(kim1 == kim2); // 대입 연산을 하면 완전히 같은 위치를 표현하는 셈이라 같다고 나옴.
        System.out.println(lee1 == lee2); // 둘은 내부 데이터 값은 같지만, 다르다고 나옴
    }
}

class Human03 {
    int age;
    String name;

    Human03(int age, String name) {
        this.age = age;
        this.name = name;
    }
}