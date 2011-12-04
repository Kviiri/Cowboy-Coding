/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cowboycoodaus;

/**
 *
 * @author tonykovanen
 */
public class CowboyCoodaus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Hevonen heppa = new Hevonen(true, "Heppa");
//        try {
//            Ihminen immeinen = heppa.getRatsastaja();
//            System.out.println(immeinen);
//        } catch (EiRatsastajaaException e) {
//            System.out.println("Ei ratsastajaa!");
//        }
        Postivaunu vaunu = new Postivaunu(100);
        vaunu.lisaaIhminen(new Meksikaani(true, "Mulkku", "Mulkkersson"));
        Alue alue = new Alue();
        alue.lisaaSisaltava(vaunu);
        Alue toinen = new Alue();
        vaunu.liiku(toinen);
        
    }
}
