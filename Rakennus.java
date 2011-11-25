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
public abstract class Rakennus implements SisaltaaIhmisia{
    Alue alue;
    ArrayList<Ihminen> ihmiset = new ArrayList<Ihminen>();
    
    public Rakennus(Alue alue) {
        this.alue = alue;
    }
    public void poistaIhminen(Ihminen ihminen) {
        ihmiset.add(ihminen);
    }
    public void lisaaIhminen(Ihminen ihminen) {
        ihmiset.add(ihminen);
    }
    public ArrayList<Ihminen> getIhmiset() {
        return ihmiset;
    }
}
