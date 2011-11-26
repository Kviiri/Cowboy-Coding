package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kviiri
 */
public class Muuli extends Elain implements Ratsastettava {

    Ihminen ratsastaja;

    public Muuli(boolean sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }

    @Override
    public void otaRatsaille(Ihminen ihminen) {
        this.ratsastaja = ihminen;
    }

    @Override
    public Ihminen getRatsastaja() {
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
