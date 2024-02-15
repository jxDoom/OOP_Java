package veterinary_clinic.core.drugstore;

public class Component implements Comparable<Component> {
    private String title;
    private Double weight;
    private int power;
//    private Double power;

    public Component(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    public Component() {
    }

    public String getTitle() {
        return title;
    }

    public Double getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("Title = %s, Power = %s", title, power);
    }

    @Override
    public int compareTo(Component o) {
//        if (this.power > o.power) return 1;
//        else if (this.power < o.power) return -1;
//        else return 0;

        return Integer.compare(this.power, o.power); // Сортировка по возрастанию

//        return Integer.compare(o.power, this.power); // Сортировка по убыванию

//        return this.power.compareTo(o.power); // Вариант с Double

//        return (int)(this.power - o.power); // Вариант с Double
    }
}
