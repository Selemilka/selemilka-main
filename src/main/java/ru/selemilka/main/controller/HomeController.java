package ru.selemilka.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    String index() {
        return "Places\n todate.selemilka.ru - To Da Te 🥰\n mc.selemilka.ru - minecraft\nlol that's all";
    }

}
