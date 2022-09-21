/**
 * _001Class
 * 
 * 아래에는 안나왔지만
 * { } 블록 자체를 만들어서 처음에 class 생성하면서 초기화 하는 방법.
 * 
 * init 메서드를 따로 만들어 줘서
 * 그 메서드를 선언하여 초기화 하는 방법
 */
public class _001Class {

    public static void main(String[] args) {
        Time time1 = new Time();
        time1.whatTime();

        Time time2 = new Time(2, 2, 2);
        time2.whatTime();

        Time time3 = new Time(false, 2, 2, 2);
        time3.whatTime();
    }
}

class Time {
    boolean am = true; // 명시적 초기화. 기본 생성자를 쓸 경우 이러한 값으로 초기화 해주라는 의미
    int hour = 0; // 사실 Time() 으로 선언하는 곳에 적어도 무방.
    int minute = 0;
    int second = 0;

    Time() { // 기본 생성자는 값을 원래는 0이나 false나 NULL로 초기화 해줌. 아니면 여기서 초기화 방식을 작성 가능.
    }

    Time(int hour, int minute, int second) {
        this(hour < 12, hour % 12, minute, second);
    }

    Time(boolean am, int hour, int minute, int second) { // 생성자 오버로딩
        this.am = am;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void whatTime() {
        System.out.print(am ? "오전" : "오후");
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}