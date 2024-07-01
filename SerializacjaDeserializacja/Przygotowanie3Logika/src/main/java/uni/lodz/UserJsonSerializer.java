package uni.lodz;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class UserJsonSerializer implements IUserJsonSerializer {

    @Override
    public void jsonSerializer(List<User> users) {
        try (Writer writer = new FileWriter("src/main/resources/users.json")) {
            writer.write("[\n");
            for (User user : users) {
                String json = String.format("  { \"imie\": \"%s\", \"nazwisko\": \"%s\", \"wiek\": %d, \"email\": \"%s\" }",
                        user.getImie(), user.getNazwisko(), user.getWiek(), user.getEmail());
                writer.write(json);
                if (users.indexOf(user) < users.size() - 1) {
                    writer.write(",\n");
                } else {
                    writer.write("\n");
                }
            }
            writer.write("]");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void jsonDeserializer(List<User> users) {
        try (Reader reader = new FileReader("src/main/resources/users.json")) {
            StringBuilder jsonData = new StringBuilder();
            int character;
            while ((character = reader.read()) != -1) {
                jsonData.append((char) character);
            }

            // Remove leading/trailing whitespace and newlines
            String jsonString = jsonData.toString().trim();

            // Check if the file is empty or only contains newline characters
            if (jsonString.isEmpty()) {
                return;
            }

            // Check if the JSON starts with an array
            if (!jsonString.startsWith("[")) {
                throw new IOException("Invalid JSON format: expected an array.");
            }

            // Trim the square brackets and process the JSON objects inside
            jsonString = jsonString.substring(1, jsonString.length() - 1).trim();

            // Split JSON objects by commas
            String[] jsonObjects = jsonString.split(",");

            for (String jsonObject : jsonObjects) {
                String[] fields = jsonObject.split(":");
                if (fields.length == 4) {
                    String imie = fields[0].trim().replace("\"", "").split(":")[1].trim();
                    String nazwisko = fields[1].trim().replace("\"", "");
                    int wiek = Integer.parseInt(fields[2].trim().replace("\"", ""));
                    String email = fields[3].trim().replace("\"", "").replace("}", "");

                    users.add(new User(imie, nazwisko, wiek, email));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
