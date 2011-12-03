/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

/**
 * Henkilöllä oleva rooli.
 * @author kviiri, tonykovanen
 */
public class Rooli {
    private String nimi;
    /**
     * Luo uuden roolin.
     * @param nimi roolin nimi.
     */
    public Rooli(String nimi) {
        this.nimi = nimi;
    }
    /**
     * Palauttaa roolin nimen.
     * @return roolin nimi
     */
    public String getNimi() {
        return this.nimi;
    }
}
