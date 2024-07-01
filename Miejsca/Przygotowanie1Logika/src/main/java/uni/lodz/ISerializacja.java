package uni.lodz;

import java.io.IOException;
import java.util.List;

public interface ISerializacja {
    void zapiszDoPliku(List<Miejsce> miejsca) throws IOException;
}
