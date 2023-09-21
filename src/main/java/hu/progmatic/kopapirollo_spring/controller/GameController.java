package hu.progmatic.kopapirollo_spring.controller;

import hu.progmatic.kopapirollo_spring.service.BasicGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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


//    @PostMapping("/play")
//    public String getChoice(@RequestParam("choice") String choice) {
//
//
//        System.out.println(basicGameService.gameResult(choice));
//        return "redirect:/home";
//    }

    @PostMapping("/play")
    public String showResult(@RequestParam("choice") String choice, Model model){
        String result = basicGameService.gameResult(choice);
        String compC = basicGameService.computerChoice();
        model.addAttribute("result", result);
        model.addAttribute("choice",choice);
        model.addAttribute("compC",compC);
        return "result";
    }




}
