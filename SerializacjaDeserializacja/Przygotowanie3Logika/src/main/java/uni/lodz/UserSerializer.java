package uni.lodz;

import java.io.*;
import java.util.List;

public class UserSerializer implements UserSerializerInterface {
    @Override
    public void serializuj(List<User> users) throws IOException {
        FileWriter writer = new FileWriter("src/main/resources//output.csv");
        for(User user : users) {
            writer.write(user.getInfo() + System.lineSeparator());
        }
        writer.close();
    }

    @Override
    public List<User> deserializuj(List<User> users) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/output.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String firstName = parts[0];
                    String lastName = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    String email = parts[3];
                    users.add(new User(firstName, lastName, age, email));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }
}
