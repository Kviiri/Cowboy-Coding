package cowboycoodaus;

/**
 * Rajapinta liikkumiseen kykeneville otuksille ja asioille.
 * @author kviiri, tonykovanen
 */
public interface Liikkuva {
    /**
     * Liikkuu parametrinä annetulle alueelle.
     * @param kohde 
     */
    public void liiku(Alue kohde);
    /**
     * Palauttaa Liikkuvan liikkumisnopeuden.
     * @return 
     */
    public int getNopeus();
}
