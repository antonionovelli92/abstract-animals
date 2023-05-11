package jungle.kingdom.animals;

import jungle.kingdom.Kingdom;

public class Passerotto extends Kingdom {

	  @Override
	    public void dormi() {
	        System.out.println("ZzzPasserottozzZZ");
	    }

	    @Override
	    public void verso() {
	        System.out.println("Cip cip");
	    }

	    @Override
	    public void mangia() {
	        System.out.println("Semi e vermi");
	    }
	    @Override
	    public String toString() {
	        return "Passerotto";
	    }

}