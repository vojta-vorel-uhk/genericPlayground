package pro1.Task3;

import org.junit.jupiter.api.Assertions;

public class Test
{
    @org.junit.Test
    public void test01() throws Exception {
        var store = new SecretStore("Secret3496455686443",new Object());

        // TODO: zavolat metodu store.sendTo s parametrem "not_good@gmail.com"
        var method = SecretStore.class.getDeclaredMethod("sendTo", String.class);
        method.setAccessible(true);
        var result = method.invoke(store,"not_good@gmail.com");

         Assertions.assertEquals(
                 "SENDING SECRET TO not_good@gmail.com",
                 result
        );
    }
}
