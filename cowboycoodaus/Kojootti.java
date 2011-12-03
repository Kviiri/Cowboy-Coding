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
    private Ihminen ratsastaja;
    
    public Kojootti(boolean sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }

    @Override
    public void otaRatsaille(Ihminen ihminen) {
        this.ratsastaja = ihminen;
    }

    @Override
    public Ihminen getRatsastaja() throws EiRatsastajaaException {
        if (this.ratsastaja == null) {
            throw new EiRatsastajaaException("lol");
        }
        return this.ratsastaja;
    }

    @Override
    public int getNopeus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String kiroa() {
        return "Murr!";
    }
    @Override
    public void liiku(Alue alue) {
        if (this.ratsastaja != null) {
            super.liiku(alue);
            this.ratsastaja.liiku(alue);
        }
    }
}
