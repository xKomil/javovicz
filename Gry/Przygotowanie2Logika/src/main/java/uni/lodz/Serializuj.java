package uni.lodz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Serializuj implements ISerializuj{
    @Override
    public void zapiszDoPliku(List<Wypozyczenie> wypozyczenia) throws IOException {
        int id = 1;
        FileWriter writer = new FileWriter("src/main/resources/Plik.txt");
        for(Wypozyczenie wypozyczenie : wypozyczenia) {
            writer.write(id + ", " + wypozyczenie + System.lineSeparator());
            id++;
        }
        writer.close();
    }
}
