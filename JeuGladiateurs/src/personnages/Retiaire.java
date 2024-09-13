
package personnages;

public class Retiaire extends Personnage
{
    private boolean siPossedeFilet;
    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        siPossedeFilet =true;
    }

    public boolean isSiPossedeFilet() {
        return siPossedeFilet;
    }

    public void setSiPossedeFilet(boolean siPossedeFilet) {
        this.siPossedeFilet = siPossedeFilet;
    }
    
}
