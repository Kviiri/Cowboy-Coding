/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

/**
 *
 * @author tonykovanen
 */
public class Meksikaani extends Ihminen{
    double kulta;
    Rooli rooli;
    
    public Meksikaani(boolean sukupuoli, String nimi, String sukunimi, double kulta, Rooli rooli) {
        super(sukupuoli, nimi, sukunimi);
        this.kulta = kulta;
        this.rooli = rooli;
    }
    @Override
    public String kiroa() {
        return "Ai caramba!";
    }

    @Override
    public double getKulta() {
        return this.kulta;
    }

    @Override
    public void setKulta(double summa) {
        this.kulta = summa;
    }
    
}
