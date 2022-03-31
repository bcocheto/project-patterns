package prototype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotorcycleTest {

    @Test
    void testClone() throws CloneNotSupportedException{
        Motorcycle motorcycle = new Motorcycle("RI02A18", new Model("Fat Boy", "Twin Cam 114™"));

        Motorcycle motorcycleClone = motorcycle.clone();
        motorcycleClone.setPlate("BRA2E19");
        motorcycleClone.getModel().setName("Fat Boy");
        motorcycleClone.getModel().setEngine("Twin Cam 107™");

        assertEquals("Motorcycle{plate=RI02A18, model=Model{name=Fat Boy, engine=Twin Cam 114™'}'}", motorcycle.toString());
        assertEquals("Motorcycle{plate=BRA2E19, model=Model{name=Fat Boy, engine=Twin Cam 107™'}'}", motorcycleClone.toString());
    }
}