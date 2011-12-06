package cowboycoodaus;

import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ihminen on abstrakti yliluokka sen periville Meksikaaneille ja muille mahdollisille vastaaville luokille. Macho Luukkandez on sek� Meksikaani, Ihminen, ett� Elain.
 * Ihmisill� on aseita mielivaltainen m��r� (aluksi 0), kultam��r� (aluksi 0)
 * Ihminen on Ryostettava ja Ihmisen nopeus vaihtuu ratsun nopeudeksi kun noustaan ratsaille, sek� siit� tulee 0 kun ihminen on IhmisSailiossa
 * Ihmisella on tai ei ole Ratsastettava ratsu
 * @author tonykovanen, kviiri
 */
public abstract class Ihminen extends Elain implements Ryostettava {
    private ArrayList<Ase> aseet = new ArrayList<Ase>();
    private String sukunimi;
    private double kulta;
    private Rooli rooli;
    private Ratsastettava ratsu;
    /**
     * 
     * @param sukupuoli
     * @param nimi
     * @param sukunimi Ihmisell� on sukupuolen ja nimen lis�ksi sukunimi
     * @param rooli Ihmisell� on my�s rooli
     */
    public Ihminen(Sukupuoli sukupuoli, String nimi, String sukunimi, Rooli rooli) {
        super(sukupuoli, nimi);
        this.sukunimi = sukunimi;
        this.kulta = 0;
        this.rooli = rooli;
    }
    /**
     * Ihmisen voi my�s alustaa vaihtoehtoisella konstruktorilla jossa rooliksi annetaan Herra tai Rouva sukupuolesta riippuen
     * @param sukupuoli
     * @param nimi
     * @param sukunimi 
     */
    public Ihminen(Sukupuoli sukupuoli, String nimi, String sukunimi) {
        this(sukupuoli, nimi, sukunimi, new Rooli(sukupuoli == sukupuoli.UROS ? "Herra" : "Rouva"));
    }
    
    
    /**
     * Siirt�� ihmisen parametrina annettuun IhmisSailioon
     * Ihminen nousee ratsailta ja nopeudeksi asetetaan 0
     * @param is Kohde IhmisSailio
     */
    public void astuSisaan(IhmisSailio is) {
        is.lisaaIhminen(this);
    }
    /**
     * Siirt�� ihmisen ulos IhmisiSailiosta, jos ihminen ei ole sis�ll� niin mit��n ei tapahdu
     * Jos ihminen on IhmisSailiossa niin poistumisen lis�ksi nopeus palautetaan vakioon
     * @param is Kohde IhmisSailio
     */
    public void astuUlos(IhmisSailio is) {
        is.poistaIhminen(this);
    }
    /**
     * Ihminen nousee ratsaille
     * Ihmisen nopeus tulee samaksi kuin ratsun
     * @param ratsastettava Ratsastettava, jonka ratsaille ihminen nousee
     */
    public void nouseRatsaille(Ratsastettava ratsastettava) {
        ratsastettava.otaRatsaille(this);
        this.ratsu = ratsastettava;
    }
    /**
     * T�lt� (this) poistetaan ratsu ja nopeus palaa takaisin oletukseen
     */
    public void nouseRatsailta() {
        this.ratsu = null;
    }
    /**
     * Parametrina annettu Ihminen ry�st�� t�m�n (this) ihmisen. Ry�st�n onnistuminen riippuu ihmisten aseiden tehosta.
     * @param ryostaja
     * @return double: saaliin m��r� (0 jos ry�st�j�n ase ei ole tehokkaampi kuin t�m�n (this) ase, muulloin koko this.kulta omaisuus)
     */
    @Override
    public double ryosta(Ihminen ryostaja) {
        if (this.parasAse().getTehokkuus() >= ryostaja.parasAse().getTehokkuus()) {
            return 0;
        }
        double maara = this.kulta;
        this.kulta = 0;
        return maara;
    }
    /**
     * Yritt�� ry�st�� kohteeksi annetun ry�stett�v�n. T�ss� metodissa olisi hyv� p�iv�tt�� t�m�n (this) kultam��r�
     * @param kohde Ryostettava rajapinnan toteuttava kohde
     */
    public void teeRyosto(Ryostettava kohde) {
        double maara = kohde.ryosta(this);
        this.kulta += maara;
    }
    /**
     * Ihmisen useista aseista valitaan paras
     * @return Tehokkain ase joka ihmisell� on
     */
    public Ase parasAse() {
        if (this.aseet.isEmpty())
            return new Ase("Ei asetta", 0);
        return Collections.max(this.aseet);
    }
    /**
     * Lis�� ihmiselle uuden aseen, niit� voi olla siis useita
     * @param a Ase joka annetaan
     */
    public void annaAse(Ase a) {
        aseet.add(a);
    }
    /**
     * Palauttaa ihmisen kultam��r�n.
     * @return Kulta
     */
    @Override
    public double getKulta() {
        return this.kulta;
    }
    /**
     * Asettaa Ihmisen kultam��r�n
     * @param summa Uusi kultam��r�
     */
    @Override
    public void setKulta(double summa) {
        this.kulta = summa;
    }
    /**
     * Palauttaa Ihmisen toString-esityksen muodossa
     * "Yliopistonlehtori Macho Luukkandez, Meksikaani, omaisuuden arvo $500."
     * @return Olion merkkijonoesitys
     */
    @Override
    public String toString() {
        return rooli.getNimi() + " " + getNimi() + " " + sukunimi + ", " +  getClass().getSimpleName() + ", omaisuuden arvo $" + kulta + ".";
    }
}
