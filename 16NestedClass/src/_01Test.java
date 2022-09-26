/**
 * _01Test
 * 
 * 메서드는 기본적으로 무조건 같은결과를 내보내야 한다. 시점에 따라 변할 수 있는 값이면.
 * 가능하면 final이 되어야 한다.
 * [들어오는 인자에 의해 바뀌는 경우는 당연히 제외하고.]
 */
class _01Test {

    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        Outer.staticInner staticIn = new Outer.staticInner();

    }
}

class Outer {
    int num = 10;

    Outer() {
    }

    void OuterMethod() {
        final int num = 40; // 여기가 final이어야 한다. 그래야 아래 메서드가 항상 일정하게 나온다.

        class OuterMethodClass {
            void OuterMethodClassMethod() {
                System.out.println(num);
            }
        }
        // 예를 들어 여기에서 num의 값을 바꿀수 있다면.
        OuterMethodClass OMC = new OuterMethodClass();
        OMC.OuterMethodClassMethod(); // 여기서 실행할때와, 외부. 예를들어 main에서 실행하는 것과 값이 달라진다.
    }

    class Inner {
        int num = 20;

        Inner() {
        }

        void InnerMethod() {
            this.num = 10; // Inner 를 나타냄
            Outer.this.num = 10; // Outer를 나타냄
        }
    }

    static class staticInner {
        int num = 30;

        staticInner() {
        }
    }

    static void staticInnerMethod() {
    }
}