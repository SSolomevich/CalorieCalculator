package ru.calorieCalculator.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 15 on 24.03.2017.
 * Контроллер для первой страницы приложения
 */


@Controller
public class Controllers {


    private int visitorCount = 0;

    @RequestMapping("/index.html")
    public String index(Model model) {
        model.addAttribute("visitorCount", visitorCount++);
        return "WEB-INF/jsp/index.jsp";
    }
}
