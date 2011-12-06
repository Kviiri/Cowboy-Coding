package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Elain on abstrakti yliluokka kaikille sitä periville eläimille. Myös Arto Vihavandez ja Macho Luukkandez ovat Elain luokan periviä.
 * Elain on liikkuva
 * @author kviiri, tonykovanen
 */
public abstract class Elain implements Liikkuva{
    private boolean sukupuoli;      //true on uros, false on naaras
    private String nimi;
    private Alue alue;
    private int nopeus = 10;
    
    /**
     * Eläimelle annetaan sukupuoli ja nimi
     * @param sukupuoli eläimen sukupuoli, true jos uros, false jos naaras
     * @param nimi eläimen nimi
     */
    public Elain(boolean sukupuoli, String nimi) {
        this.sukupuoli = sukupuoli;
        this.nimi = nimi;
    }
    /**
     * 
     * @return Palauttaa sukupuolen
     */
    public boolean getSukupuoli() {
        return sukupuoli;
    }
    /**
     * 
     * @return Palauttaa nimen
     */
    public String getNimi() {
        return nimi;
    }
    /**
     * Eläimellä voi myös olla alue (kuuluu yhteen alueeseen tai ei yhteenkään)
     * @param alue Alue johon eläin asetetaan kuuluvaksi
     */
    public void setAlue(Alue alue) {
        this.alue = alue;
    }
    /**
     * Eläin voi liikkua alueelta toiselle
     * @param alue Kohdealue johon liikutaan
     */
    @Override
    public void liiku(Alue alue) {
        this.alue.poistaElain(this);
        alue.lisaaElain(this);
    }
    /**
     * Toteuttamaton abstrakti kiroa() metodi
     * @return Palauttaa kiroilun String muodossa
     */
    public abstract String kiroa();
    /**
     * Palauttaa Elaimen merkkijonoesityksen muodossa
     * Kojootti Rekku, koiras
     * Vinkki! Voit toteuttaa toString() metodin tähän yliluokkaan kaikille eläimille, this.getClass().getSimpleName().
     * Mitä edeltävä pätkä koodia palauttaa? Tutki asiaa. Tämä on ratkaisu! Sukupuolen tulostamisessa kannattaa tutustua ? operaattoriin
     * @return 
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + nimi + ", " + (sukupuoli ? "koiras" : "naaras");
    }
     /**
     * Eläimelle voidaan asettaa nopeus, se on vakiolta 10 km / h
     * @param nopeus Asetettava nopeus
     */
    public void setNopeus(int nopeus) {
        this.nopeus = nopeus;
    }
    /**
     * 
     * @return Palauttaa eläimen nopeuden
     */
    public int getNopeus() {
        return this.nopeus;
    }
}
