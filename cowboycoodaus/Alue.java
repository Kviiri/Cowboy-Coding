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

/*
 * Sisältää ihmisiä
 * 
 */
public class Alue extends IhmisSailio {
    ArrayList<Elain> elaimet = new ArrayList<Elain>();
    ArrayList<IhmisSailio> sisaltavat = new ArrayList<IhmisSailio>(); 
    ArrayList<Rakennus> rakennukset = new ArrayList<Rakennus>(); 
    /**
     * Lisää alueelle rakennuksen
     * @param rakennus lisättävä rakennus
     */
    public void lisaaRakennus(Rakennus rakennus) {
        rakennukset.add(rakennus);
    } 
    /**
     * Lisää eläimen alueelle
     * @param elain lisättävä eläin
     */
    public void lisaaElain(Elain elain) {
        elain.setAlue(this);
        elaimet.add(elain);
    }
    /**
     * Lisää IhmisSailio luokan ilmentymän alueelle
     * @param sisaltava lisättävä ilmentymä
     */
    public void lisaaSisaltava(IhmisSailio sisaltava) {
        sisaltava.setAlue(this);
        sisaltavat.add(sisaltava);
    }
    /**
     * Poistaa rakennuksen alueelta
     * @param rakennus poistettva rakennus
     */
    public void poistaRakennus(Rakennus rakennus) {
        rakennukset.remove(rakennus);
    }
    /**
     * Poistaa eläimen alueelta
     * @param elain poistettava eläin
     */
    public void poistaElain(Elain elain) {
        elaimet.remove(elain);
    }
    /**
     * Poistaa IhmisSailio luokan ilmentymän alueelta
     * @param sisaltava poistettava ilmentymä
     */
    public void poistaSisaltava(IhmisSailio sisaltava) {
        sisaltavat.remove(sisaltava);
    }
    public String toString() {
        return "Rakennuksia " + rakennukset.size() + "\nMuita ihmisiä sisältäviä: " +
                (sisaltavat.size() - rakennukset.size()) + "\nVapaita eläimiä: " + 
                elaimet.size();
    }
    /**
     * Palauttaa alueella olevat rakennukset
     * @return paluuarvona ArrayList rakennuksia
     */
    public ArrayList<Rakennus> getRakennukset() {
        return this.rakennukset;
    }
}
