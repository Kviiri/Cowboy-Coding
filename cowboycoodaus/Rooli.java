/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

/**
 * Ihmisellä oleva rooli.
 * @author kviiri, tonykovanen
 */
public class Rooli {
    private String nimi;
    /**
     * Luo uuden roolin.
     * @param nimi Roolin nimi.
     */
    public Rooli(String nimi) {
        this.nimi = nimi;
    }
    /**
     * Palauttaa roolin nimen.
     * @return Roolin nimi
     */
    public String getNimi() {
        return this.nimi;
    }
}
