package uni.lodz;

import java.util.List;

public class Raport implements IRaport{
    @Override
    public void generujRaport(List<Miejsce> miejsca) {
        int odwKraj = 0;
        int planKraj = 0;
        int odwMiasto = 0;
        int planMiasto = 0;
        int odwStolica = 0;
        int planStolica = 0;

        for (Miejsce miejsce : miejsca) {
            if (miejsce.getMiejsce() instanceof Kraj) {
                if (((Kraj) miejsce.getMiejsce()).isCzyOdwiedzone()){
                    odwKraj++;
                }
                else {
                    planKraj++;
                }
            }
            else if (miejsce.getMiejsce() instanceof Miasto) {
                if (((Miasto) miejsce.getMiejsce()).isCzyOdwiedzone()) {
                    odwMiasto++;
                    if (((Miasto) miejsce.getMiejsce()).isStolica()) {
                        odwStolica++;
                    }
                }
                else {
                    planMiasto++;
                    if (((Miasto) miejsce.getMiejsce()).isStolica()) {
                        planStolica++;
                    }
                }
            }
        }

        System.out.println("Raport: ");
        System.out.println("Odwiedzone kraje: " + odwKraj);
        System.out.println("Planowane kraje: " + planKraj);
        System.out.println("Odwiedzone miasta: " + odwMiasto);
        System.out.println("Planowane miasta: " + planMiasto);
        System.out.println("Odwiedzone stolice: " + odwStolica);
        System.out.println("Planowane stolice: " + planStolica);

    }
}
