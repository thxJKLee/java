/**
 * _003GetClass1
 * getClass 메서드에는 Class 객체를 반환하는데.
 * 여기서 다수의 메서드가 있음
 * 1. String getName() : 클래스 이름
 * 2. Field[] getDeclaredFields() : 필드 목록
 * 3. Method[] getDeclaredMethods() : 선언된 메서드 목록
 * 4. Constructor<?>[] getConstructors() : 생성자 목록 조사
 * 5. Class<?>[] getClasses() : 포함된 클래스 목록을 조사
 * 6. Field[] getFields() : 상속받은것 + public 필드 목록
 * 7. Method[] getMethods() : 상속받은것 + public 메서드 목록
 * 8. Class<? super T> getSuperclass() : 슈퍼클래스에 대한 정보
 * 9. boolean isEnum() : 열거타입인지
 * 10. boolean isInterface() : 인터페이스인지
 * 11. boolean isPrimitive() : 기본타입인지.
 * 
 * 
 * 이걸 외우는건 아니고, 그냥 클래스 정보 가져올려면 많이 가져올 수 있구나... 정도로만
 * [번호 순서대로 아래에도 작성하니 옆에다 켜놓고 같이 보면됨]
 * [var 뒤에 변수부분에 마우스 올려두면 타입 나오니깐 이것도 확인.]
 */
public class _003GetClass1 {

    public static void main(String[] args) {
        Human05 lee = new Human05(22, "lee");

        var cls = lee.getClass();

        System.out.println("01>" + cls.getName());

        System.out.print("02>");
        for (var x : cls.getDeclaredFields())
            System.out.print(x.getName() + " ");
        System.out.println();

        System.out.print("03>");
        for (var x : cls.getDeclaredMethods())
            System.out.print(x.getName() + " ");
        System.out.println();

        System.out.print("04>");
        for (var x : cls.getConstructors())
            System.out.print(x.getName() + " ");
        System.out.println();

        System.out.print("05>");
        for (var x : cls.getClasses())
            System.out.print(x.getName() + " ");
        System.out.println();

        System.out.print("06>");
        for (var x : cls.getFields())
            System.out.print(x.getName() + " ");
        System.out.println();

        System.out.print("07>");
        for (var x : cls.getMethods())
            System.out.print(x.getName() + " ");
        System.out.println();

        System.out.print("08>");
        System.out.println(cls.getSuperclass().getName());

        System.out.print("09>");
        System.out.println(cls.isEnum());

        System.out.print("10>");
        System.out.println(cls.isInterface());

        System.out.print("11>");
        System.out.println(cls.isPrimitive());

    }
}

class Human05 {
    int age;
    String name;

    Human05(int age, String name) {
        this.age = age;
        this.name = name;
    }
}