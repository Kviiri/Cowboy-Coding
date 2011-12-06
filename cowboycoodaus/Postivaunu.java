package cowboycoodaus;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Postivaunussa voi matkustaa. Sen voi my�s ry�st��.
 * @author kviiri, tonykovanen
 */
public class Postivaunu extends IhmisSailio implements Ryostettava, Liikkuva {
    private double kulta;
    private int nopeus = 5;
    /**
     * Luo uuden postivaunun
     * @param kulta Postivaunun kultasisis�lt�
     */
    public Postivaunu(double kulta) {
        this.kulta = kulta;
    }
    /**
     * Ry�st�� postivaunun. Kaikki vaunun kulta siirtyy ry�st�j�lle. Matkustajia ei ry�stet�.
     * @param ryostaja Ihminen joka tekee ry�st�n.
     * @return Saaliin m��r�
     */
    @Override
    public double ryosta(Ihminen ryostaja) {
        double maara = this.kulta;
        this.kulta = 0;
        return maara;
    }
    /**
     * Postivaunu liikkuu. Siirt�� kaikki sis�ll� olevat ihmiset my�s kohdealueelle.
     * @param kohde Alue jonne siirryt��n
     */
    @Override
    public void liiku(Alue kohde) {
        for (Ihminen ihminen : super.ihmiset) {
            ihminen.setAlue(kohde);
        }
        super.alue.poistaSisaltava(this);
        kohde.lisaaSisaltava(this);
        try {
            System.out.println("Liikkuu...");
            Thread.sleep((60 / nopeus) * 1000);
            System.out.println("Liikkunut.");
        } catch (InterruptedException ex) {
            Logger.getLogger(Postivaunu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Palauttaa postivaunun nopeuden.
     * @return Postivaunun nopeus
     */
    @Override
    public int getNopeus() {
        return this.nopeus;
    }
    /**
     * Palauttaa postivaunun kultasis�ll�n.
     * @return Postivaunun kultasis�lt�
     */
    @Override
    public double getKulta() {
        return this.kulta;
    }
    /**
     * Asettaa postivaunun kultasis�ll�n
     * @param summa Uusi kultasis�lt�
     */
    @Override
    public void setKulta(double summa) {
        this.kulta = summa;
    }
    /**
     * Postivaunulle voidaan asettaa nopeus, se on oletukselta 5 km / h
     * @param nopeus asetettava nopeus 
     */
    @Override
    public void setNopeus(int nopeus) {
        this.nopeus = nopeus;
    }
    
}
