package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RevenueServiceTest {

    @Test
    void shouldReturnDebtPeopleInCountry(){
        Country country = new Country(
                new People("Dean", "EUA", true),
                new People("Joseph", "EUA", true),
                new People("Maria Menendes", "EUA",false),
                new People("Paul", "BR",true)

        );
        assertEquals(3, RevenueService.peopleInDebtCountry(country));
    }

    @Test
    void shoudReturnPeopleInDebtPerCountry(){
        Country country = new Country(
                new People("Dean", "EUA", true),
                new People("Maria Menendes", "EUA", true),
                new People("Jão", "BR",false),
                new People("Zé", "BR",true)

        );
        assertEquals(1, RevenueService.peopleInDebtPerCountry(country, "BR"));
    }

    @Test
    void shouldReturnTotalPeopleInDebt(){
        Country country = new Country(
                new People("Dean", "EUA", true),
                new People("Maria Menendes", "EUA", true),
                new People("Jão", "BR",false),
                new People("Zé", "BR",true),
                new People("José Menendez", "ES",false),
                new People("Joana", "ES",true)

        );
        assertEquals(6, RevenueService.totalPeopleCountry(country));
    }

}