package uni.lodz;

import uni.lodz.IMiejsce;

public class Kraj implements IMiejsce{
    private String nazwa;
    private boolean czyWUni;
    private String waluta;
    private boolean czyOdwiedzone;

    public Kraj(String nazwa, boolean czyWUni, String waluta, boolean czyOdwiedzone) {
        this.nazwa = nazwa;
        this.czyWUni = czyWUni;
        this.waluta = waluta;
        this.czyOdwiedzone = czyOdwiedzone;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean isCzyWUni() {
        return czyWUni;
    }

    public void setCzyWUni(boolean czyWUni) {
        this.czyWUni = czyWUni;
    }

    public String getWaluta() {
        return waluta;
    }

    public void setWaluta(String waluta) {
        this.waluta = waluta;
    }

    public boolean isCzyOdwiedzone() {
        return czyOdwiedzone;
    }

    public void setCzyOdwiedzone(boolean czyOdwiedzone) {
        this.czyOdwiedzone = czyOdwiedzone;
    }

    @Override
    public String getInfo() {
        return "Kraj: " + nazwa + "; czy jest w Uni " + czyWUni + "; waluta: " + waluta + "; czy odwiedzone " + czyOdwiedzone + "; ";
    }
}
