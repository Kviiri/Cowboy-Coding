package cowboycoodaus;

import java.util.ArrayList;

/**
 * Pankki on rakennus jonka voi ryöstää.
 * @author kviiri, tonykovanen
 */
public class Pankki extends Rakennus implements Ryostettava{
    private double kulta;
    private ArrayList<Ihminen> vartijat;
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
     * Ryöstää pankin. Ryöstösaalis lasketaan sen mukaan kuinka suuren osan (prosentteina) varitijoista varas voittaa
     * @param ryostaja Ihminen joka tekee ryöstön
     * @return Saaliin määrä
     */
    @Override
    public double ryosta(Ihminen ryostaja) {
        double ryostoProsentti = kuinkaMontaVartijaaVoittaa(ryostaja) / vartijat.size();
        double maara = kulta * ryostoProsentti;
        kulta -= maara;
        return maara;
    }
    /**
     * Palauttaa pankin kultasisällön.
     * @return Pankin kultasisältö.
     */
    @Override
    public double getKulta() {
        return kulta;
    }
    /**
     * Asettaa oankin kultasisällön
     * @param summa Pankin uusi kultasisältö.
     */
    @Override
    public void setKulta(double summa) {
        kulta = summa;
    }
    /**
     * Pankilla on 0 - useita vartijoita
     * @param ihminen lis�tt�v� vartija
     */
    public void lisaaVartija(Ihminen ihminen) {
        vartijat.add(ihminen);
    }
    /**
     * Tarkistaa kuinka monta vartijaa ihminen voittaa
     * @param ihminen vertailtava ihminen (ry�st�j�)
     * @return m��r� voitettuja vartijoita
     */
    public int kuinkaMontaVartijaaVoittaa(Ihminen ihminen) {
        int voitot = 0;
        for (Ihminen vartija : vartijat) {
           if (ihminen.parasAse().getTehokkuus() > vartija.parasAse().getTehokkuus()) {
               voitot++;
           }
        }
        return voitot;
    }
}
