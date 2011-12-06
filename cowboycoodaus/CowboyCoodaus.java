/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

/**
 * Sisältää mainin, jossa Macho Luukkandez ja Arriva Vihavandez kohtaavat
 * @author tonykovanen
 */
public class CowboyCoodaus {

    /** Main metodista kaikki jo varmaan tietävät. Täydentäkää tähän toki itse jotain hienoa!
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EiRatsastajaaException {
        Hevonen heppa = new Hevonen(true, "Heppa");
        heppa.otaRatsaille(new Meksikaani(true, "Macho", "Luukkandez", new Rooli("Yliopistonlehtori")));
        Alue eka = new Alue();
        Alue toka = new Alue();
        try {
            System.out.println(heppa.getRatsastaja());
            heppa.getRatsastaja().annaAse(new Ase("Pistooli", 15));
            heppa.getRatsastaja().setAlue(eka);
            heppa.setAlue(eka);
            heppa.liiku(toka);
        } catch (EiRatsastajaaException e) {
            System.out.println("Ei ratsastajaa!");
        }
        Pankki pankki = new Pankki(100, 20, 20, 20);
        Meksikaani vartija = new Meksikaani(true, "Thug", "Bodyguardson", new Rooli("Vartija"));
        vartija.annaAse(new Ase("Puunuija", 3));
        pankki.lisaaVartija(vartija);
        heppa.getRatsastaja().teeRyosto(pankki);
        System.out.println(heppa.getRatsastaja());
    }
}
