
package personnages;


public class mirmillon extends Personnage
{
boolean doubleTour;
    public mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
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
