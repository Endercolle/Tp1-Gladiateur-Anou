package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Méthodes d'affichage">
    public void afficherDebutCombat() {
        System.out.println("");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>> Que le combat commence ! <<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
    }
    
    public void afficherSeparateurDeTour() {
        System.out.println("*********************************");
    }

    public void afficherSeparateurInfosPerso() {
        System.out.println("---------------");
        System.out.println("Info Personnage");
        System.out.println("---------------");
        System.out.println("");
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        if (personnage1.getPointsDeVie() == 0) 
        {
            System.out.println(personnage2.getNom() + " gagne le combat");
        }
        else
        {
            System.out.println(personnage1.getNom() + " gagne le combat");
        }
    }
    // </editor-fold>
}
