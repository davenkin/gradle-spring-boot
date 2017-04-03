package davenkin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yteng on 4/3/17.
 */
public class HelloWorldTest {

    @Test
    public void shouldSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        String hello = helloWorld.hello();
        assertEquals("Hello World!", hello);
    }

}