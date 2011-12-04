/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

/**
 * Toteuttaa ratsastettavaa ja perii eläimen
 * @author tonykovanen, kviiri
 */
public class Kojootti extends Elain implements Ratsastettava {
    private Ihminen ratsastaja;
    /**
     * Toteuttaa yliluokan konstruktorin
     * @param sukupuoli
     * @param nimi 
     */
    public Kojootti(boolean sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }
    /**
     * Ottaa ratsaille ihmisen
     * @param ihminen ratsastaja
     */
    @Override
    public void otaRatsaille(Ihminen ihminen) {
        this.ratsastaja = ihminen;
    }
    /**
     * 
     * @return ratsastaja
     * @throws EiRatsastajaaException jos ei ole ratsastajaa
     */
    @Override
    public Ihminen getRatsastaja() throws EiRatsastajaaException {
        if (this.ratsastaja == null) {
            throw new EiRatsastajaaException("lol");
        }
        return this.ratsastaja;
    }
    /**
     * 
     * @return nopeus
     */
    @Override
    public int getNopeus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 
     * @return "Murr!"
     */
    @Override
    public String kiroa() {
        return "Murr!";
    }
    /**
     * Jos ratsastaja niin molemmat liikkuvat, muuten vain kojootti
     * @param alue kohdealue
     */
    @Override
    public void liiku(Alue alue) {
        if (this.ratsastaja != null) {
            super.liiku(alue);
            this.ratsastaja.liiku(alue);
        } else {
            super.liiku(alue);
        }
    }
}
