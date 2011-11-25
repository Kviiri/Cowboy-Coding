package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kviiri
 */
public abstract class Elain {
    private boolean sukupuoli;      //true on uros, false on naaras
    private String nimi;
    
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
}
