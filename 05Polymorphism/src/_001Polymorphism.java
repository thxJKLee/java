/**
 * _001Polymorphism
 * 다형성.
 * 부모-자식 상속관계에 있는 클래스에서
 * 상위클래스가 [동일한 메시지]로 서로 다르게 동작하는 경우.
 * 
 * 예를들어
 * 1. 하위클래스가 상위클래스의 메서드를 재정의 한다.
 * 2. 상위클래스로 타입선언 한다. 즉, 겉과 속이 다른 상태.
 * 
 * 3. 물론 일반적인 메서드는 타입을 따라간다. => 정적 바인딩
 * 4. 물론 내부의 메서드를 부르고 싶으면 형변환을 하면 된다. => 정적바인딩
 * 
 * 5. 중요한 것은. 재정의한 메서드면, 무조건 내부를 따라간다. => 동적바인딩
 */
public class _001Polymorphism {

    public static void main(String[] args) {
        Animal animal = new Animal(); 
        animal.move();

        Animal dog = new Dog(); // 부모 타입에 자식 객체를 넣은 경우
        dog.move();
        // dog.bark(); // 부모의 것만 사용 가능. 담는 상자가 부모것이라

        // Dove dove = new Animal(); // 자식 타입에 부모 객체를 넣는 경우. 오류
        Dove dove = (Dove) new Animal(); // 타입변환해주면 가능하긴 함
        dove.fly(); // 오류. 내부 데이터는 Animal 객체라
    }
}

class Animal {
    void move() {
        System.out.println("동물동물");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("개개");
    }
}

class Dove extends Animal {
    void fly() {
        System.out.println("비둘비둘");
    }
}