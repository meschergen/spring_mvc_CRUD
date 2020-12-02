package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 02.12.2020
 *
 * @author MescheRGen
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(ModelMap model){
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm CRUD User application");
        model.addAttribute("messages", messages);
        return "index";
    }
}
