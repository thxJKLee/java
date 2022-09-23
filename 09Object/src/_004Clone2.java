/**
 * _004Clone2
 * 여기서 본격적으로 내부데이터 자체 복사를 어떻게 하는가.
 * 우리의 현재 상태는 다음과 같다.
 * 1. 클래스 내부에서 오버라이딩을 한 상태이다.
 * 2. 지금은 우리가 클래스로 만들어진 객체를 위해 오버라이딩을 한 상태이다.
 * [결국 아까의 해시코드 제작이나 toString 제작같이 클.래.스.전.용. 으로 만들어주면 된다.]
 * 
 * 
 * 결과
 * > 완전한 복제품의 탄생
 */
public class _004Clone2 {

    public static void main(String[] args) {
        Human07 kim = new Human07(12, "kim");
        Human07 kimchi = (Human07) kim.clone();
        System.out.println(kim);
        System.out.println(kimchi);
        System.out.println();

        kimchi.name = "lee";
        kimchi.age = 2006;
        System.out.println(kim);
        System.out.println(kimchi);
    }
}

class Human07 implements Cloneable {
    int age;
    String name;

    Human07(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age + "세, " + name;
    }

    @Override
    public Object clone() {
        try {
            Human07 other = (Human07) super.clone();
            other.age = age;
            other.name = name;
            return other;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}