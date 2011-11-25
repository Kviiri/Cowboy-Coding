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
public class Alue extends IhmisSailio {
    ArrayList<Elain> elaimet = new ArrayList<Elain>();
    ArrayList<IhmisSailio> sisaltavat = new ArrayList<IhmisSailio>();
    ArrayList<Rakennus> rakennukset = new ArrayList<Rakennus>();
    
    public void lisaaRakennus(Rakennus rakennus) {
        rakennukset.add(rakennus);
    } 
    public void lisaaElain(Elain elain) {
        elaimet.add(elain);
    }
    public void lisaaSisaltava(IhmisSailio sisaltava) {
        sisaltavat.add(sisaltava);
    }
    public void poistaRakennus(Rakennus rakennus) {
        rakennukset.remove(rakennus);
    }
    public void poistaElain(Elain elain) {
        elaimet.remove(elain);
    }
    public void poistaSisaltava(IhmisSailio sisaltava) {
        sisaltavat.remove(sisaltava);
    }
}
