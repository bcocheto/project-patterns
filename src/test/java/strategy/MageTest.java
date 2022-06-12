package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    void shouldUseFireSpell() {
        Mage mage = new Mage();
        mage.fireSpell("fire ball");
        assertEquals("fire ball", mage.getUsedSkill());
    }

    @Test
    void shouldUseIceSpell() {
        Mage mage = new Mage();
        mage.iceSpell("freeze");
        assertEquals("freeze", mage.getUsedSkill());
    }

}