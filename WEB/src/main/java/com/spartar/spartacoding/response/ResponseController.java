package com.spartar.spartacoding.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {
    // Content-Type : text/html
    // Response Body
    // {"name":"owen","age":26}

    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson(){
        return "{\"name\":\"owen\",\"age\":26}";
    }

    // Content-Type : application/json
    // Response Body
    // {"name":"owen","age":26}
    @GetMapping("/json/class")
    @ResponseBody
    public Star helloClassJson(){
        return new Star("owen2",27);
    }
}
