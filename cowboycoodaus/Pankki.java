package cowboycoodaus;

import java.util.ArrayList;

/**
 * Pankki on rakennus jonka voi ryšstŠŠ.
 * Pankissa on mielivaltainen mŠŠrŠ vartijoita
 * @author kviiri, tonykovanen
 */
public class Pankki extends Rakennus implements Ryostettava{
    private double kulta;
    private ArrayList<Ihminen> vartijat = new ArrayList<Ihminen>();
    /**
     * Luo uuden pankin. Kysy Rakennus-luokan konstruktoria avuksesi.
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
     * RyšstŠŠ pankin. Ryšstšsaalis lasketaan sen mukaan kuinka suuren osan (prosentteina) varitijoista varas voittaa
     * @param ryostaja Ihminen joka tekee ryšstšn
     * @return Saaliin mŠŠrŠ
     */
    @Override
    public double ryosta(Ihminen ryostaja) {
        double ryostoProsentti = kuinkaMontaVartijaaVoittaa(ryostaja) / vartijat.size();
        double maara = kulta * ryostoProsentti;
        kulta -= maara;
        return maara;
    }
    /**
     * Palauttaa pankin kultasisŠllšn.
     * @return Pankin kultasisŠltš.
     */
    @Override
    public double getKulta() {
        return kulta;
    }
    /**
     * Asettaa pankin kultasisŠllšn
     * @param summa Pankin uusi kultasisŠltš.
     */
    @Override
    public void setKulta(double summa) {
        kulta = summa;
    }
    /**
     * LisŠŠ uuden vartijan pankkiin.
     * @param ihminen 
     */
    public void lisaaVartija(Ihminen ihminen) {
        vartijat.add(ihminen);
    }
    /**
     * Laskee montako vartijaa RyšstŠjŠ voittaa aseillaan
     * @param ihminen RyšstŠjŠ
     * @return Voitettujen vartioiden mŠŠrŠ
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
