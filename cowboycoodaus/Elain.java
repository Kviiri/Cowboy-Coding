package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Elain on abstrakti yliluokka kaikille sit� periville el�imille. My�s Arto Vihavandez ja Macho Luukkandez ovat Elain luokan perivi�.
 * Elain on liikkuva
 * @author kviiri, tonykovanen
 */
public abstract class Elain implements Liikkuva{
    private boolean sukupuoli;      //true on uros, false on naaras
    private String nimi;
    private Alue alue;
    private int nopeus = 10;
    
    /**
     * El�imelle annetaan sukupuoli ja nimi
     * @param sukupuoli el�imen sukupuoli, true jos uros, false jos naaras
     * @param nimi el�imen nimi
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
     * El�imell� voi my�s olla alue (kuuluu yhteen alueeseen tai ei yhteenk��n)
     * @param alue Alue johon el�in asetetaan kuuluvaksi
     */
    public void setAlue(Alue alue) {
        this.alue = alue;
    }
    /**
     * El�in voi liikkua alueelta toiselle
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
     * Vinkki! Voit toteuttaa toString() metodin t�h�n yliluokkaan kaikille el�imille, this.getClass().getSimpleName().
     * Mit� edelt�v� p�tk� koodia palauttaa? Tutki asiaa. T�m� on ratkaisu! Sukupuolen tulostamisessa kannattaa tutustua ? operaattoriin
     * @return 
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + nimi + ", " + (sukupuoli ? "koiras" : "naaras");
    }
     /**
     * El�imelle voidaan asettaa nopeus, se on vakiolta 10 km / h
     * @param nopeus Asetettava nopeus
     */
    public void setNopeus(int nopeus) {
        this.nopeus = nopeus;
    }
    /**
     * 
     * @return Palauttaa el�imen nopeuden
     */
    public int getNopeus() {
        return this.nopeus;
    }
}
