package main.medical_staff;

import java.time.LocalDate;

public abstract class BaseStaff {
    public String name;
    public LocalDate birthDate;
    public boolean highEducation;
    public int experience;

    public BaseStaff(String name, LocalDate birthDate, boolean highEducation, int experience) {
        this.name = name;
        this.birthDate = birthDate;
        this.highEducation = highEducation;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public boolean isHighEducation() {
        return highEducation;
    }

    public int getExperience() {
        return experience;
    }

    public void setHighEducation(boolean highEducation) {
        this.highEducation = highEducation;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void lunch();

    @Override
    public String toString() {
        return String.format("Имя: %s, Дата рождения: %s, Высшее образование: %s, Стаж работы: %s",
                name, birthDate, highEducation, experience);
    }
}
