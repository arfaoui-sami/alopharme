package com.exemple.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("home")
public class HomeController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
public String index(){
    return "home.index";
}
}

