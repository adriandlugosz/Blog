package pl.adriandlugosy.BlogSpring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.adriandlugosy.BlogSpring.model.Response;
import pl.adriandlugosy.BlogSpring.repository.BlogRepository;

@Controller
public class BlogController {


    @Autowired
    BlogRepository blogRepository;

    @GetMapping("/index")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("info", blogRepository.count());
        return "blog/index";
    }

    @GetMapping("/friends")
    public String friends(ModelMap modelMap) {
        modelMap.addAttribute("info", blogRepository.count());
        return "blog/friends";
    }

    @GetMapping("/suits")
    public String suits(ModelMap modelMap) {
        modelMap.addAttribute("info", blogRepository.count());
        return "blog/suits";
    }

    @GetMapping("/mother")
    public String mother(ModelMap modelMap) {
       modelMap.addAttribute("info", blogRepository.count());
        return "blog/mother";
    }

    @GetMapping("/whitecollar")
    public String whiteCollar(ModelMap modelMap) {
       modelMap.addAttribute("info", blogRepository.count());
        return "blog/whitecollar";
    }

    @GetMapping("/that70s")
    public String that70s(ModelMap modelMap) {
       modelMap.addAttribute("info", blogRepository.count());
        return "blog/that70s";
    }

    @GetMapping("/gameofthrones")
    public String gameOfThrones(ModelMap modelMap) {
       modelMap.addAttribute("info", blogRepository.count());
        return "blog/gameofthrones";
    }

    @GetMapping("/cooperation")
    public String cooperation(ModelMap modelMap) {
       modelMap.addAttribute("info", blogRepository.count());
        return "blog/cooperation";
    }

    @GetMapping("/contact/form")
    public String form(ModelMap modelMap) {
        modelMap.addAttribute("response",new Response());
       modelMap.addAttribute("info", blogRepository.count());
        return "blog/contact";
    }

    @PostMapping("/contact")
    public String data(@ModelAttribute Response response) {
        blogRepository.save(response);
        return "redirect:/contact";
    }

    @GetMapping("/contact")
    public String contact(ModelMap modelMap) {
        return "redirect:/contact/form";
    }
}
