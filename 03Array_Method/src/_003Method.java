/**
 * _003Method
 * 여기서 배울 핵심 내용은.
 * 
 * [지정자] 리턴타입 메서드명(인수목록){
 * <본체>
 * <리턴값>
 * }
 * 
 * 1. 지정자는 메서드의 속성. 이라고만 생각해두자 (공개, 비공개, 자식한테만 공개, static 등등)
 * 
 * 2. 메서드 자체에서는 인수. Parameter 라고 한다.
 * 3. 하지만 우리가 실행할 때 실인수. Argument 라고 한다.
 * 
 * 4. void인 경우 return 값은 없지만, 메서드 종료를 위해 return; 을 활용
 * 
 * 5. 기본형의 경우 argument. 실인수가 메서드로 들어가는게 아니라. 그것의 복사본이 들어감.
 * [C++ 처럼 참조연산자를 이용할 수 있는것도 아니고]
 * [참조형의 경우. 방향을 제공한다고 생각하면 되고, 복사본이 아니라 실제 값을 사용하는 셈]
 * 
 * 
 */
public class _003Method {

    public static void main(String[] args) {
        System.out.println("1부터 999까지 합: " + calcSum(1, 999));
    }

    static int calcSum(int from, int to) { // 여기서는 parameter
        int sum = 0;
        for (int i = from; i <= to; i++)
            sum += i;
        return sum;
    }
}