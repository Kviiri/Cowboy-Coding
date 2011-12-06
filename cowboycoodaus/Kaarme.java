package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Perinteisesti hidas el�in, joka puree 
 * @author kviiri
 */
public class Kaarme extends Elain{
    /**
     * K��rme vain kutsuu yliluokan konstruktoria
     * @param sukupuoli
     * @param nimi 
     */
    public Kaarme(Sukupuoli sukupuoli, String nimi) {
        super(sukupuoli, nimi);
    }
    /**
     * K��rme voi purra el�int� ja ��nntelee seraavasti: "HISS!",ln, "*puree*",ln, sitten kutsutaan el�imen kiroa() metodia
     * @param e Purtava el�in
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
