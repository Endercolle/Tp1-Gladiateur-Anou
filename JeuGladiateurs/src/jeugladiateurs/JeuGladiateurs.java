package jeugladiateurs;

import personnages.Personnage;
import personnages.Mirmillon;
import personnages.Retiaire;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Mirmillon Bob = new Mirmillon("Bob le Malchanceux",15,15,70,15);
    Retiaire Igor = new Retiaire("Igor l'empaleur",25,5,100,30);
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    Bob.afficherInfosPersonnage();
    Igor.afficherInfosPersonnage();
    affichage.afficherDebutCombat();
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        do 
        {
          
            tour.afficheTour();
            for (int i = 0; i < 100; i++) 
            {
                if (Bob.getInitiative() == i && Bob.getPointsDeVie()> 0 ) 
                {
                    Bob.frapperPersonnage(Igor);
                    if (Bob.isDoubleTour() && Igor.getPointsDeVie() > 0) 
                    {
                        System.out.println("Bob attaque une deuxième fois");
                        System.out.println("");
                        Bob.frapperPersonnage(Igor);
                        Bob.setDoubleTour(false);
                    }
                    else if(Bob.isDoubleTour() && Igor.getPointsDeVie() == 0)
                    {
                        System.out.println("Bob décapite Igor");
                        System.out.println("");
                        break;
                    }
                    System.out.println("");
                    Igor.frapperPersonnage(Bob);
                    break;
                }
                if (Igor.getInitiative() == i && Igor.getPointsDeVie() > 0) 
                {
                    Igor.frapperPersonnage(Bob);
                    System.out.println("");
                    Bob.frapperPersonnage(Igor);
                    break;
                }
            }
            affichage.afficherSeparateurInfosPerso();
            Bob.afficherInfosPersonnage();
            Igor.afficherInfosPersonnage();
            Bob.setNewInitiativeRandom();
            Igor.setNewInitiativeRandom();
            tour.augmenteTour();
            affichage.afficherSeparateurDeTour();
             Bob.setDoubleTour(true);
            
        } while (Bob.getPointsDeVie() > 0 && Igor.getPointsDeVie() > 0);
        affichage.afficheVictoire(Bob, Igor);
    // </editor-fold>
    }

}
