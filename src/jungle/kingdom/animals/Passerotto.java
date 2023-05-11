package jungle.kingdom.animals;

import jungle.kingdom.Kingdom;
import jungle.kingdom.Vola;

public class Passerotto extends Kingdom implements Vola {

    @Override
    public void dormi() {
        System.out.println("ZzzPasserottozzZ");
    }

    @Override
    public void verso() {
        System.out.println("Cip");
    }

    @Override
    public void mangia() {
        System.out.println("Semi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
