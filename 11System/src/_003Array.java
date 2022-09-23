/**
 * _003Array
 * 배열 복사를 지원.
 * 일반적인 대입복사가 아니라
 * 고속복사라고 하는데
 * 
 * void arraycopy(원본배열, 원본배열시작위치, 복사받을배열, 복사받을배열시작위치, 복사할 길이)
 */
public class _003Array {

    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4, 5 };
        int[] ar2 = new int[5];

        System.arraycopy(ar, 0, ar2, 0, 5);

        for (var x : ar2)
            System.out.print(x + " ");
        System.out.println();

        System.arraycopy(ar, 1, ar, 3, 2); // 원본끼리 붙여넣기도 가능
        for (var x : ar)
            System.out.print(x + " ");
        System.out.println();
    }
}
/*
 * 질문
 * 1. 다른 복사방식은 없는가.
 * [Arrays 클래스에 copyOf 와 copyOfRange가 있습니다.]
 * 2. 굳이 빈 배열을 선언해야하는가
 * [Arrays 클래스에서 사용하는 메서드는 아예 배열을 반환]
 */