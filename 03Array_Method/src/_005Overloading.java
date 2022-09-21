/**
 * _005Overloading
 * 
 * 일반적으로 변수선언할 때는,
 * 같은 이름으로 선언이 불가능하다.
 * int value;
 * double value;
 * => 불가능
 * 
 * 
 * 하지만 메서드는 변수와 달리 Signature 라고 구분한다고 합니다.
 * 이 시그니쳐에는
 * 1. 메서드의 이름
 * 2. 인수의 타입 목록.
 * => 이 두가지가 같아야 완전한 같은 것이라고 생각하나 봅니다.
 * 
 * 
 * [그러면 타입만 다르게 하는 메서드? => 정답]
 */
public class _005Overloading {

    public static void main(String[] args) {
        System.out.println("getMax(33, 13, 71, 97, 83) = " + getMax(33, 13, 71, 97, 83));
        System.out.println("getMax(33.3, 13.1, 71.2, 97.4, 83.5) = " + getMax(33.3, 13.1, 71.2, 97.4, 83.5));
    }

    static int getMax(int... a) {
        int max = 0;
        for (var x : a) {
            max = max < x ? x : max;
        }
        return max;
    }

    static double getMax(double... a) {
        double max = 0;
        for (var x : a) {
            max = max < x ? x : max;
        }
        return max;
    }
}
/*
 * 질문.
 * 1. 혹시 더 자세한 판별규칙이 있나요
 * => 리턴 타입만 다르면 불가능
 * ex) int getMax(int a, int b) vs double getMax(int a, int b)
 * => 인수 이름만 달라도 불가능
 * ex) int getMax(int a,int b) vs int getMax(int x,int y)
 * 
 * 2. 우리가 일반적으로 쓰이는 예시는 있나요
 * => println의 경우. 문자열도 받고, 실수도 받고, 정수도 받고.
 * [모두 문자열로 바꾼다음에 전달하는 방식은 아님]
 * => 굳이 얘기하면 +연산, -연산 같은것도 오버로딩입니다.[C++의 연산자 오버로딩을 기억하세요]
 * [대표적으로 문자열끼리 더하기 vs 숫자끼리 더하기.]
 */