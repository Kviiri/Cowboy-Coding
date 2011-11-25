package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kviiri
 */
public abstract class Ihminen extends Elain implements Ryostettava {
    private String sukunimi;
    public Ihminen(boolean sukupuoli, String nimi, String sukunimi) {
        super(sukupuoli, nimi);
        this.sukunimi = sukunimi;
    }
    
    
    /**
     * Siirtää ihmisen parametrina annettuun IhmisiaSisaltavaan
     * @param is 
     */
    public void astu(SisaltaaIhmisia is) {
        is.lisaaIhminen(this);
    }
    /**
     * Parametrinä annettu Ihminen ryöstää tämän ihmisen
     * @param ryostaja
     * @return double: saaliin määrä
     */
    @Override
    public double ryosta(Ihminen ryostaja) {
        return 0.0;
    }
    
}
