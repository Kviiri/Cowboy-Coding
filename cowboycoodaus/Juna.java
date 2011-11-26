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
            summa += ihminen.ryosta(ryostaja);
        }
        return summa;
    }

    @Override
    public void liiku(Alue kohde) {
        for (Ihminen ihminen : super.ihmiset) {
            ihminen.setAlue(kohde);
        }
        super.alue.poistaSisaltava(this);
        super.setAlue(kohde);
        kohde.lisaaSisaltava(this);
    }

    @Override
    public int getNopeus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getKulta() {
        int kultaa = 0;
        for (Ihminen matkustaja : super.ihmiset) {
            kultaa += matkustaja.getKulta();
        }
        return kultaa;
    }

    @Override
    public void setKulta(double summa) {
        return;
    }
    
}
