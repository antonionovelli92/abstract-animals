package jungle;


import jungle.kingdom.*;
import jungle.kingdom.AnimalMenager;
import jungle.kingdom.animals.Aquila;
import jungle.kingdom.animals.Cane;
import jungle.kingdom.animals.Passerotto;
import jungle.kingdom.animals.Delfino;


public class Main {

    public static void main(String[] args) {
        
    	Cane cane = new Cane();
    	Passerotto passerotto = new Passerotto();
    	Aquila aquila = new Aquila();
    	Delfino delfino = new Delfino();
        
        Kingdom[] regno = { cane, passerotto, aquila, delfino };
        AnimalMenager m = new AnimalMenager();

        for (int i = 0; i < regno.length; i++) {
            Kingdom a = regno[i];
            System.out.println("------------------------------------\n");
            System.out.println("Animale: " + a);

            System.out.print("Verso: ");
            a.verso();

            if (a instanceof Vola) {
                m.faiVolare((Vola) a);
            }

            if (a instanceof Nuota) {
                m.faiNuotare((Nuota) a);
            }
    }
   }

}