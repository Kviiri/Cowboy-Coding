package cowboycoodaus;

import java.util.ArrayList;

/**
 * Pankki on rakennus jonka voi ry�st��.
 * Pankissa on mielivaltainen m��r� vartijoita
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
     * Ry�st�� pankin. Ry�st�saalis lasketaan sen mukaan kuinka suuren osan (prosentteina) varitijoista varas voittaa
     * @param ryostaja Ihminen joka tekee ry�st�n
     * @return Saaliin m��r�
     */
    @Override
    public double ryosta(Ihminen ryostaja) {
        double ryostoProsentti = kuinkaMontaVartijaaVoittaa(ryostaja) / vartijat.size();
        double maara = kulta * ryostoProsentti;
        kulta -= maara;
        return maara;
    }
    /**
     * Palauttaa pankin kultasis�ll�n.
     * @return Pankin kultasis�lt�.
     */
    @Override
    public double getKulta() {
        return kulta;
    }
    /**
     * Asettaa pankin kultasis�ll�n
     * @param summa Pankin uusi kultasis�lt�.
     */
    @Override
    public void setKulta(double summa) {
        kulta = summa;
    }
    /**
     * Lis�� uuden vartijan pankkiin.
     * @param ihminen 
     */
    public void lisaaVartija(Ihminen ihminen) {
        vartijat.add(ihminen);
    }
    /**
     * Laskee montako vartijaa Ry�st�j� voittaa aseillaan
     * @param ihminen Ry�st�j�
     * @return Voitettujen vartioiden m��r�
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
