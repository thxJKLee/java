import java.util.*;

/**
 * _02LinkedList
 * 앞뒤 순서를 기억하기 때문에,
 * 중간에 값을 넣으면 단순하게 생각해서 3가지만 진행하면 된다.
 * ACD 에서 C자리에 B를 넣는다면[보통 뒤로 밀어넣으니깐 => ABCD 가 되도록]
 * 1. 메모리에 B값을 부여
 * 2. A뒤를 B로 지정
 * 3. C앞을 B로 지정
 * 
 * 삭제도 단순해진다. ABC 에서 B를 삭제한다면
 * 1. B앞인 A. A뒤를 C로 지정
 * 2. B뒤인 C. C앞을 A로 지정. // 이거는 A 변경한김에 그대로 넘어가도 될듯
 * 3. B를 메모리에서 삭제
 * 
 * 하지만 읽기속도는 느리다. 둘다 알고리즘은 달라도 비슷한 면이 많기 때문에 대체가능하다.
 * 
 * 
 * 
 * 여기서 제일 중요한 사실은
 * LinkedList 와 ArrayList 의 super가 List 기 때문에.
 * List 타입으로 선언하고 적절히 왔다갔다 할 수 있다.
 * 
 * 
 * 예제에서는 일반적인 클래스 타입을 이용하지만.
 * 실무에서는 추상타입으로 만드는게 적절.[대충 직접 설정한 클래스라고 생각하는게. 행렬에서 1열 2열 느낌]
 */
public class _02LinkedList {

    public static void main(String[] args) {
        var arInt = new LinkedList<Integer>(
                Arrays.asList(
                        1, 2, 3, 4, 5, 6, 7, 8, 9, 0,
                        1, 2, 3, 4, 5, 6, 7, 8, 9, 0)); // 원본을 복사해서 활용

        //
        // 원소 넣기
        var arInt1 = new LinkedList<Integer>(arInt);
        arInt1.add(1);
        arInt1.add(3);
        arInt1.add(4);
        arInt1.add(1, 2);
        System.out.println(arInt1);
        System.out.println();

        //
        // 반복자. [그냥 좌우 이동에 특화된 포인터라고 생각하면 됨.]
        // Iterator<E> iterator().
        // 모든 컬렉션에 Iterable 인터페이스를 구현되어 있기 때문에 사용가능[~able 류는 나중에 더 배움]
        var arInt2 = new LinkedList<Integer>(arInt);

        Iterator<Integer> it = arInt2.iterator(); //
        // System.out.println(it.next());
        while (it.hasNext()) // 다음것이 있는지 확인조사. [이 명령어 자체는 다음으로 안넘어감.] boolean hasNext()
            System.out.print(it.next() + " "); // 여기 ' '을 더하면 오류. E next()
        // void remove() : next()로 읽은 요소 삭제.
        System.out.println();

        it = arInt2.iterator(); // iterator 는 맨 끝까지 가면 쓸모 없어지는 느낌이라 다시한번 더 선언해야 됨
        while (it.hasNext()) {
            if (it.next() % 2 == 0)
                it.remove(); // 마치 뷰처럼 반복자로 지우면 원본도 날아간다.
        }
        System.out.println(arInt2);
        System.out.println();

        //
        // ListIterator<E> listIterator([int index]) => index: 시작위치
        // iterator를 상속받아서.
        // 역방향 이동, 값변경, 현재위치조사 등의 기능
        var arInt3 = new LinkedList<Integer>(arInt);
        ListIterator<Integer> listIt = arInt3.listIterator(0);
        while (listIt.hasNext())
            System.out.print(listIt.next() + " ");
        System.out.println();
        while (listIt.hasPrevious())
            System.out.print(listIt.previous() + " ");
        System.out.println();
        // int previousIndex() => 원본과 링크해서 확인하고 싶다면.
        // int nextIndex()
        //
        // 아래는 조금 비추천.
        // void set(E e) => 읽온 요소의 값을 변경함
        // void add(E e) => next로 읽은 앞쪽, previous로 읽은 뒤쪽에 새로운 요소를 삽입.

        
    }
}