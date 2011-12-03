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
    
    private String nimi;
    private int nopeus;
    private double omaKulta;        //Kulta joka on junassa mutta ei matkustajilla
    private int liikkumisAikaaJaljella;     //Kuinka monta "tickiä" juna liikkuu vielä
    public Juna(String nimi, int nopeus, int omaKulta) {
        this.nimi = nimi;
        this.nopeus = nopeus;
        this.omaKulta = omaKulta;
        liikkumisAikaaJaljella = 0;
    }
    
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
        kohde.lisaaSisaltava(this);
        liikkumisAikaaJaljella = (int)Math.ceil(300.0 / getNopeus());
    }

    @Override
    public int getNopeus() {
        return nopeus;
    }

    @Override
    public double getKulta() {
        double kultaa = omaKulta;
        for (Ihminen matkustaja : super.ihmiset) {
            kultaa += matkustaja.getKulta();
        }
        return kultaa;
    }

    @Override
    public void setKulta(double summa) {
        omaKulta = summa;
    }
    
}
