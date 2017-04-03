package davenkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yteng on 4/3/17.
 */

@RestController("/helloworld")
public class HelloController {

    private HelloWorld helloWorld;

    public HelloController(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @GetMapping
    public String hello() {
        return helloWorld.hello();
    }
}
