package cowboycoodaus;

/**
 * Rajapinta kaikelle, jolla voi ratsastaa. Ratsastettavat ovat my�s Liikkuvia.
 * @author kviiri, tonykovanen
 */
public interface Ratsastettava extends Liikkuva{
    /**
     * Ottaa ihmisen ratsaille
     * @param ihminen ratsaille otettava ihminen
     */
    public void otaRatsaille(Ihminen ihminen);
    /**
     * Palauttaa sel�ss� olevan ratsastajan. Heitt�� EiRatsastajaaExceptionin jos ratsastajaa ei ole.
     * @return ratsastaja
     * @throws EiRatsastajaaException 
     */
    public Ihminen getRatsastaja() throws EiRatsastajaaException;
    /**
     * Jos ratsailla on Ihminen se poistetaan
     */
    public void poistaRatsailta();
}
