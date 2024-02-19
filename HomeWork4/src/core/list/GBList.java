package core.list;

public interface GBList<T> extends Iterable<T> {
    void addLast(T elem);
    void remove(int index);
    T getElem(int index);
    int size();
}