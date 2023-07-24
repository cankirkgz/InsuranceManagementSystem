package Customer.Adress;

import Customer.User;

public class AddressManager {
    public static void addAdress(User user, IAdress adress) {
        user.getAddresses().add(adress);
    }

    public static void removeAddress(User user, IAdress address) {
        user.getAddresses().remove(address);
    }
}
