package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Rajapinta asioille, jotka voi ryöstää.
 * @author tonykovanen, kviiri
 */
public interface Ryostettava {
    /**
     * Ryöstää Ryostettavan.
     * @param ryostaja Ryöstön tekijä
     * @return Saaliin määrä 
     */
    public double ryosta(Ihminen ryostaja);
    /**
     * Palauttaa Ryostettavan kultamäärän
     * @return kultamäärä
     */
    public double getKulta();
    /**
     * Asettaa Ryostettavan sisältämän kultamäärän
     * @param summa Uusi kultamäärä
     */
    public void setKulta(double summa);
}
