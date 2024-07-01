package uni.lodz;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Serializacja implements ISerializacja{
    @Override
    public void zapiszDoPliku(List<Miejsce> miejsca) throws IOException {
        FileWriter writer = new FileWriter("src/main/resources/miejsca.txt");
        for(Miejsce miejsce : miejsca) {
            writer.write(miejsce.getInfo() + System.lineSeparator());
        }
        writer.close();
    }
}
