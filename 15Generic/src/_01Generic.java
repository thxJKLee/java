/**
 * _01Box
 */
public class _01Generic {

    public static void main(String[] args) {
        Box<Integer> bi01 = new Box<Integer>(123);
        Box<Integer> bi02 = new Box<>(123); // 자바 7 이상
        Box<Integer> bi03 = new Box(123); // 타입 안정성 경고. Raw타입으로 인식함.
        var bi04 = new Box<>(123); // 자바 10 이상. 타입추론.[편하긴 한데 아직은 호환성에 어렵고, 타입공부할때 쓸만함]

        //
        // 다음 것은 자제
        Box bi05 = new Box(123); // Raw 타입. 이전버전과의 호환성을 위한 허용
        // System.out.println((String)bi05.get());
        System.out.println((int) bi05.get()); // 캐스팅이 필요하다(라고 한다)

        //
        // 제너릭 메서드의 경우
        _01Generic.<Integer>print(123); // 메서드 바로 직전에 제너릭을 작성.
        // 추론가능하면 생략할 수 있다.
    }

    static <T> void print(T a) {
        System.out.println(a);
    }
}

/*
 * T Type
 * E Element
 * K Key
 * V Value
 * N Number
 */
class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

    void set(T value) {
        this.value = value;
    }
}