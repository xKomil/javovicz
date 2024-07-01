package uni.lodz;

import java.io.IOException;
import java.util.List;

public interface UserSerializerInterface {
    void serializuj(List<User> users) throws IOException;
    List<User> deserializuj(List<User> users);
}
