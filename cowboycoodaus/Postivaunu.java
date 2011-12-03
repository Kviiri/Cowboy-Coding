package cowboycoodaus;

import java.util.ArrayList;
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kviiri
 */
public class Postivaunu extends IhmisSailio implements Ryostettava, Liikkuva {
    private double kulta;
    
    public Postivaunu(double kulta) {
        this.kulta = kulta;
    }
    @Override
    public double ryosta(Ihminen ryostaja) {
        double maara = this.kulta;
        this.kulta = 0;
        return maara;
    }

    @Override
    public void liiku(Alue kohde) {
        for (Ihminen ihminen : super.ihmiset) {
            ihminen.setAlue(kohde);
        }
        super.alue.poistaSisaltava(this);
        kohde.lisaaSisaltava(this);
    }

    @Override
    public int getNopeus() {
        throw new UnsupportedOperationException("Not supported yet.");
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
