package jungle.kingdom.animals;

import jungle.kingdom.Kingdom;
import jungle.kingdom.Nuota;

public class Delfino extends Kingdom implements Nuota {

    @Override
    public void dormi() {
        System.out.println("ZzzDelfinozzZ");
    }

    @Override
    public void verso() {
        System.out.println("Fischio");
    }

    @Override
    public void mangia() {
        System.out.println("Pesce");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
    
    @Override
    public String toString() {
        return "Delfino";
    }
}
