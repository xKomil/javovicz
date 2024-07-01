package uni.lodz;

import java.util.List;

public interface IUserJsonSerializer {
    void jsonSerializer(List<User> users);
    void jsonDeserializer(List<User> users);
}
