package main.actions;

public interface Goable {
    default Double run() {
        return 10D;
    }
}
