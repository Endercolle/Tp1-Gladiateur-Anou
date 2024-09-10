package combat;

public class CompteurDeTour {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    int cptrTour;
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public CompteurDeTour() {
        cptrTour = 1;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    public int getCptrTour() {   
        return cptrTour;
        // TODO : Incrémenter le compteur de tour
    }

    public void setCptrTour(int cptrTour) {
        this.cptrTour = cptrTour;
    }

   
    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void augmenteTour() {
        cptrTour++;
    }

    public void afficheTour() {
        System.out.println("--------------");
        System.out.println("TOUR ACTUEL: " + cptrTour);
        System.out.println("--------------");
    }
    // </editor-fold>
}
