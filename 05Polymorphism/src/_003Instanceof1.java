/**
 * _003Instanceof1
 * 아무튼 업캐스팅 정도면
 * 안전한 편이다. [마찬가지 타입은 알고 있고, 그 타입 내에서만 활용하면 문제 없기 떄문에]
 * 
 * 다운캐스팅이 문제가 많다.
 * 하지만 이것도 활용 가능성이 좀 큰편
 * 
 * 객체 타입을 확인하는 instanceof 를 활용한다.
 */
public class _003Instanceof1 {

    public static void main(String[] args) {
        Dog happy = new Dog(); // 자식 객체로 선언
        testAnimal(happy); // 부모객체 파라미터에 자식객체 알규먼트로

        Dove donald = new Dove();
        testAnimal(donald);
    }

    static void testAnimal(Animal animal) { // 들어온 animal의 내부값은 Dog객체
        animal.move(); // 타입이니깐 당연히 가능
        if (animal instanceof Dog) { // 객체의 타입 자체를 판별함.
            Dog mydog = (Dog) animal;
            mydog.bark();
        }
        if (animal instanceof Dove) {
            Dove mydove = (Dove) animal;
            mydove.fly();
        }
        System.out.println();
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