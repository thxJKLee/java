/**
 * _003Instanceof2
 * 
 * _003Instanceof1과 비교해서 보면.
 * 
 * instanceof 타입 [변수명] 으로 바뀜.
 * 그러면 그 변수명이 동시에 저 원하는 타입으로 선언되는 셈.
 * 
 * [하지만 이거는 jdk16부터 생긴거라 얼마 안돼서 호환성의 문제가 큼.]
 */
public class _003Instanceof2 {

    public static void main(String[] args) {
        Dog happy = new Dog();
        testAnimal(happy);

        Dove donald = new Dove();
        testAnimal(donald);
    }

    static void testAnimal(Animal animal) { 
        animal.move(); 
        if (animal instanceof Dog mydog) { 
            mydog.bark();
        }
        if (animal instanceof Dove mydove) {
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