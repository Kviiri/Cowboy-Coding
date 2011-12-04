package cowboycoodaus;

/**
 * Meksikaani, tuo Villin Lännen leppoisa matkustelija
 * @author kviiri, tonykovanen
 */
public class Meksikaani extends Ihminen{
    /**
     * Luo uuden Meksikaanin (käytä yliluokan konstruktoria)
     * @param sukupuoli
     * @param nimi
     * @param sukunimi
     * @param rooli 
     */
    public Meksikaani(boolean sukupuoli, String nimi, String sukunimi, Rooli rooli) {
        super(sukupuoli, nimi, sukunimi, rooli);
    }
    /**
     * Luo uuden Meksikaanin (käytä yliluokan konstruktoria)
     * Rooliksi asetetaan "Señor" miehille ja "Señora" naisille
     * @param sukupuoli
     * @param nimi
     * @param sukunimi 
     */
    public Meksikaani(boolean sukupuoli, String nimi, String sukunimi) {
        super(sukupuoli, nimi, sukunimi, new Rooli(sukupuoli ? "Señor" : "Señora"));
    }
    @Override
    public String kiroa() {
        return "Ai caramba!";
    }
}
