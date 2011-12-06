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
 * Ihminen on Ryostettava
 * @author tonykovanen, kviiri
 */
public abstract class Ihminen extends Elain implements Ryostettava {
    private ArrayList<Ase> aseet = new ArrayList<Ase>();
    private String sukunimi;
    private double kulta;
    private Rooli rooli;
    /**
     * 
     * @param sukupuoli
     * @param nimi
     * @param sukunimi Ihmisell� on sukupuolen ja nimen lis�ksi sukunimi
     * @param rooli Ihmisell� on my�s rooli
     */
    public Ihminen(boolean sukupuoli, String nimi, String sukunimi, Rooli rooli) {
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
    public Ihminen(boolean sukupuoli, String nimi, String sukunimi) {
        this(sukupuoli, nimi, sukunimi, new Rooli(sukupuoli ? "Herra" : "Rouva"));
    }
    
    
    /**
     * Siirt�� ihmisen parametrina annettuun IhmisSailioon
     * @param is Kohde IhmisSailio
     */
    public void astuSisaan(IhmisSailio is) {
        is.lisaaIhminen(this);
    }
    /**
     * Siirt�� ihmisen ulos IhmisiSailiosta, jos ihminen ei ole sis�ll� niin mit��n ei tapahdu
     * @param is Kohde IhmisSailio
     */
    public void astuUlos(IhmisSailio is) {
        is.poistaIhminen(this);
    }
    /**
     * Ihminen nousee ratsaille
     * @param hevonen Hevonen, jonka ratsaille ihminen nousee
     */
    public void nouseRatsaille(Hevonen hevonen) {
        hevonen.otaRatsaille(this);
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
     * Yritt�� ry�st�� kohteeksi annetun ry�stet�v�n.
     * @param kohde Ryostettava rajapinnan toteuttava kohde
     * @return double: Ry�stetty kultam��r�. Toteutus j�� riippumaan Ry�stett�v�n ryosta(Ihminen ryostaja) metodista
     */
    public double teeRyosto(Ryostettava kohde) {
        double maara = kohde.ryosta(this);
        this.kulta += maara;
        return maara;
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
