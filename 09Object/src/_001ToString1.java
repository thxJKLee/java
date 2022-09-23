/**
 * _001ToString1
 * toString을 처음 보면 당황스럽다.
 * 해석이 될거 같으면서, 해석이 안되는 코드라는 점이 크다.
 * 
 * 아래 Human 클래스로 만든 객체로 문자열을 나오는 방식은 모두 동일하다.
 * 결론적으로 toString은 [클래스이름]+'@'+[해시코드(10진수에서 16진수로 바꾼)]
 */
public class _001ToString1 {

    public static void main(String[] args) {
        double pi = 3.14;
        System.out.println(pi);

        var human = new Human01(17, "Fred");
        System.out.println(human);
        System.out.println(human.toString());
        System.out.println(human.getClass().getName() +
                '@' +
                Integer.toHexString(human.hashCode()));

    }
}

class Human01 {
    int age;
    String name;

    Human01(int age, String name) {
        this.age = age;
        this.name = name;
    }
}