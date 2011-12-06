package cowboycoodaus;

/**
 * Meksikolaisten lempiratsu, muuli.
 * @author kviiri, tonykovanen
 */
public class Muuli extends Elain implements Ratsastettava {

    Ihminen ratsastaja;

    /**
     * Luo uuden muulin (kysytŠŠn yliluokan konstruktoria)
     * @param sukupuoli true = uros, false = naaras
     * @param nimi Muulin nimi
     */
    public Muuli(boolean sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }

    /**
     * Asettaa parametrina annetun ihmisen muulin ratsaille.
     * @param ihminen Ratsastaja
     */
    @Override
    public void otaRatsaille(Ihminen ihminen) {
        this.ratsastaja = ihminen;
    }

    /**
     * Palauttaa muulilla ratsastavan ihmisen.
     * @return Ratsastaja
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
     * Muulikin osaa kirota.
     * @return "Ihahaa!" 
     */
    @Override
    public String kiroa() {
        return "Ihahaa!";
    }
    /**
     * Liikkuu kohdealueelle
     * @param alue Kohdealue
     */
    @Override
    public void liiku(Alue alue) {
        if (this.ratsastaja != null) {
            super.liiku(alue);
            this.ratsastaja.liiku(alue);
        }
    }
}
