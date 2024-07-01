package uni.lodz;

public class Ksiazka implements Przedmiot{
    private String nazwa;
    private String autor;
    private int wiekMin;

    public Ksiazka(String nazwa, String autor, int wiekMin) {
        this.nazwa = nazwa;
        this.autor = autor;
        this.wiekMin = wiekMin;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getWiekMin() {
        return wiekMin;
    }

    public void setWiekMin(int wiekMin) {
        this.wiekMin = wiekMin;
    }

    @Override
    public String getInfo() {
        return "Nazwa książki: " + nazwa + "; Autor: " + autor + "; rodzaj pozycji: Ksiazka"+ "; wiek minimalny: " + wiekMin + "; ";
    }
}
