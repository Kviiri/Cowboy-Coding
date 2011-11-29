package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kviiri
 */
public abstract class Elain implements Liikkuva{
    private boolean sukupuoli;      //true on uros, false on naaras
    private String nimi;
    private Alue alue;
    
    public Elain(boolean sukupuoli, String nimi) {
        this.sukupuoli = sukupuoli;
        this.nimi = nimi;
    }
    
    public boolean getSukupuoli() {
        return sukupuoli;
    }
    public String getNimi() {
        return nimi;
    }
    public void setAlue(Alue alue) {
        this.alue = alue;
    }
    @Override
    public void liiku(Alue alue) {
        this.alue.poistaElain(this);
        alue.lisaaElain(this);
    }
    public abstract String kiroa();
}
