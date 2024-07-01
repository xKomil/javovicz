package uni.lodz;

import java.util.List;

public interface IUserBinarySerializer {
    void serializujBinarnie(List<User> users);
    void  deserializujBinarnie(List<User> users);
}
