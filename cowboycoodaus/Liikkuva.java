package cowboycoodaus;

/**
 * Rajapinta liikkumiseen kykeneville otuksille ja asioille.
 * @author kviiri, tonykovanen
 */
public interface Liikkuva {
    /**
     * Liikkuu parametrin√§ annetulle alueelle. Liikkuminen kestää matka/nopeus sekuntia, ja oletukselta joka alueelta on 60 km toiselle. Tätä voi laajentaa tehtävän vaiheessa 6.
     * Vinkkinä tähän Thread.sleep(millisekunteinaOdotettavaAika)s
     * @param kohde 
     */
    public void liiku(Alue kohde);
    /**
     * Palauttaa Liikkuvan liikkumisnopeuden.
     * @return 
     */
    public int getNopeus();
    /**
     * Nopeuden voi asettaa
     * @param nopeus asetetta nopeus (muotoa km / h)
     */
    public void setNopeus(int nopeus);
}
