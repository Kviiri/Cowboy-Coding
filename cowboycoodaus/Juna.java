package cowboycoodaus;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * IhmisSailion periv�, ry�stett�v� ja liikkuva
 * @author tonykovanen, kviiri
 */
public class Juna extends IhmisSailio implements Ryostettava, Liikkuva {
    
    private String malli;
    private int nopeus;
    private double omaKulta;        //Kulta joka on junassa mutta ei matkustajilla
    /**
     * Junalla on malli ja oma kultam��r�
     * @param malli junan malli
     * @param omaKulta junan oma kultam��r�
     */
    public Juna(String malli, int omaKulta) {
        this.malli = malli;
        this.omaKulta = omaKulta;
    }
    /**
     * Juna voidaan siis ry�st��, ja junan oman kullan lis�ksi ry�stet��n my�s samalla kaikki matkustajat. Ota huomioon matkustajien aseet.
     * @param ryostaja junan ry�st�v� ihminen
     * @return ry�stetty rahasumma
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
     * @param kohde kohdealue
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
     * @return nopeus
     */
    @Override
    public int getNopeus() {
        return nopeus;
    }
    /**
     * 
     * @return junan oma kultam��r� + matkustajien kultam��r�
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
     * @param summa uusi kultam��r�
     */
    @Override
    public void setKulta(double summa) {
        omaKulta = summa;
    }
    
}
