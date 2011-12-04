package cowboycoodaus;

/**
 * Meksikolaisten lempiratsu, muuli.
 * @author kviiri, tonykovanen
 */
public class Muuli extends Elain implements Ratsastettava {

    Ihminen ratsastaja;

    /**
     * Luo uuden muulin (käytä yliluokan konstruktoria)
     * @param sukupuoli true = uros, false = naaras
     * @param nimi Muulin nimi
     */
    public Muuli(boolean sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }

    /**
     * Asettaa parametrinä annetun ihmisen muulin ratsaille.
     * @param ihminen 
     */
    @Override
    public void otaRatsaille(Ihminen ihminen) {
        this.ratsastaja = ihminen;
    }

    /**
     * Palauttaa muulilla ratsastavan ihmisen.
     * @return
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
     * Palauttaa Muulin nopeuden
     * @return 
     */
    @Override
    public int getNopeus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 
     * @return "Ihahaa!" 
     */
    @Override
    public String kiroa() {
        return "Ihahaa!";
    }
    /**
     * Liikkuu kohdealueelle
     * @param alue 
     */
    @Override
    public void liiku(Alue alue) {
        if (this.ratsastaja != null) {
            super.liiku(alue);
            this.ratsastaja.liiku(alue);
        }
    }
}
