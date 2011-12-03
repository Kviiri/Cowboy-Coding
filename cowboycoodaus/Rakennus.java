package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author tonykovanen
 */
public abstract class Rakennus extends IhmisSailio {
    private double leveys;
    private double korkeus;
    private double syvyys;
    
    public Rakennus(double leveys, double korkeus, double syvyys) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.syvyys = syvyys;
    }
    
    public double tilavuus() {
        return leveys * korkeus * syvyys;
    }
    public void laajenna(double leveys, double korkeus, double syvyys) {
        this.leveys += leveys;
        this.korkeus += korkeus;
        this.syvyys += syvyys;
    }
}
