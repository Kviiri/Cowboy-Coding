/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

/**
 * Toteuttaa ratsastettavaa ja perii eläimen. Kojootti on kuitenkin vaarallinen eläin.
 * Kerolan sanoin: "Olkaa siis varovaisia."
 * @author tonykovanen, kviiri
 */
public class Kojootti extends Elain implements Ratsastettava {
    private Ihminen ratsastaja;
    /**
     * Kutsuu yliluokan konstruktoria
     * @param sukupuoli
     * @param nimi 
     */
    public Kojootti(boolean sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }
    /**
     * Ottaa ratsaille ihmisen
     * @param ihminen Ratsastaja
     */
    @Override
    public void otaRatsaille(Ihminen ihminen) {
        this.ratsastaja = ihminen;
    }
    /**
     * Ratsastajaan päästään käsiksi getterillä
     * @return Palautetaan ratsastaja
     * @throws EiRatsastajaaException Jos ei ole ratsastajaa
     */
    @Override
    public Ihminen getRatsastaja() throws EiRatsastajaaException {
        if (this.ratsastaja == null) {
            throw new EiRatsastajaaException("lol");
        }
        return this.ratsastaja;
    }
    /**
     * Kojootti sanoo "Murr!"
     * @return "Murr!"
     */
    @Override
    public String kiroa() {
        return "Murr!";
    }
    /**
     * Jos kojootilla on ratsastaja niin molemmat liikkuvat, muuten vain kojootti
     * @param alue Kohdealue
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
