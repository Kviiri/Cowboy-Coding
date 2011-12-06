/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

import java.util.ArrayList;

/**
 * IhmisSailio on yliluokka ihmisi� sis�lt�ville luokille, niill� on lista ihmisi� ja alue johon ne kuuluvat, tai ei aluetta
 * @author tonykovanen, kviiri
 */
public abstract class IhmisSailio {
    protected ArrayList<Ihminen> ihmiset = new ArrayList<Ihminen>();
    protected Alue alue;
    /**
     * Ihmiset saadaan luokasta getterill�
     * @return Palauttaa listan ihmisist�
     */
    public ArrayList<Ihminen> getIhmiset() {
        return ihmiset; 
    }
    /**
     * Lis�� ihmisen IhmisiaSisaltavaan
     * @param ihminen Lis�tt�v� ihminen
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
     * Tarkistaa jos ihminen l�ytyy IhmisSailiosta
     * @param ihminen Haettava ihminen 
     * @return Palauttaa true jos l�ytyy, false jos ei l�ydy
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
