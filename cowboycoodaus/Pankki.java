/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

import java.util.ArrayList;

/**
 *
 * @author tonykovanen
 */
public class Pankki extends Rakennus {
    private double kulta;
    private ArrayList<Ihminen> Vartijat;
    
    public Pankki(double kulta, double leveys, double korkeus, double syvyys) {
        super(leveys, korkeus, syvyys);
        this.kulta = kulta;
    }
}
