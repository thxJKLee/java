/**
 * _002Polymorphism
 * 
 * 객체 캐스팅
 */
public class _002Polymorphism {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        // 업 캐스팅
        Animal up = dog; // 이게 가능하다는게 엄청나게 중요함.
        // 형변환을 해도 되지만 굳이?
        up.move();
        // up.bark();

        // 다운 캐스팅
        Dog down = (Dog) animal;
        down.move();
        // down.bark(); 내부 값은 animal 이라.
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