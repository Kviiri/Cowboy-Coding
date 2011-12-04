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
     * El�imelle annetaan sukupuoli nimi
     * @param sukupuoli el�imen sukupuoli, true jos uros, false jos naaras
     * @param nimi el�imen nimi
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
     * El�imell� voi my�s olla alue (kuuluu yhteen alueeseen tai ei yhteenk��n)
     * @param alue alue johon el�in asetetaan kuuluvaksi
     */
    public void setAlue(Alue alue) {
        this.alue = alue;
    }
    /**
     * El�in voi liikkua alueelta toiselle
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
