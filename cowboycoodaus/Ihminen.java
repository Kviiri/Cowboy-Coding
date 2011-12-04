package cowboycoodaus;

import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
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
     * @param sukunimi
     * @param rooli ihmisell� on my�s rooli
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
     * Siirtää ihmisen parametrina annettuun IhmisSailioon
     * @param is 
     */
    public void astuSisaan(IhmisSailio is) {
        is.lisaaIhminen(this);
    }
    /**
     * Siirtää ihmisen ulos IhmisiSailiosta, jos ihminen ei ole siell� niin mit��n ei tapahdu
     * @param is
     */
    public void astuUlos(IhmisSailio is) {
        is.poistaIhminen(this);
    }
    /**
     * Ihminen nousee ratsaille
     * @param hevonen hevonen jonka ratsaille ihminen nousee
     */
    public void nouseRatsaille(Hevonen hevonen) {
        hevonen.otaRatsaille(this);
    }
    /**
     * Parametrinä annettu Ihminen ryöstää tämän ihmisen. Ryöstön onnistuminen riippuu ihmisten aseiden tehosta.
     * @param ryostaja
     * @return double: saaliin määrä (0 jos ryöstäjän ase ei ole tehokkaampi kuin Ryöstettävän ase, muulloin koko Ryöstettävän omaisuus)
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
     * Ryöstää kohteeksi annetun ryöstettävän.
     * @param kohde
     * @return 
     */
    public double teeRyosto(Ryostettava kohde) {
        double maara = kohde.ryosta(this);
        this.kulta += maara;
        return maara;
    }
    /**
     * 
     * @return tehokkain ase joka Ihmisellä on
     */
    public Ase parasAse() {
        if (this.aseet.isEmpty())
            return new Ase("Ei asetta", 0);
        return Collections.max(this.aseet);
    }
    /**
     * Lis�� ihmiselle uuden aseen, niit� voi olla siis useita
     * @param a ase joka annetaan
     */
    public void annaAse(Ase a) {
        aseet.add(a);
    }
    /**
     * Palauttaa ihmisen liikkumisnopeuden.
     * @return liikkumisnopeus
     */
    public int getNopeus() {
        throw new UnsupportedOperationException("Ei tuettu vielä");
    }
    /**
     * Palauttaa Ihmisen kultamäärän.
     * @return kulta
     */
    @Override
    public double getKulta() {
        return this.kulta;
    }
    /**
     * Asettaa Ihmisen kultamäärän
     * @param summa uusi kultamäärä
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
