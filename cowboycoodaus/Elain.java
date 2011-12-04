package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kviiri, tonykovanen
 */
public abstract class Elain implements Liikkuva{
    private boolean sukupuoli;      //true on uros, false on naaras
    private String nimi;
    private Alue alue;
    
    /**
     * Eläimelle annetaan sukupuoli nimi
     * @param sukupuoli eläimen sukupuoli, true jos uros, false jos naaras
     * @param nimi eläimen nimi
     */
    public Elain(boolean sukupuoli, String nimi) {
        this.sukupuoli = sukupuoli;
        this.nimi = nimi;
    }
    /**
     * 
     * @return palauttaa sukupuolen
     */
    public boolean getSukupuoli() {
        return sukupuoli;
    }
    /**
     * 
     * @return palauttaa nimen
     */
    public String getNimi() {
        return nimi;
    }
    /**
     * Eläimellä voi myös olla alue (kuuluu yhteen alueeseen tai ei yhteenkään)
     * @param alue alue johon eläin asetetaan kuuluvaksi
     */
    public void setAlue(Alue alue) {
        this.alue = alue;
    }
    /**
     * Eläin voi liikkua alueelta toiselle
     * @param alue kohdealue johon liikutaan
     */
    @Override
    public void liiku(Alue alue) {
        this.alue.poistaElain(this);
        alue.lisaaElain(this);
    }
    /**
     * Toteuttamaton abstrakti kiroa() metodi
     * @return palauttaa kiroilun string muodossa
     */
    public abstract String kiroa();
}
