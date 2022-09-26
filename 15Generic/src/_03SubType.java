import java.util.ArrayList;

/**
 * _03SubType
 */
public class _03SubType {

    public static void main(String[] args) {
        ArrayList<Parents> p = new ArrayList<Parents>();
        ArrayList<Child> c = new ArrayList<Child>();

        p.add(new Parents());
        p.add(new Child());

        // c.add(new Parents()); // Child 것을 온전히 쓸 수 있어야 되는데 못쓰게 되는 셈이라
        c.add(new Child());

        // p = c;
        // c = p; 
        // 안됨. 이거는 Parents Child가 아니라.
        // 엄연히 ArrayList 이기 때문에. ArrayList<Parents> 와 ArrayList<Child> 은 상속관계가 아니기 때문


    }
}

class Parents {
}

class Child extends Parents {
}