package uni.lodz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        MiejsceOperacje miejsceOperacje = new MiejsceOperacje();
        Raport raport = new Raport();
        Serializacja serializacja = new Serializacja();
        boolean running = true;
        List<Miejsce> miejsca = new ArrayList<>();

        while(running){
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Dodaj miejsce ");
            System.out.println("2. Pokaż liste miejsc ");
            System.out.println("3. Pokaż raport ");
            System.out.println("4. Zapisz do pliku");
            System.out.println("5. Wyjdz z programu");
            String opcja = scanner.nextLine();

            switch (opcja) {
                case "1":
                    miejsceOperacje.dodajMiejsce(miejsca);
                    break;
                case "2":
                    miejsceOperacje.wyswietlListe(miejsca);
                    break;
                case "3":
                    raport.generujRaport(miejsca);
                    break;
                case "4":
                    serializacja.zapiszDoPliku(miejsca);
                    System.out.println("Zapisano plik ");
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Wybraną złą opcję");
            }
        }

    }
}