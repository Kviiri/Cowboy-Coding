package cowboycoodaus;

/**
 * Meksikaani
 * @author kviiri, tonykovanen
 */
public class Meksikaani extends Ihminen{
    
    public Meksikaani(boolean sukupuoli, String nimi, String sukunimi, Rooli rooli) {
        super(sukupuoli, nimi, sukunimi, rooli);
    }
    public Meksikaani(boolean sukupuoli, String nimi, String sukunimi) {
        super(sukupuoli, nimi, sukunimi);
    }
    @Override
    public String kiroa() {
        return "Ai caramba!";
    }
}
