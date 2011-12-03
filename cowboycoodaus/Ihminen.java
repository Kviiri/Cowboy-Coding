package cowboycoodaus;

import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kviiri
 */
public abstract class Ihminen extends Elain implements Ryostettava {
    private ArrayList<Ase> aseet = new ArrayList<Ase>();
    private String sukunimi;
    private double kulta;
    
    public Ihminen(boolean sukupuoli, String nimi, String sukunimi) {
        super(sukupuoli, nimi);
        this.sukunimi = sukunimi;
        this.kulta = 0;
    }
    
    
    /**
     * Siirtää ihmisen parametrina annettuun IhmisiaSisaltavaan
     * @param is 
     */
    public void astuSisaan(IhmisSailio is) {
        is.lisaaIhminen(this);
    }
    /*
     * Siirt�� ihmisen ulos IhmisiSailiosta
     * @param is
     */
    public void astuUlos(IhmisSailio is) {
        is.poistaIhminen(this);
    }
    /*
     * Ihminen nousee ratsaille
     * @param hevonen hevonen jonka ratsaille ihminen nousee
     */
    public void nouseRatsaille(Hevonen hevonen) {
        hevonen.otaRatsaille(this);
    }
    /**
     * Parametrinä annettu Ihminen ryöstää tämän ihmisen
     * @param ryostaja
     * @return double: saaliin määrä
     */
    @Override
    public double ryosta(Ihminen ryostaja) {
        if (this.parasAse().getTehokkuus() >= ryostaja.parasAse().getTehokkuus()) {
            return 0;
        }
        double maara = this.kulta;
        this.kulta = 0;
        return maara;
    }
    public double teeRyosto(Ryostettava kohde) {
        double maara = kohde.ryosta(this);
        this.kulta += maara;
        return maara;
    }
    public Ase parasAse() {
        if (this.aseet.isEmpty())
            return new Ase("Ei asetta", 0);
        return Collections.max(this.aseet);
    }
    public int getNopeus() {
        throw new UnsupportedOperationException("Ei tuettu viel�");
    }
}
