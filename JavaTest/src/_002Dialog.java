/**
 * _002Dialog
 * 아니면, 그래픽 라이브러리를 이용하는 방법이 있습니다.
 * [스윙]
 * 
 * javax.swing.JOptionPane.showInputDialog("title");
 */
public class _002Dialog {

    public static void main(String[] args) {
        String name = javax.swing.JOptionPane.showInputDialog("이름?");
        System.out.println("안녕하세요." + name + "님");

        String age_str = javax.swing.JOptionPane.showInputDialog("나이?");
        int age = Integer.parseInt(age_str); // 의도상 int형이여야 되기 때문에

        System.out.println("나이는 " + age);
    }
}
/*
 * 여기서 입력받는 것은 크게 문제가 안된다.
 * 
 * 터미널을 통해 접근할 경우 EUC-KR로 인식되는 것일까
 */