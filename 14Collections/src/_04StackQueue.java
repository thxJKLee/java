import java.util.*;

/**
 * _04StackQueue
 * 다 알던 스택. 디큐. 큐
 * 
 * ArrayList의 구형버전 Vector 클래스에서 파생되는거라
 * 사용하면 안된다고 하지만.
 * 쓰던거라 쓰는 느낌.[워낙 유명한 이론이라 편하기도 하고]
 * 오래된 자료구조라 기능이 너무 단순함.
 * 
 * 
 * 결론만 말하면.
 * 이정도는 직접 만들만 하니깐. 만드는것도 괜찮은 방법이다.
 */
public class _04StackQueue {

    public static void main(String[] args) {
        //
        // 스택
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.empty()) {
            System.out.print(stack.peek() + " "); // 맨 위 살펴만 보기
            System.out.println(stack.pop()); // 맨 위 뽑아버리기
        }
        System.out.println();
        // int search(Object o)

        //
        // 디큐
        Deque<Integer> deque = new ArrayDeque<Integer>(); // ArrayDeque가 디큐를 구현함
        deque.addLast(1); // 실질적으로 push
        deque.addLast(2);
        deque.addLast(3);
        deque.addFirst(0);
        System.out.println(deque);
        while (!deque.isEmpty()) {
            System.out.println(deque.removeFirst());
            if (!deque.isEmpty())
                System.out.println(deque.removeLast()); // 실질적으로 pop
        }
        System.out.println();

        //
        // 큐
        // 보통 Queue는 보통 LinkedList로 구현한다.
        // [Queue 인터페이스가 있는데 이를 구현한 클래스는 없어서]
        var queue = new LinkedList<Integer>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " "); // 없으면 null
            // System.out.println(queue.remove()); ==> 없으면 오류
            if (!queue.isEmpty()) {
                System.out.println(queue.peek()); // 없으면 null
                // System.out.println(queue.element()); ==> 없으면 오류
            }
        }
        System.out.println();
    }
}