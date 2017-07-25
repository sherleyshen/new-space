package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by john on 2017/7/25.
 */
@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(value = "*")
    public String index() {
        return "index";
    }
}
