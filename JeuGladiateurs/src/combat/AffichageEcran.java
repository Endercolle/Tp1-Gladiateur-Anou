package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="M�thodes d'affichage">
    public void afficherDebutCombat() {
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>> Que le combat commence ! <<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
    }
    
    public void afficherSeparateurDeTour() {
        // TODO : Afficher un retour � la ligne, suivi d'une ligne d'ast�risques, tel que montr� dans l'�nonc�
    }

    public void afficherSeparateurInfosPerso() {
        // TODO : Afficher un retour � la ligne, suivi du s�parateur "infos personnages", tel que montr� dans l'�nonc�
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        // TODO : Afficher le gagnant du combat, tel que montr� dans l'�nonc�
    }
    // </editor-fold>
}
