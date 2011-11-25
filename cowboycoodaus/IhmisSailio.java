/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

import java.util.ArrayList;

/**
 *
 * @author tonykovanen, kviiri
 */
public abstract class IhmisSailio {
    public ArrayList<Ihminen> ihmiset;
    
    public ArrayList<Ihminen> getIhmiset() {
        return ihmiset; 
    }
    public void lisaaIhminen(Ihminen ihminen) {
        ihmiset.add(ihminen);
    }
    public void poistaIhminen(Ihminen ihminen) {
        ihmiset.remove(ihminen);
    }
    public boolean onkoSailiossa(Ihminen ihminen) {
        return ihmiset.contains(ihminen);
    }
}
