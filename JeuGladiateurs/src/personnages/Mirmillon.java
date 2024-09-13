package personnages;

import java.util.Random;

public class Mirmillon extends Personnage {

    private boolean doubleTour;

    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        doubleTour = true;
    }

    public boolean isDoubleTour() {
        return doubleTour;
    }

    public void setDoubleTour(boolean doubleTour) {
        this.doubleTour = doubleTour;
    }

    @Override
    public void setNewInitiativeRandom() {
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 30;
        int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
        initiative = nombreAleatoire;
    }
}
