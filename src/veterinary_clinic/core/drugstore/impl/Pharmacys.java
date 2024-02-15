package veterinary_clinic.core.drugstore.impl;

import veterinary_clinic.core.drugstore.Component;
import veterinary_clinic.core.drugstore.PharmacyX;

import java.util.ArrayList;

public class Pharmacys {
    private ArrayList<PharmacyX> pharmacys = new ArrayList<>();

    public ArrayList<PharmacyX> addPharmacys() {
        PharmacyX p1 = new PharmacyX("Felocil", 12.2, 13);
        PharmacyX p2 = new PharmacyX("Melbimax", 6D, 44);
        PharmacyX p3 = new PharmacyX("Orpage", 8.4, 16);
        PharmacyX p4 = new PharmacyX("Giagant", 54.4, 2);

        pharmacys.add(p1);
        pharmacys.add(p2);
        pharmacys.add(p3);
        pharmacys.add(p4);
        return pharmacys;
    }

}
