package uni.lodz;

public class Miejsce implements IMiejsce{
    private IMiejsce miejsce;

    public Miejsce(IMiejsce miejsce) {
        this.miejsce = miejsce;
    }

    public IMiejsce getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(IMiejsce miejsce) {
        this.miejsce = miejsce;
    }

    @Override
    public String getInfo() {
        return miejsce.getInfo();
    }
}
