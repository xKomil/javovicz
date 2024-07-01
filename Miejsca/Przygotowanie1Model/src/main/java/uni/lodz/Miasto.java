package uni.lodz;

public class Miasto implements IMiejsce{
    private String nazwa;
    private String krajWJest;
    private boolean stolica;
    private boolean czyOdwiedzone;

    public Miasto(String nazwa, String krajWJest, boolean stolica, boolean czyOdwiedzone) {
        this.nazwa = nazwa;
        this.krajWJest = krajWJest;
        this.stolica = stolica;
        this.czyOdwiedzone = czyOdwiedzone;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKrajWJest() {
        return krajWJest;
    }

    public void setKrajWJest(String krajWJest) {
        this.krajWJest = krajWJest;
    }

    public boolean isStolica() {
        return stolica;
    }

    public void setStolica(boolean stolica) {
        this.stolica = stolica;
    }

    public boolean isCzyOdwiedzone() {
        return czyOdwiedzone;
    }

    public void setCzyOdwiedzone(boolean czyOdwiedzone) {
        this.czyOdwiedzone = czyOdwiedzone;
    }

    @Override
    public String getInfo() {
        return "Miasto: " + nazwa + "; kraj w którym się znajduje: " + krajWJest + "; czy jest stolicą: " + stolica + "; czy odwiedzone " +
                czyOdwiedzone + "; ";
    }
}
