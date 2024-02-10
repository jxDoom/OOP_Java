package main.medical_staff;

import main.medical_staff.actions.Injectable;
import main.medical_staff.actions.Inspectable;
import main.medical_staff.actions.Provideable;

import java.time.LocalDate;

public class HeadNurse extends Nurse implements Provideable, Inspectable, Injectable {
    public HeadNurse(String name, LocalDate birthDate, boolean highEducation, int experience) {
        super(name, birthDate, highEducation, experience);
    }

    @Override
    public void provide() {
        System.out.println(getName() + " делает заказ на медикаменты, оформляет документацию, снабжает вет. клинику");
    }
}
