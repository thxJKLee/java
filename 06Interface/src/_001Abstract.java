/**
 * _001Abstract
 * 
 * 추상.
 * 클래스 앞에 abstract 라고 붙이면
 * 이 클래스 자체로 변수 선언이 불가능함.
 * 
 * 그리고 내부에서 abstract 메서드를 선언하면
 * 나머지 자식들도 반드시 구현해줘야됨
 * 
 */
public class _001Abstract {

    public static void main(String[] args) {
        // Animal animal = new Animal(); // 오류. abstract 클래스라서 변수로 선언이 불가능.
        // 정확히는 new 선언이 안되는 것이지. 타입 자체는 만들 수 있음.

        Hello.morning(); // 이렇게 추상 클래스 내부의 메서드 자체는 바로 쓸 수 있음.[static이니깐 또]

        Animal animal = new Dog(); // abstract 지만 Dog객체의 부모라 이런식으로 생성은 가능
        ((Dog) animal).move(); // 여전히 다형성 활용은 가능
    }

}

abstract class Hello { // 추상클래스
    static void morning() { // 에서 메서드
        System.out.println("아침");
    }

    static void lunch() {
        System.out.println("점심");
    }

    static void evening() {
        System.out.println("저녁");
    }
    // 굳이 Hello를 일반 클래스로 만들필요 없으니.
    // 그런데 추상 메서드하고 이거하고 추상클래스안에서 같이 있으면 오류를 일으킨다.
}

abstract class Animal {
    abstract void move(); // 추상 메서드
}

class Dog extends Animal {
    void move() { // 부모의 abstract는 반드시 구현해야함.
        System.out.println("개개");
    }
}

class Dove extends Animal {
    void move() {
        System.out.println("비둘비둘");
    }
}