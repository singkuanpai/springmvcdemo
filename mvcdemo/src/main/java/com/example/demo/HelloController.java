package com.example.demo;

/**
 * Created by Enzo Cotter on 2020/2/21.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String StringHello(){
        return "helloworld!";
    }
}
