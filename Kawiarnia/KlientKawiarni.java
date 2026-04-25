public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public String pobierzPelneDane() {
        return imie + " " + nazwisko + " (" + email + ")";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        
        KlientKawiarni innyKlient = (KlientKawiarni) obj;
        return this.idKlienta == innyKlient.idKlienta;
    }

    public String toString() {
        return "Klient #" + idKlienta + ": " + imie + " " + nazwisko + ", e-mail: " + email;
    }
}