package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author tonykovanen
 */
public abstract class Rakennus extends IhmisSailio {
    Alue alue;
    
    public Rakennus(Alue alue) {
        this.alue = alue;
    }
}
