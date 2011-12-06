/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

/**
 * Ihmisill� on useita aseita. Aseita k�ytet��n esim. ry�st�n onnistumisen arvioinnissa.
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
     * @return palauttaa negatiivista jos t�m� ase on tehokkuudeltaan huonompi jne. Lis�� tietoa Comparablen toteuttamisesta l�ytyy sek� ohjan materiaalista, ett� Javan omasta APIsta
     *
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
