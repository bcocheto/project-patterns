package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NinjaTest {

    Ninja ninja;

    @BeforeEach
    public void setUp() {
        ninja = new Ninja();
    }

    @Test
    public void shouldBelongLeaf() {
        ninja.setVillage(Villager.getInstance());
        assertEquals("Leaf ninja", ninja.leafVillage());
    }

    @Test
    public void shouldBelongGrass() {
        ninja.setVillage(Villager.getInstance());
        assertEquals("Grass ninja", ninja.grassVillage());
    }

    @Test
    public void shouldBelongSand() {
        ninja.setVillage(Villager.getInstance());
        assertEquals("Sand ninja", ninja.sandVillage());
    }

    @Test
    public void shouldBelongFog() {
        ninja.setVillage(Villager.getInstance());
        assertEquals("Fog ninja", ninja.fogVillage());
    }

    @Test
    public void shouldNotBelongLeaf() {
        ninja.setVillage(FogVillageNinja.getInstance());
        assertEquals("Does not belong to this village.", ninja.grassVillage());
    }

    @Test
    public void shouldNotBelongSand() {
        ninja.setVillage(GrassVillageNinja.getInstance());
        assertEquals("Does not belong to this village.", ninja.fogVillage());
    }

}