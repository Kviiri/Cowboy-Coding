/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

import java.util.ArrayList;

/**
 * Sis�lt�� el�imi�, rakennuksia ja muita sis�lt�vi�
 * @author tonykovanen, kviiri
 */

/*
 * 
 * 
 */
public class Alue extends IhmisSailio {
    private ArrayList<Elain> elaimet = new ArrayList<Elain>();
    private ArrayList<IhmisSailio> sisaltavat = new ArrayList<IhmisSailio>(); 
    private ArrayList<Rakennus> rakennukset = new ArrayList<Rakennus>(); 
    /**
     * Lis�� alueelle rakennuksen
     * @param rakennus lis�tt�v� rakennus
     */
    public void lisaaRakennus(Rakennus rakennus) {
        rakennukset.add(rakennus);
    } 
    /**
     * Lis�� el�imen alueelle
     * @param elain lis�tt�v� el�in
     */
    public void lisaaElain(Elain elain) {
        elain.setAlue(this);
        elaimet.add(elain);
    }
    /**
     * Lis�� IhmisSailio luokan ilmentym�n alueelle
     * @param sisaltava lis�tt�v� ilmentym�
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
     * Poistaa el�imen alueelta
     * @param elain poistettava el�in
     */
    public void poistaElain(Elain elain) {
        elaimet.remove(elain);
    }
    /**
     * Poistaa IhmisSailio luokan ilmentym�n alueelta
     * @param sisaltava poistettava ilmentym�
     */
    public void poistaSisaltava(IhmisSailio sisaltava) {
        sisaltavat.remove(sisaltava);
    }
    public String toString() {
        return "Rakennuksia " + rakennukset.size() + "\nMuita ihmisi� sis�lt�vi�: " +
                (sisaltavat.size() - rakennukset.size()) + "\nVapaita el�imi�: " + 
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
