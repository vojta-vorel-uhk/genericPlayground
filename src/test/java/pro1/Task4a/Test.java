package pro1.Task4a;

import org.junit.jupiter.api.Assertions;
import java.util.List;

public class Test
{
    @org.junit.Test
    public void test01() throws Exception {
        var c = new ShufflingCollection<String>(List.of("K1","K2","K3","K4","K5","K6"));
        c.shuffle(0);
        String first = c.get(0);

        // TODO: uprav třídu ShufflingCollection tak,
        //       aby proměnná first šla změnit na typ String

        Assertions.assertEquals(
                "K1",
                first
        );
    }
}
