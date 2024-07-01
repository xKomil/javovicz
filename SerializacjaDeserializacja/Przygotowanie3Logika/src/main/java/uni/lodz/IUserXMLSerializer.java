package uni.lodz;

import java.util.List;

public interface IUserXMLSerializer {
    void xml(List<User> users);
    void deXml(List<User> users);
}
