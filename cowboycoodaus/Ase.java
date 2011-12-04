/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

/**
 * 
 * @author tonykovanen, kviiri
 */
public class Ase implements Comparable<Ase>{
    public String nimi;
    public int tehokkuus;
    /**
     * Aseella on nimi ja tehokkuus
     * @param nimi aseen nimi
     * @param tehokkuus aseen tehokkuus
     */
    public Ase(String nimi, int tehokkuus) {
        this.nimi = nimi;
        this.tehokkuus = tehokkuus;
    }
    @Override
    public String toString() {
        return nimi + "(" + tehokkuus + ")";
    }
    /**
     * Aseita voidaan siis vertailla
     * @param t vertailun kohteena oleva ase
     * @return palauttaa negatiivista jos tämä ase on tehokkuudeltaan huonompi jne.
     * 
     */
    @Override
    public int compareTo(Ase t) {
        return this.getTehokkuus() - t.getTehokkuus();
    }
    /**
     * 
     * @return palauttaa tehokkuuden
     */
    public int getTehokkuus() {
        return this.tehokkuus;
    }
    /**
     * 
     * @return palauttaa nimen
     */
    public String getNimi() {
        return this.nimi;
    }
}
