package uni.lodz;

public class Gra implements Przedmiot{
    private String nazwa;
    private int wiekMin;
    private int wiekMax;

    public Gra(String nazwa, int wiekMin, int wiekMax) {
        this.nazwa = nazwa;
        this.wiekMin = wiekMin;
        this.wiekMax = wiekMax;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getWiekMin() {
        return wiekMin;
    }

    public void setWiekMin(int wiekMin) {
        this.wiekMin = wiekMin;
    }

    public int getWiekMax() {
        return wiekMax;
    }

    public void setWiekMax(int wiekMax) {
        this.wiekMax = wiekMax;
    }

    @Override
    public String getInfo() {
        return "Nazwa gry: " + nazwa + "; rodzaj pozycji: Gra " + "; wiek minimalny: " + wiekMin + "; wiek maksymalny " + wiekMax + "; ";
    }
}
