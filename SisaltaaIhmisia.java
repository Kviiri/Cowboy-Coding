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
public interface SisaltaaIhmisia {
    public ArrayList<Ihminen> getIhmiset();
    public void lisaaIhminen(Ihminen ihminen);
    public void poistaIhminen(Ihminen ihminen);
}