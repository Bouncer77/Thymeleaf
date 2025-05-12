package pro.kosenkov.inventory.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/info")
public class InfoController {
    @GetMapping()
    public String info() {
        return "info";
    }

    @GetMapping("/parget")
    public String statusEndpoint(@RequestParam(required = false) String status, Model model) {
        model.addAttribute("status", status);
        return "info";
    }

    @GetMapping("/dynamic/some")
    public String dynamicInfo() {
        return "info";
    }
}
