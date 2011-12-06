package cowboycoodaus;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Hevonen on Elain luokan perivŠ ratsastettava elŠin. SillŠ voi siis olla ratsastaja.
 * @author kviiri, tonykovanen
 */
public class Hevonen extends Elain implements Ratsastettava {
    private Ihminen ratsastaja;
    
    /**
     * Hevoselle annetaan vain yliluokan konstruktori vaatimat parametrit. Miten kutsut yliluokan konstruktoria?
     * @param sukupuoli
     * @param nimi 
     */
    public Hevonen(Sukupuoli sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }
    /**
     * Hevosella voi olla ratsastaja
     * @param ihminen Ihminen joka asetetaan ratsastajaksi
     */
    @Override
    public void otaRatsaille(Ihminen ihminen) {
        this.ratsastaja = ihminen;
    }
    /**
     * Ratsastajaan pŠŠstŠŠn kŠsiksi getterillŠ
     * @return palauttaa ratsastajan
     * @throws EiRatsastajaaException Jos ratsastajaa ei ole niin heitettŠŠn poikkeus
     */
    @Override
    public Ihminen getRatsastaja() throws EiRatsastajaaException {
        if (this.ratsastaja == null) {
            throw new EiRatsastajaaException("lol");
        }
        return this.ratsastaja;
    }
    /**
     * 
     * @return Hevonen kiroaa "Ihahaa!"
     */
    @Override
    public String kiroa() {
        return "Ihahaa!";
    }
    /**
     * Jos hevosella on ratsastaja niin molemmat liikkuvat, muuten vain hevonen liikkuu
     * @param alue Alue johon liikutaan
     */
    @Override
    public void liiku(Alue alue) {
        if (this.ratsastaja != null) {
            super.liiku(alue);
            this.ratsastaja.liiku(alue);
        } else {
            super.liiku(alue);
        }
    }
    /**
     * Ratsastaja voidaan poistaa ratsailta
     */
    @Override
    public void poistaRatsailta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
