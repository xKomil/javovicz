package uni.lodz;

import java.io.*;
import java.util.List;

public class UserBinarySerializer implements IUserBinarySerializer{

    @Override
    public void serializujBinarnie(List<User> users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/resources/binaryfile.dat"))) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deserializujBinarnie(List<User> users) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/binaryfile.dat"))) {
            List<User> deserializedUsers = (List<User>) ois.readObject();
            users.clear();
            users.addAll(deserializedUsers);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
