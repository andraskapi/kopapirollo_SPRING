package hu.progmatic.kopapirollo_spring.controller;

import hu.progmatic.kopapirollo_spring.service.BasicGameService;
import hu.progmatic.kopapirollo_spring.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

    private final BasicGameService basicGameService;

    @Autowired
    public GameController(BasicGameService basicGameService) {
        this.basicGameService = basicGameService;
    }

    @GetMapping({"", "/", "/home"})
    public String home() {
        return "home";
    }

    @PostMapping("/play")
    public String getChoice(@ModelAttribute("choice") String choice) {

        basicGameService.gameResult(choice);
        return "redirect:/home";
    }


}
