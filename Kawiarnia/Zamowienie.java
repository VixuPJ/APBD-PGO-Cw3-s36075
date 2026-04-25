import java.util.ArrayList;

public class Zamowienie {
    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;
    
    private static int kolejnyNumer = 1;

    public Zamowienie(KlientKawiarni klient) {
        this.numerZamowienia = pobierzKolejnyNumer();
        this.klient = klient;
        this.produkty = new ArrayList<>();
        this.oplacone = false;
    }

    public static int pobierzKolejnyNumer() {
        int przypisanyNumer = kolejnyNumer;
        kolejnyNumer++;
        return przypisanyNumer;
    }

    public void dodajProdukt(ProduktMenu produkt) {
        produkty.add(produkt);
    }

    public double policzWartosc() {
        double suma = 0.0;
        for (ProduktMenu produkt : produkty) {
            suma = suma + produkt.getCena();
        }
        return suma;
    }

    public int policzLiczbeProduktow() {
        return produkty.size();
    }

    public void oznaczJakoOplacone() {
        this.oplacone = true;
    }

    public String toString() {
        String wynik = "Zamówienie #" + numerZamowienia + " ";
        wynik = wynik + "Klient: " + klient.pobierzPelneDane() + " ";
        
        if (oplacone == true) {
            wynik = wynik + "Status: Opłacone";
        } else {
            wynik = wynik + "Status: Nieopłacone";
        }
        
        wynik = wynik + "Produkty:";
        for (ProduktMenu p : produkty) {
            wynik = wynik + " - " + p.getNazwa() + " (" + p.getCena() + " zł)";
        }
        
        return wynik;
    }
}