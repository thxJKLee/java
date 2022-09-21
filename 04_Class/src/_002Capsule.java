/**
 * _002Capsule
 * 일반적으로 다른 클래스를 사용할때
 * 변수 그 자체는 private나, 자식만 사용할 수 있도록, protected로 해놓고
 * get 이나 set으로 접근하는게 정석.
 * 
 * 목적은
 * 내부구조는 밝히지 않은 상태에서
 * 외부유저한테는 단순히 사용법만 알려줘서 편하도록.
 * 굳이 구조를 알 필요 없이 사용하기 편하도록
 * 개선 편이성
 * 또한, 오류방지
 * 
 * 
 * 기계 작동법만 외부에 알려주고
 * 내부에서는 알아서 작동하도록.
 */
public class _002Capsule {

    public static void main(String[] args) {
        Range range = new Range(2, 100);
        range.outRange();

        range.setFrom(120);
        range.outRange();

        range.setTo(0);
        range.outRange();
    }
}

/**
 * Range
 */
class Range {
    private int from;
    private int to;

    Range(int from, int to) {
        setFrom(from);
        setTo(to);
    }

    public void setFrom(int from) {
        this.from = from;
        if (to < from)
            to = from;
    }

    public void setTo(int to) {
        this.to = to;
        if (to < from)
            from = to;
    }

    public void outRange() {
        System.out.println(from + "~" + to);
    }
}
