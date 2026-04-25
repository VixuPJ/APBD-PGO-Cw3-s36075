public class Main {
    public static void main(String[] args) {
        ProduktMenu p1 = new ProduktMenu("K-01", "Espresso", 9.0, "kawa");
        ProduktMenu p2 = new ProduktMenu("K-02", "Cappuccino", 13.5, "kawa");
        ProduktMenu p3 = new ProduktMenu("D-01", "Sernik", 16.0, "deser");

        KlientKawiarni klient = new KlientKawiarni(100, "Julia", "Mazur", "j.mazur@mail.pl");

        Zamowienie zamowienie = new Zamowienie(klient);
        zamowienie.dodajProdukt(p1);
        zamowienie.dodajProdukt(p2);
        zamowienie.dodajProdukt(p3);

        System.out.println(klient);
        System.out.println(zamowienie);
        System.out.println("Łączna wartość do zapłaty: " + zamowienie.policzWartosc() + " zł");
        System.out.println("Ile sztuk w zamówieniu: " + zamowienie.policzLiczbeProduktow());
        
        System.out.println("Ile produktów stworzono w ogóle w systemie: " + ProduktMenu.getLiczbaProduktow());

        ProduktMenu innaKawa = new ProduktMenu("K-01", "Inne Espresso", 9.0, "kawa");
        System.out.println("\nCzy p1 i innaKawa to to samo według kodu? " + p1.equals(innaKawa));

        zamowienie.oznaczJakoOplacone();
        System.out.println("--- Po opłaceniu ---");
        System.out.println(zamowienie);
    }
}