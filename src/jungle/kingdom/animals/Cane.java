package jungle.kingdom.animals;

import jungle.kingdom.Kingdom;

public class Cane extends Kingdom {

    @Override
    public void dormi() {
        System.out.println("ZzzCanezzZZ");
    }

    @Override
    public void verso() {
        System.out.println("Bau");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }
    
    @Override
    public String toString() {
        return "Cane";
    }

    
}