package veterinary_clinic.core.drugstore;

import java.util.ArrayList;
import java.util.Arrays;

public class PharmacyComp implements Comparable<PharmacyComp> {
    ArrayList<Component> components = new ArrayList<>();

    public void addComponents(Component... components) {
        this.components.addAll(Arrays.asList(components));
    }

    public int sumPower() {
        int res = 0;
        for (Component el : this.components) {
            res += el.getPower();
        }
        return res;
    }

    @Override
    public String toString() {
        return String.format("Component %s, sum Power = %s", components, this.sumPower());
    }

    @Override
    public int compareTo(PharmacyComp o) {
        int otherSum = 0;
        int thisSum = 0;

        for (Component c : o.components) {
            otherSum += c.getPower();
        }

        for (Component c : this.components) {
            thisSum += c.getPower();
        }

        return Integer.compare(thisSum, otherSum);
    }
}
