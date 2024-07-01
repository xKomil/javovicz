package uni.lodz;

import java.util.List;

public interface IWypozyczeniaManager {
    void dodajWypozyczenie(List<Wypozyczenie> wypozyczenia);
    void wyswietlListe(List<Wypozyczenie> wypozyczenia);
}
