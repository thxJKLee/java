/**
 * _003Static1
 * 
 * 이걸 왜 정적 으로 해석하는지 모르겠는데.
 * 굳이 얘기하면
 * 
 * 동적 프로그래밍의 관점에서 생각해 봤을때
 * 메모리의 힙에 생성된다.
 * 보통 클래스 자체는 메서드영역. 정적영역에 있다.
 * 
 * 그래서 new 연산자를 하면
 * 힙에 생성되고
 * 그 힙을 가리키는 것으로 각각의 객체를 다룬다.
 * 
 * 그런데 그중에서도 분명
 * [공동구역]으로 하고 싶은 변수나 함수가 충분히 있을 수 있다.
 * 이를 static으로 선언하면. 동적으로. 막 사라지고 생성되고를 계속 하는게 아닌
 * 정적으로 ["빰!"] 하고 생성된뒤 프로그램이 끝날때까지 계속 있는.[미리 할당하는]
 * 
 * 
 * 
 * C++에서 배웠던거 중에서 생각하면(물론 자바에도 있지만)
 * 
 * 동적바인딩과 정적바인딩의 차이다.
 * 동적바인딩은 프로그램이 실행되면서 그때 어느 클래스의 함수를 할지 정하는 것이였고
 * 정적바인딩은 프로그램이 실행되기 이전에 이미 어느 클래스의 함수를 할지 정해지는 것.[미리]. 보통 업캐스팅,다운캐스팅에서 활용했었지
 */
public class _003Static1 {

    public static void main(String[] args) {
        Count count1 = new Count("A");
        Count.printCount();

        Count count2 = new Count("B");
        Count.printCount();

        Count.resetCount();
        Count.printCount();
        Count count3 = new Count("C");
        Count.printCount();
    }
}

class Count {
    String name;
    static int count;

    Count(String name) {
        setName(name);
        addCount();
    }

    public void setName(String name) {
        this.name = name;
    }

    static void printCount() {
        System.out.println("count: " + count);
    }

    static void resetCount() {
        count = 0;
    }

    static void addCount() {
        count++;
    }

}
/*
 * static 메서드 내부에는 static 멤버만 사용 가능합니다.
 * 
 * 일반 메서드 내부에서는 static 이나 일반멤버 둘다 사용 가능합니다.
 * 
 * static 메서드는 [클래스이름.메서드이름] 형식으로 합니다. 굳이 new 연산자로 변수선언을 한뒤 그 변수에서 선언할 필요는 없다.
 * 
 * System.out.println도 동일.
 * out은 System 클래스의 정적필드라. System 객체를 생성안하고 그냥 불러버렸지.
 * [만약 동적이었다면. System x = ~~~ 이런식으로 한다음에 x.out.~~~ 이런식으로 했어야 겠지.]
 */