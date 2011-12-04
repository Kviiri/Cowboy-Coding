package cowboycoodaus;

import java.util.ArrayList;
import java.util.Random;


/**
 * Postivaunussa voi matkustaa. Sen voi myös ryöstää.
 * @author kviiri, tonykovanen
 */
public class Postivaunu extends IhmisSailio implements Ryostettava, Liikkuva {
    private double kulta;
    /**
     * Luo uuden postivaunun
     * @param kulta postivaunun kultasisältö
     */
    public Postivaunu(double kulta) {
        this.kulta = kulta;
    }
    /**
     * Ryöstää postivaunun. Kaikki vaunun kulta siirtyy ryöstäjälle.
     * @param ryostaja Ihminen joka tekee ryöstön.
     * @return saaliin määrä
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
    }
    /**
     * Palauttaa postivaunun nopeuden.
     * @return postivaunun nopeus
     */
    @Override
    public int getNopeus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * Palauttaa postivaunun kultasisällön.
     * @return postivaunun kultasisältö
     */
    @Override
    public double getKulta() {
        return this.kulta;
    }
    /**
     * Asettaa postivaunun kultasisällön
     * @param summa uusi kultasisältö
     */
    @Override
    public void setKulta(double summa) {
        this.kulta = summa;
    }
    
}
