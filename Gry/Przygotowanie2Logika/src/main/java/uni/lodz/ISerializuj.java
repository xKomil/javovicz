package uni.lodz;

import java.io.IOException;
import java.util.List;

public interface ISerializuj {
    void zapiszDoPliku(List<Wypozyczenie> wypozyczenia) throws IOException;
}
