package jungle.kingdom.animals;

import jungle.kingdom.Kingdom;

public class Delfino extends Kingdom {
	
    @Override
    public void dormi() {
        System.out.println("ZzzDelfinozzZ");
    }

    @Override
    public void verso() {
        System.out.println("Fischi");
    }

    @Override
    public void mangia() {
    System.out.println("Pesce");
	    }
    @Override
    public String toString() {
        return "Delfino";
    }

    
}