package cowboycoodaus;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * IhmisSailion perivä, ryöstettävä ja liikkuva
 * @author tonykovanen, kviiri
 */
public class Juna extends IhmisSailio implements Ryostettava, Liikkuva {
    
    private String malli;
    private int nopeus;
    private double omaKulta;        //Kulta joka on junassa mutta ei matkustajilla
    /**
     * Junalla on malli ja oma kultamäärä
     * @param malli junan malli
     * @param omaKulta junan oma kultamäärä
     */
    public Juna(String malli, int omaKulta) {
        this.malli = malli;
        this.omaKulta = omaKulta;
    }
    /**
     * Juna voidaan siis ryöstää, ja junan oman kullan lisäksi ryöstetään myös samalla kaikki matkustajat. Ota huomioon matkustajien aseet.
     * @param ryostaja junan ryöstävä ihminen
     * @return ryöstetty rahasumma
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
     * @return junan oma kultamäärä + matkustajien kultamäärä
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
     * @param summa uusi kultamäärä
     */
    @Override
    public void setKulta(double summa) {
        omaKulta = summa;
    }
    
}
