import java.util.ArrayList;

/**
 * _04WildCard
 * 와일드카드는 서로 정확한 상속관계는 아니고
 * 서로의 제너릭이 상속관계일 경우.
 * <? extends Human> 처럼 활용한다.
 * 
 * T로 하면 바로 그 T 타입. {이거는 반환타입 앞에서 이 제너릭을 쓰겠다고 선언하는 느낌}
 * 
 * 와일드카드는 내부에서 활용하는 타입으로 상속관계를 보고 싶을 경우
 */
public class _04WildCard {

    public static void main(String[] args) {
        ArrayList<Human> h = new ArrayList<>();
        ArrayList<Student> s = new ArrayList<>();

        h.add(new Student());
        h.add(new Human());
        h.add(new Student());
        h.add(new Human());

        printArray(h);
        printArray(s);
    }

    static void printArray(ArrayList<? extends Human> ar) {
        for (var x : ar) {
            x.show();
        }
    }
}

class Human {
    void show() {
        System.out.println("사람사람");
    }
}

class Student extends Human {
    void show() {
        System.out.println("학생학생");
    }
}