package pro1.Task7a;

import pro1.Task6.Resistor;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test
{
    @org.junit.Test
    public void test01() throws Exception {

        var resistances = new Double[]{5.0,6.0};

        var resistors = Arrays
                .stream(resistances)
                .map( Resistor::new )
                .toList();

        assertEquals(
                24.0,
                resistors.get(0).getCurrent(120.0)
        );
        assertEquals(
                20.0,
                resistors.get(1).getCurrent(120.0)
        );
    }
}
