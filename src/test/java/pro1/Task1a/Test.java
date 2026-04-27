package pro1.Task1a;

import com.google.gson.Gson;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Assertions;

public class Test
{
    @org.junit.Test
    public void test01() throws Exception {
        AtomicInteger c = new AtomicInteger();

        for(int i=0; i<10; i++){
            Callable<String> task = () -> {
                String resp = Utils.getFromUri("http://www.randomnumberapi.com/api/v1.0/random?min=100&max=1000&count=5");
                int[] data = new Gson().fromJson(resp,int[].class);
                c.addAndGet(data.length);
                return "DONE";
            };
            task.call();
        }

        // TODO: doplň tak, aby všechna data byla stažena

        Assertions.assertEquals(
                50,
                c.intValue()
        );
    }
}
