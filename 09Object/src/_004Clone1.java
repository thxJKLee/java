/**
 * _004Clone1
 * 클론은.
 * 일반적인 = 의 경우를 생각해보자.
 * 기본형(타입)인 경우에는 값 자체가 들어갔지만
 * 참조형(포인터,주소)인 경우에는 같은 곳을 가리키는 것일뿐이라.
 * 
 * 가끔은 의도적으로 아예 다른 힙에 존재하는 사본을 만들 필요가 있음.
 * 
 * 다만 클론을 하기에는 여러 과정이 필요한데.
 * 1. Cloneable 인터페이스 상속(이건 단순히 허용의 문제에서 쓰는 것. Comparable하고 비슷하다고 하면 비슷)
 * [그리고 Cloneable 파일을 확인해보면 정보가 자세히 나옴.]
 * [Cloneable을 안붙이면, CloneNotSupportedException가 발생한다.]
 * => 그래서 아래에서는 혹시 모를 오류방지로 한번 더 진행하는 듯.
 * [물론 Object 클래스에서 봐도 오류를 던지는 모습.]
 * 
 */
public class _004Clone1 {

    public static void main(String[] args) {

    }
}

class Human06 implements Cloneable {
    int age;
    String name;

    Human06(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException {
    // return super.clone(); // 왜 super.clone()으로 하는가.
    // // 자바코드가 아니라 운영체제의 코드를 사용하기 때문.
    // }
    // 또는..
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    } // 가능하면 이것을 권장합니다. main 에서도 throw를 해줘야 됨.

}