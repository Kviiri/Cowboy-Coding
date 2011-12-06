package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Rajapinta asioille, jotka voi ryšstŠŠ.
 * @author tonykovanen, kviiri
 */
public interface Ryostettava {
    /**
     * RyšstŠŠ Ryostettavan.
     * @param ryostaja Ryšstšnn tekijŠ
     * @return Saaliin mŠŠrŠ
     */
    public double ryosta(Ihminen ryostaja);
    /**
     * Palauttaa Ryostettavalla olevan kultamŠŠrŠn
     * @return KultamŠŠrŠ
     */
    public double getKulta();
    /**
     * Asettaa Ryostettavan sisŠltŠmŠn kultamŠŠrŠn
     * @param summa Uusi kultamŠŠrŠ
     */
    public void setKulta(double summa);
}
