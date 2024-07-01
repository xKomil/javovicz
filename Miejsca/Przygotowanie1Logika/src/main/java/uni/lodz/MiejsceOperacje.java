package uni.lodz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiejsceOperacje implements IMiejsceOperacje{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void dodajMiejsce(List<Miejsce> miejsca) {
        System.out.println("Co chcesz dodać miasto czy kraj? (m/k)");
        String opcja = scanner.nextLine();

        if (opcja.equals("m")) {
            System.out.println("Podaj nazwę miasta (120 znakow): ");
            String nazwa = scanner.nextLine();
            if (nazwa.length() > 120){
                System.out.println("Nazwa kraju nie moze przekroczyc 120 znakow");
            }
            System.out.println("W jakim kraju jest miasto ");
            String krajWJest = scanner.nextLine();
            if (krajWJest.length() > 120){
                System.out.println("Nazwa kraju nie moze przekroczyc 120 znakow");
            }
            System.out.println("Czy stolica (true/false) ");
            Boolean czyStolica = Boolean.valueOf(scanner.nextLine());
            System.out.println("Czy odwiedzone (true/false)");
            Boolean czyOdwiedzone = Boolean.valueOf(scanner.nextLine());

            for (Miejsce miejsce : miejsca) {
                if (miejsce.getMiejsce() instanceof Miasto && ((Miasto) miejsce.getMiejsce()).getNazwa().equals(nazwa)){
                    System.out.println("To miasto jest już na liście");
                }
            }

            Miasto miasto = new Miasto(nazwa, krajWJest, czyStolica, czyOdwiedzone);
            miejsca.add(new Miejsce(miasto));
        }
        else if (opcja.equals("k")) {
            System.out.println("Podaj nazwę kraju (120) ");
            String nazwaK = scanner.nextLine();
            if (nazwaK.length() > 120) {
                System.out.println("Nazwa może mieć maksymalnie 120 znaków ");
            }
            System.out.println("Czy jest w Uni (true/false) ");
            Boolean czyUnia = Boolean.valueOf(scanner.nextLine());
            System.out.println("Obowiązująca waluta (3) ");
            String waluta = scanner.nextLine();
            if (waluta.toString().length() > 3){
                System.out.println("Waluta nie może mieć więcej niż 3 znaki ");

            }
            System.out.println("Czy odwiedzone (true/false) ");
            Boolean czyOdwiedzone = Boolean.valueOf(scanner.nextLine());

            for (Miejsce miejsce : miejsca) {
                if (miejsce.getMiejsce() instanceof Kraj && ((Kraj) miejsce.getMiejsce()).getNazwa().equals(nazwaK)) {
                    System.out.println("Ten kraj jest już na liście ");
                }
            }

            Kraj kraj = new Kraj(nazwaK, czyUnia, waluta, czyOdwiedzone);
            miejsca.add(new Miejsce(kraj));

        }
        else {
            System.out.println("Wybrałeś złą opcję");
        }
    }

    @Override
    public void wyswietlListe(List<Miejsce> miejsca) {
        int id = 1;
        for (Miejsce miejsce : miejsca) {
            System.out.println(id + " " + miejsce.getInfo());
            id++;
        }
    }
}
