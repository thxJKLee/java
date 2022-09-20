/**
 * _002Oldswitch
 * switch문은 깔끔할때는 깔끔한데
 * 
 * C++에서 공부한바로는
 * 케이스문 내부에서 변수선언을 한다면
 * 중괄호를 해줘야 했다. [오류가능성이 있는걸까]
 */
public class _002Oldswitch {

    public static void main(String[] args) {
        int days;
        int month = 1;

        switch (month) {
            case 2:
                days = 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            default:
                days = 30;
                break;
        }
        System.out.println(days);
    }
}