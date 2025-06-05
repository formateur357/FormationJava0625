package exercices.ex06_ClassRectangle;

public class Rectangle {

    /*-------------------- Attributs --------------------*/
    private double longueur;
    private double largeur;

    /*------------------ Constructeur -------------------*/
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur  = largeur;
    }

    /*-------------------- Accesseurs -------------------*/
    public double getLongueur()           { return longueur; }
    public double getLargeur()            { return largeur;  }

    public void   setLongueur(double l)   { this.longueur = (l > 0) ?  l : this.longueur; }
    public void   setLargeur(double l)    { this.largeur = (l > 0) ?  l : this.largeur; }

    /*--------------------- Méthodes --------------------*/
    /** Périmètre = 2 × (longueur + largeur) */
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    /** Aire = longueur × largeur */
    public double aire() {
        return longueur * largeur;
    }

    /** @return true si le rectangle est aussi un carré */
    public boolean isCarre() {
        return Double.compare(longueur, largeur) == 0;
    }

    /*--------------------- toString --------------------*/
    @Override
    public String toString() {
        return String.format(
            """
            Longueur : %.2f – Largeur : %.2f
            Périmètre : %.2f
            Aire      : %.2f
            Carré ?   : %b
            """,
            longueur, largeur,
            perimetre(),
            aire(),
            isCarre()
        );
    }
}
