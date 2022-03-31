package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonthEmployeeTest {

    @Test
    public void mustReturnMonth() {
        MonthEmployee.getInstance().setMonth("March");
        assertEquals("March", MonthEmployee.getInstance().getMonth());
    }

    @Test
    public void mustReturnEmployeeName() {
        MonthEmployee.getInstance().setEmployeeName("Will Smith");
        assertEquals("Will Smith", MonthEmployee.getInstance().getEmployeeName());
    }
}