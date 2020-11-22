# Aplikacja Logistyczna do zamawiania transportu

### Spis treści

* Opis funkcjonalny aplikacji
* Opcjonalne funkcje
* Technologie
* Uruchomienie
* Baza danych
* Struktura projektu
* Status
* Inspiracja
* Kontakt

### Opis funkcjonalny aplikacji

Program nie nie wymaga opcji logowania lub rejestracji.
Jest otwartą funkcją z której każdy może dowolnie korzystać

Aplikacja mobilna pozwoli zamówić odpowiednią ciężarówkę/bus-a do przewozu ładunku paletowego.

Użytkownik w aplikacji mobilnej podaje liczbę palet, wymiary i wagę

Program oblicza powierzchnię ładunkową potrzebną do przewozu danego zamówienia.
        
Aplikacj z bazy danych proponuje dostępne auto lub auta gdy ładunek nie zmieści się na jednym. 

Aplikacja uwzględnia fakt że nie zawsze przewozimy palety wymiarowe. 

Sugerowany środek transportu będzie liczony w oparciu o dane powierzchni w m3 miejsca ładunkowego.

Rozwiązanie będzie korzystać z bazy danych gdzie będą zawarte 
pojazdy o różnych rozmiarach, tonażu i stawce kosztowej za KM

### Opcjonalne fukcje

Obliczenie kosztu przejazdu w oparciu o podanie ilości kilometrów

### Technologie

* Java 11 
* Workbench database
* AWS

### Uruchomienie

Brak minimalnych wymgań sprzętowych

https://github.com/JKOKOT/KFJ_LogisticApp

### Baza danych

Uwzględnia każdy typ pojazdu dostępnego na rynku spedycyjnym. Zawiera informację dotyczące
Marki, modelu, ilości palet zdolnych do przewozu, tonażu, stawki za kilometr oraz wymiary w metrach 
sześćciennych powierzchni ładunkowej

Przykład pojazdu:

Autos (Brand, Model, PalletsAmount, Tonnage, PriceForKM, DimensionsM3) VALUES('Fiat', 'Ducato', 5, 2500, 2.7, 16);

### Struktura projektu

Pakiet Auto i jego klasy - łączą się z bazą danych

Pakiet Order i jego klasy na podstawie danych od Customer dobierają odpowiedni środek transportu
zwraca dla użytkownika aplikacji finalną informację

Pakiet Customer to użytkownik który wprowadza potrzebne dane do wyboru środka transportu dla
swojego ładunku

### Status

W trakcie opracowania

### Inspiracja

Projekt inspirowany i bazujący na doświadczeniu własnym

### Kontakt

Created by Filip, Kamil i Jacek