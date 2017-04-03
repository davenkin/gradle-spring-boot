package davenkin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by yteng on 4/3/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloWorldApiTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldSayHelloWorld() {
        String result = restTemplate.getForObject("/helloworld", String.class);
        assertEquals("Hello World!", result);
    }

}
