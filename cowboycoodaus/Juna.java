package cowboycoodaus;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * IhmisSailion perivä, ryöstettävä ja liikkuva
 * Junan vakionopeus on 60 km/h
 * @author tonykovanen, kviiri
 */
public class Juna extends IhmisSailio implements Ryostettava, Liikkuva {
    private String malli;
    private int nopeus = 60;
    private double omaKulta;        //Kulta joka on junassa mutta ei matkustajilla
    /**
     * Junalla on malli ja oma kultamäärä
     * @param malli Junan malli
     * @param omaKulta Junan oma kultamäärä
     */
    public Juna(String malli, double omaKulta) {
        this.malli = malli;
        this.omaKulta = omaKulta;
    }
    /**
     * Juna voidaan siis ryöstää, ja junan oman kullan lisäksi ryöstetään myös samalla kaikki matkustajat. Ota huomioon matkustajien aseet.
     * @param ryostaja Junan ryöstävä ihminen
     * @return Ryöstetty rahasumma
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
     * Kun juna liikkuu alueelta toiselle myös sen sisällä olevat ihmiset liikkuvat alueelta toiselle
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
     * @return Junan oma kultamäärä + matkustajien kultamäärä
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
     * Asettaa junan oman kultamäärän
     * @param summa Uusi kultamäärä
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
