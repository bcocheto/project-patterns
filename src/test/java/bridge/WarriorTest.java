package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WarriorTest {

    @Test
    void shouldReturnElfWarriorHealth() {
        Class aClass = new Elf();
        Warrior warrior = new Warrior(100);
        warrior.setClass(aClass);
        assertEquals(110.0f, warrior.calculateHealth());
    }

    @Test
    void shouldReturnDwarfWarriorHealth() {
        Class aClass = new Dwarf();
        Warrior warrior = new Warrior(100);
        warrior.setClass(aClass);
        assertEquals(120.00001f, warrior.calculateHealth());
    }

}