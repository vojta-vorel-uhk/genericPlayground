package pro1.Task6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test
{
    @org.junit.Test
    public void test01() throws Exception {

        assertEquals(
                5,
                new Resistor(10).getCurrent(50)
        );
        assertThrows(
                ResistorException.class,
                ()->new Resistor(10).getCurrent(Double.POSITIVE_INFINITY)
        );

        // TODO 1: doplň třídu Resistor tak, aby vyhazovala speciální druh výjimky
        //         když výsledek výpočtu není platné číslo
        // TODO 2: doplň test pro tuto výjimku
    }
}
