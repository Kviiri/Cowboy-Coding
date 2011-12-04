package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kviiri
 */
public class Kaarme extends Elain{
    /**
     * Käärme toteuttaa vain yliluokan konstruktoria
     * @param sukupuoli
     * @param nimi 
     */
    public Kaarme(boolean sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }
    /**
     * Käärme voi purra eläintä ja ääntelee seraavasti: HISS!, *puree*, sitten kutsutaan eläimen kiroa() metodia
     * @param e purtava eläin
     */
    public void pure(Elain e) {
        System.out.println("HISS!");
        System.out.println("*puree*");
        System.out.println(e.kiroa());
    }
    /**
     * 
     * @return "Hiss!"
     */
    @Override
    public String kiroa() {
        return "Hiss!";
    }
    /**
     * 
     * @return nopeus
     */
    @Override
    public int getNopeus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
