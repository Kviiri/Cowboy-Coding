package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kviiri
 */
public class Hevonen extends Elain implements Ratsastettava {
    
    public Hevonen(boolean sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }
    
    @Override
    public void otaRatsaille(Ihminen ihminen) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ihminen getRatsastaja() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
