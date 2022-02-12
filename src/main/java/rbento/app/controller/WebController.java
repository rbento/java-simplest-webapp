package rbento.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("client", System.getenv("APP_CLIENT"));
        model.addAttribute("version", System.getenv("APP_VERSION"));
        model.addAttribute("year", LocalDate.now().getYear());
        return "index";
    }
}
