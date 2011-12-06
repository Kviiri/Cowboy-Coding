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
        Hevonen heppa = new Hevonen(Sukupuoli.UROS, "Heppa");
        heppa.otaRatsaille(new Meksikaani(Sukupuoli.UROS, "Macho", "Luukkandez", new Rooli("Yliopistonlehtori")));
        Alue eka = new Alue();
        Alue toka = new Alue();
        try {
            System.out.println(heppa.getRatsastaja());
            heppa.getRatsastaja().annaAse(new Ase("Test Driven Development", 15));
            heppa.getRatsastaja().setAlue(eka);
            heppa.setAlue(eka);
            heppa.liiku(toka);
        } catch (EiRatsastajaaException e) {
            System.out.println("Ei ratsastajaa!");
        }
        Pankki pankki = new Pankki(500, 20, 20, 20);
        Meksikaani vihavainen = new Meksikaani(Sukupuoli.UROS, "Arriva", "Vihavandez", new Rooli("Padawan"));
        vihavainen.annaAse(new Ase("Vesiputousmalli", 3));
        pankki.lisaaVartija(vihavainen);
        heppa.getRatsastaja().teeRyosto(pankki);
        System.out.println(heppa.getRatsastaja());
        Kojootti coyotee = new Kojootti(Sukupuoli.UROS, "Coyotee");
        vihavainen.nouseRatsaille(coyotee);
        Kaarme kobra = new Kaarme(Sukupuoli.NAARAS, "Muerte");
        
        kobra.pure(vihavainen);
    }
}
