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
    
    public Kaarme(boolean sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }
    
    public void pure(Elain e) {
        System.out.println("HISS!");
        System.out.println("*puree*");
        System.out.println(e.kiroa());
    }

    @Override
    public String kiroa() {
        return "Hiss!";
    }

    @Override
    public int getNopeus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
