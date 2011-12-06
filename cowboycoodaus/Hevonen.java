package cowboycoodaus;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Hevonen on Elain luokan perivä ratsastettava eläin. Sillä voi siis olla ratsastaja.
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
     * Ratsastajaan päästään käsiksi getterillä
     * @return palauttaa ratsastajan
     * @throws EiRatsastajaaException Jos ratsastajaa ei ole niin heitettään poikkeus
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
        try {
            System.out.println("Liikkuu...");
            Thread.sleep(1000 * 60 / super.getNopeus());
            System.out.println("Perillä.");
        } catch (InterruptedException ex) {
            Logger.getLogger(Hevonen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
