package core.ex;

public class A<T> {
    private T[] arr; // для компилятора T не более чем буква

    public A() {
        this.arr = (T[]) new Object();
    }

}
