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
public class Alue implements SisaltaaIhmisia {
    ArrayList<Elain> elaimet = new ArrayList<Elain>();
    ArrayList<SisaltaaIhmisia> sisaltavat = new ArrayList<SisaltaaIhmisia>();
    ArrayList<Rakennus> rakennukset = new ArrayList<Rakennus>();
    
    public void lisaaRakennus(Rakennus rakennus) {
        rakennukset.add(rakennus);
    } 
    public void lisaaElain(Elain elain) {
        elaimet.add(elain);
    }
    public void lisaaSisaltava(SisaltaaIhmisia sisaltava) {
        sisaltavat.add(sisaltava);
    }
    public void poistaRakennus(Rakennus rakennus) {
        rakennukset.remove(rakennus);
    }
    public void poistaElain(Elain elain) {
        elaimet.remove(elain);
    }
    public void poistaSisaltava(SisaltaaIhmisia sisaltava) {
        sisaltavat.remove(sisaltava);
    }

    

    @Override
    public void lisaaIhminen(Ihminen ihminen) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void poistaIhminen(Ihminen ihminen) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Ihminen> getIhmiset() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
