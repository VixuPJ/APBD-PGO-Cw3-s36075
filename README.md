# Kawiarnia - PGO-GIT-CW3

Prosta aplikacja konsolowa napisana w języku Java. Projekt został stworzony w ramach nauki programowania obiektowego (PGO) i symuluje podstawowe działanie systemu do przyjmowania zamówień w kameralnej kawiarni.

## O projekcie

Celem projektu było praktyczne zastosowanie podstawowych koncepcji języka Java. Aplikacja pozwala na rejestrowanie produktów z menu, dodawanie klientów oraz tworzenie i podsumowywanie zamówień.

# Struktura plików

Main.java - główny punkt startowy aplikacji z testowym scenariuszem.

ProduktMenu.java - klasa reprezentująca pojedynczy produkt.

KlientKawiarni.java - klasa przechowująca dane klientów kawiarni.

Zamowienie.java - klasa łącząca klienta z listą produktów i obliczająca rachunek.

**W projekcie wykorzystano następujące elementy Javy:**
* Klasy, pola i konstruktory
* Metody i pola statyczne (do automatycznej numeracji zamówień)
* Kolekcje: ArrayList do przechowywania produktów w zamówieniu
* Nadpisywanie metod obiektowych: toString() (do czytelnego wyświetlania danych) oraz equals() (do biznesowego porównywania obiektów)
