package jungle.kingdom.animals;

import jungle.kingdom.Kingdom;
import jungle.kingdom.Vola;

public class Aquila extends Kingdom implements Vola {

    @Override
    public void dormi() {
        System.out.println("ZzzAquilaazzZZ");
    }

    @Override
    public void verso() {
        System.out.println("Cra");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
    
    @Override
    public String toString() {
        return "Aquila";
    }
}
