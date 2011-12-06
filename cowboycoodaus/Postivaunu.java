package cowboycoodaus;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Postivaunussa voi matkustaa. Sen voi myös ryöstää.
 * @author kviiri, tonykovanen
 */
public class Postivaunu extends IhmisSailio implements Ryostettava, Liikkuva {
    private double kulta;
    private int nopeus = 5;
    /**
     * Luo uuden postivaunun
     * @param kulta Postivaunun kultasisisältö
     */
    public Postivaunu(double kulta) {
        this.kulta = kulta;
    }
    /**
     * Ryöstää postivaunun. Kaikki vaunun kulta siirtyy ryöstäjälle. Matkustajia ei ryöstetä.
     * @param ryostaja Ihminen joka tekee ryöstön.
     * @return Saaliin määrä
     */
    @Override
    public double ryosta(Ihminen ryostaja) {
        double maara = this.kulta;
        this.kulta = 0;
        return maara;
    }
    /**
     * Postivaunu liikkuu. Siirtää kaikki sisällä olevat ihmiset myös kohdealueelle.
     * @param kohde Alue jonne siirrytään
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
     * Palauttaa postivaunun kultasisällön.
     * @return Postivaunun kultasisältö
     */
    @Override
    public double getKulta() {
        return this.kulta;
    }
    /**
     * Asettaa postivaunun kultasisällön
     * @param summa Uusi kultasisältö
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
