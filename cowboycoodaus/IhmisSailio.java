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
    protected ArrayList<Ihminen> ihmiset;
    protected Alue alue;
    
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
    public void setAlue(Alue alue) {
        this.alue = alue;
    }
}
