package cowboycoodaus;

/**
 * Rajapinta liikkumiseen kykeneville otuksille ja asioille.
 * @author kviiri, tonykovanen
 */
public interface Liikkuva {
    /**
     * Liikkuu parametrinä annetulle alueelle. 
     * @param kohde Kohdealue
     */
    public void liiku(Alue kohde);
    /**
     * Palauttaa Liikkuvan liikkumisnopeuden.
     * @return Liikkumanopeus
     */
    public int getNopeus();
    /**
     * Nopeuden voi asettaa
     * @param nopeus Asetettava nopeus (muotoa km / h)
     */
    public void setNopeus(int nopeus);
}
