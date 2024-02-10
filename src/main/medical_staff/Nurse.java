package main.medical_staff;

import main.medical_staff.actions.Injectable;
import main.medical_staff.actions.Inspectable;

import java.time.LocalDate;

public class Nurse extends BaseStaff implements Inspectable, Injectable {
    public Nurse(String name, LocalDate birthDate, boolean highEducation, int experience) {
        super(name, birthDate, highEducation, experience);
    }

    @Override
    public void lunch() {
        System.out.println("Обед начинается с 13:00 до 14:00");
    }
}
