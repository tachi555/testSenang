package test.Controller;

import org.springframework.web.bind.annotation.*;
import test.Model.*;

@RestController
public class api {

    private final String cors = "*";

    private final String url = "";

    public api(){}

    @CrossOrigin(origins = cors)
    @GetMapping(url+"/greeting")
    public Result greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
            return new Result("Hello World!");
    }
    
}