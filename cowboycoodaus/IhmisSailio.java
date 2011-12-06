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
    protected ArrayList<Ihminen> ihmiset = new ArrayList<Ihminen>();
    protected Alue alue;
    /**
     * Ihmiset saadaan luokasta getterillä
     * @return Palauttaa listan ihmisistä
     */
    public ArrayList<Ihminen> getIhmiset() {
        return ihmiset; 
    }
    /**
     * Lisää ihmisen IhmisiaSisaltavaan
     * @param ihminen Lisättävä ihminen
     */
    public void lisaaIhminen(Ihminen ihminen) {
        this.ihmiset.add(ihminen);
    }
    /**
     * Poistaa ihmisen IhmisiaSisaltavasta
     * @param ihminen Poistettava ihminen
     */
    public void poistaIhminen(Ihminen ihminen) {
        ihmiset.remove(ihminen);
    }
    /**
     * Tarkistaa jos ihminen löytyy IhmisSailiosta
     * @param ihminen Haettava ihminen 
     * @return Palauttaa true jos löytyy, false jos ei löydy
     */
    public boolean onkoSailiossa(Ihminen ihminen) {
        return ihmiset.contains(ihminen);
    }
    /**
     * IhmisSailiolle voidaan asettaa alue johon se kuuluu
     * @param alue Asetettava alue
     */
    public void setAlue(Alue alue) {
        this.alue = alue;
    }
}
