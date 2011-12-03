package cowboycoodaus;

/**
 * Tiipii on ympyräkartion muotoinen intiaanimaja.
 * @author kviiri, tonykovanen
 */
public class Tiipii extends Rakennus {
    private double sade;
    private double korkeus;
    /**
     * Luo uuden tiipiin.
     * @param sade Tiipiin pohjaympyrän säde. Jos sade on negatiivinen, käytetään itseisarvoa
     * @param korkeus Tiipiin korkeus. Jos korkeus on negatiivinen, käytetään itseisarvoa
     */
    public Tiipii(double sade, double korkeus) {
        super(sade, korkeus, 0);
        this.sade = sade;
        this.korkeus = korkeus;
    }
    /**
     * Laskee tiipiin tilavuuden (käytä apuna pohjaPintaAla - metodia!)
     * @return tilavuus
     */
    public double tilavuus() {
        return (pohjaPintaAla() * korkeus) / 3;
    }
    /**
     * Laskee tiipiin pohjapinta-alan.
     * @return Tiipiin pohjapinta-ala
     */
    public double pohjaPintaAla() {
        return (2 * Math.PI * sade);
    }
    /**
     * Laajentaa tiipiitä.
     * @param sadeLaajennos Säteen muutos (jos negatiivinen, ei muutosta)
     * @param korkeusLaajennos Korkeuden muutos (jos negatiivinen, ei muutosta)
     */
    
    @Override
    public void laajenna(double sadeLaajennos, double korkeusLaajennos, double syvyys) {
        super.laajenna(sadeLaajennos, korkeusLaajennos, 0);
    }
}
