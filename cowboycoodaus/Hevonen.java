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
    private Ihminen ratsastaja;
    
    public Hevonen(boolean sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }
    
    @Override
    public void otaRatsaille(Ihminen ihminen) {
        this.ratsastaja = ihminen;
    }

    @Override
    public Ihminen getRatsastaja() throws EiRatsastajaaException {
        return this.ratsastaja;
    }

    @Override
    public int getNopeus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String kiroa() {
        return "Ihahaa!";
    }
    
}
