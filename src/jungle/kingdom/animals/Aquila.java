package jungle.kingdom.animals;

import jungle.kingdom.Kingdom;

public class Aquila extends Kingdom {
	
	    @Override
	    public void dormi() {
	        System.out.println("ZzzAquilazzZ");
	    }

	    @Override
	    public void verso() {
	        System.out.println("Fischio");
	    }

	    @Override
	    public void mangia() {
	        System.out.println("Carne");
	    }
	    @Override
	    public String toString() {
	        return "Aquila";
	    }

}