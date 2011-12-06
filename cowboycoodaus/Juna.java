package cowboycoodaus;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * IhmisSailion periv�, ry�stett�v� ja liikkuva
 * Junan vakionopeus on 60 km/h
 * @author tonykovanen, kviiri
 */
public class Juna extends IhmisSailio implements Ryostettava, Liikkuva {
    private String malli;
    private int nopeus = 60;
    private double omaKulta;        //Kulta joka on junassa mutta ei matkustajilla
    /**
     * Junalla on malli ja oma kultam��r�
     * @param malli Junan malli
     * @param omaKulta Junan oma kultam��r�
     */
    public Juna(String malli, double omaKulta) {
        this.malli = malli;
        this.omaKulta = omaKulta;
    }
    /**
     * Juna voidaan siis ry�st��, ja junan oman kullan lis�ksi ry�stet��n my�s samalla kaikki matkustajat. Ota huomioon matkustajien aseet.
     * @param ryostaja Junan ry�st�v� ihminen
     * @return Ry�stetty rahasumma
     */
    @Override
    public double ryosta(Ihminen ryostaja) {
        double summa = this.omaKulta;
        for (Ihminen ihminen : super.ihmiset) {
            summa += ihminen.ryosta(ryostaja);
        }
        this.omaKulta = 0;
        return summa;
    }
    /**
     * Kun juna liikkuu alueelta toiselle my�s sen sis�ll� olevat ihmiset liikkuvat alueelta toiselle
     * @param kohde Kohdealue
     */
    @Override
    public void liiku(Alue kohde) {
        for (Ihminen ihminen : super.ihmiset) {
            ihminen.setAlue(kohde);
        }
        super.alue.poistaSisaltava(this);
        kohde.lisaaSisaltava(this);
    }
    /**
     * 
     * @return Nopeus
     */
    @Override
    public int getNopeus() {
        return nopeus;
    }
    /**
     * 
     * @return Junan oma kultam��r� + matkustajien kultam��r�
     */
    @Override
    public double getKulta() {
        double kultaa = omaKulta;
        for (Ihminen matkustaja : super.ihmiset) {
            kultaa += matkustaja.getKulta();
        }
        return kultaa;
    }
    /**
     * Asettaa junan oman kultam��r�n
     * @param summa Uusi kultam��r�
     */
    @Override
    public void setKulta(double summa) {
        omaKulta = summa;
    }
    /**
     * Junalle voidaan asettaa nopeus, se on vakiolta 60 km / h
     * @param nopeus Asetettava nopeus
     */
    @Override
    public void setNopeus(int nopeus) {
        this.nopeus = nopeus;
    }
    
}
