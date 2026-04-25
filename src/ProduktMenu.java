public class ProduktMenu {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    
    private static int liczbaProduktow = 0;

    public ProduktMenu(String kod, String nazwa, double cena, String kategoria) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        
        liczbaProduktow++;
    }

    public String getKod() { return kod; }
    public String getNazwa() { return nazwa; }
    public double getCena() { return cena; }

    public static int getLiczbaProduktow() {
        return liczbaProduktow;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        
        ProduktMenu innyProdukt = (ProduktMenu) obj;
        return this.kod.equals(innyProdukt.kod);
    }

    public String toString() {
        return "[" + kod + "] " + nazwa + " (" + cena + " zł) - " + kategoria;
    }
}