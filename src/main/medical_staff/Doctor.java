package main.medical_staff;

import main.medical_staff.actions.Inspectable;
import main.medical_staff.actions.Operateable;

import java.time.LocalDate;

public class Doctor extends Assistent implements Operateable, Inspectable {
    double rating;
    public Doctor(String name, LocalDate birthDate, boolean highEducation, int experience, double rating) {
        super(name, birthDate, highEducation, experience);
        this.rating = rating;
    }

    @Override
    public void operate() {
        System.out.println(getName() + " оперирует пациента");
    }

    @Override
    public String toString() {
        return super.toString() + " Рейтинг("+rating+")";
    }
}
