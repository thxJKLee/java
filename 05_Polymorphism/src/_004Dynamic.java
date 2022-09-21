/**
 * _004Dynamic
 * 
 * 동적 바인딩.
 */
public class _004Dynamic {

    public static void main(String[] args) {
        Human lee = new Human(22, "Lee");
        Student choi = new Student(23, "choi", 2202020, "기공");

        introHuman(lee); // Human의 intro가 나옴
        introHuman(choi); // Student의 intro가 나옴

        System.out.println();

        introHuman2(lee, choi);
    }

    static void introHuman(Human who) { // 들어오는 값은 분명 Human 객체지만. 그 자식 객체도 넣을 수 있음
        who.intro(); // 만약 자식객체에서 재정의 했다면 그 자식객체쪽으로 나옴.
    }

    static void introHuman2(Human... lots) { // 사실 이 parameter 에 들어오는 값들이 진짜 Human이 아니라 자식인 경우도 있음.
        // 그런것들도 싸잡아서
        for (var x : lots) {
            x.intro();
        } // 간단하게 변환 필요없이 식으로 처리가 가능해짐
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

    @Override
    void intro() {
        System.out.println("학과: " + major + ", 학번: " + stnum + ", 나이: " + age + ", 이름: " + name);
    }
}
/*
 * 결론.
 * 1. 부모타입의 변수가 자식객체를 가리킬 수 있다.
 * 2. 객체로 호출 가능한 메서드 종류는 객체의 선언 타입(겉 껍질)에 따른다
 * 3. 메서드를 호출하면 선언 타입이 아닌 객체의 타입(속)에 따른다.
 */