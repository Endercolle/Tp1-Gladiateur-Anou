package personnages;
import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    protected String nom;
    protected int pointsDeVie;
    protected int valeurMaxAttaque;
    protected int valeurDefense;
    protected int initiative;
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        pointsDeVie = pvs;
        valeurMaxAttaque = attaqueMax;
        valeurDefense = defense;
        initiative = ini;
    }

    public Personnage() {
        nom = "";
        pointsDeVie= 0;
        valeurMaxAttaque = 0;
        valeurDefense = 0;
        initiative = 0;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    
    
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="M�canique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println("");
        System.out.println(nom);
        System.out.println("    Attaque : " + valeurMaxAttaque);
        System.out.println("    D�fense : " + valeurDefense);
        System.out.println("    Points de vie : " + pointsDeVie);
        System.out.println("    Initiative : " + initiative);
        if (pointsDeVie <= 0) 
        {
            System.out.println("    Statut: Mort");
        }
        else
        {
            System.out.println("    Statut: Vivant");
        }
        
    }

    private int attaqueCalcul() {
       Random rand = new Random();
       int minValue = 0;
       int maxValue = valeurMaxAttaque;
       int nombreAleatoire = rand.nextInt(maxValue - minValue)+minValue;
        return nombreAleatoire;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : R�cup�rer la valeur d'attaque pour ce tour, calculer les d�gats,
        //modifier les points de vie du personnage cible, afficher les d�tails
        // sur l'attaque, tel que montr� dans l'�nonc�.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de fa�on al�atoire la valeur INI du personnage.
    }
    // </editor-fold>
}
