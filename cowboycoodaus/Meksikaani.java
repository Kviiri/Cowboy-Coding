package cowboycoodaus;

/**
 * Meksikaani, tuo Villin L�nnen leppoisa matkustelija
 * @author kviiri, tonykovanen
 */
public class Meksikaani extends Ihminen{
    /**
     * Luo uuden Meksikaanin (kysyt��n yliluokan konstruktoria)
     * @param sukupuoli
     * @param nimi
     * @param sukunimi
     * @param rooli 
     */
    public Meksikaani(Sukupuoli sukupuoli, String nimi, String sukunimi, Rooli rooli) {
        super(sukupuoli, nimi, sukunimi, rooli);
    }
    /**
     * Luo uuden Meksikaanin (kysyt��n yliluokan konstruktoria)
     * Rooliksi asetetaan "Se�or" miehille ja "Se�ora" naisille
     * @param sukupuoli
     * @param nimi
     * @param sukunimi 
     */
    public Meksikaani(Sukupuoli sukupuoli, String nimi, String sukunimi) {
        super(sukupuoli, nimi, sukunimi, new Rooli(sukupuoli == Sukupuoli.UROS ? "Se�or" : "Se�ora"));
    }
    /**
     * Kiroaa.
     * @return "Ai caramba!"
     */
    @Override
    public String kiroa() {
        return "Ai caramba!";
    }
}
