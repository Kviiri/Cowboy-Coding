/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

/**
 * EiRatsastajaaException on poikkeus jota heitetŠŠn kun yritetŠŠn palauttaa ratsastettavan olematonta ratsastajaa
 * @author tonykovanen, kviiri
 */
public class EiRatsastajaaException extends Exception {
    /**
     * 
     * @param message Viesti joka annetaan poikkeukselle.
     */
    public EiRatsastajaaException(String message) {
        super(message);
    }
}
