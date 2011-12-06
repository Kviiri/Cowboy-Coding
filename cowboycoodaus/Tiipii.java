package cowboycoodaus;

/**
 * Tiipii on ympyr�kartion muotoinen intiaanimaja. Tiipiin leveys ja syvyys ovat aina yht�suuret.
 * @author kviiri, tonykovanen
 */
public class Tiipii extends Rakennus {
    /**
     * Luo uuden tiipiin.
     * @param sade Tiipiin pohjaympyr�n s�de. Jos sade on negatiivinen, k�ytet��n itseisarvoa
     * @param korkeus Tiipiin korkeus. Jos korkeus on negatiivinen, k�ytet��n itseisarvoa
     */
    public Tiipii(double sade, double korkeus) {
        super(sade, korkeus, sade);
    }
    /**
     * Laskee tiipiin tilavuuden (k�yt� apuna pohjaPintaAla - metodia!)
     * @return tilavuus
     */
    public double tilavuus() {
        return (pohjaPintaAla() * super.getKorkeus()) / 3;
    }
    /**
     * Palauttaa lattiaympyr�n s�teen.
     * @return lattiaympyr�n s�de
     */
    public double getSade() {
        return getLeveys();
    }
    /**
     * Laskee Tiipiin pohjan pinta-alan. Pohja on ympyr�n muotoinen.
     * @return Tiipiin lattiapinta-ala
     */
    public double pohjaPintaAla() {
        return (2 * Math.PI * getLeveys());
    }

    /**
     * Laajentaa Tiipiit�. K�yt� yliluokan laajenna-metodia avuksesi. 
     * @param sadeLaajennos Syvyyteen ja Leveyteen teht�v� muutos.
     * @param korkeusLaajennos Korkeuteen teht�v� muutos.
     */
    public void laajenna(double sadeLaajennos, double korkeusLaajennos) {
        super.laajenna(sadeLaajennos, korkeusLaajennos, sadeLaajennos);
    }
}
