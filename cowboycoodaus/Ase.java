/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

/**
 *
 * @author tonykovanen, kviiri
 */
public class Ase {
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
}
