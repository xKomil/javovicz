package uni.lodz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Wypozyczenie> wypozyczenia = new ArrayList<>();
        WypozyczeniaManager wypozyczeniaManager = new WypozyczeniaManager();
        Raport raport = new Raport();
        Serializuj serializuj = new Serializuj();
        boolean running = true;


        while (running){
            System.out.println("Wybierz opcje ");
            System.out.println("1. Dodaj wypozyczenie ");
            System.out.println("2. Wyswietl liste ");
            System.out.println("3. Generuj raport ");
            System.out.println("4. Zapisz plik");
            System.out.println("5. Wyjdz z programu");
            String opcja = scanner.nextLine();
            switch (opcja) {
                case "1":
                    wypozyczeniaManager.dodajWypozyczenie(wypozyczenia);
                    break;
                case "2":
                    wypozyczeniaManager.wyswietlListe(wypozyczenia);
                    break;
                case "3":
                    raport.generujRaport(wypozyczenia);
                    break;
                case "4":
                    serializuj.zapiszDoPliku(wypozyczenia);
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Wybrales zla opcje");

            }
        }
    }
}