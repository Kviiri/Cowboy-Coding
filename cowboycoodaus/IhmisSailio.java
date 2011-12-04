/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

import java.util.ArrayList;

/**
 * IhmisSailio on yliluokka ihmisiä sisältäville luokille, niillä on lista ihmisiä ja alue johon ne kuuluvat, tai ei aluetta
 * @author tonykovanen, kviiri
 */
public abstract class IhmisSailio {
    protected ArrayList<Ihminen> ihmiset;
    protected Alue alue;
    /**
     * 
     * @return palauttaa listan ihmisistä
     */
    public ArrayList<Ihminen> getIhmiset() {
        return ihmiset; 
    }
    /**
     * Lisää ihmisen IhmisiaSisaltavaan
     * @param ihminen lisättävä ihminen
     */
    public void lisaaIhminen(Ihminen ihminen) {
        ihmiset.add(ihminen);
    }
    /**
     * Poistaa ihmisen IhmisiaSisaltavasta
     * @param ihminen poistettava ihminen
     */
    public void poistaIhminen(Ihminen ihminen) {
        ihmiset.remove(ihminen);
    }
    /**
     * Tarkistaa jos ihminen löytyy IhmisSailiosta
     * @param ihminen haettava ihminen 
     * @return palauttaa true jos löytyy, false jos ei löydy
     */
    public boolean onkoSailiossa(Ihminen ihminen) {
        return ihmiset.contains(ihminen);
    }
    /**
     * IhmisSailiolle voidaan asettaa alue johon se kuuluu
     * @param alue asetettava alue
     */
    public void setAlue(Alue alue) {
        this.alue = alue;
    }
}
