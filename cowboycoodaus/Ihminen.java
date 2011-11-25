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
    public void astu(IhmisSailio is) {
        is.lisaaIhminen(this);
    }
    /**
     * Parametrinä annettu Ihminen ryöstää tämän ihmisen
     * @param ryostaja
     * @return double: saaliin määrä
     */
    @Override
    public double ryosta(Ihminen ryostaja) {
        double maara = this.kulta;
        this.kulta = 0;
        return maara;
    }
    public double teeRyosto(Ryostettava kohde) {
        double maara = kohde.ryosta(this);
        this.kulta += maara;
        return maara;
    }
    
}
