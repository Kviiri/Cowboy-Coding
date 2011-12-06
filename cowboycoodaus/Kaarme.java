package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Perinteisesti hidas elŠin, joka puree 
 * @author kviiri
 */
public class Kaarme extends Elain{
    /**
     * KŠŠrme vain kutsuu yliluokan konstruktoria
     * @param sukupuoli
     * @param nimi 
     */
    public Kaarme(Sukupuoli sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }
    /**
     * KŠŠrme voi purra elŠintŠ ja ŠŠnntelee seraavasti: "HISS!",ln, "*puree*",ln, sitten kutsutaan elŠimen kiroa() metodia
     * @param e Purtava elŠin
     */
    public void pure(Elain e) {
        System.out.println("HISS!");
        System.out.println("*puree*");
        System.out.println(e.kiroa());
    }
    /**
     * Kiroaa
     * @return "Hiss!"
     */
    @Override
    public String kiroa() {
        return "Hiss!";
    }
}
