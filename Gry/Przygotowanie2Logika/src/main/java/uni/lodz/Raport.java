package uni.lodz;

import java.util.List;

public class Raport implements IRaport{

    @Override
    public void generujRaport(List<Wypozyczenie> wypozyczenia) {
        int iloscKsiazek = 0;
        int iloscGier = 0;
        int dzieci = 0;
        int mlodziez = 0;
        int dorosli = 0;

        for (Wypozyczenie wypozyczenie : wypozyczenia) {
            if (wypozyczenie.getWiek() < 10) {
                dzieci++;
            } else if (wypozyczenie.getWiek() > 18) {
                dorosli++;
            } else if (wypozyczenie.getWiek() > 10 || wypozyczenie.getWiek() < 18) {
                mlodziez++;
            } else if (wypozyczenie.getPrzedmiot() instanceof Ksiazka) {
                iloscKsiazek++;
            } else if (wypozyczenie.getPrzedmiot() instanceof Gra) {
                iloscGier++;
            } else {
                System.out.println("Jakiś błąd w klasach w liscie");
            }
        }

        System.out.println("Ilość książek " + iloscKsiazek);
        System.out.println("Ilość gier " + iloscGier);
        System.out.println("Dzieci " + dzieci);
        System.out.println("Młodzież " + mlodziez);
        System.out.println("Dorośli " + dorosli);
    }
}
