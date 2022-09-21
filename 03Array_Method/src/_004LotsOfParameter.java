/**
 * _004LotsOfParameter
 * 
 * 그러면 또 다른 생각이.
 * 무수히 많은 인수로 하여, 실인수를 받을 순 없을까
 * 
 * [가변인수]
 * 인수 부분에 int... 같은 형식의 타입으로 놓으면,
 * 인수 자체에 배열 또는 그 각각원소의 나열로 연산이 가능해짐.
 * 
 */
public class _004LotsOfParameter {

    public static void main(String[] args) {
        System.out.println(getSum(1));
        System.out.println(getSum(1, 2));
        System.out.println(getSum(1, 2, 3));

        System.out.println(getSum(new int[] { 1, 2, 3, 4, 5 }));
    }

    static int getSum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
/*
 * 질문
 * 1. 그냥 가변인수 말고 parameter를 int[] 타입으로 해도 되지 않나요?
 * => 그렇게 하면 배열로만 제한되기 때문에 가변인수로 하는게 좋습니다.
 * 사실은. 메서드 내부에서 인수를 받게 되면, 알아서 판별하게 해줬기 때문에 여러모로 편의기능이라고만 생각하면 됩니다.
 */