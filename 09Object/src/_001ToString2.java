/**
 * _001ToString2
 * 마찬가지 다른 부분은 어떻게든 구할 수 있으니 이 toString은 그냥 바꿔도 될거 같다.
 * 이제 오버라이딩도 진행해보자.
 */
class Human02 {
    int age;
    String name;

    Human02(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age + "세, " + name;
    }
}

public class _001ToString2 {

    public static void main(String[] args) {
        var human = new Human02(17, "Fred");
        String name = human.toString();
        System.out.println(name);
    }
}
