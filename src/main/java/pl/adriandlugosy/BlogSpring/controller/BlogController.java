package pl.adriandlugosy.BlogSpring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.adriandlugosy.BlogSpring.repository.BlogRepository;

@Controller
public class BlogController {


    @Autowired
    BlogRepository blogRepository;

    @GetMapping("/index")
    public String index(){
        return "blog/index";
    }

    @GetMapping("/friends")
    public String friends(){
        return "blog/friends";
    }

    @GetMapping("/suits")
    public String suits(){
        return "blog/suits";
    }

    @GetMapping("/mother")
    public String mother(){
        return "blog/mother";
    }

    @GetMapping("/whitecollar")
    public String whiteCollar(){
        return "blog/whitecollar";
    }

    @GetMapping("/that70s")
    public String that70s(){
        return "blog/that70s";
    }

    @GetMapping("/gameofthrones")
    public String gameOfThrones(){
        return "blog/gameofthrones";
    }

    @GetMapping("/cooperation")
    public String cooperation(){
        return "blog/cooperation";
    }
}
