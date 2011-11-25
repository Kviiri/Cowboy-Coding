/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

/**
 *
 * @author tonykovanen, kviiri
 */
public class Kojootti extends Elain implements Ratsastettava {
    public Kojootti(boolean sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }

    @Override
    public void otaRatsaille(Ihminen ihminen) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ihminen getRatsastaja() throws EiRatsastajaaException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
