package main.medical_staff.actions;

public interface Injectable {
    default double vaccine() {
        return 5D;
    }
}
