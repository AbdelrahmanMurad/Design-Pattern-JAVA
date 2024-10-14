package ShallowDeepCopy;

import java.io.Serializable;

public class A implements Serializable, Cloneable {
    //cloneable for shallow copy
    //serializable for deep copy

    int data;
    B b;
    transient public float number;//مجرد عابر

    public A() {
        b = new B();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
