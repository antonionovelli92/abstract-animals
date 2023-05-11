package java.jungle.kingdom.animals;

import java.jungle.kingdom.Kingdom;

public class Cane extends Kingdom {

    @Override
    public void dormi() {
        System.out.println("Zzz");
    }

    @Override
    public void verso() {
        System.out.println("Bau");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }
    
}