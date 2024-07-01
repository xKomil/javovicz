package uni.lodz;

public class Wypozyczenie implements Przedmiot {
    private Przedmiot przedmiot;
    private String imie;
    private String nazwisko;
    private int wiek;

    public Wypozyczenie(Przedmiot przedmiot, String imie, String nazwisko, int wiek) {
        this.przedmiot = przedmiot;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Przedmiot getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(Przedmiot przedmiot) {
        this.przedmiot = przedmiot;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String getInfo() {
        return przedmiot.getInfo() + "Imię klienta: " + imie + "; Nazwisko klienta: " + nazwisko + "; Wiek klienta: " + wiek;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
