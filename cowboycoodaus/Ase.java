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
    public Ase(String nimi, int tehokkuus) {
        this.nimi = nimi;
        this.tehokkuus = tehokkuus;
    }
    @Override
    public String toString() {
        return nimi + "(" + tehokkuus + ")";
    }

    @Override
    public int compareTo(Ase t) {
        return this.getTehokkuus() - t.getTehokkuus();
    }
    public int getTehokkuus() {
        return this.tehokkuus;
    }
    public String getNimi() {
        return this.nimi;
    }
}
