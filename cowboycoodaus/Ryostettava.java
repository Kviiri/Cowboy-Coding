package cowboycoodaus;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Rajapinta asioille, jotka voi ry�st��.
 * @author tonykovanen, kviiri
 */
public interface Ryostettava {
    /**
     * Ry�st�� Ryostettavan.
     * @param ryostaja Ry�st�nn tekij�
     * @return Saaliin m��r�
     */
    public double ryosta(Ihminen ryostaja);
    /**
     * Palauttaa Ryostettavalla olevan kultam��r�n
     * @return Kultam��r�
     */
    public double getKulta();
    /**
     * Asettaa Ryostettavan sis�lt�m�n kultam��r�n
     * @param summa Uusi kultam��r�
     */
    public void setKulta(double summa);
}
