package uni.lodz;

import java.util.List;
import java.util.Scanner;

public class UserManager implements IUserManager{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void dodajUzytkownika(List<User> users) {
        System.out.println("Podaj nazwe uzytkownika ");
        String nazwa = scanner.nextLine();
        System.out.println("Podaj nazwisko uzytkownika ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj wiek uzytkownika ");
        int wiek = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj adres email ");
        String email = scanner.nextLine();

        User user = new User(nazwa, nazwisko, wiek, email);
        users.add(user);
        System.out.println("Dodano użytkownika ");
    }

    @Override
    public void usunUzytkownika(List<User> users) {
        System.out.println("Podaj adres e-mail użytkownika którego chcesz usunąć ");
        String doUsuniecia = scanner.nextLine();
        users.removeIf(user -> user.getEmail().equals(doUsuniecia));
        System.out.println("Użytkowik został usunięty jeśli istnieje");
    }

    @Override
    public void wyswietlUzytkownika(List<User> users) {
        for (User user : users) {
            System.out.println(user.getInfo());
        }
    }
}
