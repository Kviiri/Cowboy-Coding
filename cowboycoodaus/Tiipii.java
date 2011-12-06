package cowboycoodaus;

/**
 * Tiipii on ympyräkartion muotoinen intiaanimaja. Tiipiin leveys ja syvyys ovat aina yhtäsuuret.
 * @author kviiri, tonykovanen
 */
public class Tiipii extends Rakennus {
    /**
     * Luo uuden tiipiin.
     * @param sade Tiipiin pohjaympyrän säde. Jos sade on negatiivinen, käytetään itseisarvoa
     * @param korkeus Tiipiin korkeus. Jos korkeus on negatiivinen, käytetään itseisarvoa
     */
    public Tiipii(double sade, double korkeus) {
        super(sade, korkeus, sade);
    }
    /**
     * Laskee tiipiin tilavuuden (käytä apuna pohjaPintaAla - metodia!)
     * @return tilavuus
     */
    public double tilavuus() {
        return (pohjaPintaAla() * super.getKorkeus()) / 3;
    }
    /**
     * Palauttaa lattiaympyrän säteen.
     * @return lattiaympyrän säde
     */
    public double getSade() {
        return getLeveys();
    }
    /**
     * Laskee Tiipiin pohjan pinta-alan. Pohja on ympyrän muotoinen.
     * @return Tiipiin lattiapinta-ala
     */
    public double pohjaPintaAla() {
        return (2 * Math.PI * getLeveys());
    }

    /**
     * Laajentaa Tiipiitä. Käytä yliluokan laajenna-metodia avuksesi. 
     * @param sadeLaajennos Syvyyteen ja Leveyteen tehtävä muutos.
     * @param korkeusLaajennos Korkeuteen tehtävä muutos.
     */
    public void laajenna(double sadeLaajennos, double korkeusLaajennos) {
        super.laajenna(sadeLaajennos, korkeusLaajennos, sadeLaajennos);
    }
}
