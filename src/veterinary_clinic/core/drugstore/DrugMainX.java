package veterinary_clinic.core.drugstore;

import veterinary_clinic.core.drugstore.components.Azitronite;
import veterinary_clinic.core.drugstore.components.Penicillin;
import veterinary_clinic.core.drugstore.components.Water;
import veterinary_clinic.core.drugstore.impl.Pharmacys;

import java.util.ArrayList;
import java.util.Collections;

public class DrugMainX {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("Penicillin", 1.6D, 6);

        // Первый вариант как решить задачу
        Pharmacys pharmacys = new Pharmacys();

        ArrayList<PharmacyX> pharmaList = pharmacys.addPharmacys();
//        System.out.println(pharmaList);
        Collections.sort(pharmaList);
        System.out.println(pharmaList);

//        ----------------------------------------------------------------------------------

        // Второй вариант: лекарства из нескольких компонентов
        PharmacyComp p1 = new PharmacyComp();
        p1.addComponents(water, azitronite);

        PharmacyComp p2 = new PharmacyComp();
        p2.addComponents(azitronite, penicillin);

        PharmacyComp p3 = new PharmacyComp();
        p3.addComponents(water, azitronite, penicillin);

        ArrayList<PharmacyComp> pharList1 = new ArrayList<>();
        pharList1.add(p1);
        pharList1.add(p2);
        pharList1.add(p3);
        Collections.sort(pharList1);
        System.out.println(pharList1);
    }
}
