import java.util.*;

/**
 * 동적 배열
 * ArrayList<E>()
 * ArrayList<E>(int initialCapacity) // 초기 할당 크기.
 * ArrayList()(Collection<? extends E> c)
 * 
 * 미리 할당을 하고.
 * 그 할당한 크기를 넘으면 삽입할때마다 재할당되어 늘어난다.[이때 속도가 느려질수도 있다.]
 * default는 10, 또는 initialCapacity를 이용한다.
 * 
 * 그래서 size() 메서드를 사용하면 실질적으로 사용하는 크기가 나온다.
 * initialCapacity가 튀어나오는게 아니다.
 */
class _01ArrayList {

    public static void main(String[] args) {
        var arNum = new ArrayList<Integer>();
        arNum.add(1); // 원래는 래퍼클래스가 들어가야 하지만 알아서 박싱해줌
        arNum.add(2);
        arNum.add(1, 3);
        System.out.println(arNum);
        System.out.println();

        System.out.println(arNum.size());
        System.out.println(arNum.isEmpty()); // 굳이 빈거 찾으려면 이게 제일 빠름
        System.out.println();

        System.out.println(arNum.get(1)); // 값 읽기
        System.out.println(arNum.set(1, 3)); // 값 교체
        System.out.println(arNum.remove(1)); // 값 삭제
        // boolean remove(Object o)
        // void removeRange(int from, int to)
        // void clear
        System.out.println();

        var arNum1 = new ArrayList<Integer>(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9,
                1, 2, 3, 4, 5, 6, 7, 8, 9)); // 선언할 때
        // Arrays.asList 는 List 타입을 반환하는데
        // 바로 대입은 불가능하고. 생성자로 넣음.
        // Collection<? extends E> 이므로..
        System.out.println(arNum1.indexOf(3));
        System.out.println(arNum1.lastIndexOf(3));
        System.out.println();

        var ar01 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        var ar02 = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 8));

        System.out.println(arNum);
        arNum.addAll(ar01); // 합집합
        System.out.println(arNum);
        var copyAr01 = new ArrayList<Integer>(ar01);
        System.out.println(copyAr01.removeAll(ar02)); // 차집합
        System.out.println(copyAr01);
        copyAr01 = new ArrayList<Integer>(ar01);
        System.out.println(copyAr01);
        System.out.println(copyAr01.retainAll(ar02)); // 교집합
        System.out.println(copyAr01);
        copyAr01 = new ArrayList<Integer>(ar01);
        System.out.println(copyAr01.containsAll(ar02)); // 부분집합
        System.out.println(copyAr01);
        System.out.println();
        // 합 차 교 는 원본을 훼손함.
        // 물론 적절한 방식으로 이 명령어와 동일한 것을 만들 수는 있을거 같긴한데...

        //
        //
        //
        // 배열로 변환
        var arNum2 = new ArrayList<Integer>(arNum1);
        Integer[] arNumInteger = arNum2.toArray(new Integer[0]);
        System.out.println(arNumInteger);
        System.out.println();
        // 위의 방법이 좀더 쉽다.
        // Integer[] arNumInteger = new Integer[arNum.size()];
        // arNum2.toArray(arNumInteger);
        // 이 방법은 크기까지 지정해줘야 되는데. 이해 자체는 편함.

        // 정리하면. A.toArray(B) 라고 하면
        // 1. A 컬렉션을 B로 바꾸겠다는 뜻. 다 못채우면 null로 다 채움
        // 2. 만약에 다 못넣으면 새로운 크기의 배열로 반환

        // Object 버전
        Object[] ar = arNum2.toArray();
        for (Object a : ar)
            System.out.println(a); // 출력은 되는데.. 진정하게 사용하려면 Integer로 바꿔줘야

        //
        //
        // 뷰. 망원경처럼 일부를 크게 본다고 생각하면 됨
        // 뷰의 장점은 아래에 작성
        ArrayList<Integer> arView = new ArrayList<Integer>(
                Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> sub = arView.subList(1, 8); // subList는 일단 List타입 리턴
        System.out.println(sub);

        arView.set(2, 100);
        System.out.println(sub); // 원본이 바뀌면 이것도 바뀜

        sub.set(3, 200);
        System.out.println(arView); // 뷰를 바꿔도 원본이 바뀜.

        sub.clear();
        System.out.println(arView); // 뷰를 삭제해도 원본에 있던게 삭제됨.
        // 1. C++ 처럼 설명하면. 마치 그 부분의 포인터를 그대로 가져온다고 생각하면 된다
        // 2. 원래 있던 ArrayList 도 참조형이고, 뷰도 참조형이니깐
        // 3. 동시에 바뀐다고 생각하면 될 듯.

        //
        // 이걸 하는 이유는. 일부만 보고 검색을 하든, 변경을 하든 하면.
        // 속도가 빨라지는게 있음.
        // => 다만 뷰의 순서값이라. 사소한 연산이 필요.

        // 원본이 뷰 생성시점과 달라지면 [예를들어 원본의 삭제는 아예 배열자체가 압축되는 셈이라]
        // 뷰가 오류.

        // 그래서 원본에 대한 알고리즘을 적용할 때, 일시적으로만 사용.
    }
}