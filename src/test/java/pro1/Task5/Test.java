package pro1.Task5;

import org.junit.jupiter.api.Assertions;

import java.time.DateTimeException;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test
{
    @org.junit.Test
    public void test01() throws Exception {

        assertEquals(
                Instant.parse("2026-12-30T07:30:00Z"),
                MyDateParser.parse("2026-12-30 08:30").toInstant()
        );
        Assertions.assertThrows(
                DateTimeException.class,
                () -> MyDateParser.parse("2026-20-30 08:30").toInstant()
        );
        // TODO: doplň další test, který bude do metody MyDateParser.parse
        //  posílat neplatné datum
    }
}
