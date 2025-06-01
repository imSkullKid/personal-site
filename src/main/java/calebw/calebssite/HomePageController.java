package calebw.calebssite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

        @GetMapping(path = "/api/home")
        public String helloWorld() {
            return "Hello World!";
        }

}
