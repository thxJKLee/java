/**
 * _001Array
 * 
 * new 선언에 대해 다시 상기하자.
 * new 선언은 메모리의 힙에 올리는 행동이라고 생각하면 좋음.
 * 그리고 new 선언 이후 다시 new 선언하면 자동으로 [C++의 delete 처리가 되는 듯 함.]
 */
public class _001Array {

    public static void main(String[] args) {
        int[] score1;
        score1 = new int[] { 1, 2, 3, 4, 5 };
        //
        int[] score2 = new int[] { 1, 2, 3, 4, 5 };
        //
        int[] score3 = { 1, 2, 3, 4, 5 };

        //
        score1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(score1);
        System.out.println(score2);
        System.out.println(score3);
        System.out.println(score3.toString());
        // 값이 안나옴. 뭐 toString() 메서드가 나오는거라고 하는데. 아무튼 주소같은거라고 생각하면 될 듯
    }
}