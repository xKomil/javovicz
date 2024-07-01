package uni.lodz;

import java.util.List;

public interface IUserManager {
    void dodajUzytkownika(List<User> users);
    void usunUzytkownika(List<User> users);
    void wyswietlUzytkownika(List<User> users);
}
