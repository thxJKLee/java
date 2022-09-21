/**
 * _003Interface
 * 모든 메서드가 추상인. 추상 클래스 라고 생각하면 될듯.
 * 그렇기에 abstract를 그냥 생략하면 됨[내부 메서드는]
 * 당연히 내부 메서드 모두 public 일테니 이것도 생략.
 * 
 * 
 * 하지만. 상수. 정도는 가질 수 있다.[final은 생략 가능. 그니깐 대문자로 변수 작성]
 * 
 * 확장,상속의 개념인 extends 가 아닌
 * 
 * 구현의 개념인 implements.
 * 
 * 인터페이스에서는 간단하게. 추상적으로 구현 해놓고
 * 인터페이스에서 implements를 통해 받은 다른 클래스에서 본격적으로
 * [구현] 할것이다.
 */
public class _003Interface {

    public static void main(String[] args) {
        Unit[] arUnit = { new Marine(), new Zealot() };

        for (var x : arUnit) {
            x.move();
            x.attack();
        }
    }
}

/**
 * Unit
 */
interface Unit {

    void move();

    void attack();
}

class Marine implements Unit {
    public void move() {
        System.out.println("마린 마린");
    }

    public void attack() {
        System.out.println("마린 공격");
    }

    public void bunker() {
        System.out.println("마린 숨기");
    }
}

class Zealot implements Unit {
    public void move() {
        System.out.println("질럿 질럿");
    }

    public void attack() {
        System.out.println("질럿 공격");
    }
}
/*
 * 인터페이스끼리
 * 클래스끼리
 * ==> extends
 * 
 * 인터페이스에서 클래스로
 * ==> implements.
 * 
 * 
 * extends는 단 하나만 가능.
 * implements는 여러개 가능.
 * 
 * 순서는
 * class A extends B implements C
 */