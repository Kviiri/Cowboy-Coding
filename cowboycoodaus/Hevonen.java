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
    
    /**
     * 
     * @param sukupuoli
     * @param nimi 
     */
    public Hevonen(boolean sukupuoli, String nimi) {
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
        return "Ihahaa!";
    }
    @Override
    public void liiku(Alue alue) {
        if (this.ratsastaja != null) {
            super.liiku(alue);
            this.ratsastaja.liiku(alue);
        }
    }
}
