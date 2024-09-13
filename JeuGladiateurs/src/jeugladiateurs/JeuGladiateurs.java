package jeugladiateurs;

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
                        System.out.println("Bob le malchanceux attaque une deuxième fois");
                        System.out.println("");
                        Bob.frapperPersonnage(Igor);
                        Bob.setDoubleTour(false);
                    }
                    else if(Bob.isDoubleTour() && Igor.getPointsDeVie() == 0)
                    {
                        System.out.println("Bob le malchanceux décapite Igor l'empaleur");
                        System.out.println("");
                        break;
                    }
                    System.out.println("");
                     if (Igor.getPointsDeVie() > 0) 
                     {
                        if (Igor.isSiPossedeFilet()) 
                    {
                        System.out.println("Igor l'empaleur lance son filet ");
                        var filetRoll = (int)(Math.random()*(100-0));
                        if (filetRoll <= 10) 
                        {
                            Bob.setPointsDeVie(0);
                            System.out.println("Son filet attrape Bob le malchanceux et il l'empale sauvagement avec sa lance");
                            System.out.println("");
                            break;
                        }
                        else
                        {
                            System.out.println("Igor l'empaleur rate son tire et le filet tombe du sol");
                            System.out.println("");
                            Igor.setSiPossedeFilet(false);
                        }
                    }
                    else
                    {
                        System.out.println("Igor l'empaleur ramasse son filet et en profite pour attaquer");
                        Igor.setSiPossedeFilet(true);
                        System.out.println("");
                        Igor.frapperPersonnage(Bob);
                        System.out.println("");
                    }
                     }
                    break;
                }
                if (Igor.getInitiative() == i && Igor.getPointsDeVie() > 0) 
                {
                    if (Igor.isSiPossedeFilet()) 
                    {
                        System.out.println("Igor l'empaleur lance son filet ");
                        var filetRoll = (int)(Math.random()*(100-0));
                        if (filetRoll <= 10) 
                        {
                            Bob.setPointsDeVie(0);
                            System.out.println("Son filet attrape Bob le malchanceux et il l'empale sauvagement avec sa lance");
                            System.out.println("");
                            break;
                        }
                        else
                        {
                            System.out.println("Igor l'empaleur rate son tire et le filet tombe du sol");
                            System.out.println("");
                            Igor.setSiPossedeFilet(false);
                        }
                    }
                    else
                    {
                        System.out.println("Igor l'empaleur ramasse son filet et en profite pour attaquer");
                        Igor.setSiPossedeFilet(true);
                        System.out.println("");
                        Igor.frapperPersonnage(Bob);
                        System.out.println("");
                    }
                    
                    if (Bob.getPointsDeVie() > 0) 
                    {
                        Bob.frapperPersonnage(Igor);
                    if (Bob.isDoubleTour() && Igor.getPointsDeVie() > 0) 
                    {
                        System.out.println("Bob le malchanceux attaque une deuxième fois");
                        System.out.println("");
                        Bob.frapperPersonnage(Igor);
                        Bob.setDoubleTour(false);
                    }
                    else if(Bob.isDoubleTour() && Igor.getPointsDeVie() == 0)
                    {
                        System.out.println("Bob le malchanceux décapite Igor l'empaleur");
                        System.out.println("");
                        break;
                    }
                    System.out.println("");
                    }
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
