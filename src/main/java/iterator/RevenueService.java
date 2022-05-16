package iterator;

public class RevenueService {

    public static Integer peopleInDebtCountry(Country country) {
        int quantity = 0;
        for (People people : country) {
            if (people.isOwe()){
                quantity++;
            }
        }
        return quantity;
    }

    public static Integer totalPeopleCountry(Country country) {
        int quantity = 0;
        for (People people : country) {
            quantity++;
        }
        return quantity;
    }

    public static Integer peopleInDebtPerCountry(Country country, String address) {
        int quantity = 0;
        for (People people : country) {
            if (people.isOwe() && people.getAddress().equals(address)){
                quantity++;
            }
        }
        return quantity;
    }
}
