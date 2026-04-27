package pro1.Task7c;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class Test {
    @org.junit.Test
    public void test01() throws Exception {

        var numbers = new double[]{78.0, 60.5, 36.7, -160.0};

        var res = Arrays
                .stream(numbers)
                .map( Math::abs )
                .sum();

        Assertions.assertEquals(
                335.2,
                res,
                0.001d
        );
    }
}
