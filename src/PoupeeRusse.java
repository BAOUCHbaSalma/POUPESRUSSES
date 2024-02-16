import java.util.Objects;
import java.util.Scanner;

public class PoupeeRusse implements Poupee {
    private String NomP;
    private boolean ouverte;
    private int taille;
    PoupeeRusse Doll;

    public String getNomP() {
        return NomP;
    }

    public void setNomP(String nomP) {
        NomP = nomP;
    }

    public boolean isOuverte() {
        return ouverte;
    }

    public void setOuverte(boolean ouverte) {
        this.ouverte = ouverte;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public PoupeeRusse(int taille) {

        this.taille = taille;
        this.ouverte = false;
    }

    @Override
    public void ouvrir() {
        if (this.ouverte) {
            System.out.println("Cette poupee est deja ouverte !!");

        } else {
            setOuverte(true);
            System.out.println("Cette poupee sera ouverte maintenant !!");

        }


    }

    @Override
    public void fermer() {

    }

    @Override
    public void placerDans(PoupeeRusse p) {

    }

    @Override
    public void sortirDe(PoupeeRusse p) {

    }
}
