import java.time.LocalDate;

/**
 * Trida Prodejce s atributy
 * jmeno - jmeno a prijmeni
 * datumNarozeni - format LocalDate (1955,09,22)
 * pocetSjednanychSmluv - cele cislo
 * prodanaMrkev - format float s pouzitim desetinnych cisel   // pozit double nebo float?
 * senior - true/false
 */
public class Prodejce {
    private String jmeno;
    private LocalDate datumNarozeni;
    private int pocetSjednanychSmluv;
    private float prodanaMrkev;
    private boolean senior;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public int getPocetSjednanychSmluv() {
        return pocetSjednanychSmluv;
    }

    public void setPocetSjednanychSmluv(int pocetSjednanychSmluv) {
        this.pocetSjednanychSmluv = pocetSjednanychSmluv;
    }

    public float getProdanaMrkev() {
        return prodanaMrkev;
    }

    public void setProdanaMrkev(float prodanaMrkev) {
        this.prodanaMrkev = prodanaMrkev;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }
}




