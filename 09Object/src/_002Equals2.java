/**
 * _002Equals2
 * 
 * 그러나 연산자 오버라이딩은 없어서. equals로 연산을 무조건 해줘야 한다.
 * 그리고 equals를 재정의하면. hashcode도 재정의 하는게. 해시컬렉션에 저장할때 공간을 아낄 수 있다.
 * 
 * 왜냐하면 내용이 같으면 해시값도 같아야 되는데.
 * 직접 내부 내용을 이용한 해시값을 설정해주면(특히 소수를 곱하는)
 * 분명 해시값도 일치하기 때문이다.
 * 
 * 
 * [해시값이 우.연.히. 일치할 확률은 꽤 낮다. 그래도 안생기는건 아님.]
 */
public class _002Equals2 {

    public static void main(String[] args) {
        var kim1 = new Human04(20, "kim");
        var lee1 = new Human04(30, "lee");
        var lee2 = new Human04(30, "lee");
        var kim2 = kim1;

        System.out.println(kim1 == kim2); // 대입 연산을 하면 완전히 같은 위치를 표현하는 셈이라 같다고 나옴.
        System.out.println(lee1.equals(lee2)); // 오버라이딩 해줬으므로 같다고 나옴
    }
}

class Human04 {
    int age;
    String name;

    Human04(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Human04) {
            Human04 other = (Human04) obj;
            if (age == other.age && name.equals(other.name))
                return true;
            else
                return false;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int c = 37;
        int result = 79;
        result = c * result + name == null ? 0 : name.hashCode();
        result = c * result + age;
        return result;
    }
}