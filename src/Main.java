import java.time.LocalDate;

/* Zadani domaciho ukolu lekce 1
   Prodejce mrkve
 */
public class Main {
    public static void main(String[] args) {

        String jmeno = "Jan Novak";
        LocalDate datumNarozeni;

        int pocetSjednanychSmluv = 10;
        float prodanaMrkev = 10.5F;
        boolean senior = true;

        Prodejce prodejce1 = new Prodejce();
        Prodejce prodejce2 = new Prodejce();

        prodejce1.setJmeno("Jan Novak \t");
        prodejce1.setDatumNarozeni(LocalDate.of(1955, 11, 22));
        System.out.println(prodejce1.getJmeno());
        //System.out.println(prodejce1.getJmeno() + prodejce1.getDatumNarozeni()); Pro vypsani data narozeni


        prodejce2.setJmeno("Josef Novy \t");
        prodejce2.setDatumNarozeni(LocalDate.of(1956, 11, 22));
        System.out.println(prodejce2.getJmeno());


        }
    }
