package uni.lodz;

import java.util.List;
import java.util.Scanner;

public class WypozyczeniaManager implements IWypozyczeniaManager {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void dodajWypozyczenie(List<Wypozyczenie> wypozyczenia) {
        System.out.println("Chcesz dodać książkę czy gre planszową? (g/k) ");
        String opcja = scanner.nextLine();

        if (opcja.equals("k")) {
            System.out.println("Podaj nazwę książki ");
            String nazwa = scanner.nextLine();
            if (nazwa.length() > 120) {
                System.out.println("Nazwa musi mieć mniej niż 120 znaków");
                return;
            }
            System.out.println("Podaj autora książki ");
            String autor = scanner.nextLine();
            if (autor.length() > 100) {
                System.out.println("Autor musi mieć mniej niż 100 znaków");
                return;
            }
            System.out.println("Podaj wiek minimalny ");
            int wiek = Integer.parseInt(scanner.nextLine());

            System.out.println("Podaj imię ");
            String imie = scanner.nextLine();
            System.out.println("Podaj nazwisko ");
            String nazwisko = scanner.nextLine();
            System.out.println("Podaj wiek ");
            int wiekKlienta = Integer.parseInt(scanner.nextLine());

            Ksiazka ksiazka = new Ksiazka(nazwa, autor, wiek);
            wypozyczenia.add(new Wypozyczenie(ksiazka, imie, nazwisko, wiekKlienta));
        } else if (opcja.equals("g")) {
            System.out.println("Podaj nazwę gry ");
            String nazwa = scanner.nextLine();
            if (nazwa.length() > 120) {
                System.out.println("Nazwa gry musi mieć mniej niż 120 znaków");
                return;
            }
            System.out.println("Podaj wiek minimalny ");
            int wiekMin = Integer.parseInt(scanner.nextLine());
            System.out.println("Podaj wiek maksymalny ");
            int wiekMax = Integer.parseInt(scanner.nextLine());

            System.out.println("Podaj imię ");
            String imie = scanner.nextLine();
            System.out.println("Podaj nazwisko ");
            String nazwisko = scanner.nextLine();
            System.out.println("Podaj wiek ");
            int wiekKlienta = Integer.parseInt(scanner.nextLine());

            Gra gra = new Gra(nazwa, wiekMin, wiekMax);
            wypozyczenia.add(new Wypozyczenie(gra, imie, nazwisko, wiekKlienta));
        } else {
            System.out.println("Wybrałeś złą opcję");
        }
    }

    @Override
    public void wyswietlListe(List<Wypozyczenie> wypozyczenia) {
        int id = 1;
        for (Wypozyczenie wypozyczenie : wypozyczenia) {
            System.out.println(id + ", " + wypozyczenie.getInfo());
            id++;
        }
    }
}
