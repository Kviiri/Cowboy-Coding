package cowboycoodaus;

/**
 * Rajapinta liikkumiseen kykeneville otuksille ja asioille.
 * @author kviiri, tonykovanen
 */
public interface Liikkuva {
    /**
     * Liikkuu parametrinä annetulle alueelle. Liikkuminen kestää matka/nopeus sekuntia, ja oletukselta joka alueelta on 60 km toiselle. Tätä voi laajentaa tehtävän vaiheessa 6.
     * Vinkkinä tähän Thread.sleep(millisekunteinaOdotettavaAika)
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
