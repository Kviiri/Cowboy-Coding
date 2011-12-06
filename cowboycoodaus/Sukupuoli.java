/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

/**
 * Elain luokan mahdolliset sukupuolet: UROS, NAARAS
 * @author tonykovanen
 */
public enum Sukupuoli {
    UROS, NAARAS;
    /**
     * Palauttaa Sukupuolen suoraan stringinä
     * @return Muotoa Uros, Naaras
     */
    public String toString() {
        String string = super.toString();
        string = string.charAt(0) + string.substring(1).toLowerCase();
        return string;
    }
}
