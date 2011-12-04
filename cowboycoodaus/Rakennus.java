package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 * Yksittäinen rakennus, jolla on leveys, korkeus ja syvyys
 * @author kviiri, tonykovanen
 */
public abstract class Rakennus extends IhmisSailio {
    private double leveys;
    private double korkeus;
    private double syvyys;
    /**
     * Luo uuden rakennuksen annetuista parametreista. Rakennukset ovat kuution muotoisia.
     * @param leveys
     * @param korkeus
     * @param syvyys 
     */
    public Rakennus(double leveys, double korkeus, double syvyys) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.syvyys = syvyys;
    }

    /**
     * @return rakennuksen korkeus 
     */
    public double getKorkeus() {
        return korkeus;
    }
    /**
     * @return rakennuksen leveys 
     */
    public double getLeveys() {
        return leveys;
    }
    /**
     * @return rakennuksen syvyys 
     */
    public double getSyvyys() {
        return syvyys;
    }
    /**
     * Laskee rakennuksen tilavuuden. Rakennukset ovat oletuksellisesti kuution muotoisia.
     * @return rakennuksen tilavuus
     */
    public double tilavuus() {
        return leveys * korkeus * syvyys;
    }
    
    /**
     * Laskee rakennuksen pohjan pinta-alan.
     * @return pohjan pinta-ala
     */
    public double pohjaPintaAla() {
        return leveys * syvyys;
    }

    /**
     * Laajentaa rakennusta annettujen parametrien verran. Negatiivinen laajennos tulkitaan nollaksi.
     * @param leveys leveyden laajennos
     * @param korkeus korkeuden laajennos
     * @param syvyys syvyyden laajennos
     */
    public void laajenna(double leveys, double korkeus, double syvyys) {
        this.leveys += Math.max(0, leveys);
        this.korkeus += Math.max(0, korkeus);
        this.syvyys += Math.max(0, syvyys);
    }
}
