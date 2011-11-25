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
    /**
     * Siirtää ihmisen parametrina annettuun IhmisiaSisaltavaan
     * @param is 
     */
    public void astu(SisaltaaIhmisia is) {
        throw new UnsupportedOperationException("Not supported yet.");
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
