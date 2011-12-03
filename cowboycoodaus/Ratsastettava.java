package cowboycoodaus;

/**
 * Rajapinta kaikelle, jolla voi ratsastaa.
 * @author kviiri, tonykovanen
 */
public interface Ratsastettava {
    /**
     * Ottaa ihmisen ratsaille
     * @param ihminen ratsaille otettava ihminen
     */
    public void otaRatsaille(Ihminen ihminen);
    /**
     * Palauttaa selässä olevan ratsastajan. Heittää EiRatsastajaaExceptionin jos ratsastajaa ei ole.
     * @return ratsastaja
     * @throws EiRatsastajaaException 
     */
    public Ihminen getRatsastaja() throws EiRatsastajaaException;
}
