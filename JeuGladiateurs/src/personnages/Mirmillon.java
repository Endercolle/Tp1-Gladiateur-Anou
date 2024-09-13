
package personnages;


public class Mirmillon extends Personnage
{
private boolean doubleTour;
    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        initiative = 30;
        doubleTour = true;
    }

    public boolean isDoubleTour() {
        return doubleTour;
    }

    public void setDoubleTour(boolean doubleTour) {
        this.doubleTour = doubleTour;
    }
    
}
