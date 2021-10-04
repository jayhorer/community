package life.majiang.commnunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Jay on 21/10/3 - 22:56
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String hello(){
        return "index";
    }
}
