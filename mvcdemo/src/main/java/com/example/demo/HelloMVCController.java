package com.example.demo;

/**
 * Created by Enzo Cotter on 2020/2/21.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloMVCController {
    @RequestMapping("/mvc")
    public String Hello(){
        return "hello";
    }
}
