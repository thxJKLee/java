/**
 * _004Extends
 * 
 * 자바에서는 상속이라고 하는데.
 * [확장] 이라는 개념으로 이해하면 좀더 편하긴 했다.
 * 
 * class A extends B
 * 라고 하면
 * B의 것을 A도 사용하고.
 * A는 A 자신의 것도 사용한다.
 * 물론 B의 public과 protected 까지만 사용 가능하다.
 * 
 * 그리고 이때, B를 A의 Super.[Base, Parent, 상위 라고도 한다.]
 * A는 A의 this.[말그대로 자기자신. C++ 에서는 포인터로 자기자신을 지칭]
 * A는 B의 Sub.[Derived파생, Child, 하위 라고도 한다.] => sub은 보통 완전 다른 메서드에서 활용할때 사용하는 듯
 * 하다.[자식 클래스도 값으로 허용합니다. 이런 식으로]
 * 
 */
public class _004Extends {

    public static void main(String[] args) {
        Student kim = new Student(20, "Lee", 20003311, "수학");
        kim.intro();
        kim.study();
    }
}

class Human {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void intro() {
        System.out.println("나이: " + age + ", 이름: " + name);
    }
}

class Student extends Human {
    int stnum;
    String major;

    Student(int age, String name, int stnum, String major) {
        super(age, name);
        this.stnum = stnum;
        this.major = major;
    }

    void study() {
        System.out.println("공부준");
    }

    @Override // 애노테이션 이라고 해서. 실수방지용. 혹은 작성자에게 알리기 위한 용
    void intro() { // 자식에서 부모것을 재정의하면 자기가 사용 가능하다. 정확히 메서드 이름이 일치.
        System.out.println("학과: " + major + ", 학번: " + stnum + ", 나이: " + age + ", 이름: " + name);
    }
}

/*
 * 맨 먼저 final을 붙이면 상속이 "절.대.로" 불가능하다.
 * 이거는 재정의, 상속 모두 같다. 말그대로 final은 더이상 확장가능성을 상쇄시키는 역할.
 */