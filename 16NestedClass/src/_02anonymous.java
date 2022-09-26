/**
 * _02anonymous
 * 중요한 것은.
 * 익명이라는 것이다.
 * 타입은 인터페이스든 클래스처럼 보이는거 같아도
 * 이름이 없는 것이라고 생각하면 된다.
 * 
 */
public class _02anonymous {

    public static void main(String[] args) {
        A bb = new A() {
            void show() {
                System.out.println("BB");
            }
        };
        bb.show();

        C cc = new C() {
            public void print() { // 당연히 public
                System.out.println("CC");
            }

            public void set() {
                System.out.println("set");
            }
        };
        cc.print();
        cc.set();
    }
}

class A {
    void show() {
        System.out.println("AA");
    }
}

interface C {
    void print();

    void set();
}