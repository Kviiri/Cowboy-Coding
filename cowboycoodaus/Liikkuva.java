package cowboycoodaus;

/**
 * Rajapinta liikkumiseen kykeneville otuksille ja asioille.
 * @author kviiri, tonykovanen
 */
public interface Liikkuva {
    /**
     * Liikkuu parametrin� annetulle alueelle. Liikkuminen kest�� matka/nopeus sekuntia, ja oletukselta joka alueelta on 60 km toiselle. T�t� voi laajentaa teht�v�n vaiheessa 6.
     * Vinkkin� t�h�n Thread.sleep(millisekunteinaOdotettavaAika)
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
