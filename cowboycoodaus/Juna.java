package cowboycoodaus;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tonykovanen, kviiri
 */
public class Juna extends IhmisSailio implements Ryostettava, Liikkuva {

    @Override
    public double ryosta(Ihminen ryostaja) {
        double summa = 0;
        for (Ihminen ihminen : super.ihmiset) {
            summa += ihminen.getKulta();
            ihminen.ryosta(ryostaja);
        }
        return summa;
    }

    @Override
    public void liiku(Alue kohde) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getNopeus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getKulta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setKulta(double summa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
