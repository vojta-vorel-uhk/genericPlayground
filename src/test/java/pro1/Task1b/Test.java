package pro1.Task1b;

import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import pro1.Task1a.Utils;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Test
{
    @org.junit.Test
    public void test01() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        AtomicInteger c = new AtomicInteger();

        for(int i=0; i<10; i++){
            Callable<String> task1 = () -> {
                String resp = Utils.getFromUri("http://www.randomnumberapi.com/api/v1.0/random?min=100&max=1000&count=5");
                int[] data = new Gson().fromJson(resp,int[].class);
                c.addAndGet(data.length);
                return "DONE";
            };
            executor.submit(task1);
        }
        executor.shutdown();
        executor.awaitTermination(1,TimeUnit.MINUTES);
        // TODO: doplň volání metod objektu executor,
        //       abychom se ujistili že všechna data byla stažena

        Assertions.assertEquals(
                50,
                c.intValue()
        );
    }
}
