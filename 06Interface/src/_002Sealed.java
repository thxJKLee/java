/**
 * _002Sealed
 * [JDK 17]
 * 
 * sealed class(interface) 클래스명 permits 후손목록 { ... }
 * 클래스의 자손을 후손목록으로 제한합니다.
 * 
 * 후손목록이 하나도 없다면.
 * 이는 final 선언과 같은 효과
 * 
 * 
 * 반대로 제한 없게 하고 싶다면 non-sealed 를 붙이면 됨.[permits 는 빼고]
 * 
 * 결국은
 * 1. final
 * 2. sealed
 * 3. non-sealed 세가지.
 */
abstract sealed class Laguage permits Java, Cpp, CSharp {
}

final class Java extends Laguage {
}

final class Cpp extends Laguage {
}

final class CSharp extends Laguage {
}

public class _002Sealed {

    public static void main(String[] args) {

    }
}