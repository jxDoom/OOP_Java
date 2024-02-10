package main.medical_staff.actions;

public interface Inspectable {
    default String inspect() {
        return "Осмотр пациента";
    }
}
