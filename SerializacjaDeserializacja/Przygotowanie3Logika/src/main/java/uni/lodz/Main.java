package uni.lodz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        UserSerializer serialize = new UserSerializer();
        UserManager userManager = new UserManager();
        UserBinarySerializer userBinarySerializer = new UserBinarySerializer();
        UserJsonSerializer userJsonSerializer = new UserJsonSerializer();
        UserXMLSerializer userXMLSerializer = new UserXMLSerializer();
        boolean runninng = true;

        while (runninng) {
            System.out.println("Wybierz opcje ");
            System.out.println("1. Dodanie użytkownika ");
            System.out.println("2. Wyświetlenie użytkowników ");
            System.out.println("3. Usunięcie użytkownika ");
            System.out.println("4. Zapisz liste użytkowników (csv)");
            System.out.println("5. Odczytaj użytkowników z pliku (csv)");
            System.out.println("6. Zapisz liste użytkowników (bat)");
            System.out.println("7. Odczytaj użytkowników z pliku (bat)");
            System.out.println("8. Zapisz liste użytkowników (json)");
            System.out.println("9. Odczytaj użytkowników z pliku (json)");
            System.out.println("10. Zapisz liste użytkowników (xml)");
            System.out.println("11. Odczytaj użytkowników z pliku (xml)");
            System.out.println("12. Wyjdz z programu ");
            String opcja = scanner.nextLine();

            switch (opcja) {
                case "1":
                    userManager.dodajUzytkownika(users);
                    break;
                case "2":
                    userManager.wyswietlUzytkownika(users);
                    break;
                case "3":
                    userManager.usunUzytkownika(users);
                    break;
                case "4":
                    serialize.serializuj(users);
                    break;
                case "5":
                    serialize.deserializuj(users);
                    break;
                case "6":
                    userBinarySerializer.serializujBinarnie(users);
                    break;
                case "7":
                    userBinarySerializer.deserializujBinarnie(users);
                    break;
                case "8":
                    userJsonSerializer.jsonSerializer(users);
                    break;
                case "9":
                    userJsonSerializer.jsonDeserializer(users);
                    break;
                case "10":
                    userXMLSerializer.xml(users);
                    break;
                case "11":
                    userXMLSerializer.deXml(users);
                    break;
                case "12":
                    runninng = false;
                    break;
                default:
                    System.out.println("Wybrano złą opcję");
            }
        }
    }
}