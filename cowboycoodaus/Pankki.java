package cowboycoodaus;

import java.util.ArrayList;

/**
 * Pankki on rakennus jonka voi ryöstää.
 * @author kviiri, tonykovanen
 */
public class Pankki extends Rakennus implements Ryostettava{
    private double kulta;
    private ArrayList<Ihminen> Vartijat;
    /**
     * Luo uuden pankin. Käytä Rakennus-luokan konstruktoria avuksesi.
     * @param kulta Pankin kultavarasto
     * @param leveys Pankin leveys
     * @param korkeus Pankin korkeus
     * @param syvyys Pankin syvyys
     */
    public Pankki(double kulta, double leveys, double korkeus, double syvyys) {
        super(leveys, korkeus, syvyys);
        this.kulta = kulta;
    }
    /**
     * Ryöstää pankin.
     * @param ryostaja Ihminen joka tekee ryöstön
     * @return Saaliin määrä
     */
    @Override
    public double ryosta(Ihminen ryostaja) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * Palauttaa pankin kultasisällön.
     * @return Pankin kultasisältö.
     */
    @Override
    public double getKulta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * Asettaa oankin kultasisällön
     * @param summa Pankin uusi kultasisältö.
     */
    @Override
    public void setKulta(double summa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
