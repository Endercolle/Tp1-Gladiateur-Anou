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
        if (pointsDeVie < 0) 
        {
            this.pointsDeVie = 0;
        }
        else
        {
            this.pointsDeVie = pointsDeVie;
        }
        
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
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println("");
        System.out.println(nom);
        System.out.println("    Attaque : " + valeurMaxAttaque);
        System.out.println("    Défense : " + valeurDefense);
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
        int forceDeFrappe = attaqueCalcul();
        int defenceCible = personnageCible.getValeurDefense();
        int dommage = forceDeFrappe - defenceCible;
        
        if (dommage < 0) 
        {
            dommage = 0;
        }
        
        personnageCible.setPointsDeVie(personnageCible.getPointsDeVie() - dommage);
        System.out.println(nom + " attaque avec une puissance de : " + forceDeFrappe);
        System.out.println(personnageCible.getNom() +  " a une défense de : " + defenceCible);
        System.out.println("les dommages sont donc de : " + dommage);  
    }

    public void setNewInitiativeRandom() {
       Random rand = new Random();
       int minValue = 0;
       int maxValue = 100 ;
       int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
       initiative = nombreAleatoire;
    }
    // </editor-fold>
}
