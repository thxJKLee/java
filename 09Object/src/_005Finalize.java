/**
 * _005Finalize
 * 
 * finalize는 다른게 아니라.
 * 일단 지금은 Deprecated 가 됐지만 이론만 설명하면.
 * 메모리 회수. 하지만 자바는 메모리 회수 측면에서는 월등해서.
 * 
 * 그리고 finalize 는 랜덤성이 짙어서 그냥
 * 그냥..
 * 그냥
 * 
 * 우리가 메서드를 만들고
 * 명시적으로 관리해주는게
 * 훨씬
 * 훨씬 안전하다.
 */
public class _005Finalize {

    public static void main(String[] args) {
        Human07 kim = new Human07(12, "kim");
        System.out.println(kim);
    }
}

class Human07 {
    int age;
    String name;

    Human07(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age + "세, " + name;
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        // super.finalize(); // Deprecated 발생
    }
}