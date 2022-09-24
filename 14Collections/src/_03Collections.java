import java.util.*;

/**
 * _03Collections
 * Collection 에 제공되는 알고리즘들
 */
public class _03Collections {

    public static void main(String[] args) {
        var arInt = new ArrayList<Integer>(
                Arrays.asList(
                        1, 2, 3, 4, 5, 6, 7, 8, 9, 0,
                        1, 2, 3, 4, 5, 6, 7, 8, 9, 0)); // 원본을 복사해서 활용

        //
        // static <T extends Comparable<? super T>> void sort(List<T> list)
        // static <T> void sort(List<T> list, Comparator<? super T> c)
        // 1. Comparable을 상속한 List인 경우
        // 2. Comparable을 상속한 List는 아니지만,
        // Comparator 람다함수로 뒤에 추가내용을 넣을 수 있는 경우
        // [보통 a-b를 리턴하도록 해서. a>b인지 아닌지 이런식으로 비교 방식을 넣고]
        // [비교할 것이 두개 이상이면 이 방식을 채택함.]
        // 간단하게 이 두가지라고 생각만 해두면 됨
        var arInt1 = new ArrayList<Integer>(arInt);
        System.out.println(arInt1);
        Collections.sort(arInt1);
        System.out.println(arInt1);
        Collections.reverse(arInt1);
        System.out.println(arInt1);

        //
        // static void shuffle(List<?> list, [Random rnd])
        Collections.shuffle(arInt1);
        System.out.println(arInt1);
        //
        // static <T> int binarySearch(List<? extends Comparable<? super T>> list, T
        // key) : key를 기준으로 이분 검색
        // static void rotate(List<?> list, int distance)
        // static void swap(List<?> list, int i, int j)
        // static <T> void fill(List<? super T> list, T obj)
        // static <T extends Object & Comparable<? super T>> T min(Collection<? extends
        // T> coll)
        // static <T extends Object & Comparable<? super T>> T max(Collection<? extends
        // T> coll)
    }
}