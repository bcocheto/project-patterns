package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    void shouldReturnMageEflHealth() {
        Class aClass = new Elf();
        Mage mage = new Mage(95);
        mage.setClass(aClass);
        assertEquals(104.5f, mage.calculateHealth());
    }

    @Test
    void shouldReturnMageDwarfHealth() {
        Class aClass = new Dwarf();
        Mage mage = new Mage(95);
        mage.setClass(aClass);
        assertEquals(114.00001f, mage.calculateHealth());
    }

}